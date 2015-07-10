package nomarthehero.projectfun.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import nomarthehero.projectfun.ProjectFun;

public class LickCommand implements CommandExecutor {

	/*
	 * COPY THIS WHOLE CLASS INTO A NEW CLASS FOR A NEW COMMAND
	 * 
	 * Replace "String command = null" with the command, for example
	 * "String command = slap" (make sure it's lowercase) Replace
	 * "String permission = null" with the permission you set it to in the
	 * plugin.yml, for example "String permission = projectfun.command.slap"
	 * (lowercase)
	 * 
	 * Make sure to register the command in ProjectFun
	 */

	ProjectFun PF = ProjectFun.getPlugin();

	private String command = "lick";

	private String permission = "projectfun.lick";

	@SuppressWarnings("unused")
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {

		if (cmd.getName().equalsIgnoreCase(getCommand())) {

			if (sender instanceof Player) {

				Player player = (Player) sender;

				if (!player.hasPermission(getPerm())) {
					return false;
				}

				else {

					if (args.length == 0) {
						sender.sendMessage(ChatColor.RED
								+ "Not enough arguments!" + ChatColor.DARK_AQUA
								+ " /lick <player>");
						return true;
					}

					String p = sender.getName();
					@SuppressWarnings("deprecation")
					Player target = Bukkit.getPlayer(args[0]);
					String cooldown = PF.getConfig().getString("cooldown");

					if (target != null) {

						int cooldownTime = Integer.parseInt(cooldown);

						if (PF.lickCool.containsKey(sender.getName())) {
							long secondsLeft = ((PF.lickCool.get(sender
									.getName()) / 1000 + cooldownTime) - System
									.currentTimeMillis() / 1000);
							if (secondsLeft > 0) {
								sender.sendMessage(ChatColor.RED
										+ "Your toungue is still dry from the last lick, please wait.");
								return true;
							}
						}
						PF.lickCool.put(p, System.currentTimeMillis());

						if (target != null) {
							Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + p
									+ ChatColor.RED + " L"
									+ ChatColor.LIGHT_PURPLE + "I"
									+ ChatColor.GOLD + "C" + ChatColor.BLUE
									+ "K" + ChatColor.YELLOW + "E"
									+ ChatColor.WHITE + "D "
									+ ChatColor.LIGHT_PURPLE + target.getName()
									+ ChatColor.DARK_RED + "!");
						} else if (args[0].equalsIgnoreCase("all")) {
							Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + p
									+ ChatColor.RED + " L"
									+ ChatColor.LIGHT_PURPLE + "I"
									+ ChatColor.GOLD + "C" + ChatColor.BLUE
									+ "K" + ChatColor.YELLOW + "E"
									+ ChatColor.WHITE + "D "
									+ ChatColor.LIGHT_PURPLE + "EVERYONE"
									+ ChatColor.DARK_RED + "!");
						} else {

							sender.sendMessage(ChatColor.RED
									+ "Player not online.");
							return true;

						}

					}
					return true;

				}

			}

		}
		return true;
	}

	public String getCommand() {
		return command;
	}

	private String getPerm() {
		return permission;
	}

}
