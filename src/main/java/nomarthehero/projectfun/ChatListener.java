package nomarthehero.projectfun;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class ChatListener implements Listener {

	// have a seperate hashtagList to allow things like "tableflip2"
	private HashMap<String, String> hashtags = new HashMap<String, String>();
	private ArrayList<String> hashtagList = new ArrayList<String>();

	// RainbowEffect REffect = new RainbowEffect();

	public ChatListener() {
		registerHashtags();

	}

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

		for (String tag : hashtagList) {
			finalMsg = finalMsg.replaceAll(tag, hashtags.get(tag));

		}

		return finalMsg;

	}

	public void registerHashtags() {

		// PUT NEW WORDS WITH REPLACEMENTS HERE
		// addHashtag("#hashtag", "emoji");
		addHashtag("#donger", "ヽ༼°ل͜°༽ﾉ");
		addHashtag("#tableflip2", "(╯°Д°）╯︵ /(.□ . \\)");
		addHashtag("#tableflip", "(╯°□°)╯︵ ┻━┻");
		addHashtag("#molly", "༼ つ ◕_◕ ༽つ");
		addHashtag("#happy", "☆*｡. o(≧▽≦)o .｡*☆");
		addHashtag("#facepalm", "(－‸ლ)");
		addHashtag("#rage", "ლ(ಠ益ಠლ)");
		addHashtag("#cry", "(╯︵╰,)");
		addHashtag("#lenny", "( ͡° ͜ʖ ͡°)");
		addHashtag("#shrug", "¯\\_(ツ)_/¯");
		addHashtag("#derp", "ヽ(◉◡◔)ﾉ");

	}

	private void addHashtag(String hashtag, String replacement) {
		hashtags.put("(?i)" + hashtag, replacement);
		hashtagList.add("(?i)" + hashtag);

	}

}
