import assets.blocks.TestBlock;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

@Mod(modid=rpgMod.MODID, name=rpgMod.NAME, version=rpgMod.VERSION)
public class rpgMod {
    public static final String MODID = "rpgmod";
    public static final String NAME = "rpg Mod";
    public static final String VERSION = "1.0.0";

    public static CreativeTabs testTab = new CreativeTabs("TestTab") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Blocks.anvil);
        }
    };

    public static Block TestBlock;

    @EventHandler
    public void init(FMLInitializationEvent e){

    }
    @EventHandler
    public void preInit(FMLPreInitializationEvent e){
        TestBlock = new TestBlock(Material.rock);
        GameRegistry.registerBlock(TestBlock, "testblock");

    }

}
