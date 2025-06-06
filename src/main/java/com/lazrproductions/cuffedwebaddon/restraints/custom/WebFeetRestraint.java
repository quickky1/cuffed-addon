package com.lazrproductions.cuffedwebaddon.restraints.custom;

import com.lazrproductions.cuffed.client.model.RestraintModelInterface;
import com.lazrproductions.cuffed.restraints.base.AbstractLegRestraint;
import com.lazrproductions.cuffedwebaddon.client.ModClient;
import net.minecraft.world.item.ItemStack;

public class WebFeetRestraint extends AbstractLegRestraint {

    public WebFeetRestraint(Properties properties) {
        super(properties);
    }

    @Override
    public boolean blocksMovement() {
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
