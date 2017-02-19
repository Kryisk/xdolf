package com.darkcart.xcheat.mods.world;

import org.lwjgl.input.Keyboard;

import com.darkcart.xcheat.Client;
import com.darkcart.xcheat.Module;

import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;

public class Fullbright extends Module {

	@Override
	public void enable() {
		PotionEffect nightVision = new PotionEffect(Potion.getPotionById(16), Integer.MAX_VALUE, 0);
		nightVision.setPotionDurationMax(true);
		Client.mc.player.addPotionEffect(nightVision);
	}

	@Override
	public void disable() {
		try {
			Client.mc.player.removeActivePotionEffect(Potion.getPotionById(16));
		}catch(Exception ex){/*incase there is no effect to remove*/}
	}

	@Override
	public void tick() {
	}

	@Override
	public int getKeyCode() {
		return Keyboard.KEY_B;
	}
	
	@Override
	public String getName() {
		return "Fullbright";
	}

	@Override
	public String getDescription() {
		return "Activates NightVision potion effect.";
	}
}