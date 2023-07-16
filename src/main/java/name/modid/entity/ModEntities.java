package name.modid.entity;

import name.modid.AmongusPotion;
import name.modid.entity.custom.AmongusRedEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModEntities {
    public static final EntityType<AmongusRedEntity> AMONGUS_RED = Registry.register(Registries.ENTITY_TYPE, new Identifier(AmongusPotion.MOD_ID, "amongus_red"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, AmongusRedEntity::new).dimensions(EntityDimensions.fixed(1.5f, 1.75f)).build());
}
