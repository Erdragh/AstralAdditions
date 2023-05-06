package com.github.ethanicuss.astraladditions.entities.enderjelly;

import com.github.ethanicuss.astraladditions.AstralAdditions;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;
import net.minecraft.util.math.MathHelper;

public class EnderJellyEntityModel extends AnimatedGeoModel<EnderJellyEntity> {
    private static final Identifier
        modelResource = new Identifier(AstralAdditions.MOD_ID, "geo/ender_jelly.geo.json"),
        textureResource = new Identifier(AstralAdditions.MOD_ID, "textures/entity/ender_jelly.png"),
        animationResource = new Identifier(AstralAdditions.MOD_ID, "animations/ender_jelly.animation.json");

    @Override
    public Identifier getModelLocation(EnderJellyEntity object) {
        return modelResource;
    }

    @Override
    public Identifier getTextureLocation(EnderJellyEntity object) {
        return textureResource;
    }

    @Override
    public Identifier getAnimationFileLocation(EnderJellyEntity animatable) {
        return animationResource;
    }

    @Override
    public void setCustomAnimations(EnderJellyEntity animatable, int instanceId, AnimationEvent animationEvent) {
        super.setCustomAnimations(animatable, instanceId, animationEvent);
        IBone head = this.getAnimationProcessor().getBone("root_joint");

        EntityModelData extraData = (EntityModelData) animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(45 * MathHelper.RADIANS_PER_DEGREE);
            //head.setRotationX(extraData.headPitch * MathHelper.RADIANS_PER_DEGREE);
            //head.setRotationY(extraData.netHeadYaw * MathHelper.RADIANS_PER_DEGREE);
        }
    }
}
