package com.peeko32213.unusualfishmod.core.init;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.common.block.JellyfishTorchBlock;
import com.peeko32213.unusualfishmod.common.block.JellyfishTorchWallBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public final class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            UnusualFishMod.MODID);


    public static final RegistryObject<JellyfishTorchWallBlock> JELLYFISH_WALL_TORCH = BLOCKS.register("jellyfish_wall_torch",
            () -> new JellyfishTorchWallBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.METAL).noOcclusion().instabreak().lightLevel(state -> 15).dynamicShape()) );

    public static final RegistryObject<Block> JELLYFISH_TORCH = registerBlock("jellyfish_torch",
            () -> new JellyfishTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.METAL).noOcclusion().instabreak().lightLevel(state -> 15).dynamicShape()), UnusualFishMod.UNUSUAL_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
     CreativeModeTab tab) { return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));}

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }


}
