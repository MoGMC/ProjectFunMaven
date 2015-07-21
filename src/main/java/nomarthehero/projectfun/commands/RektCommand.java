package nomarthehero.projectfun.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import nomarthehero.projectfun.ProjectFun;

public class RektCommand extends CoolDownCommand {

	public RektCommand() {
		super("rek", ProjectFun.getCooldown());

		setCooldownMessage(ChatColor.RED + "There's no way you rek people that quick.");

	}

	@Override
	public void messageAll(String playerName) {
		Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + playerName
				+ ChatColor.DARK_RED + " REKT "
				+ ChatColor.LIGHT_PURPLE + "EVERYONE"
				+ ChatColor.DARK_RED + "!");

	}

	@Override
	public void message(String playerName, Player target) {
		Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + playerName
				+ ChatColor.DARK_RED + " REKT "
				+ ChatColor.LIGHT_PURPLE + target.getDisplayName()
				+ ChatColor.DARK_RED + "!");

	}

}
