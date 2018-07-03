package nomarthehero.projectfun.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import nomarthehero.projectfun.ProjectFun;

public class RainbowCommand extends BaseCommand {

	public RainbowCommand() {
		super("rainbow");

	}

	ProjectFun PF = ProjectFun.getPlugin();

	@Override
	public boolean execute(CommandSender sender, String[] args) {

		if (PF.hasRainbow.contains(sender.getName())) {
			PF.hasRainbow.remove(sender.getName());
			sender.sendMessage(ChatColor.YELLOW
					+ "Rainbow mode disabled!");
			return true;

		} else {
			PF.hasRainbow.add(sender.getName());
			sender.sendMessage(ChatColor.YELLOW
					+ "Rainbow mode enabled!");
			return true;

		}

	}

}
