package nomarthehero.projectfun.commands;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public abstract class CoolDownCommand extends BaseCommand {

	private HashMap<String, Long> cooldown;
	private int cooldownTime;
	private String cooldownMessage;

	public CoolDownCommand(String commandName, int cooldownTime) {
		super(commandName);
		this.cooldownTime = cooldownTime;
		cooldown = new HashMap<String, Long>();

		// defaults
		cooldownMessage = "Please wait " + cooldownTime + " before using this command again.";

	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean execute(CommandSender sender, String[] args) {

		if (cooldown.containsKey(sender.getName())) {
			if (System.currentTimeMillis() - cooldown.get(sender.getName()) < cooldownTime) {
				sender.sendMessage(cooldownMessage);
				return true;

			}

		}

		if (args.length == 0) {
			sender.sendMessage(ChatColor.RED
					+ "Not enough arguments! " + ChatColor.DARK_AQUA + "/" + getName() + " <player>");
			return true;

		}

		if (args[0].equalsIgnoreCase("all")) {

			messageAll(((Player) sender).getDisplayName());
			cooldown.put(sender.getName(), System.currentTimeMillis());

			return true;

		}

		if (Bukkit.getPlayer(args[0]) == null) {
			sender.sendMessage(ChatColor.RED + "Player not online.");

			return true;

		}

		message(((Player) sender).getDisplayName(), args[0]);
		cooldown.put(sender.getName(), System.currentTimeMillis());

		return true;
	}

	public void setCooldownMessage(String message) {
		cooldownMessage = message;

	}

	// remember that messageAll and message NEED TO BROADCAST THE MESSAGE if you
	// want it to.

	public abstract void messageAll(String playerName);

	public abstract void message(String playerName, String target);

	public int getCooldownTime() {
		return cooldownTime;

	}

}
