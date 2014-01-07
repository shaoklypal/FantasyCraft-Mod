package unrelentless.fantasycraft.blocks;

import unrelentless.fantasycraft.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Blocks {
	
	public static Block MythrilOre_Block;
	public static Block OrichOre_Block;
	public static Block AdamOre_Block;
	
	public static void init(){
		
		MythrilOre_Block = new Ore_Mythril_Block(1000);
		OrichOre_Block = new Ore_Orich_Block(1001);
		AdamOre_Block = new Ore_Adam_Block(1002);
		
		GameRegistry.registerBlock(MythrilOre_Block, Strings.MYTHRILORE_NAME);
		GameRegistry.registerBlock(AdamOre_Block, Strings.ADAMORE_NAME);
		GameRegistry.registerBlock(OrichOre_Block, Strings.ORICHORE_NAME);
	}

}
