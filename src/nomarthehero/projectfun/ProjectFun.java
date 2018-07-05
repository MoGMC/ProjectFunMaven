package nomarthehero.projectfun;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import nomarthehero.projectfun.RainbowEffect;
import nomarthehero.projectfun.commands.*;

public class ProjectFun extends JavaPlugin implements Listener {

	public HashMap<String, Long> hugCool = new HashMap<String, Long> ();
	public HashMap<String, Long> slapCool = new HashMap<String, Long> ();
	public HashMap<String, Long> rageCool = new HashMap<String, Long> ();

	public Set<String> didRage = new HashSet<String> ();
	public Set<String> hasRainbow = new HashSet<String> ();

	private static ProjectFun plugin;
	private static int cooldown;

	public void onEnable () {

		// changed seconds to mls
		cooldown = this.getConfig ().getInt ("cooldown") * 1000;

		plugin = this;

		registerAllCommands ();

		getServer ().getPluginManager ().registerEvents (new ChatListener (), this);
		getServer ().getPluginManager ().registerEvents (new RainbowEffect (), this);

		saveDefaultConfig ();

	}

	public void registerAllCommands () {

		getCommand ("slap").setExecutor (new SlapCommand ());
		getCommand ("hug").setExecutor (new HugCommand ());
		getCommand ("lick").setExecutor (new LickCommand ());
		getCommand ("rainbow").setExecutor (new RainbowCommand ());
		getCommand ("rek").setExecutor (new RektCommand ());
		getCommand ("fun").setExecutor (new FunCommand ());
		getCommand ("hashtag").setExecutor (new HashtagCommand ());
		getCommand ("dab").setExecutor (new DabCommand ());

	}

	public static int getCooldown () { return cooldown; }

	public static ProjectFun getPlugin () { return plugin; }

}