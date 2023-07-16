package name.modid.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static name.modid.AmongusPotion.MOD_ID;

public class ModEffects {
    public static StatusEffect AMONGED;

    public static StatusEffect registerEffect(String name) {
        // statuseffect registry item
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, name), new AmongedEffect(StatusEffectCategory.NEUTRAL, 3124687));
    }

    // register statuseffect function
    public static void registerEffects() {
        AMONGED = registerEffect("amonged");
    }
}
