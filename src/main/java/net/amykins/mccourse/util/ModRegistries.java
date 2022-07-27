package net.amykins.mccourse.util;

import net.amykins.mccourse.MCCourseMod;
import net.amykins.mccourse.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void registerModStuffs(){
        registerFuels();
    }

    private static void registerFuels(){
        System.out.println("Registering Fuels for " + MCCourseMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        // 400 / 20 = 20 seconds

        registry.add(ModItems.COAL_SLIVER, 400);

    }
}
