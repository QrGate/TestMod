package assets.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TestBlock extends Block {
    public TestBlock (Material material){
        super(material);
        setCreativeTab(rpgMod.);
        setBlockName(rpgMod.MODID + "." + "testblock");
    }
}
