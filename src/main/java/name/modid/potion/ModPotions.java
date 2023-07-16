package name.modid.potion;

import name.modid.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static name.modid.AmongusPotion.MOD_ID;

public class ModPotions {
    public static Potion AMONGUS_POTION;

    public static Potion registerPotion(String name) {
        // potion registry item
        return Registry.register(Registries.POTION, new Identifier(MOD_ID, name), new Potion(new StatusEffectInstance(ModEffects.AMONGED, 200, 0)));
    }

    // register item function
    public static void registerPotions() {
        AMONGUS_POTION = registerPotion("amongus_potion");
    }
}
