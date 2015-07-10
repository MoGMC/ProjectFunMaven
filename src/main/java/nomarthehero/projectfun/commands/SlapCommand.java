package nomarthehero.projectfun.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import nomarthehero.projectfun.ProjectFun;

public class SlapCommand extends CoolDownCommand {

	public SlapCommand() {
		super("slap", ProjectFun.getCooldown());

		setCooldownMessage(ChatColor.RED + "Woah woah, calm down dude!");

	}

	@Override
	public void messageAll(String playerName) {
		Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + playerName
				+ ChatColor.YELLOW + " S" + ChatColor.RED
				+ "L" + ChatColor.GRAY + "A"
				+ ChatColor.GREEN + "P"
				+ ChatColor.DARK_PURPLE + "P"
				+ ChatColor.AQUA + "E" + ChatColor.BLUE
				+ "D " + ChatColor.LIGHT_PURPLE
				+ "EVERYONE" + ChatColor.DARK_RED + "!");

	}

	@Override
	public void message(String playerName, String target) {
		Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + playerName
				+ ChatColor.YELLOW + " S" + ChatColor.RED
				+ "L" + ChatColor.GRAY + "A"
				+ ChatColor.GREEN + "P"
				+ ChatColor.DARK_PURPLE + "P"
				+ ChatColor.AQUA + "E" + ChatColor.BLUE
				+ "D " + ChatColor.LIGHT_PURPLE
				+ target + ChatColor.DARK_RED
				+ "!");

	}

}