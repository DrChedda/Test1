package com.drchedda.practicalelements.item;

import com.drchedda.practicalelements.PracticalElements;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PracticalElements.MOD_ID);

    public static final DeferredItem<Item> HYDROGEN = ITEMS.register("hydrogen", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HELIUM = ITEMS.register("helium", ()-> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
