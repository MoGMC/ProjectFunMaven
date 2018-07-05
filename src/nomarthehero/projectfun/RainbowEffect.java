package nomarthehero.projectfun;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.Random;

public class RainbowEffect implements Listener {

	private ProjectFun PF = ProjectFun.getPlugin ();

	@EventHandler
	public void onChat (AsyncPlayerChatEvent event) {

		if (!PF.hasRainbow.contains (event.getPlayer ().getName ())) return;

		StringBuilder b = new StringBuilder ();

		String[] words = event.getMessage ().split (" ");

		for (String word : words) {

			b.append (randColor ());
			b.append (word);

		}

		event.setMessage (b.toString ());


	}

	private final ChatColor[] COLORS = {
		ChatColor.BLACK, ChatColor.DARK_BLUE, ChatColor.DARK_GREEN, ChatColor.DARK_AQUA,
		ChatColor.DARK_RED, ChatColor.DARK_PURPLE, ChatColor.GOLD, ChatColor.GRAY,
		ChatColor.DARK_GRAY, ChatColor.BLUE, ChatColor.GREEN, ChatColor.AQUA,
		ChatColor.RED, ChatColor.LIGHT_PURPLE, ChatColor.YELLOW, ChatColor.WHITE
	};

	private static Random rand = new Random ();

	private String randColor () { return COLORS[rand.nextInt (COLORS.length)].toString (); }

}