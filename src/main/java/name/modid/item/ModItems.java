package name.modid.item;

import name.modid.AmongusPotion;
import name.modid.entity.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item AMONGUS_RED_SPAWN_EGG = registerItem("amongus_red_spawn_egg",
            new SpawnEggItem(ModEntities.AMONGUS_RED, 0xD57E36, 0x1D0D00,
                    new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AmongusPotion.MOD_ID, name), item);
    }
    public static void registerModItems() {
        AmongusPotion.LOGGER.info("Registering Mod Items for " + AmongusPotion.MOD_ID);
    }
}