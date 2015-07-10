package nomarthehero.projectfun.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import nomarthehero.projectfun.ProjectFun;

public class FunCommand implements CommandExecutor {
	
	/*
	 * COPY THIS WHOLE CLASS INTO A NEW CLASS FOR A NEW COMMAND
	 * 
	 * Replace "String command = null" with the command, for example "String command = slap" (make sure it's lowercase)
	 * Replace "String permission = null" with the permission you set it to in the plugin.yml, for example "String permission = projectfun.command.slap" (lowercase)
	 * 
	 * Make sure to register the command in ProjectFun
	 */
	
	private String command = "fun";
	
	private String permission = "projectfun.fun";
	
	ProjectFun PF = ProjectFun.getPlugin();
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase(getCommand())) {
		
			if (sender instanceof Player) {
				
				Player player = (Player)sender;
				
				if (!player.hasPermission(getPerm())) {					
					return false;				
				}
				
				else {
					
					sender.sendMessage(ChatColor.GOLD + "ProjectFun by Nomar and Ploffie.");
					if(sender.hasPermission("projectfun.fun")) {
					sender.sendMessage(ChatColor.AQUA + "/fun" + ChatColor.GOLD + ": Base command.");
					}
					if(sender.hasPermission("projectfun.hug")) {
					sender.sendMessage(ChatColor.AQUA + "/hug <player>" + ChatColor.GOLD + ": Hug a player.");
					}
					if(sender.hasPermission("projectfun.lick")) {
					sender.sendMessage(ChatColor.AQUA + "/lick <player>" + ChatColor.GOLD + ": Lick a player.");
					}
					if(sender.hasPermission("projectfun.slap")) {
					sender.sendMessage(ChatColor.AQUA + "/slap <player>" + ChatColor.GOLD + ": Slap a player.");
					}
					if(sender.hasPermission("projectfun.rekt")) {
					sender.sendMessage(ChatColor.AQUA + "/rek <player>" + ChatColor.GOLD + ": Rek a player like the Call of Duty kids would.");
					}
					sender.sendMessage(ChatColor.GOLD + "All of the above commands have a cooldown of " + ChatColor.RED + PF.getConfig().getString("cooldown") + ChatColor.GOLD + " seconds.");
					if(sender.hasPermission("projectfun.rainbow")) {
					sender.sendMessage(ChatColor.AQUA + "/rainbow" + ChatColor.GOLD + ": Toggle rainbow mode.");
					}
					if(sender.hasPermission("projectfun.hashtags.use")) {
					sender.sendMessage(ChatColor.AQUA + "/hashtag" + ChatColor.GOLD + ": Get a list of HashTags.");
					}
					
					return true;
				}
				
			}
			
			else return true;			
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
