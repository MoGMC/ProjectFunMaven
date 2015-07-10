package nomarthehero.projectfun;

import java.util.HashMap;

import mkremins.fanciful.FancyMessage;

public class Hashtag {
	
	// INSERT HASHTAGS HERE FOR IN CHAT, EXAMPLE: #tableflip
	
	private HashMap<String, String> words = new HashMap<String, String>();
	
	public void registerHashtags() {
			
		//PUT NEW WORDS WITH REPLACEMENTS HERE
		//add("#hashtag", new FancyMessage("emoji").formattedTooltip(new FancyMessage("#hashtag")).toJSONString());
		add("#donger",
			new FancyMessage("ヽ༼°ل͜°༽ﾉ")
				.formattedTooltip(new FancyMessage("#donger"))
				.toJSONString());
		add("#tableflip2",
				new FancyMessage("(╯°Д°）╯︵ /(.□ . \\)")
					.formattedTooltip(new FancyMessage("#tableflip2"))
					.toJSONString());
		add("#tableflip",
				new FancyMessage("(╯°□°)╯︵ ┻━┻")
					.formattedTooltip(new FancyMessage("#tableflip"))
					.toJSONString());		
		add("#molly",
				new FancyMessage("༼ つ ◕_◕ ༽つ")
					.formattedTooltip(new FancyMessage("#molly"))
					.toJSONString());
		add("#happy",
				new FancyMessage("☆*｡. o(≧▽≦)o .｡*☆")
					.formattedTooltip(new FancyMessage("#happy"))
					.toJSONString());
		add("#facepalm",
				new FancyMessage("(－‸ლ)")
					.formattedTooltip(new FancyMessage("#facepalm"))
					.toJSONString());
		add("#rage",
				new FancyMessage("ლ(ಠ益ಠლ)")
					.formattedTooltip(new FancyMessage("#rage"))
					.toJSONString());
		add("#cry",
				new FancyMessage("(╯︵╰,)")
					.formattedTooltip(new FancyMessage("#cry"))
					.toJSONString());
		add("#lenny",
				new FancyMessage("( ͡° ͜ʖ ͡°)")
					.formattedTooltip(new FancyMessage("#lenny"))
					.toJSONString());
		add("sauron", "loser");
		
	}
	
	
	public HashMap<String, String> getList() {		
		return words;		
	}
	
	public String getHashtag(String hashtag) {
		return getList().get(hashtag);
	}
	
	public boolean containsHashtag(String hashtag) {
		if (words.containsKey(hashtag)) 
			return true;
		else return false;
	}
	
	private void add(String hashtag, String replacement) {		
		words.put(hashtag, replacement);		
	}
	
}
