package net.ggwpgaming.morebeautifultorches.block;

//import net.ggwpgaming.mbt.MoreBeautifulTorches;
//import net.ggwpgaming.mbt.block.custom.ModFloorTorchBlock;
//import net.ggwpgaming.mbt.block.custom.ModRedstoneFloorTorchBlock;
//import net.ggwpgaming.mbt.block.custom.ModRedstoneWallTorchBlock;
//import net.ggwpgaming.mbt.block.custom.ModWallTorchBlock;
import net.ggwpgaming.morebeautifultorches.MoreBeautifulTorches;
import net.ggwpgaming.morebeautifultorches.block.custom.ModFloorTorchBlock;
import net.ggwpgaming.morebeautifultorches.block.custom.ModRedstoneFloorTorchBlock;
import net.ggwpgaming.morebeautifultorches.block.custom.ModRedstoneWallTorchBlock;
import net.ggwpgaming.morebeautifultorches.block.custom.ModWallTorchBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
//import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MoreBeautifulTorches.MOD_ID);
    public static final List<RegistryObject<ModFloorTorchBlock>> FLOOR_TORCHES = new ArrayList<>();
    public static final List<RegistryObject<ModWallTorchBlock>> WALL_TORCHES = new ArrayList<>();
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    /*
    blocks should be registered below in the following hierarchy:
    GREATER HALVES [ wood | stone ]*
    INDIVIDUAL ORDERS
    (wood_floor_torch, wood_wall_torch, wood_redstone_floor_torch, wood_redstone_wall_torch)
    (stone_floor_torch, stone_wall_torch, stone_redstone_floor_torch, wood_redstone_wall_torch)
     */

    public static final RegistryObject<Block> OAK_LOG_TORCH = registerBlock("oak_log_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> OAK_LOG_WALL_TORCH = registerBlock("oak_log_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> OAK_LOG_REDSTONE_TORCH = registerBlock("oak_log_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> OAK_LOG_REDSTONE_WALL_TORCH = registerBlock("oak_log_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> OAK_PLANKS_TORCH = registerBlock("oak_planks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> OAK_PLANKS_WALL_TORCH = registerBlock("oak_planks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> OAK_PLANKS_REDSTONE_TORCH = registerBlock("oak_planks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> OAK_PLANKS_REDSTONE_WALL_TORCH = registerBlock("oak_planks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> SPRUCE_LOG_TORCH = registerBlock("spruce_log_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> SPRUCE_LOG_WALL_TORCH = registerBlock("spruce_log_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> SPRUCE_LOG_REDSTONE_TORCH = registerBlock("spruce_log_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> SPRUCE_LOG_REDSTONE_WALL_TORCH = registerBlock("spruce_log_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> SPRUCE_PLANKS_TORCH = registerBlock("spruce_planks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> SPRUCE_PLANKS_WALL_TORCH = registerBlock("spruce_planks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> SPRUCE_PLANKS_REDSTONE_TORCH = registerBlock("spruce_planks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> SPRUCE_PLANKS_REDSTONE_WALL_TORCH = registerBlock("spruce_planks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> BIRCH_LOG_TORCH = registerBlock("birch_log_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> BIRCH_LOG_WALL_TORCH = registerBlock("birch_log_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> BIRCH_LOG_REDSTONE_TORCH = registerBlock("birch_log_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> BIRCH_LOG_REDSTONE_WALL_TORCH = registerBlock("birch_log_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> BIRCH_PLANKS_TORCH = registerBlock("birch_planks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> BIRCH_PLANKS_WALL_TORCH = registerBlock("birch_planks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> BIRCH_PLANKS_REDSTONE_TORCH = registerBlock("birch_planks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> BIRCH_PLANKS_REDSTONE_WALL_TORCH = registerBlock("birch_planks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> JUNGLE_LOG_TORCH = registerBlock("jungle_log_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> JUNGLE_LOG_WALL_TORCH = registerBlock("jungle_log_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> JUNGLE_LOG_REDSTONE_TORCH = registerBlock("jungle_log_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> JUNGLE_LOG_REDSTONE_WALL_TORCH = registerBlock("jungle_log_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> JUNGLE_PLANKS_TORCH = registerBlock("jungle_planks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> JUNGLE_PLANKS_WALL_TORCH = registerBlock("jungle_planks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> JUNGLE_PLANKS_REDSTONE_TORCH = registerBlock("jungle_planks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> JUNGLE_PLANKS_REDSTONE_WALL_TORCH = registerBlock("jungle_planks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> ACACIA_LOG_TORCH = registerBlock("acacia_log_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> ACACIA_LOG_WALL_TORCH = registerBlock("acacia_log_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> ACACIA_LOG_REDSTONE_TORCH = registerBlock("acacia_log_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> ACACIA_LOG_REDSTONE_WALL_TORCH = registerBlock("acacia_log_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> ACACIA_PLANKS_TORCH = registerBlock("acacia_planks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> ACACIA_PLANKS_WALL_TORCH = registerBlock("acacia_planks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> ACACIA_PLANKS_REDSTONE_TORCH = registerBlock("acacia_planks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> ACACIA_PLANKS_REDSTONE_WALL_TORCH = registerBlock("acacia_planks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> DARK_OAK_LOG_TORCH = registerBlock("dark_oak_log_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DARK_OAK_LOG_WALL_TORCH = registerBlock("dark_oak_log_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DARK_OAK_LOG_REDSTONE_TORCH = registerBlock("dark_oak_log_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DARK_OAK_LOG_REDSTONE_WALL_TORCH = registerBlock("dark_oak_log_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> DARK_OAK_PLANKS_TORCH = registerBlock("dark_oak_planks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DARK_OAK_PLANKS_WALL_TORCH = registerBlock("dark_oak_planks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DARK_OAK_PLANKS_REDSTONE_TORCH = registerBlock("dark_oak_planks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DARK_OAK_PLANKS_REDSTONE_WALL_TORCH = registerBlock("dark_oak_planks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> MANGROVE_LOG_TORCH = registerBlock("mangrove_log_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> MANGROVE_LOG_WALL_TORCH = registerBlock("mangrove_log_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> MANGROVE_LOG_REDSTONE_TORCH = registerBlock("mangrove_log_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> MANGROVE_LOG_REDSTONE_WALL_TORCH = registerBlock("mangrove_log_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> MANGROVE_PLANKS_TORCH = registerBlock("mangrove_planks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> MANGROVE_PLANKS_WALL_TORCH = registerBlock("mangrove_planks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> MANGROVE_PLANKS_REDSTONE_TORCH = registerBlock("mangrove_planks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> MANGROVE_PLANKS_REDSTONE_WALL_TORCH = registerBlock("mangrove_planks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRIMSON_STEM_TORCH = registerBlock("crimson_stem_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CRIMSON_STEM_WALL_TORCH = registerBlock("crimson_stem_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CRIMSON_STEM_REDSTONE_TORCH = registerBlock("crimson_stem_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CRIMSON_STEM_REDSTONE_WALL_TORCH = registerBlock("crimson_stem_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRIMSON_PLANKS_TORCH = registerBlock("crimson_planks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CRIMSON_PLANKS_WALL_TORCH = registerBlock("crimson_planks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CRIMSON_PLANKS_REDSTONE_TORCH = registerBlock("crimson_planks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CRIMSON_PLANKS_REDSTONE_WALL_TORCH = registerBlock("crimson_planks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> WARPED_STEM_TORCH = registerBlock("warped_stem_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WARPED_STEM_WALL_TORCH = registerBlock("warped_stem_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WARPED_STEM_REDSTONE_TORCH = registerBlock("warped_stem_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WARPED_STEM_REDSTONE_WALL_TORCH = registerBlock("warped_stem_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> WARPED_PLANKS_TORCH = registerBlock("warped_planks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WARPED_PLANKS_WALL_TORCH = registerBlock("warped_planks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WARPED_PLANKS_REDSTONE_TORCH = registerBlock("warped_planks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WARPED_PLANKS_REDSTONE_WALL_TORCH = registerBlock("warped_planks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHERRY_LOG_TORCH = registerBlock("cherry_log_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHERRY_LOG_WALL_TORCH = registerBlock("cherry_log_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHERRY_LOG_REDSTONE_TORCH = registerBlock("cherry_log_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHERRY_LOG_REDSTONE_WALL_TORCH = registerBlock("cherry_log_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHERRY_PLANKS_TORCH = registerBlock("cherry_planks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHERRY_PLANKS_WALL_TORCH = registerBlock("cherry_planks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHERRY_PLANKS_REDSTONE_TORCH = registerBlock("cherry_planks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHERRY_PLANKS_REDSTONE_WALL_TORCH = registerBlock("cherry_planks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> BAMBOO_BLOCK_TORCH = registerBlock("bamboo_block_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> BAMBOO_BLOCK_WALL_TORCH = registerBlock("bamboo_block_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> BAMBOO_BLOCK_REDSTONE_TORCH = registerBlock("bamboo_block_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> BAMBOO_BLOCK_REDSTONE_WALL_TORCH = registerBlock("bamboo_block_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> BAMBOO_PLANKS_TORCH = registerBlock("bamboo_planks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> BAMBOO_PLANKS_WALL_TORCH = registerBlock("bamboo_planks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> BAMBOO_PLANKS_REDSTONE_TORCH = registerBlock("bamboo_planks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> BAMBOO_PLANKS_REDSTONE_WALL_TORCH = registerBlock("bamboo_planks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> STONE_TORCH = registerBlock("stone_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> STONE_WALL_TORCH = registerBlock("stone_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> STONE_REDSTONE_TORCH = registerBlock("stone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> STONE_REDSTONE_WALL_TORCH = registerBlock("stone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_STONE_TORCH = registerBlock("smooth_stone_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> SMOOTH_STONE_WALL_TORCH = registerBlock("smooth_stone_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> SMOOTH_STONE_REDSTONE_TORCH = registerBlock("smooth_stone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> SMOOTH_STONE_REDSTONE_WALL_TORCH = registerBlock("smooth_stone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> COBBLESTONE_TORCH = registerBlock("cobblestone_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> COBBLESTONE_WALL_TORCH = registerBlock("cobblestone_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> COBBLESTONE_REDSTONE_TORCH = registerBlock("cobblestone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> COBBLESTONE_REDSTONE_WALL_TORCH = registerBlock("cobblestone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_TORCH = registerBlock("mossy_cobblestone_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_WALL_TORCH = registerBlock("mossy_cobblestone_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_REDSTONE_TORCH = registerBlock("mossy_cobblestone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_REDSTONE_WALL_TORCH = registerBlock("mossy_cobblestone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> STONE_BRICKS_TORCH = registerBlock("stone_bricks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> STONE_BRICKS_WALL_TORCH = registerBlock("stone_bricks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> STONE_BRICKS_REDSTONE_TORCH = registerBlock("stone_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> STONE_BRICKS_REDSTONE_WALL_TORCH = registerBlock("stone_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> MOSSY_STONE_BRICKS_TORCH = registerBlock("mossy_stone_bricks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> MOSSY_STONE_BRICKS_WALL_TORCH = registerBlock("mossy_stone_bricks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> MOSSY_STONE_BRICKS_REDSTONE_TORCH = registerBlock("mossy_stone_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> MOSSY_STONE_BRICKS_REDSTONE_WALL_TORCH = registerBlock("mossy_stone_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_STONE_BRICKS_TORCH = registerBlock("chiseled_stone_bricks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHISELED_STONE_BRICKS_WALL_TORCH = registerBlock("chiseled_stone_bricks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHISELED_STONE_BRICKS_REDSTONE_TORCH = registerBlock("chiseled_stone_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHISELED_STONE_BRICKS_REDSTONE_WALL_TORCH = registerBlock("chiseled_stone_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> GRANITE_TORCH = registerBlock("granite_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> GRANITE_WALL_TORCH = registerBlock("granite_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> GRANITE_REDSTONE_TORCH = registerBlock("granite_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> GRANITE_REDSTONE_WALL_TORCH = registerBlock("granite_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_GRANITE_TORCH = registerBlock("polished_granite_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> POLISHED_GRANITE_WALL_TORCH = registerBlock("polished_granite_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> POLISHED_GRANITE_REDSTONE_TORCH = registerBlock("polished_granite_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> POLISHED_GRANITE_REDSTONE_WALL_TORCH = registerBlock("polished_granite_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> DIORITE_TORCH = registerBlock("diorite_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DIORITE_WALL_TORCH = registerBlock("diorite_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DIORITE_REDSTONE_TORCH = registerBlock("diorite_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DIORITE_REDSTONE_WALL_TORCH = registerBlock("diorite_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_DIORITE_TORCH = registerBlock("polished_diorite_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> POLISHED_DIORITE_WALL_TORCH = registerBlock("polished_diorite_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> POLISHED_DIORITE_REDSTONE_TORCH = registerBlock("polished_diorite_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> POLISHED_DIORITE_REDSTONE_WALL_TORCH = registerBlock("polished_diorite_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> ANDESITE_TORCH = registerBlock("andesite_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> ANDESITE_WALL_TORCH = registerBlock("andesite_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> ANDESITE_REDSTONE_TORCH = registerBlock("andesite_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> ANDESITE_REDSTONE_WALL_TORCH = registerBlock("andesite_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_ANDESITE_TORCH = registerBlock("polished_andesite_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> POLISHED_ANDESITE_WALL_TORCH = registerBlock("polished_andesite_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> POLISHED_ANDESITE_REDSTONE_TORCH = registerBlock("polished_andesite_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> POLISHED_ANDESITE_REDSTONE_WALL_TORCH = registerBlock("polished_andesite_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> DEEPSLATE_TORCH = registerBlock("deepslate_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DEEPSLATE_WALL_TORCH = registerBlock("deepslate_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DEEPSLATE_REDSTONE_TORCH = registerBlock("deepslate_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DEEPSLATE_REDSTONE_WALL_TORCH = registerBlock("deepslate_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_TORCH = registerBlock("cobbled_deepslate_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> COBBLED_DEEPSLATE_WALL_TORCH = registerBlock("cobbled_deepslate_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> COBBLED_DEEPSLATE_REDSTONE_TORCH = registerBlock("cobbled_deepslate_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> COBBLED_DEEPSLATE_REDSTONE_WALL_TORCH = registerBlock("cobbled_deepslate_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_DEEPSLATE_TORCH = registerBlock("chiseled_deepslate_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHISELED_DEEPSLATE_WALL_TORCH = registerBlock("chiseled_deepslate_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHISELED_DEEPSLATE_REDSTONE_TORCH = registerBlock("chiseled_deepslate_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHISELED_DEEPSLATE_REDSTONE_WALL_TORCH = registerBlock("chiseled_deepslate_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_TORCH = registerBlock("polished_deepslate_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> POLISHED_DEEPSLATE_WALL_TORCH = registerBlock("polished_deepslate_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> POLISHED_DEEPSLATE_REDSTONE_TORCH = registerBlock("polished_deepslate_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> POLISHED_DEEPSLATE_REDSTONE_WALL_TORCH = registerBlock("polished_deepslate_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> DEEPSLATE_BRICKS_TORCH = registerBlock("deepslate_bricks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DEEPSLATE_BRICKS_WALL_TORCH = registerBlock("deepslate_bricks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DEEPSLATE_BRICKS_REDSTONE_TORCH = registerBlock("deepslate_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DEEPSLATE_BRICKS_REDSTONE_WALL_TORCH = registerBlock("deepslate_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICKS_TORCH = registerBlock("cracked_deepslate_bricks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICKS_WALL_TORCH = registerBlock("cracked_deepslate_bricks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICKS_REDSTONE_TORCH = registerBlock("cracked_deepslate_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICKS_REDSTONE_WALL_TORCH = registerBlock("cracked_deepslate_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> DEEPSLATE_TILES_TORCH = registerBlock("deepslate_tiles_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DEEPSLATE_TILES_WALL_TORCH = registerBlock("deepslate_tiles_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DEEPSLATE_TILES_REDSTONE_TORCH = registerBlock("deepslate_tiles_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DEEPSLATE_TILES_REDSTONE_WALL_TORCH = registerBlock("deepslate_tiles_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILES_TORCH = registerBlock("cracked_deepslate_tiles_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILES_WALL_TORCH = registerBlock("cracked_deepslate_tiles_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILES_REDSTONE_TORCH = registerBlock("cracked_deepslate_tiles_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILES_REDSTONE_WALL_TORCH = registerBlock("cracked_deepslate_tiles_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> BRICKS_TORCH = registerBlock("bricks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> BRICKS_WALL_TORCH = registerBlock("bricks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> BRICKS_REDSTONE_TORCH = registerBlock("bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> BRICKS_REDSTONE_WALL_TORCH = registerBlock("bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> PACKED_MUD_TORCH = registerBlock("packed_mud_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> PACKED_MUD_WALL_TORCH = registerBlock("packed_mud_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> PACKED_MUD_REDSTONE_TORCH = registerBlock("packed_mud_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> PACKED_MUD_REDSTONE_WALL_TORCH = registerBlock("packed_mud_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> MUD_BRICKS_TORCH = registerBlock("mud_bricks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> MUD_BRICKS_WALL_TORCH = registerBlock("mud_bricks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> MUD_BRICKS_REDSTONE_TORCH = registerBlock("mud_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> MUD_BRICKS_REDSTONE_WALL_TORCH = registerBlock("mud_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> SANDSTONE_TORCH = registerBlock("sandstone_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> SANDSTONE_WALL_TORCH = registerBlock("sandstone_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> SANDSTONE_REDSTONE_TORCH = registerBlock("sandstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> SANDSTONE_REDSTONE_WALL_TORCH = registerBlock("sandstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_SANDSTONE_TORCH = registerBlock("chiseled_sandstone_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHISELED_SANDSTONE_WALL_TORCH = registerBlock("chiseled_sandstone_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHISELED_SANDSTONE_REDSTONE_TORCH = registerBlock("chiseled_sandstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHISELED_SANDSTONE_REDSTONE_WALL_TORCH = registerBlock("chiseled_sandstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_TORCH = registerBlock("smooth_sandstone_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> SMOOTH_SANDSTONE_WALL_TORCH = registerBlock("smooth_sandstone_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> SMOOTH_SANDSTONE_REDSTONE_TORCH = registerBlock("smooth_sandstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> SMOOTH_SANDSTONE_REDSTONE_WALL_TORCH = registerBlock("smooth_sandstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> CUT_SANDSTONE_TORCH = registerBlock("cut_sandstone_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CUT_SANDSTONE_WALL_TORCH = registerBlock("cut_sandstone_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CUT_SANDSTONE_REDSTONE_TORCH = registerBlock("cut_sandstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CUT_SANDSTONE_REDSTONE_WALL_TORCH = registerBlock("cut_sandstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> RED_SANDSTONE_TORCH = registerBlock("red_sandstone_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> RED_SANDSTONE_WALL_TORCH = registerBlock("red_sandstone_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> RED_SANDSTONE_REDSTONE_TORCH = registerBlock("red_sandstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> RED_SANDSTONE_REDSTONE_WALL_TORCH = registerBlock("red_sandstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_RED_SANDSTONE_TORCH = registerBlock("chiseled_red_sandstone_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHISELED_RED_SANDSTONE_WALL_TORCH = registerBlock("chiseled_red_sandstone_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHISELED_RED_SANDSTONE_REDSTONE_TORCH = registerBlock("chiseled_red_sandstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHISELED_RED_SANDSTONE_REDSTONE_WALL_TORCH = registerBlock("chiseled_red_sandstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_TORCH = registerBlock("smooth_red_sandstone_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_WALL_TORCH = registerBlock("smooth_red_sandstone_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_REDSTONE_TORCH = registerBlock("smooth_red_sandstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_REDSTONE_WALL_TORCH = registerBlock("smooth_red_sandstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_TORCH = registerBlock("cut_red_sandstone_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CUT_RED_SANDSTONE_WALL_TORCH = registerBlock("cut_red_sandstone_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CUT_RED_SANDSTONE_REDSTONE_TORCH = registerBlock("cut_red_sandstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CUT_RED_SANDSTONE_REDSTONE_WALL_TORCH = registerBlock("cut_red_sandstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> PRISMARINE_TORCH = registerBlock("prismarine_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> PRISMARINE_WALL_TORCH = registerBlock("prismarine_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> PRISMARINE_REDSTONE_TORCH = registerBlock("prismarine_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> PRISMARINE_REDSTONE_WALL_TORCH = registerBlock("prismarine_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> PRISMARINE_BRICKS_TORCH = registerBlock("prismarine_bricks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> PRISMARINE_BRICKS_WALL_TORCH = registerBlock("prismarine_bricks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> PRISMARINE_BRICKS_REDSTONE_TORCH = registerBlock("prismarine_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> PRISMARINE_BRICKS_REDSTONE_WALL_TORCH = registerBlock("prismarine_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> DARK_PRISMARINE_TORCH = registerBlock("dark_prismarine_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DARK_PRISMARINE_WALL_TORCH = registerBlock("dark_prismarine_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DARK_PRISMARINE_REDSTONE_TORCH = registerBlock("dark_prismarine_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DARK_PRISMARINE_REDSTONE_WALL_TORCH = registerBlock("dark_prismarine_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> NETHERRACK_TORCH = registerBlock("netherrack_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> NETHERRACK_WALL_TORCH = registerBlock("netherrack_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> NETHERRACK_REDSTONE_TORCH = registerBlock("netherrack_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> NETHERRACK_REDSTONE_WALL_TORCH = registerBlock("netherrack_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> NETHER_BRICKS_TORCH = registerBlock("nether_bricks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> NETHER_BRICKS_WALL_TORCH = registerBlock("nether_bricks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> NETHER_BRICKS_REDSTONE_TORCH = registerBlock("nether_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> NETHER_BRICKS_REDSTONE_WALL_TORCH = registerBlock("nether_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRACKED_NETHER_BRICKS_TORCH = registerBlock("cracked_nether_bricks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CRACKED_NETHER_BRICKS_WALL_TORCH = registerBlock("cracked_nether_bricks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CRACKED_NETHER_BRICKS_REDSTONE_TORCH = registerBlock("cracked_nether_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CRACKED_NETHER_BRICKS_REDSTONE_WALL_TORCH = registerBlock("cracked_nether_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_NETHER_BRICKS_TORCH = registerBlock("chiseled_nether_bricks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHISELED_NETHER_BRICKS_WALL_TORCH = registerBlock("chiseled_nether_bricks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHISELED_NETHER_BRICKS_REDSTONE_TORCH = registerBlock("chiseled_nether_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHISELED_NETHER_BRICKS_REDSTONE_WALL_TORCH = registerBlock("chiseled_nether_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> RED_NETHER_BRICKS_TORCH = registerBlock("red_nether_bricks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> RED_NETHER_BRICKS_WALL_TORCH = registerBlock("red_nether_bricks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> RED_NETHER_BRICKS_REDSTONE_TORCH = registerBlock("red_nether_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> RED_NETHER_BRICKS_REDSTONE_WALL_TORCH = registerBlock("red_nether_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> BASALT_TORCH = registerBlock("basalt_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> BASALT_WALL_TORCH = registerBlock("basalt_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> BASALT_REDSTONE_TORCH = registerBlock("basalt_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> BASALT_REDSTONE_WALL_TORCH = registerBlock("basalt_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_BASALT_TORCH = registerBlock("smooth_basalt_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> SMOOTH_BASALT_WALL_TORCH = registerBlock("smooth_basalt_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> SMOOTH_BASALT_REDSTONE_TORCH = registerBlock("smooth_basalt_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> SMOOTH_BASALT_REDSTONE_WALL_TORCH = registerBlock("smooth_basalt_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_BASALT_TORCH = registerBlock("polished_basalt_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> POLISHED_BASALT_WALL_TORCH = registerBlock("polished_basalt_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> POLISHED_BASALT_REDSTONE_TORCH = registerBlock("polished_basalt_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> POLISHED_BASALT_REDSTONE_WALL_TORCH = registerBlock("polished_basalt_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> BLACKSTONE_TORCH = registerBlock("blackstone_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> BLACKSTONE_WALL_TORCH = registerBlock("blackstone_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> BLACKSTONE_REDSTONE_TORCH = registerBlock("blackstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> BLACKSTONE_REDSTONE_WALL_TORCH = registerBlock("blackstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> GILDED_BLACKSTONE_TORCH = registerBlock("gilded_blackstone_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> GILDED_BLACKSTONE_WALL_TORCH = registerBlock("gilded_blackstone_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> GILDED_BLACKSTONE_REDSTONE_TORCH = registerBlock("gilded_blackstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> GILDED_BLACKSTONE_REDSTONE_WALL_TORCH = registerBlock("gilded_blackstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_POLISHED_BLACKSTONE_TORCH = registerBlock("chiseled_polished_blackstone_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHISELED_POLISHED_BLACKSTONE_WALL_TORCH = registerBlock("chiseled_polished_blackstone_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHISELED_POLISHED_BLACKSTONE_REDSTONE_TORCH = registerBlock("chiseled_polished_blackstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHISELED_POLISHED_BLACKSTONE_REDSTONE_WALL_TORCH = registerBlock("chiseled_polished_blackstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_TORCH = registerBlock("polished_blackstone_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_WALL_TORCH = registerBlock("polished_blackstone_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_REDSTONE_TORCH = registerBlock("polished_blackstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_REDSTONE_WALL_TORCH = registerBlock("polished_blackstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_TORCH = registerBlock("polished_blackstone_bricks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_WALL_TORCH = registerBlock("polished_blackstone_bricks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_REDSTONE_TORCH = registerBlock("polished_blackstone_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_REDSTONE_WALL_TORCH = registerBlock("polished_blackstone_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS_TORCH = registerBlock("cracked_polished_blackstone_bricks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS_WALL_TORCH = registerBlock("cracked_polished_blackstone_bricks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS_REDSTONE_TORCH = registerBlock("cracked_polished_blackstone_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS_REDSTONE_WALL_TORCH = registerBlock("cracked_polished_blackstone_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> END_STONE_TORCH = registerBlock("end_stone_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> END_STONE_WALL_TORCH = registerBlock("end_stone_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> END_STONE_REDSTONE_TORCH = registerBlock("end_stone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> END_STONE_REDSTONE_WALL_TORCH = registerBlock("end_stone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> END_STONE_BRICKS_TORCH = registerBlock("end_stone_bricks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> END_STONE_BRICKS_WALL_TORCH = registerBlock("end_stone_bricks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> END_STONE_BRICKS_REDSTONE_TORCH = registerBlock("end_stone_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> END_STONE_BRICKS_REDSTONE_WALL_TORCH = registerBlock("end_stone_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> PURPUR_BLOCK_TORCH = registerBlock("purpur_block_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> PURPUR_BLOCK_WALL_TORCH = registerBlock("purpur_block_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> PURPUR_BLOCK_REDSTONE_TORCH = registerBlock("purpur_block_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> PURPUR_BLOCK_REDSTONE_WALL_TORCH = registerBlock("purpur_block_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> PURPUR_PILLAR_TORCH = registerBlock("purpur_pillar_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> PURPUR_PILLAR_WALL_TORCH = registerBlock("purpur_pillar_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> PURPUR_PILLAR_REDSTONE_TORCH = registerBlock("purpur_pillar_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> PURPUR_PILLAR_REDSTONE_WALL_TORCH = registerBlock("purpur_pillar_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> IRON_TORCH = registerBlock("iron_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> IRON_WALL_TORCH = registerBlock("iron_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> IRON_REDSTONE_TORCH = registerBlock("iron_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> IRON_REDSTONE_WALL_TORCH = registerBlock("iron_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> GOLD_TORCH = registerBlock("gold_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> GOLD_WALL_TORCH = registerBlock("gold_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> GOLD_REDSTONE_TORCH = registerBlock("gold_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> GOLD_REDSTONE_WALL_TORCH = registerBlock("gold_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> REDSTONE_TORCH = registerBlock("redstone_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> REDSTONE_WALL_TORCH = registerBlock("redstone_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> REDSTONE_REDSTONE_TORCH = registerBlock("redstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> REDSTONE_REDSTONE_WALL_TORCH = registerBlock("redstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> EMERALD_TORCH = registerBlock("emerald_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> EMERALD_WALL_TORCH = registerBlock("emerald_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> EMERALD_REDSTONE_TORCH = registerBlock("emerald_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> EMERALD_REDSTONE_WALL_TORCH = registerBlock("emerald_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> LAPIS_LAZULI_TORCH = registerBlock("lapis_lazuli_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> LAPIS_LAZULI_WALL_TORCH = registerBlock("lapis_lazuli_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> LAPIS_LAZULI_REDSTONE_TORCH = registerBlock("lapis_lazuli_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> LAPIS_LAZULI_REDSTONE_WALL_TORCH = registerBlock("lapis_lazuli_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> DIAMOND_TORCH = registerBlock("diamond_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DIAMOND_WALL_TORCH = registerBlock("diamond_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DIAMOND_REDSTONE_TORCH = registerBlock("diamond_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DIAMOND_REDSTONE_WALL_TORCH = registerBlock("diamond_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> NETHERITE_TORCH = registerBlock("netherite_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> NETHERITE_WALL_TORCH = registerBlock("netherite_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> NETHERITE_REDSTONE_TORCH = registerBlock("netherite_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> NETHERITE_REDSTONE_WALL_TORCH = registerBlock("netherite_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> QUARTZ_TORCH = registerBlock("quartz_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> QUARTZ_WALL_TORCH = registerBlock("quartz_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> QUARTZ_REDSTONE_TORCH = registerBlock("quartz_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> QUARTZ_REDSTONE_WALL_TORCH = registerBlock("quartz_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_QUARTZ_TORCH = registerBlock("chiseled_quartz_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHISELED_QUARTZ_WALL_TORCH = registerBlock("chiseled_quartz_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHISELED_QUARTZ_REDSTONE_TORCH = registerBlock("chiseled_quartz_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CHISELED_QUARTZ_REDSTONE_WALL_TORCH = registerBlock("chiseled_quartz_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> QUARTZ_BRICKS_TORCH = registerBlock("quartz_bricks_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> QUARTZ_BRICKS_WALL_TORCH = registerBlock("quartz_bricks_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> QUARTZ_BRICKS_REDSTONE_TORCH = registerBlock("quartz_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> QUARTZ_BRICKS_REDSTONE_WALL_TORCH = registerBlock("quartz_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> QUARTZ_PILLAR_TORCH = registerBlock("quartz_pillar_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> QUARTZ_PILLAR_WALL_TORCH = registerBlock("quartz_pillar_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> QUARTZ_PILLAR_REDSTONE_TORCH = registerBlock("quartz_pillar_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> QUARTZ_PILLAR_REDSTONE_WALL_TORCH = registerBlock("quartz_pillar_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_QUARTZ_TORCH = registerBlock("smooth_quartz_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> SMOOTH_QUARTZ_WALL_TORCH = registerBlock("smooth_quartz_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> SMOOTH_QUARTZ_REDSTONE_TORCH = registerBlock("smooth_quartz_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> SMOOTH_QUARTZ_REDSTONE_WALL_TORCH = registerBlock("smooth_quartz_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> AMETHYST_TORCH = registerBlock("amethyst_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> AMETHYST_WALL_TORCH = registerBlock("amethyst_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> AMETHYST_REDSTONE_TORCH = registerBlock("amethyst_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> AMETHYST_REDSTONE_WALL_TORCH = registerBlock("amethyst_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> COPPER_TORCH = registerBlock("copper_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> COPPER_WALL_TORCH = registerBlock("copper_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> COPPER_REDSTONE_TORCH = registerBlock("copper_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> COPPER_REDSTONE_WALL_TORCH = registerBlock("copper_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> CUT_COPPER_TORCH = registerBlock("cut_copper_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CUT_COPPER_WALL_TORCH = registerBlock("cut_copper_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CUT_COPPER_REDSTONE_TORCH = registerBlock("cut_copper_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> CUT_COPPER_REDSTONE_WALL_TORCH = registerBlock("cut_copper_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> EXPOSED_COPPER_TORCH = registerBlock("exposed_copper_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> EXPOSED_COPPER_WALL_TORCH = registerBlock("exposed_copper_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> EXPOSED_COPPER_REDSTONE_TORCH = registerBlock("exposed_copper_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> EXPOSED_COPPER_REDSTONE_WALL_TORCH = registerBlock("exposed_copper_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> EXPOSED_CUT_COPPER_TORCH = registerBlock("exposed_cut_copper_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> EXPOSED_CUT_COPPER_WALL_TORCH = registerBlock("exposed_cut_copper_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> EXPOSED_CUT_COPPER_REDSTONE_TORCH = registerBlock("exposed_cut_copper_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> EXPOSED_CUT_COPPER_REDSTONE_WALL_TORCH = registerBlock("exposed_cut_copper_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> WEATHERED_COPPER_TORCH = registerBlock("weathered_copper_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WEATHERED_COPPER_WALL_TORCH = registerBlock("weathered_copper_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WEATHERED_COPPER_REDSTONE_TORCH = registerBlock("weathered_copper_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WEATHERED_COPPER_REDSTONE_WALL_TORCH = registerBlock("weathered_copper_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> WEATHERED_CUT_COPPER_TORCH = registerBlock("weathered_cut_copper_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WEATHERED_CUT_COPPER_WALL_TORCH = registerBlock("weathered_cut_copper_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WEATHERED_CUT_COPPER_REDSTONE_TORCH = registerBlock("weathered_cut_copper_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WEATHERED_CUT_COPPER_REDSTONE_WALL_TORCH = registerBlock("weathered_cut_copper_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> OXIDIZED_COPPER_TORCH = registerBlock("oxidized_copper_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> OXIDIZED_COPPER_WALL_TORCH = registerBlock("oxidized_copper_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> OXIDIZED_COPPER_REDSTONE_TORCH = registerBlock("oxidized_copper_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> OXIDIZED_COPPER_REDSTONE_WALL_TORCH = registerBlock("oxidized_copper_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> OXIDIZED_CUT_COPPER_TORCH = registerBlock("oxidized_cut_copper_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> OXIDIZED_CUT_COPPER_WALL_TORCH = registerBlock("oxidized_cut_copper_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> OXIDIZED_CUT_COPPER_REDSTONE_TORCH = registerBlock("oxidized_cut_copper_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> OXIDIZED_CUT_COPPER_REDSTONE_WALL_TORCH = registerBlock("oxidized_cut_copper_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> WAXED_COPPER_TORCH = registerBlock("waxed_copper_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WAXED_COPPER_WALL_TORCH = registerBlock("waxed_copper_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WAXED_COPPER_REDSTONE_TORCH = registerBlock("waxed_copper_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WAXED_COPPER_REDSTONE_WALL_TORCH = registerBlock("waxed_copper_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> WAXED_CUT_COPPER_TORCH = registerBlock("waxed_cut_copper_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WAXED_CUT_COPPER_WALL_TORCH = registerBlock("waxed_cut_copper_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WAXED_CUT_COPPER_REDSTONE_TORCH = registerBlock("waxed_cut_copper_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WAXED_CUT_COPPER_REDSTONE_WALL_TORCH = registerBlock("waxed_cut_copper_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_TORCH = registerBlock("waxed_exposed_copper_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_WALL_TORCH = registerBlock("waxed_exposed_copper_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_REDSTONE_TORCH = registerBlock("waxed_exposed_copper_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_REDSTONE_WALL_TORCH = registerBlock("waxed_exposed_copper_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> WAXED_EXPOSED_CUT_COPPER_TORCH = registerBlock("waxed_exposed_cut_copper_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WAXED_EXPOSED_CUT_COPPER_WALL_TORCH = registerBlock("waxed_exposed_cut_copper_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WAXED_EXPOSED_CUT_COPPER_REDSTONE_TORCH = registerBlock("waxed_exposed_cut_copper_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WAXED_EXPOSED_CUT_COPPER_REDSTONE_WALL_TORCH = registerBlock("waxed_exposed_cut_copper_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_TORCH = registerBlock("waxed_weathered_copper_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_WALL_TORCH = registerBlock("waxed_weathered_copper_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_REDSTONE_TORCH = registerBlock("waxed_weathered_copper_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_REDSTONE_WALL_TORCH = registerBlock("waxed_weathered_copper_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> WAXED_WEATHERED_CUT_COPPER_TORCH = registerBlock("waxed_weathered_cut_copper_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WAXED_WEATHERED_CUT_COPPER_WALL_TORCH = registerBlock("waxed_weathered_cut_copper_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WAXED_WEATHERED_CUT_COPPER_REDSTONE_TORCH = registerBlock("waxed_weathered_cut_copper_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WAXED_WEATHERED_CUT_COPPER_REDSTONE_WALL_TORCH = registerBlock("waxed_weathered_cut_copper_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_TORCH = registerBlock("waxed_oxidized_copper_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_WALL_TORCH = registerBlock("waxed_oxidized_copper_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_REDSTONE_TORCH = registerBlock("waxed_oxidized_copper_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_REDSTONE_WALL_TORCH = registerBlock("waxed_oxidized_copper_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> WAXED_OXIDIZED_CUT_COPPER_TORCH = registerBlock("waxed_oxidized_cut_copper_torch",
            () -> new ModFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WAXED_OXIDIZED_CUT_COPPER_WALL_TORCH = registerBlock("waxed_oxidized_cut_copper_wall_torch",
            () -> new ModWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WAXED_OXIDIZED_CUT_COPPER_REDSTONE_TORCH = registerBlock("waxed_oxidized_cut_copper_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WAXED_OXIDIZED_CUT_COPPER_REDSTONE_WALL_TORCH = registerBlock("waxed_oxidized_cut_copper_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(BlockBehaviour.Properties
                    .of().pushReaction(PushReaction.DESTROY)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p_50755_) -> { return 14; })
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));



}
