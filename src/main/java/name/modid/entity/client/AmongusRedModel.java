package name.modid.entity.client;

import name.modid.AmongusPotion;
import net.minecraft.util.Identifier;
import name.modid.entity.custom.AmongusRedEntity;
import software.bernie.geckolib.model.GeoModel;

public class AmongusRedModel extends GeoModel<AmongusRedEntity> {
    @Override
    public Identifier getModelResource(AmongusRedEntity animatable) {
        return new Identifier(AmongusPotion.MOD_ID, "geo/amongus_red.geo.json");
    }

    @Override
    public Identifier getTextureResource(AmongusRedEntity animatable) {
        return new Identifier(AmongusPotion.MOD_ID, "textures/entity/amongus_red.png");
    }

    @Override
    public Identifier getAnimationResource(AmongusRedEntity animatable) {
        return new Identifier(AmongusPotion.MOD_ID, "animations/amongus_red.animation.json");
    }
}
