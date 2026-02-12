package com.drchedda.practicalelements.item;

import com.drchedda.practicalelements.PracticalElements;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PracticalElements.MOD_ID);

    public static final Supplier<CreativeModeTab> PRACTICAL_ELEMENTS_TAB = CREATIVE_MODE_TAB.register("practical_elements_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.HYDROGEN.get()))
                    .title(Component.translatable("Practical Elements"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.HYDROGEN.get());
                    }).build());


    public static void register (IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
