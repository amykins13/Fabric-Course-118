package net.amykins.mccourse.util;

import net.amykins.mccourse.MCCourseMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> DOWSING_ROD_DETECTABLE_BLOCKS = createTag("dowsing_rod_detectable_blocks");
        public static final TagKey<Block> ORICHALCUM_BLOCKS = createCommonTag("orichalcum_blocks");
        public static final TagKey<Block> ORICHALCUM_ORES = createCommonTag("orichalcum_ores"); //common tags can be shared among mods

        private static TagKey<Block> createTag(String name)
        {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(MCCourseMod.MOD_ID, name));
        }
        private static TagKey<Block> createCommonTag(String name)
        {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", name));
        }

    }
    public static class Items {

        public static final TagKey<Item> ORICHALCUM_INGOTS = createCommonTag("orichalcum_ingots"); //common tags can be shared among mods
        public static final TagKey<Item> ORICHALCUM_NUGGETS = createCommonTag("orichalcum_nuggets"); //common tags can be shared among mods

        private static TagKey<Item> createTag(String name)
        {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(MCCourseMod.MOD_ID, name));
        }
        private static TagKey<Item> createCommonTag(String name)
        {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }

    }
}
