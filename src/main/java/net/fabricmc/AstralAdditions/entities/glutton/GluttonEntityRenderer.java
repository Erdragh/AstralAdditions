package net.fabricmc.AstralAdditions.entities.glutton;

import net.fabricmc.AstralAdditions.AstralAdditions;
import net.fabricmc.AstralAdditions.AstralAdditionsClient;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class GluttonEntityRenderer extends MobEntityRenderer<GluttonEntity, GluttonEntityModel<GluttonEntity>> {

    public GluttonEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new GluttonEntityModel(context.getPart(AstralAdditionsClient.MODEL_GLUTTON_LAYER)), 0.5f);
        this.addFeature(new GluttonEyesFeatureRenderer<GluttonEntity>(this));
    }

    @Override
    public Identifier getTexture(GluttonEntity entity){
        return new Identifier(AstralAdditions.MOD_ID, "textures/entity/glutton/glutton.png");
    }
}