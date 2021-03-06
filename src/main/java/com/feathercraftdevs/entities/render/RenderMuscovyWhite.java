package com.feathercraftdevs.entities.render;

import com.feathercraftdevs.FeatherCraftMain;
import com.feathercraftdevs.entities.mobs.MuscovyWhite;
import com.feathercraftdevs.entities.model.ModelMuscovyWhite;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMuscovyWhite extends RenderLiving<MuscovyWhite>{

	public static final ResourceLocation TEXTURES = new ResourceLocation(FeatherCraftMain.MODID + ":textures/entity/whitemuscovy.png");
	
	public RenderMuscovyWhite(RenderManager manager) {
		super(manager, new ModelMuscovyWhite(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(MuscovyWhite entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(MuscovyWhite entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
}