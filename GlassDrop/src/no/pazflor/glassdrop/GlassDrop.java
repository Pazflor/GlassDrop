package no.pazflor.glassdrop;

import org.bukkit.event.Event.Priority;
import org.bukkit.event.Event.Type;
import org.bukkit.plugin.java.JavaPlugin;

public class GlassDrop extends JavaPlugin {
	
	public PluginBlockListener bListener = new PluginBlockListener(this);

	@Override
	public void onDisable() {
		
		System.out.println(this + " disabled.");
	}

	@Override
	public void onEnable() {
		
		getServer().getPluginManager().registerEvent(Type.BLOCK_BREAK, bListener, Priority.Normal, this);
		
		System.out.println(this + " enabled.");
	}

}
