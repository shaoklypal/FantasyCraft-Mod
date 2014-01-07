package unrelentless.fantasycraft.blocks;

import unrelentless.fantasycraft.lib.Reference;
import unrelentless.fantasycraft.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Ore_Mythril_Block extends Block {
	
	public Ore_Mythril_Block(int id){
		super(id, Material.rock);
		this.setHardness(20.0F);
		this.setResistance(25.0F);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName(Strings.MYTHRILORE_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		
		//registers the block
		blockIcon = iconRegister.registerIcon(String.format("%s:%s", Reference.MODID.toLowerCase(), getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
		
	}
	
	//Makes sure that only the name and not tile.name is sent.
	protected String getUnwrappedUnlocalizedName(String name){
		return name.substring(name.indexOf(".") + 1);
	}

}
