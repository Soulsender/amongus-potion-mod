package name.modid.entity.client;

import name.modid.AmongusPotion;
import name.modid.entity.custom.AmongusRedEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class AmongusRedRenderer extends GeoEntityRenderer<AmongusRedEntity> {
    public AmongusRedRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new AmongusRedModel());
    }

    @Override
    public Identifier getTextureLocation(AmongusRedEntity animatable) {
        return new Identifier(AmongusPotion.MOD_ID, "textures/entity/amongus_red.png");
    }

    @Override
    public void render(AmongusRedEntity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        if (entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}

