package nomarthehero.projectfun;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import nomarthehero.projectfun.ChatListener;
import nomarthehero.projectfun.RainbowEffect;
import nomarthehero.projectfun.Hashtag;
import nomarthehero.projectfun.commands.*;

public class ProjectFun extends JavaPlugin implements Listener {

	public HashMap<String, Long> hugCool = new HashMap<String, Long>();
	public HashMap<String, Long> slapCool = new HashMap<String, Long>();
	public HashMap<String, Long> rageCool = new HashMap<String, Long>();
	public HashMap<String, Long> lickCool = new HashMap<String, Long>();
	public HashMap<String, Long> rektCool = new HashMap<String, Long>();

	public Set<String> didRage = new HashSet<String>();
	public Set<String> hasRainbow = new HashSet<String>();

	/*
	 * TODO: hashtags command, list of hashtags if statement on funcommand using
	 * permissions seperate class for all messages, perhaps config?
	 */

	private static ProjectFun plugin;

	Hashtag hashtag = new Hashtag();

	public void onEnable() {
		plugin = this;

		registerAllCommands();

		hashtag.registerHashtags();

		getServer().getPluginManager().registerEvents(new ChatListener(), this);
		getServer().getPluginManager()
				.registerEvents(new RainbowEffect(), this);

		saveDefaultConfig();

	}

	public void onDisable() {

	}

	public void registerAllCommands() {

		plugin.getCommand("slap").setExecutor(new SlapCommand());
		plugin.getCommand("hug").setExecutor(new HugCommand());
		plugin.getCommand("lick").setExecutor(new LickCommand());
		plugin.getCommand("rainbow").setExecutor(new RainbowCommand());
		plugin.getCommand("rek").setExecutor(new RektCommand());
		plugin.getCommand("fun").setExecutor(new FunCommand());
		plugin.getCommand("hashtag").setExecutor(new HashtagCommand());

	}

	public static ProjectFun getPlugin() {
		return plugin;
	}

	public Hashtag getHashtag() {
		return hashtag;
	}
}