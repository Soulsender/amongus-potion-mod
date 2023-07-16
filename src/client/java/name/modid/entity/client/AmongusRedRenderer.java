package name.modid.entity.client;

import name.modid.entity.custom.AmongusRedEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class AmongusRedRenderer extends GeoEntityRenderer<AmongusRedEntity> {
    public AmongusRedRenderer(EntityRendererFactory.Context renderManager, GeoModel<AmongusRedEntity> model) {
        super(renderManager, model);
    }
}

