package com.lazrproductions.cuffedwebaddon.restraints.custom;

import com.lazrproductions.cuffed.client.model.RestraintModelInterface;
import com.lazrproductions.cuffed.restraints.base.AbstractArmRestraint;
import com.lazrproductions.cuffedwebaddon.client.ModClient;
import net.minecraft.world.item.ItemStack;

public class WebHandsRestraint extends AbstractArmRestraint {

    public WebHandsRestraint(Properties properties) {
        super(properties);
    }

    @Override
    public boolean blocksInteraction() {
        return true;
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }

    @Override
    public RestraintModelInterface getModelInterface() {
        return ModClient.WEB_MODEL;
    }
}
