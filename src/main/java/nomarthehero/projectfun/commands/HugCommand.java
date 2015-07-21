package nomarthehero.projectfun.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import nomarthehero.projectfun.ProjectFun;

public class HugCommand extends CoolDownCommand {

	ProjectFun PF;

	public HugCommand() {
		super("hug", ProjectFun.getCooldown());
		PF = ProjectFun.getPlugin();

		setCooldownMessage(ChatColor.RED + "You can only hug one player every 50 seconds.");

	}

	@Override
	public void messageAll(String playerName) {
		Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + playerName
				+ ChatColor.RED + " hugged "
				+ ChatColor.LIGHT_PURPLE + "everyone"
				+ ChatColor.RED + " ♥");

	}

	@Override
	public void message(String playerName, Player target) {
		Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + playerName
				+ ChatColor.RED + " hugged "
				+ ChatColor.LIGHT_PURPLE + target
				+ ChatColor.DARK_RED + " ♥");

	}

}
