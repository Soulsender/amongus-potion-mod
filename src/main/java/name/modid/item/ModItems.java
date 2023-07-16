package name.modid.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static name.modid.AmongusPotion.MOD_ID;


public class ModItems {
    public static Item AMONGOID = new Item(new FabricItemSettings());

    public static Item registerItem(String name) {
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, name), AMONGOID);
    }

    public static void registerItems() {
        AMONGOID = registerItem("amongoid");
    }

}


