package nomarthehero.projectfun;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class RainbowEffect implements Listener {

	static Random rand = new Random();

	ProjectFun PF = ProjectFun.getPlugin();

	@EventHandler
	public void onChat(AsyncPlayerChatEvent event) {

		if (PF.hasRainbow.contains(event.getPlayer().getName())) {

			String message = event.getMessage();
			String newMessage;

			String[] words = message.split(" ");

			int x = rand.nextInt(15);
			newMessage = getColorFirst(x) + words[0];

			for (int i = 1; i < words.length; i++) {
				int y = rand.nextInt(15);
				newMessage = newMessage + getColor(y) + words[i];

			}

			event.setMessage(newMessage);

		}

	}

	private String getColor(int i) {
		switch (i) {
		case 0:
			return ChatColor.BLACK + " ";
		case 1:
			return ChatColor.DARK_BLUE + " ";
		case 2:
			return ChatColor.DARK_GREEN + " ";
		case 3:
			return ChatColor.DARK_AQUA + " ";
		case 4:
			return ChatColor.DARK_RED + " ";
		case 5:
			return ChatColor.DARK_PURPLE + " ";
		case 6:
			return ChatColor.GOLD + " ";
		case 7:
			return ChatColor.GRAY + " ";
		case 8:
			return ChatColor.DARK_GRAY + " ";
		case 9:
			return ChatColor.BLUE + " ";
		case 10:
			return ChatColor.GREEN + " ";
		case 11:
			return ChatColor.AQUA + " ";
		case 12:
			return ChatColor.RED + " ";
		case 13:
			return ChatColor.LIGHT_PURPLE + " ";
		case 14:
			return ChatColor.YELLOW + " ";
		case 15:
			return ChatColor.WHITE + " ";
		}
		return null;
	}

	private String getColorFirst(int i) {
		switch (i) {
		case 0:
			return ChatColor.BLACK + "";
		case 1:
			return ChatColor.DARK_BLUE + "";
		case 2:
			return ChatColor.DARK_GREEN + "";
		case 3:
			return ChatColor.DARK_AQUA + "";
		case 4:
			return ChatColor.DARK_RED + "";
		case 5:
			return ChatColor.DARK_PURPLE + "";
		case 6:
			return ChatColor.GOLD + "";
		case 7:
			return ChatColor.GRAY + "";
		case 8:
			return ChatColor.DARK_GRAY + "";
		case 9:
			return ChatColor.BLUE + "";
		case 10:
			return ChatColor.GREEN + "";
		case 11:
			return ChatColor.AQUA + "";
		case 12:
			return ChatColor.RED + "";
		case 13:
			return ChatColor.LIGHT_PURPLE + "";
		case 14:
			return ChatColor.YELLOW + "";
		case 15:
			return ChatColor.WHITE + "";
		}
		return null;
	}

}