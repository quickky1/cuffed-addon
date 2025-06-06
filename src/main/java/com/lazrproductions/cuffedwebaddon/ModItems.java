package com.lazrproductions.cuffedwebaddon;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod.EventBusSubscriber(modid = CuffedWebAddon.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CuffedWebAddon.MODID);

    public static final RegistryObject<Item> WEB_HANDS = ITEMS.register("web_hands", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WEB_FEET = ITEMS.register("web_feet", () -> new Item(new Item.Properties()));

    static {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}