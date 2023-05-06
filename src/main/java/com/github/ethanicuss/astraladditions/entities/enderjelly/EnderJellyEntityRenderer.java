package com.github.ethanicuss.astraladditions.entities.enderjelly;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class EnderJellyEntityRenderer extends GeoEntityRenderer<EnderJellyEntity> {
    public EnderJellyEntityRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new EnderJellyEntityModel());
    }

    @Override
    public void render(GeoModel model, EnderJellyEntity animatable, float partialTick, RenderLayer type, MatrixStack poseStack, @Nullable VertexConsumerProvider bufferSource, @Nullable VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        // System.out.println("partial tick " + partialTick);
        // model.topLevelBones.forEach(bone -> bone.setRotationX((float) Math.PI));
        super.render(model, animatable, partialTick, type, poseStack, bufferSource, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
