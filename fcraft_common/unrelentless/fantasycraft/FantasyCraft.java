package unrelentless.fantasycraft;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import unrelentless.fantasycraft.blocks.Blocks;
import unrelentless.fantasycraft.lib.Reference;
import unrelentless.fantasycraft.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

//Mod Information
@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.MODVERSION)
//No idea what this does.
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class FantasyCraft {

	@Instance(Reference.MODID)
	public static FantasyCraft instance;
	
	//Proxy Instance
	@SidedProxy( clientSide = "unrelentless.fantasycraft.proxy.ClientProxy", serverSide = "unrelentless.fantasycraft.proxy.CommonProxy")	
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		Blocks.init();
	}
	@EventHandler
	public void init(FMLInitializationEvent event){
		
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
