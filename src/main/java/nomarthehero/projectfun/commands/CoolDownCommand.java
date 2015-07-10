package nomarthehero.projectfun.commands;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public abstract class CoolDownCommand extends BaseCommand {

	private HashMap<String, Long> cooldown;
	private int cooldownTime;
	private String cooldownMessage// , allMessage, message;
	;

	public CoolDownCommand(String commandName, int cooldownTime) {
		super(commandName);
		this.cooldownTime = cooldownTime;
		cooldown = new HashMap<String, Long>();

		// defaults
		cooldownMessage = "Please wait " + cooldownTime + " before using this command again.";

	}

	@Override
	public boolean execute(CommandSender sender, String[] args) {
		if (args.length == 0) {
			sender.sendMessage(ChatColor.RED
					+ "Not enough arguments! " + ChatColor.DARK_AQUA + "/" + getName() + " <player>");
			return true;

		}

		if (cooldown.containsKey(sender.getName())) {
			if (cooldown.get(sender.getName()) - System.currentTimeMillis() < cooldownTime) {
				sender.sendMessage(cooldownMessage);
				return true;

			}

		}

		String name = sender.getName();

		if (args[0].equalsIgnoreCase("all")) {

			messageAll(name);
			cooldown.put(name, System.currentTimeMillis());

			return true;

		}

		if (Bukkit.getPlayer(args[0]) == null) {
			sender.sendMessage(ChatColor.RED + "Player not online.");

			return true;

		}

		message(name, args[0]);
		cooldown.put(name, System.currentTimeMillis());

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
