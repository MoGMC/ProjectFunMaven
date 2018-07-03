package nomarthehero.projectfun.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public abstract class BaseCommand implements CommandExecutor {

	// Make sure to register the command in ProjectFun

	private final String COMMAND_NAME;

	public BaseCommand(String commandName) {
		COMMAND_NAME = commandName;

	}

	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {

			if (!(sender instanceof Player)) {
				sender.sendMessage("Only a player can use this command.");
				return false;

			}

			return execute(sender, args);
	}

	public abstract boolean execute(CommandSender sender, String[] args);

	public String getName() {
		return COMMAND_NAME;
	}

}
