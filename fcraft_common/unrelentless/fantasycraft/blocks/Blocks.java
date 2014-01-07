package unrelentless.fantasycraft.blocks;

import unrelentless.fantasycraft.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Blocks {
	
	public static Block MythrilOre_Block;
	
	public static void init(){
		
		MythrilOre_Block = new MythrilOre_Block(1000);

		
		GameRegistry.registerBlock(MythrilOre_Block, Strings.MYTHRILORE_NAME);
			
	}

}
