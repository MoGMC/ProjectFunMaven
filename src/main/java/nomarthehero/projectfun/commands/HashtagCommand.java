package nomarthehero.projectfun.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HashtagCommand implements CommandExecutor {

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

	private String command = "hashtag";

	private String permission = "projectfun.hashtags.use";

	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {

		if (cmd.getName().equalsIgnoreCase(getCommand())) {

			if (sender instanceof Player) {

				Player player = (Player) sender;

				if (!player.hasPermission(getPerm())) {
					return false;
				}

				else {

					sender.sendMessage(ChatColor.GOLD + "List of Hashtags: ");
					sender.sendMessage(ChatColor.BLUE + "#donger: ヽ༼°ل͜°༽ﾉ ,"
							+ ChatColor.AQUA + " #tableflip: (╯°□°)╯︵ ┻━┻,"
							+ ChatColor.BLUE
							+ " #tableflip2: (╯°Д°）╯︵ /(.□ . \\),"
							+ ChatColor.AQUA + " #molly: ༼ つ ◕_◕ ༽つ,"
							+ ChatColor.BLUE + " #facepalm: (－‸ლ),"
							+ ChatColor.AQUA + " #happy: ☆*｡. o(≧▽≦)o .｡*☆,"
							+ ChatColor.BLUE + " #rage: ლ(ಠ益ಠლ),"
							+ ChatColor.AQUA + " #cry: (╯︵╰,),"
							+ ChatColor.BLUE + " #lenny: ( ͡° ͜ʖ ͡°).");
					return true;
				}

			}

			else
				return true;
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
