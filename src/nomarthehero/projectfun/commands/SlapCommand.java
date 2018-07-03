package nomarthehero.projectfun.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

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
	public void message(String playerName, Player target) {
		Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + playerName
				+ ChatColor.YELLOW + " S" + ChatColor.RED
				+ "L" + ChatColor.GRAY + "A"
				+ ChatColor.GREEN + "P"
				+ ChatColor.DARK_PURPLE + "P"
				+ ChatColor.AQUA + "E" + ChatColor.BLUE
				+ "D " + ChatColor.LIGHT_PURPLE
				+ target.getDisplayName().toString() + ChatColor.DARK_RED
				+ "!");

	}

}