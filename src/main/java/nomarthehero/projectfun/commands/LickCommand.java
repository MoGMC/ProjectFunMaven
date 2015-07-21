package nomarthehero.projectfun.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import nomarthehero.projectfun.ProjectFun;

public class LickCommand extends CoolDownCommand {

	public LickCommand() {
		super("lick", ProjectFun.getCooldown());

		setCooldownMessage(ChatColor.RED + "Your toungue is still dry from the last lick, please wait.");

	}

	@Override
	public void messageAll(String playerName) {
		Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + playerName
				+ ChatColor.RED + " L"
				+ ChatColor.LIGHT_PURPLE + "I"
				+ ChatColor.GOLD + "C" + ChatColor.BLUE
				+ "K" + ChatColor.YELLOW + "E"
				+ ChatColor.WHITE + "D "
				+ ChatColor.LIGHT_PURPLE + "EVERYONE"
				+ ChatColor.DARK_RED + "!");

	}

	@Override
	public void message(String playerName, Player target) {
		Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + playerName
				+ ChatColor.RED + " L"
				+ ChatColor.LIGHT_PURPLE + "I"
				+ ChatColor.GOLD + "C" + ChatColor.BLUE
				+ "K" + ChatColor.YELLOW + "E"
				+ ChatColor.WHITE + "D "
				+ ChatColor.LIGHT_PURPLE + target.getDisplayName().toString()
				+ ChatColor.DARK_RED + "!");

	}

}
