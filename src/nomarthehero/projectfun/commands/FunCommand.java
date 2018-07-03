package nomarthehero.projectfun.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import nomarthehero.projectfun.ProjectFun;

public class FunCommand extends BaseCommand {

	public FunCommand() {
		super("fun");

	}

	ProjectFun PF = ProjectFun.getPlugin();

	@Override
	public boolean execute(CommandSender sender, String[] args) {
		// Player player = (Player) sender;

		sender.sendMessage(ChatColor.GOLD + "ProjectFun by Nomar and Ploffie. (ver 0,3)");

		if (sender.hasPermission("projectfun.fun")) {
			sender.sendMessage(ChatColor.AQUA + "/fun" + ChatColor.GOLD + ": Base command.");

		}

		if (sender.hasPermission("projectfun.hug")) {
			sender.sendMessage(ChatColor.AQUA + "/hug <player>" + ChatColor.GOLD + ": Hug a player.");

		}

		if (sender.hasPermission("projectfun.lick")) {
			sender.sendMessage(ChatColor.AQUA + "/lick <player>" + ChatColor.GOLD + ": Lick a player.");

		}

		if (sender.hasPermission("projectfun.slap")) {
			sender.sendMessage(ChatColor.AQUA + "/slap <player>" + ChatColor.GOLD + ": Slap a player.");

		}

		if (sender.hasPermission("projectfun.rekt")) {
			sender.sendMessage(ChatColor.AQUA + "/rek <player>" + ChatColor.GOLD + ": Rek a player like the Call of Duty kids would.");

		}

		sender.sendMessage(ChatColor.GOLD
				+ "All of the above commands have a cooldown of "
				+ ChatColor.RED
				+ PF.getConfig().getString("cooldown")
				+ ChatColor.GOLD + " seconds.");

		if (sender.hasPermission("projectfun.rainbow")) {
			sender.sendMessage(ChatColor.AQUA + "/rainbow" + ChatColor.GOLD + ": Toggle rainbow mode.");

		}

		if (sender.hasPermission("projectfun.hashtags.use")) {
			sender.sendMessage(ChatColor.AQUA + "/hashtag" + ChatColor.GOLD + ": Get a list of HashTags.");

		}

		return true;

	}

}
