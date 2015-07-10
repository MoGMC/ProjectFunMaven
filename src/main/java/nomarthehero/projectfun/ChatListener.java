package nomarthehero.projectfun;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import nomarthehero.projectfun.Hashtag;
import nomarthehero.projectfun.ProjectFun;

public class ChatListener implements Listener {

	// ProjectFun plugin = ProjectFun.getPlugin();
	Hashtag hashtag = ProjectFun.getPlugin().getHashtag();

	// RainbowEffect REffect = new RainbowEffect();

	@EventHandler
	public void onChat(AsyncPlayerChatEvent event) {

		if (event.getPlayer().hasPermission("projectfun.hashtags.use")) {

			event.setMessage(replaceHashtags(event.getMessage()));

		}

	}

	@EventHandler
	public void onCommand(PlayerCommandPreprocessEvent event) {

		if (event.getPlayer().hasPermission("projectfun.hashtags.use")) {

			event.setMessage(replaceHashtags(event.getMessage()));

		}

	}

	// TODO: merge hashtags into ChatListener for more efficiency
	public String replaceHashtags(String message) {

		String finalMsg = message;

		for (String tag : hashtag.getList()) {

			finalMsg = message.replaceAll(tag, hashtag.getHashtag(tag));

		}

		return finalMsg;

	}

}
