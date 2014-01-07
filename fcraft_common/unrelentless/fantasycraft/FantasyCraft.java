package unrelentless.fantasycraft;

import unrelentless.fantasycraft.lib.Reference;
import unrelentless.fantasycraft.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

//Mod Information
@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.MODVERSION)

public class FantasyCraft {

	//Proxy Instance
	@SidedProxy( clientSide = "unrelentless.fantasycraft.proxy.ClientProxy", serverSide = "unrelentless.fantasycraft.proxy.CommonProxy")	
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
	}
	@EventHandler
	public void init(FMLInitializationEvent event){
		
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
