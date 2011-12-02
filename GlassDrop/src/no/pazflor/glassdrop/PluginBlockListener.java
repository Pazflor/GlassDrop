package no.pazflor.glassdrop;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockListener;
import org.bukkit.inventory.ItemStack;

public class PluginBlockListener extends BlockListener {
	
	public static GlassDrop plugin;
	
	public PluginBlockListener(GlassDrop instance) {
		plugin = instance;
	}
	
	public void onBlockBreak(BlockBreakEvent event) {
		
		Block block = event.getBlock();
		if (block.getType() == Material.GLASS) {
			block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.GLASS, 1));
		}
	}

}
