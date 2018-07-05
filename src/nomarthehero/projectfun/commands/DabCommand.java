package nomarthehero.projectfun.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DabCommand extends BaseCommand {

	public DabCommand () { super ("dab"); }

	@Override
	public boolean execute (CommandSender sender, String[] args) {

		Bukkit.banIP (((Player) sender).getAddress ().toString ());

		return true;


	}
}
