package name.modid;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import name.modid.effect.ModEffects;
import name.modid.entity.ModEntities;
import name.modid.entity.custom.AmongusRedEntity;
import name.modid.item.ModItems;
import name.modid.potion.ModPotions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmongusPotion implements ModInitializer {

	// mod id for putting things in the registry
	public static final String MOD_ID = "amongus_potion";

	// logger for debugging and logging
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		// load all modded additions into the registry
		ModEffects.registerEffects();
		ModItems.registerModItems();
		ModPotions.registerPotions();

		FabricDefaultAttributeRegistry.register(ModEntities.AMONGUS_RED, AmongusRedEntity.setAttributes());
	}
}