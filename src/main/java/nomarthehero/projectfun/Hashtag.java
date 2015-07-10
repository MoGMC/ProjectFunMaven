package nomarthehero.projectfun;

import java.util.HashMap;
import java.util.Set;

public class Hashtag {

	// INSERT HASHTAGS HERE FOR IN CHAT, EXAMPLE: #tableflip

	private HashMap<String, String> words = new HashMap<String, String>();

	public void registerHashtags() {

		// PUT NEW WORDS WITH REPLACEMENTS HERE
		// add("#hashtag", "emoji");
		add("#donger", "ヽ༼°ل͜°༽ﾉ");
		add("#tableflip2", "(╯°Д°）╯︵ /(.□ . \\)");
		add("#tableflip", "(╯°□°)╯︵ ┻━┻");
		add("#molly", "༼ つ ◕_◕ ༽つ");
		add("#happy", "☆*｡. o(≧▽≦)o .｡*☆");
		add("#facepalm", "(－‸ლ)");
		add("#rage", "ლ(ಠ益ಠლ)");
		add("#cry", "(╯︵╰,)");
		add("#lenny", "( ͡° ͜ʖ ͡°)");

	}

	public Set<String> getList() {
		return words.keySet();
	}

	public String getHashtag(String hashtag) {
		return words.get(hashtag);
	}

	public boolean containsHashtag(String hashtag) {
		if (words.containsKey(hashtag))
			return true;
		else
			return false;
	}

	private void add(String hashtag, String replacement) {
		words.put("(?i)" + hashtag, replacement);
	}

}
