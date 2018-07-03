package nomarthehero.projectfun.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class HashtagCommand extends BaseCommand {

	public HashtagCommand() {
		super("hashtag");

	}

	@Override
	public boolean execute(CommandSender sender, String[] args) {

		sender.sendMessage(ChatColor.GOLD + "List of Hashtags: ");
		sender.sendMessage(ChatColor.BLUE + "#donger: ヽ༼°ل͜°༽ﾉ ,"
				+ ChatColor.AQUA + " #tableflip: (╯°□°)╯︵ ┻━┻,"
				+ ChatColor.BLUE + " #tableflip2: (╯°Д°）╯︵ /(.□ . \\),"
				+ ChatColor.AQUA + " #molly: ༼ つ ◕_◕ ༽つ,"
				+ ChatColor.BLUE + " #facepalm: (－‸ლ),"
				+ ChatColor.AQUA + " #happy: ☆*｡. o(≧▽≦)o .｡*☆,"
				+ ChatColor.BLUE + " #rage: ლ(ಠ益ಠლ),"
				+ ChatColor.AQUA + " #cry: (╯︵╰,),"
				+ ChatColor.BLUE + " #lenny: ( ͡° ͜ʖ ͡°)"
				+ ChatColor.AQUA + " #derp: ヽ(◉◡◔)ﾉ"
				+ ChatColor.BLUE + " #shrug: ¯\\_(ツ)_/¯");

		return true;

	}

}
