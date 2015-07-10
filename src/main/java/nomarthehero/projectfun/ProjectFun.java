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

	public Set<String> didRage = new HashSet<String>();
	public Set<String> hasRainbow = new HashSet<String>();

	/*
	 * TODO: hashtags command, list of hashtags if statement on funcommand using
	 * permissions seperate class for all messages, perhaps config?
	 */

	private static ProjectFun plugin;
	private static int cooldown;

	Hashtag hashtag = new Hashtag();

	public void onEnable() {

		// changed seconds to mls
		cooldown = this.getConfig().getInt("cooldown") * 1000;

		plugin = this;

		registerAllCommands();

		hashtag.registerHashtags();

		getServer().getPluginManager().registerEvents(new ChatListener(), this);
		getServer().getPluginManager().registerEvents(new RainbowEffect(), this);

		saveDefaultConfig();

	}

	public void onDisable() {

	}

	public void registerAllCommands() {

		this.getCommand("slap").setExecutor(new SlapCommand());
		this.getCommand("hug").setExecutor(new HugCommand());
		this.getCommand("lick").setExecutor(new LickCommand());
		this.getCommand("rainbow").setExecutor(new RainbowCommand());
		this.getCommand("rek").setExecutor(new RektCommand());
		this.getCommand("fun").setExecutor(new FunCommand());
		this.getCommand("hashtag").setExecutor(new HashtagCommand());

	}

	public Hashtag getHashtag() {
		return hashtag;
	}

	public static int getCooldown() {
		return cooldown;

	}

	public static ProjectFun getPlugin() {
		return plugin;

	}

}