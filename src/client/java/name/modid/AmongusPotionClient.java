package name.modid;

import name.modid.entity.ModEntities;
import name.modid.entity.client.AmongusRedRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class AmongusPotionClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		EntityRendererRegistry.register(ModEntities.AMONGUS_RED, AmongusRedRenderer::new);
	}
}