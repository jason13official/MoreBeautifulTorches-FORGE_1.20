package net.ggwpgaming.morebeautifultorches;

import com.mojang.logging.LogUtils;
import net.ggwpgaming.morebeautifultorches.block.custom.ModFloorTorchBlock;
import net.ggwpgaming.morebeautifultorches.block.custom.ModRedstoneFloorTorchBlock;
import net.ggwpgaming.morebeautifultorches.block.custom.ModRedstoneWallTorchBlock;
import net.ggwpgaming.morebeautifultorches.block.custom.ModWallTorchBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MoreBeautifulTorches.MOD_ID)
public class MoreBeautifulTorches
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "mbt";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    // Create a Properties definition for our regular torches
    public static BlockBehaviour.Properties shorthandTorchProperties = BlockBehaviour.Properties
            .of().pushReaction(PushReaction.DESTROY)
            .noCollission().instabreak()
            .lightLevel((p_50755_) -> { return 14; })
            .sound(SoundType.WOOD);

    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    // Create a Deferred Register to hold Items which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);


    // Creates a new ModTorchBlock with the id "examplemod:example_block", combining the namespace and path
    public static final RegistryObject<Block> OAK_LOG_TORCH = BLOCKS.register("oak_log_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> OAK_LOG_WALL_TORCH = BLOCKS.register("oak_log_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> OAK_PLANKS_TORCH = BLOCKS.register("oak_planks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> OAK_PLANKS_WALL_TORCH = BLOCKS.register("oak_planks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SPRUCE_LOG_TORCH = BLOCKS.register("spruce_log_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SPRUCE_LOG_WALL_TORCH = BLOCKS.register("spruce_log_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SPRUCE_PLANKS_TORCH = BLOCKS.register("spruce_planks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SPRUCE_PLANKS_WALL_TORCH = BLOCKS.register("spruce_planks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BIRCH_LOG_TORCH = BLOCKS.register("birch_log_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BIRCH_LOG_WALL_TORCH = BLOCKS.register("birch_log_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BIRCH_PLANKS_TORCH = BLOCKS.register("birch_planks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BIRCH_PLANKS_WALL_TORCH = BLOCKS.register("birch_planks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> JUNGLE_LOG_TORCH = BLOCKS.register("jungle_log_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> JUNGLE_LOG_WALL_TORCH = BLOCKS.register("jungle_log_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> JUNGLE_PLANKS_TORCH = BLOCKS.register("jungle_planks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> JUNGLE_PLANKS_WALL_TORCH = BLOCKS.register("jungle_planks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> ACACIA_LOG_TORCH = BLOCKS.register("acacia_log_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> ACACIA_LOG_WALL_TORCH = BLOCKS.register("acacia_log_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> ACACIA_PLANKS_TORCH = BLOCKS.register("acacia_planks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> ACACIA_PLANKS_WALL_TORCH = BLOCKS.register("acacia_planks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DARK_OAK_LOG_TORCH = BLOCKS.register("dark_oak_log_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DARK_OAK_LOG_WALL_TORCH = BLOCKS.register("dark_oak_log_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DARK_OAK_PLANKS_TORCH = BLOCKS.register("dark_oak_planks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DARK_OAK_PLANKS_WALL_TORCH = BLOCKS.register("dark_oak_planks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> MANGROVE_LOG_TORCH = BLOCKS.register("mangrove_log_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> MANGROVE_LOG_WALL_TORCH = BLOCKS.register("mangrove_log_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> MANGROVE_PLANKS_TORCH = BLOCKS.register("mangrove_planks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> MANGROVE_PLANKS_WALL_TORCH = BLOCKS.register("mangrove_planks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRIMSON_STEM_TORCH = BLOCKS.register("crimson_stem_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRIMSON_STEM_WALL_TORCH = BLOCKS.register("crimson_stem_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRIMSON_PLANKS_TORCH = BLOCKS.register("crimson_planks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRIMSON_PLANKS_WALL_TORCH = BLOCKS.register("crimson_planks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> WARPED_STEM_TORCH = BLOCKS.register("warped_stem_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> WARPED_STEM_WALL_TORCH = BLOCKS.register("warped_stem_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> WARPED_PLANKS_TORCH = BLOCKS.register("warped_planks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> WARPED_PLANKS_WALL_TORCH = BLOCKS.register("warped_planks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHERRY_LOG_TORCH = BLOCKS.register("cherry_log_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHERRY_LOG_WALL_TORCH = BLOCKS.register("cherry_log_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHERRY_PLANKS_TORCH = BLOCKS.register("cherry_planks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHERRY_PLANKS_WALL_TORCH = BLOCKS.register("cherry_planks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BAMBOO_BLOCK_TORCH = BLOCKS.register("bamboo_block_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BAMBOO_BLOCK_WALL_TORCH = BLOCKS.register("bamboo_block_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BAMBOO_PLANKS_TORCH = BLOCKS.register("bamboo_planks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BAMBOO_PLANKS_WALL_TORCH = BLOCKS.register("bamboo_planks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> STONE_TORCH = BLOCKS.register("stone_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> STONE_WALL_TORCH = BLOCKS.register("stone_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_STONE_TORCH = BLOCKS.register("smooth_stone_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_STONE_WALL_TORCH = BLOCKS.register("smooth_stone_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> COBBLESTONE_TORCH = BLOCKS.register("cobblestone_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> COBBLESTONE_WALL_TORCH = BLOCKS.register("cobblestone_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_TORCH = BLOCKS.register("mossy_cobblestone_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_WALL_TORCH = BLOCKS.register("mossy_cobblestone_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> STONE_BRICKS_TORCH = BLOCKS.register("stone_bricks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> STONE_BRICKS_WALL_TORCH = BLOCKS.register("stone_bricks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> MOSSY_STONE_BRICKS_TORCH = BLOCKS.register("mossy_stone_bricks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> MOSSY_STONE_BRICKS_WALL_TORCH = BLOCKS.register("mossy_stone_bricks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_STONE_BRICKS_TORCH = BLOCKS.register("chiseled_stone_bricks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_STONE_BRICKS_WALL_TORCH = BLOCKS.register("chiseled_stone_bricks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> GRANITE_TORCH = BLOCKS.register("granite_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> GRANITE_WALL_TORCH = BLOCKS.register("granite_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_GRANITE_TORCH = BLOCKS.register("polished_granite_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_GRANITE_WALL_TORCH = BLOCKS.register("polished_granite_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DIORITE_TORCH = BLOCKS.register("diorite_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DIORITE_WALL_TORCH = BLOCKS.register("diorite_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_DIORITE_TORCH = BLOCKS.register("polished_diorite_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_DIORITE_WALL_TORCH = BLOCKS.register("polished_diorite_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> ANDESITE_TORCH = BLOCKS.register("andesite_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> ANDESITE_WALL_TORCH = BLOCKS.register("andesite_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_ANDESITE_TORCH = BLOCKS.register("polished_andesite_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_ANDESITE_WALL_TORCH = BLOCKS.register("polished_andesite_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DEEPSLATE_TORCH = BLOCKS.register("deepslate_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DEEPSLATE_WALL_TORCH = BLOCKS.register("deepslate_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_TORCH = BLOCKS.register("cobbled_deepslate_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_WALL_TORCH = BLOCKS.register("cobbled_deepslate_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_DEEPSLATE_TORCH = BLOCKS.register("chiseled_deepslate_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_DEEPSLATE_WALL_TORCH = BLOCKS.register("chiseled_deepslate_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_TORCH = BLOCKS.register("polished_deepslate_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_WALL_TORCH = BLOCKS.register("polished_deepslate_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DEEPSLATE_BRICKS_TORCH = BLOCKS.register("deepslate_bricks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DEEPSLATE_BRICKS_WALL_TORCH = BLOCKS.register("deepslate_bricks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICKS_TORCH = BLOCKS.register("cracked_deepslate_bricks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICKS_WALL_TORCH = BLOCKS.register("cracked_deepslate_bricks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DEEPSLATE_TILES_TORCH = BLOCKS.register("deepslate_tiles_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DEEPSLATE_TILES_WALL_TORCH = BLOCKS.register("deepslate_tiles_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILES_TORCH = BLOCKS.register("cracked_deepslate_tiles_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILES_WALL_TORCH = BLOCKS.register("cracked_deepslate_tiles_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BRICKS_TORCH = BLOCKS.register("bricks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BRICKS_WALL_TORCH = BLOCKS.register("bricks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> PACKED_MUD_TORCH = BLOCKS.register("packed_mud_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> PACKED_MUD_WALL_TORCH = BLOCKS.register("packed_mud_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> MUD_BRICKS_TORCH = BLOCKS.register("mud_bricks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> MUD_BRICKS_WALL_TORCH = BLOCKS.register("mud_bricks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SANDSTONE_TORCH = BLOCKS.register("sandstone_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SANDSTONE_WALL_TORCH = BLOCKS.register("sandstone_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_SANDSTONE_TORCH = BLOCKS.register("chiseled_sandstone_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_SANDSTONE_WALL_TORCH = BLOCKS.register("chiseled_sandstone_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_TORCH = BLOCKS.register("smooth_sandstone_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_WALL_TORCH = BLOCKS.register("smooth_sandstone_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CUT_SANDSTONE_TORCH = BLOCKS.register("cut_sandstone_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CUT_SANDSTONE_WALL_TORCH = BLOCKS.register("cut_sandstone_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> RED_SANDSTONE_TORCH = BLOCKS.register("red_sandstone_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> RED_SANDSTONE_WALL_TORCH = BLOCKS.register("red_sandstone_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_RED_SANDSTONE_TORCH = BLOCKS.register("chiseled_red_sandstone_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_RED_SANDSTONE_WALL_TORCH = BLOCKS.register("chiseled_red_sandstone_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_TORCH = BLOCKS.register("smooth_red_sandstone_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_WALL_TORCH = BLOCKS.register("smooth_red_sandstone_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_TORCH = BLOCKS.register("cut_red_sandstone_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_WALL_TORCH = BLOCKS.register("cut_red_sandstone_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> PRISMARINE_BRICKS_TORCH = BLOCKS.register("prismarine_bricks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> PRISMARINE_BRICKS_WALL_TORCH = BLOCKS.register("prismarine_bricks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DARK_PRISMARINE_TORCH = BLOCKS.register("dark_prismarine_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DARK_PRISMARINE_WALL_TORCH = BLOCKS.register("dark_prismarine_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> NETHERRACK_TORCH = BLOCKS.register("netherrack_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> NETHERRACK_WALL_TORCH = BLOCKS.register("netherrack_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> NETHER_BRICKS_TORCH = BLOCKS.register("nether_bricks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> NETHER_BRICKS_WALL_TORCH = BLOCKS.register("nether_bricks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRACKED_NETHER_BRICKS_TORCH = BLOCKS.register("cracked_nether_bricks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRACKED_NETHER_BRICKS_WALL_TORCH = BLOCKS.register("cracked_nether_bricks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_NETHER_BRICKS_TORCH = BLOCKS.register("chiseled_nether_bricks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_NETHER_BRICKS_WALL_TORCH = BLOCKS.register("chiseled_nether_bricks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> RED_NETHER_BRICKS_TORCH = BLOCKS.register("red_nether_bricks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> RED_NETHER_BRICKS_WALL_TORCH = BLOCKS.register("red_nether_bricks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BASALT_TORCH = BLOCKS.register("basalt_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BASALT_WALL_TORCH = BLOCKS.register("basalt_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_BASALT_TORCH = BLOCKS.register("smooth_basalt_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_BASALT_WALL_TORCH = BLOCKS.register("smooth_basalt_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_BASALT_TORCH = BLOCKS.register("polished_basalt_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_BASALT_WALL_TORCH = BLOCKS.register("polished_basalt_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BLACKSTONE_TORCH = BLOCKS.register("blackstone_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BLACKSTONE_WALL_TORCH = BLOCKS.register("blackstone_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> GILDED_BLACKSTONE_TORCH = BLOCKS.register("gilded_blackstone_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> GILDED_BLACKSTONE_WALL_TORCH = BLOCKS.register("gilded_blackstone_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_POLISHED_BLACKSTONE_TORCH = BLOCKS.register("chiseled_polished_blackstone_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_POLISHED_BLACKSTONE_WALL_TORCH = BLOCKS.register("chiseled_polished_blackstone_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_TORCH = BLOCKS.register("polished_blackstone_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_WALL_TORCH = BLOCKS.register("polished_blackstone_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_TORCH = BLOCKS.register("polished_blackstone_bricks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_WALL_TORCH = BLOCKS.register("polished_blackstone_bricks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS_TORCH = BLOCKS.register("cracked_polished_blackstone_bricks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS_WALL_TORCH = BLOCKS.register("cracked_polished_blackstone_bricks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> END_STONE_TORCH = BLOCKS.register("end_stone_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> END_STONE_WALL_TORCH = BLOCKS.register("end_stone_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> END_STONE_BRICKS_TORCH = BLOCKS.register("end_stone_bricks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> END_STONE_BRICKS_WALL_TORCH = BLOCKS.register("end_stone_bricks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> PURPUR_BLOCK_TORCH = BLOCKS.register("purpur_block_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> PURPUR_BLOCK_WALL_TORCH = BLOCKS.register("purpur_block_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> PURPUR_PILLAR_TORCH = BLOCKS.register("purpur_pillar_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> PURPUR_PILLAR_WALL_TORCH = BLOCKS.register("purpur_pillar_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> IRON_TORCH = BLOCKS.register("iron_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> IRON_WALL_TORCH = BLOCKS.register("iron_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> GOLD_TORCH = BLOCKS.register("gold_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> GOLD_WALL_TORCH = BLOCKS.register("gold_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> REDSTONE_TORCH = BLOCKS.register("redstone_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> REDSTONE_WALL_TORCH = BLOCKS.register("redstone_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> EMERALD_TORCH = BLOCKS.register("emerald_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> EMERALD_WALL_TORCH = BLOCKS.register("emerald_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> LAPIS_LAZULI_TORCH = BLOCKS.register("lapis_lazuli_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> LAPIS_LAZULI_WALL_TORCH = BLOCKS.register("lapis_lazuli_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DIAMOND_TORCH = BLOCKS.register("diamond_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DIAMOND_WALL_TORCH = BLOCKS.register("diamond_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> NETHERITE_TORCH = BLOCKS.register("netherite_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> NETHERITE_WALL_TORCH = BLOCKS.register("netherite_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> QUARTZ_TORCH = BLOCKS.register("quartz_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> QUARTZ_WALL_TORCH = BLOCKS.register("quartz_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_QUARTZ_TORCH = BLOCKS.register("chiseled_quartz_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_QUARTZ_WALL_TORCH = BLOCKS.register("chiseled_quartz_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> QUARTZ_BRICKS_TORCH = BLOCKS.register("quartz_bricks_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> QUARTZ_BRICKS_WALL_TORCH = BLOCKS.register("quartz_bricks_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> QUARTZ_PILLAR_TORCH = BLOCKS.register("quartz_pillar_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> QUARTZ_PILLAR_WALL_TORCH = BLOCKS.register("quartz_pillar_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_QUARTZ_TORCH = BLOCKS.register("smooth_quartz_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_QUARTZ_WALL_TORCH = BLOCKS.register("smooth_quartz_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> AMETHYST_TORCH = BLOCKS.register("amethyst_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> AMETHYST_WALL_TORCH = BLOCKS.register("amethyst_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> COPPER_TORCH = BLOCKS.register("copper_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> COPPER_WALL_TORCH = BLOCKS.register("copper_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CUT_COPPER_TORCH = BLOCKS.register("cut_copper_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CUT_COPPER_WALL_TORCH = BLOCKS.register("cut_copper_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> EXPOSED_COPPER_TORCH = BLOCKS.register("exposed_copper_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> EXPOSED_COPPER_WALL_TORCH = BLOCKS.register("exposed_copper_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> EXPOSED_CUT_COPPER_TORCH = BLOCKS.register("exposed_cut_copper_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> EXPOSED_CUT_COPPER_WALL_TORCH = BLOCKS.register("exposed_cut_copper_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> WEATHERED_COPPER_TORCH = BLOCKS.register("weathered_copper_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> WEATHERED_COPPER_WALL_TORCH = BLOCKS.register("weathered_copper_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> WEATHERED_CUT_COPPER_TORCH = BLOCKS.register("weathered_cut_copper_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> WEATHERED_CUT_COPPER_WALL_TORCH = BLOCKS.register("weathered_cut_copper_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> OXIDIZED_COPPER_TORCH = BLOCKS.register("oxidized_copper_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> OXIDIZED_COPPER_WALL_TORCH = BLOCKS.register("oxidized_copper_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> OXIDIZED_CUT_COPPER_TORCH = BLOCKS.register("oxidized_cut_copper_torch",
            () -> new ModFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> OXIDIZED_CUT_COPPER_WALL_TORCH = BLOCKS.register("oxidized_cut_copper_wall_torch",
            () -> new ModWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));

    public static final RegistryObject<Block> OAK_LOG_REDSTONE_TORCH = BLOCKS.register("oak_log_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> OAK_LOG_REDSTONE_WALL_TORCH = BLOCKS.register("oak_log_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> OAK_PLANKS_REDSTONE_TORCH = BLOCKS.register("oak_planks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> OAK_PLANKS_REDSTONE_WALL_TORCH = BLOCKS.register("oak_planks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SPRUCE_LOG_REDSTONE_TORCH = BLOCKS.register("spruce_log_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SPRUCE_LOG_REDSTONE_WALL_TORCH = BLOCKS.register("spruce_log_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SPRUCE_PLANKS_REDSTONE_TORCH = BLOCKS.register("spruce_planks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SPRUCE_PLANKS_REDSTONE_WALL_TORCH = BLOCKS.register("spruce_planks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BIRCH_LOG_REDSTONE_TORCH = BLOCKS.register("birch_log_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BIRCH_LOG_REDSTONE_WALL_TORCH = BLOCKS.register("birch_log_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BIRCH_PLANKS_REDSTONE_TORCH = BLOCKS.register("birch_planks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BIRCH_PLANKS_REDSTONE_WALL_TORCH = BLOCKS.register("birch_planks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> JUNGLE_LOG_REDSTONE_TORCH = BLOCKS.register("jungle_log_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> JUNGLE_LOG_REDSTONE_WALL_TORCH = BLOCKS.register("jungle_log_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> JUNGLE_PLANKS_REDSTONE_TORCH = BLOCKS.register("jungle_planks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> JUNGLE_PLANKS_REDSTONE_WALL_TORCH = BLOCKS.register("jungle_planks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> ACACIA_LOG_REDSTONE_TORCH = BLOCKS.register("acacia_log_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> ACACIA_LOG_REDSTONE_WALL_TORCH = BLOCKS.register("acacia_log_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> ACACIA_PLANKS_REDSTONE_TORCH = BLOCKS.register("acacia_planks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> ACACIA_PLANKS_REDSTONE_WALL_TORCH = BLOCKS.register("acacia_planks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DARK_OAK_LOG_REDSTONE_TORCH = BLOCKS.register("dark_oak_log_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DARK_OAK_LOG_REDSTONE_WALL_TORCH = BLOCKS.register("dark_oak_log_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DARK_OAK_PLANKS_REDSTONE_TORCH = BLOCKS.register("dark_oak_planks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DARK_OAK_PLANKS_REDSTONE_WALL_TORCH = BLOCKS.register("dark_oak_planks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> MANGROVE_LOG_REDSTONE_TORCH = BLOCKS.register("mangrove_log_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> MANGROVE_LOG_REDSTONE_WALL_TORCH = BLOCKS.register("mangrove_log_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> MANGROVE_PLANKS_REDSTONE_TORCH = BLOCKS.register("mangrove_planks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> MANGROVE_PLANKS_REDSTONE_WALL_TORCH = BLOCKS.register("mangrove_planks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRIMSON_STEM_REDSTONE_TORCH = BLOCKS.register("crimson_stem_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRIMSON_STEM_REDSTONE_WALL_TORCH = BLOCKS.register("crimson_stem_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRIMSON_PLANKS_REDSTONE_TORCH = BLOCKS.register("crimson_planks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRIMSON_PLANKS_REDSTONE_WALL_TORCH = BLOCKS.register("crimson_planks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> WARPED_STEM_REDSTONE_TORCH = BLOCKS.register("warped_stem_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> WARPED_STEM_REDSTONE_WALL_TORCH = BLOCKS.register("warped_stem_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> WARPED_PLANKS_REDSTONE_TORCH = BLOCKS.register("warped_planks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> WARPED_PLANKS_REDSTONE_WALL_TORCH = BLOCKS.register("warped_planks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHERRY_LOG_REDSTONE_TORCH = BLOCKS.register("cherry_log_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHERRY_LOG_REDSTONE_WALL_TORCH = BLOCKS.register("cherry_log_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHERRY_PLANKS_REDSTONE_TORCH = BLOCKS.register("cherry_planks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHERRY_PLANKS_REDSTONE_WALL_TORCH = BLOCKS.register("cherry_planks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BAMBOO_BLOCK_REDSTONE_TORCH = BLOCKS.register("bamboo_block_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BAMBOO_BLOCK_REDSTONE_WALL_TORCH = BLOCKS.register("bamboo_block_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BAMBOO_PLANKS_REDSTONE_TORCH = BLOCKS.register("bamboo_planks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BAMBOO_PLANKS_REDSTONE_WALL_TORCH = BLOCKS.register("bamboo_planks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> STONE_REDSTONE_TORCH = BLOCKS.register("stone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> STONE_REDSTONE_WALL_TORCH = BLOCKS.register("stone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_STONE_REDSTONE_TORCH = BLOCKS.register("smooth_stone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_STONE_REDSTONE_WALL_TORCH = BLOCKS.register("smooth_stone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> COBBLESTONE_REDSTONE_TORCH = BLOCKS.register("cobblestone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> COBBLESTONE_REDSTONE_WALL_TORCH = BLOCKS.register("cobblestone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_REDSTONE_TORCH = BLOCKS.register("mossy_cobblestone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_REDSTONE_WALL_TORCH = BLOCKS.register("mossy_cobblestone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> STONE_BRICKS_REDSTONE_TORCH = BLOCKS.register("stone_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> STONE_BRICKS_REDSTONE_WALL_TORCH = BLOCKS.register("stone_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> MOSSY_STONE_BRICKS_REDSTONE_TORCH = BLOCKS.register("mossy_stone_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> MOSSY_STONE_BRICKS_REDSTONE_WALL_TORCH = BLOCKS.register("mossy_stone_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_STONE_BRICKS_REDSTONE_TORCH = BLOCKS.register("chiseled_stone_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_STONE_BRICKS_REDSTONE_WALL_TORCH = BLOCKS.register("chiseled_stone_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> GRANITE_REDSTONE_TORCH = BLOCKS.register("granite_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> GRANITE_REDSTONE_WALL_TORCH = BLOCKS.register("granite_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_GRANITE_REDSTONE_TORCH = BLOCKS.register("polished_granite_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_GRANITE_REDSTONE_WALL_TORCH = BLOCKS.register("polished_granite_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DIORITE_REDSTONE_TORCH = BLOCKS.register("diorite_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DIORITE_REDSTONE_WALL_TORCH = BLOCKS.register("diorite_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_DIORITE_REDSTONE_TORCH = BLOCKS.register("polished_diorite_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_DIORITE_REDSTONE_WALL_TORCH = BLOCKS.register("polished_diorite_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> ANDESITE_REDSTONE_TORCH = BLOCKS.register("andesite_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> ANDESITE_REDSTONE_WALL_TORCH = BLOCKS.register("andesite_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_ANDESITE_REDSTONE_TORCH = BLOCKS.register("polished_andesite_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_ANDESITE_REDSTONE_WALL_TORCH = BLOCKS.register("polished_andesite_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DEEPSLATE_REDSTONE_TORCH = BLOCKS.register("deepslate_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DEEPSLATE_REDSTONE_WALL_TORCH = BLOCKS.register("deepslate_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_REDSTONE_TORCH = BLOCKS.register("cobbled_deepslate_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_REDSTONE_WALL_TORCH = BLOCKS.register("cobbled_deepslate_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_DEEPSLATE_REDSTONE_TORCH = BLOCKS.register("chiseled_deepslate_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_DEEPSLATE_REDSTONE_WALL_TORCH = BLOCKS.register("chiseled_deepslate_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_REDSTONE_TORCH = BLOCKS.register("polished_deepslate_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_REDSTONE_WALL_TORCH = BLOCKS.register("polished_deepslate_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DEEPSLATE_BRICKS_REDSTONE_TORCH = BLOCKS.register("deepslate_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DEEPSLATE_BRICKS_REDSTONE_WALL_TORCH = BLOCKS.register("deepslate_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICKS_REDSTONE_TORCH = BLOCKS.register("cracked_deepslate_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICKS_REDSTONE_WALL_TORCH = BLOCKS.register("cracked_deepslate_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DEEPSLATE_TILES_REDSTONE_TORCH = BLOCKS.register("deepslate_tiles_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DEEPSLATE_TILES_REDSTONE_WALL_TORCH = BLOCKS.register("deepslate_tiles_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILES_REDSTONE_TORCH = BLOCKS.register("cracked_deepslate_tiles_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILES_REDSTONE_WALL_TORCH = BLOCKS.register("cracked_deepslate_tiles_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BRICKS_REDSTONE_TORCH = BLOCKS.register("bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BRICKS_REDSTONE_WALL_TORCH = BLOCKS.register("bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> PACKED_MUD_REDSTONE_TORCH = BLOCKS.register("packed_mud_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> PACKED_MUD_REDSTONE_WALL_TORCH = BLOCKS.register("packed_mud_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> MUD_BRICKS_REDSTONE_TORCH = BLOCKS.register("mud_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> MUD_BRICKS_REDSTONE_WALL_TORCH = BLOCKS.register("mud_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SANDSTONE_REDSTONE_TORCH = BLOCKS.register("sandstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SANDSTONE_REDSTONE_WALL_TORCH = BLOCKS.register("sandstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_SANDSTONE_REDSTONE_TORCH = BLOCKS.register("chiseled_sandstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_SANDSTONE_REDSTONE_WALL_TORCH = BLOCKS.register("chiseled_sandstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_REDSTONE_TORCH = BLOCKS.register("smooth_sandstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_REDSTONE_WALL_TORCH = BLOCKS.register("smooth_sandstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CUT_SANDSTONE_REDSTONE_TORCH = BLOCKS.register("cut_sandstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CUT_SANDSTONE_REDSTONE_WALL_TORCH = BLOCKS.register("cut_sandstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> RED_SANDSTONE_REDSTONE_TORCH = BLOCKS.register("red_sandstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> RED_SANDSTONE_REDSTONE_WALL_TORCH = BLOCKS.register("red_sandstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_RED_SANDSTONE_REDSTONE_TORCH = BLOCKS.register("chiseled_red_sandstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_RED_SANDSTONE_REDSTONE_WALL_TORCH = BLOCKS.register("chiseled_red_sandstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_REDSTONE_TORCH = BLOCKS.register("smooth_red_sandstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_REDSTONE_WALL_TORCH = BLOCKS.register("smooth_red_sandstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_REDSTONE_TORCH = BLOCKS.register("cut_red_sandstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_REDSTONE_WALL_TORCH = BLOCKS.register("cut_red_sandstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> PRISMARINE_BRICKS_REDSTONE_TORCH = BLOCKS.register("prismarine_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> PRISMARINE_BRICKS_REDSTONE_WALL_TORCH = BLOCKS.register("prismarine_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DARK_PRISMARINE_REDSTONE_TORCH = BLOCKS.register("dark_prismarine_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DARK_PRISMARINE_REDSTONE_WALL_TORCH = BLOCKS.register("dark_prismarine_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> NETHERRACK_REDSTONE_TORCH = BLOCKS.register("netherrack_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> NETHERRACK_REDSTONE_WALL_TORCH = BLOCKS.register("netherrack_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> NETHER_BRICKS_REDSTONE_TORCH = BLOCKS.register("nether_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> NETHER_BRICKS_REDSTONE_WALL_TORCH = BLOCKS.register("nether_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRACKED_NETHER_BRICKS_REDSTONE_TORCH = BLOCKS.register("cracked_nether_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRACKED_NETHER_BRICKS_REDSTONE_WALL_TORCH = BLOCKS.register("cracked_nether_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_NETHER_BRICKS_REDSTONE_TORCH = BLOCKS.register("chiseled_nether_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_NETHER_BRICKS_REDSTONE_WALL_TORCH = BLOCKS.register("chiseled_nether_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> RED_NETHER_BRICKS_REDSTONE_TORCH = BLOCKS.register("red_nether_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> RED_NETHER_BRICKS_REDSTONE_WALL_TORCH = BLOCKS.register("red_nether_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BASALT_REDSTONE_TORCH = BLOCKS.register("basalt_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BASALT_REDSTONE_WALL_TORCH = BLOCKS.register("basalt_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_BASALT_REDSTONE_TORCH = BLOCKS.register("smooth_basalt_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_BASALT_REDSTONE_WALL_TORCH = BLOCKS.register("smooth_basalt_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_BASALT_REDSTONE_TORCH = BLOCKS.register("polished_basalt_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_BASALT_REDSTONE_WALL_TORCH = BLOCKS.register("polished_basalt_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BLACKSTONE_REDSTONE_TORCH = BLOCKS.register("blackstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> BLACKSTONE_REDSTONE_WALL_TORCH = BLOCKS.register("blackstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> GILDED_BLACKSTONE_REDSTONE_TORCH = BLOCKS.register("gilded_blackstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> GILDED_BLACKSTONE_REDSTONE_WALL_TORCH = BLOCKS.register("gilded_blackstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_POLISHED_BLACKSTONE_REDSTONE_TORCH = BLOCKS.register("chiseled_polished_blackstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_POLISHED_BLACKSTONE_REDSTONE_WALL_TORCH = BLOCKS.register("chiseled_polished_blackstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_REDSTONE_TORCH = BLOCKS.register("polished_blackstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_REDSTONE_WALL_TORCH = BLOCKS.register("polished_blackstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_REDSTONE_TORCH = BLOCKS.register("polished_blackstone_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_REDSTONE_WALL_TORCH = BLOCKS.register("polished_blackstone_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS_REDSTONE_TORCH = BLOCKS.register("cracked_polished_blackstone_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS_REDSTONE_WALL_TORCH = BLOCKS.register("cracked_polished_blackstone_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> END_STONE_REDSTONE_TORCH = BLOCKS.register("end_stone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> END_STONE_REDSTONE_WALL_TORCH = BLOCKS.register("end_stone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> END_STONE_BRICKS_REDSTONE_TORCH = BLOCKS.register("end_stone_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> END_STONE_BRICKS_REDSTONE_WALL_TORCH = BLOCKS.register("end_stone_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> PURPUR_BLOCK_REDSTONE_TORCH = BLOCKS.register("purpur_block_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> PURPUR_BLOCK_REDSTONE_WALL_TORCH = BLOCKS.register("purpur_block_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> PURPUR_PILLAR_REDSTONE_TORCH = BLOCKS.register("purpur_pillar_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> PURPUR_PILLAR_REDSTONE_WALL_TORCH = BLOCKS.register("purpur_pillar_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> IRON_REDSTONE_TORCH = BLOCKS.register("iron_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> IRON_REDSTONE_WALL_TORCH = BLOCKS.register("iron_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> GOLD_REDSTONE_TORCH = BLOCKS.register("gold_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> GOLD_REDSTONE_WALL_TORCH = BLOCKS.register("gold_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> REDSTONE_REDSTONE_TORCH = BLOCKS.register("redstone_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> REDSTONE_REDSTONE_WALL_TORCH = BLOCKS.register("redstone_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> EMERALD_REDSTONE_TORCH = BLOCKS.register("emerald_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> EMERALD_REDSTONE_WALL_TORCH = BLOCKS.register("emerald_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> LAPIS_LAZULI_REDSTONE_TORCH = BLOCKS.register("lapis_lazuli_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> LAPIS_LAZULI_REDSTONE_WALL_TORCH = BLOCKS.register("lapis_lazuli_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DIAMOND_REDSTONE_TORCH = BLOCKS.register("diamond_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> DIAMOND_REDSTONE_WALL_TORCH = BLOCKS.register("diamond_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> NETHERITE_REDSTONE_TORCH = BLOCKS.register("netherite_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> NETHERITE_REDSTONE_WALL_TORCH = BLOCKS.register("netherite_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> QUARTZ_REDSTONE_TORCH = BLOCKS.register("quartz_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> QUARTZ_REDSTONE_WALL_TORCH = BLOCKS.register("quartz_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_QUARTZ_REDSTONE_TORCH = BLOCKS.register("chiseled_quartz_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CHISELED_QUARTZ_REDSTONE_WALL_TORCH = BLOCKS.register("chiseled_quartz_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> QUARTZ_BRICKS_REDSTONE_TORCH = BLOCKS.register("quartz_bricks_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> QUARTZ_BRICKS_REDSTONE_WALL_TORCH = BLOCKS.register("quartz_bricks_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> QUARTZ_PILLAR_REDSTONE_TORCH = BLOCKS.register("quartz_pillar_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> QUARTZ_PILLAR_REDSTONE_WALL_TORCH = BLOCKS.register("quartz_pillar_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_QUARTZ_REDSTONE_TORCH = BLOCKS.register("smooth_quartz_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> SMOOTH_QUARTZ_REDSTONE_WALL_TORCH = BLOCKS.register("smooth_quartz_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> AMETHYST_REDSTONE_TORCH = BLOCKS.register("amethyst_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> AMETHYST_REDSTONE_WALL_TORCH = BLOCKS.register("amethyst_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> COPPER_REDSTONE_TORCH = BLOCKS.register("copper_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> COPPER_REDSTONE_WALL_TORCH = BLOCKS.register("copper_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CUT_COPPER_REDSTONE_TORCH = BLOCKS.register("cut_copper_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> CUT_COPPER_REDSTONE_WALL_TORCH = BLOCKS.register("cut_copper_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> EXPOSED_COPPER_REDSTONE_TORCH = BLOCKS.register("exposed_copper_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> EXPOSED_COPPER_REDSTONE_WALL_TORCH = BLOCKS.register("exposed_copper_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> EXPOSED_CUT_COPPER_REDSTONE_TORCH = BLOCKS.register("exposed_cut_copper_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> EXPOSED_CUT_COPPER_REDSTONE_WALL_TORCH = BLOCKS.register("exposed_cut_copper_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> WEATHERED_COPPER_REDSTONE_TORCH = BLOCKS.register("weathered_copper_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> WEATHERED_COPPER_REDSTONE_WALL_TORCH = BLOCKS.register("weathered_copper_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> WEATHERED_CUT_COPPER_REDSTONE_TORCH = BLOCKS.register("weathered_cut_copper_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> WEATHERED_CUT_COPPER_REDSTONE_WALL_TORCH = BLOCKS.register("weathered_cut_copper_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> OXIDIZED_COPPER_REDSTONE_TORCH = BLOCKS.register("oxidized_copper_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> OXIDIZED_COPPER_REDSTONE_WALL_TORCH = BLOCKS.register("oxidized_copper_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> OXIDIZED_CUT_COPPER_REDSTONE_TORCH = BLOCKS.register("oxidized_cut_copper_redstone_torch",
            () -> new ModRedstoneFloorTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));
    public static final RegistryObject<Block> OXIDIZED_CUT_COPPER_REDSTONE_WALL_TORCH = BLOCKS.register("oxidized_cut_copper_redstone_wall_torch",
            () -> new ModRedstoneWallTorchBlock(shorthandTorchProperties, ParticleTypes.FLAME));




    // Creates a new StandingAndWallBlockItem
    public static final RegistryObject<Item> OAK_LOG_TORCH_ITEM = ITEMS.register("oak_log_torch", () -> new StandingAndWallBlockItem(OAK_LOG_TORCH.get(), OAK_LOG_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> OAK_PLANKS_TORCH_ITEM = ITEMS.register("oak_planks_torch", () -> new StandingAndWallBlockItem(OAK_PLANKS_TORCH.get(), OAK_PLANKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> SPRUCE_LOG_TORCH_ITEM = ITEMS.register("spruce_log_torch", () -> new StandingAndWallBlockItem(SPRUCE_LOG_TORCH.get(), SPRUCE_LOG_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> SPRUCE_PLANKS_TORCH_ITEM = ITEMS.register("spruce_planks_torch", () -> new StandingAndWallBlockItem(SPRUCE_PLANKS_TORCH.get(), SPRUCE_PLANKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> BIRCH_LOG_TORCH_ITEM = ITEMS.register("birch_log_torch", () -> new StandingAndWallBlockItem(BIRCH_LOG_TORCH.get(), BIRCH_LOG_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> BIRCH_PLANKS_TORCH_ITEM = ITEMS.register("birch_planks_torch", () -> new StandingAndWallBlockItem(BIRCH_PLANKS_TORCH.get(), BIRCH_PLANKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> JUNGLE_LOG_TORCH_ITEM = ITEMS.register("jungle_log_torch", () -> new StandingAndWallBlockItem(JUNGLE_LOG_TORCH.get(), JUNGLE_LOG_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> JUNGLE_PLANKS_TORCH_ITEM = ITEMS.register("jungle_planks_torch", () -> new StandingAndWallBlockItem(JUNGLE_PLANKS_TORCH.get(), JUNGLE_PLANKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> ACACIA_LOG_TORCH_ITEM = ITEMS.register("acacia_log_torch", () -> new StandingAndWallBlockItem(ACACIA_LOG_TORCH.get(), ACACIA_LOG_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> ACACIA_PLANKS_TORCH_ITEM = ITEMS.register("acacia_planks_torch", () -> new StandingAndWallBlockItem(ACACIA_PLANKS_TORCH.get(), ACACIA_PLANKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> DARK_OAK_LOG_TORCH_ITEM = ITEMS.register("dark_oak_log_torch", () -> new StandingAndWallBlockItem(DARK_OAK_LOG_TORCH.get(), DARK_OAK_LOG_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> DARK_OAK_PLANKS_TORCH_ITEM = ITEMS.register("dark_oak_planks_torch", () -> new StandingAndWallBlockItem(DARK_OAK_PLANKS_TORCH.get(), DARK_OAK_PLANKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> MANGROVE_LOG_TORCH_ITEM = ITEMS.register("mangrove_log_torch", () -> new StandingAndWallBlockItem(MANGROVE_LOG_TORCH.get(), MANGROVE_LOG_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> MANGROVE_PLANKS_TORCH_ITEM = ITEMS.register("mangrove_planks_torch", () -> new StandingAndWallBlockItem(MANGROVE_PLANKS_TORCH.get(), MANGROVE_PLANKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CRIMSON_STEM_TORCH_ITEM = ITEMS.register("crimson_stem_torch", () -> new StandingAndWallBlockItem(CRIMSON_STEM_TORCH.get(), CRIMSON_STEM_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CRIMSON_PLANKS_TORCH_ITEM = ITEMS.register("crimson_planks_torch", () -> new StandingAndWallBlockItem(CRIMSON_PLANKS_TORCH.get(), CRIMSON_PLANKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> WARPED_STEM_TORCH_ITEM = ITEMS.register("warped_stem_torch", () -> new StandingAndWallBlockItem(WARPED_STEM_TORCH.get(), WARPED_STEM_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> WARPED_PLANKS_TORCH_ITEM = ITEMS.register("warped_planks_torch", () -> new StandingAndWallBlockItem(WARPED_PLANKS_TORCH.get(), WARPED_PLANKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CHERRY_LOG_TORCH_ITEM = ITEMS.register("cherry_log_torch", () -> new StandingAndWallBlockItem(CHERRY_LOG_TORCH.get(), CHERRY_LOG_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CHERRY_PLANKS_TORCH_ITEM = ITEMS.register("cherry_planks_torch", () -> new StandingAndWallBlockItem(CHERRY_PLANKS_TORCH.get(), CHERRY_PLANKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> BAMBOO_BLOCK_TORCH_ITEM = ITEMS.register("bamboo_block_torch", () -> new StandingAndWallBlockItem(BAMBOO_BLOCK_TORCH.get(), BAMBOO_BLOCK_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> BAMBOO_PLANKS_TORCH_ITEM = ITEMS.register("bamboo_planks_torch", () -> new StandingAndWallBlockItem(BAMBOO_PLANKS_TORCH.get(), BAMBOO_PLANKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> STONE_TORCH_ITEM = ITEMS.register("stone_torch", () -> new StandingAndWallBlockItem(STONE_TORCH.get(), STONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> SMOOTH_STONE_TORCH_ITEM = ITEMS.register("smooth_stone_torch", () -> new StandingAndWallBlockItem(SMOOTH_STONE_TORCH.get(), SMOOTH_STONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> COBBLESTONE_TORCH_ITEM = ITEMS.register("cobblestone_torch", () -> new StandingAndWallBlockItem(COBBLESTONE_TORCH.get(), COBBLESTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> MOSSY_COBBLESTONE_TORCH_ITEM = ITEMS.register("mossy_cobblestone_torch", () -> new StandingAndWallBlockItem(MOSSY_COBBLESTONE_TORCH.get(), MOSSY_COBBLESTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> STONE_BRICKS_TORCH_ITEM = ITEMS.register("stone_bricks_torch", () -> new StandingAndWallBlockItem(STONE_BRICKS_TORCH.get(), STONE_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> MOSSY_STONE_BRICKS_TORCH_ITEM = ITEMS.register("mossy_stone_bricks_torch", () -> new StandingAndWallBlockItem(MOSSY_STONE_BRICKS_TORCH.get(), MOSSY_STONE_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CHISELED_STONE_BRICKS_TORCH_ITEM = ITEMS.register("chiseled_stone_bricks_torch", () -> new StandingAndWallBlockItem(CHISELED_STONE_BRICKS_TORCH.get(), CHISELED_STONE_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> GRANITE_TORCH_ITEM = ITEMS.register("granite_torch", () -> new StandingAndWallBlockItem(GRANITE_TORCH.get(), GRANITE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> POLISHED_GRANITE_TORCH_ITEM = ITEMS.register("polished_granite_torch", () -> new StandingAndWallBlockItem(POLISHED_GRANITE_TORCH.get(), POLISHED_GRANITE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> DIORITE_TORCH_ITEM = ITEMS.register("diorite_torch", () -> new StandingAndWallBlockItem(DIORITE_TORCH.get(), DIORITE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> POLISHED_DIORITE_TORCH_ITEM = ITEMS.register("polished_diorite_torch", () -> new StandingAndWallBlockItem(POLISHED_DIORITE_TORCH.get(), POLISHED_DIORITE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> ANDESITE_TORCH_ITEM = ITEMS.register("andesite_torch", () -> new StandingAndWallBlockItem(ANDESITE_TORCH.get(), ANDESITE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> POLISHED_ANDESITE_TORCH_ITEM = ITEMS.register("polished_andesite_torch", () -> new StandingAndWallBlockItem(POLISHED_ANDESITE_TORCH.get(), POLISHED_ANDESITE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> DEEPSLATE_TORCH_ITEM = ITEMS.register("deepslate_torch", () -> new StandingAndWallBlockItem(DEEPSLATE_TORCH.get(), DEEPSLATE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> COBBLED_DEEPSLATE_TORCH_ITEM = ITEMS.register("cobbled_deepslate_torch", () -> new StandingAndWallBlockItem(COBBLED_DEEPSLATE_TORCH.get(), COBBLED_DEEPSLATE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CHISELED_DEEPSLATE_TORCH_ITEM = ITEMS.register("chiseled_deepslate_torch", () -> new StandingAndWallBlockItem(CHISELED_DEEPSLATE_TORCH.get(), CHISELED_DEEPSLATE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> POLISHED_DEEPSLATE_TORCH_ITEM = ITEMS.register("polished_deepslate_torch", () -> new StandingAndWallBlockItem(POLISHED_DEEPSLATE_TORCH.get(), POLISHED_DEEPSLATE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> DEEPSLATE_BRICKS_TORCH_ITEM = ITEMS.register("deepslate_bricks_torch", () -> new StandingAndWallBlockItem(DEEPSLATE_BRICKS_TORCH.get(), DEEPSLATE_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CRACKED_DEEPSLATE_BRICKS_TORCH_ITEM = ITEMS.register("cracked_deepslate_bricks_torch", () -> new StandingAndWallBlockItem(CRACKED_DEEPSLATE_BRICKS_TORCH.get(), CRACKED_DEEPSLATE_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> DEEPSLATE_TILES_TORCH_ITEM = ITEMS.register("deepslate_tiles_torch", () -> new StandingAndWallBlockItem(DEEPSLATE_TILES_TORCH.get(), DEEPSLATE_TILES_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CRACKED_DEEPSLATE_TILES_TORCH_ITEM = ITEMS.register("cracked_deepslate_tiles_torch", () -> new StandingAndWallBlockItem(CRACKED_DEEPSLATE_TILES_TORCH.get(), CRACKED_DEEPSLATE_TILES_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> BRICKS_TORCH_ITEM = ITEMS.register("bricks_torch", () -> new StandingAndWallBlockItem(BRICKS_TORCH.get(), BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> PACKED_MUD_TORCH_ITEM = ITEMS.register("packed_mud_torch", () -> new StandingAndWallBlockItem(PACKED_MUD_TORCH.get(), PACKED_MUD_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> MUD_BRICKS_TORCH_ITEM = ITEMS.register("mud_bricks_torch", () -> new StandingAndWallBlockItem(MUD_BRICKS_TORCH.get(), MUD_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> SANDSTONE_TORCH_ITEM = ITEMS.register("sandstone_torch", () -> new StandingAndWallBlockItem(SANDSTONE_TORCH.get(), SANDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CHISELED_SANDSTONE_TORCH_ITEM = ITEMS.register("chiseled_sandstone_torch", () -> new StandingAndWallBlockItem(CHISELED_SANDSTONE_TORCH.get(), CHISELED_SANDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> SMOOTH_SANDSTONE_TORCH_ITEM = ITEMS.register("smooth_sandstone_torch", () -> new StandingAndWallBlockItem(SMOOTH_SANDSTONE_TORCH.get(), SMOOTH_SANDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CUT_SANDSTONE_TORCH_ITEM = ITEMS.register("cut_sandstone_torch", () -> new StandingAndWallBlockItem(CUT_SANDSTONE_TORCH.get(), CUT_SANDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> RED_SANDSTONE_TORCH_ITEM = ITEMS.register("red_sandstone_torch", () -> new StandingAndWallBlockItem(RED_SANDSTONE_TORCH.get(), RED_SANDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CHISELED_RED_SANDSTONE_TORCH_ITEM = ITEMS.register("chiseled_red_sandstone_torch", () -> new StandingAndWallBlockItem(CHISELED_RED_SANDSTONE_TORCH.get(), CHISELED_RED_SANDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> SMOOTH_RED_SANDSTONE_TORCH_ITEM = ITEMS.register("smooth_red_sandstone_torch", () -> new StandingAndWallBlockItem(SMOOTH_RED_SANDSTONE_TORCH.get(), SMOOTH_RED_SANDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CUT_RED_SANDSTONE_TORCH_ITEM = ITEMS.register("cut_red_sandstone_torch", () -> new StandingAndWallBlockItem(CUT_RED_SANDSTONE_TORCH.get(), CUT_RED_SANDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> PRISMARINE_BRICKS_TORCH_ITEM = ITEMS.register("prismarine_bricks_torch", () -> new StandingAndWallBlockItem(PRISMARINE_BRICKS_TORCH.get(), PRISMARINE_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> DARK_PRISMARINE_TORCH_ITEM = ITEMS.register("dark_prismarine_torch", () -> new StandingAndWallBlockItem(DARK_PRISMARINE_TORCH.get(), DARK_PRISMARINE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> NETHERRACK_TORCH_ITEM = ITEMS.register("netherrack_torch", () -> new StandingAndWallBlockItem(NETHERRACK_TORCH.get(), NETHERRACK_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> NETHER_BRICKS_TORCH_ITEM = ITEMS.register("nether_bricks_torch", () -> new StandingAndWallBlockItem(NETHER_BRICKS_TORCH.get(), NETHER_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CRACKED_NETHER_BRICKS_TORCH_ITEM = ITEMS.register("cracked_nether_bricks_torch", () -> new StandingAndWallBlockItem(CRACKED_NETHER_BRICKS_TORCH.get(), CRACKED_NETHER_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CHISELED_NETHER_BRICKS_TORCH_ITEM = ITEMS.register("chiseled_nether_bricks_torch", () -> new StandingAndWallBlockItem(CHISELED_NETHER_BRICKS_TORCH.get(), CHISELED_NETHER_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> RED_NETHER_BRICKS_TORCH_ITEM = ITEMS.register("red_nether_bricks_torch", () -> new StandingAndWallBlockItem(RED_NETHER_BRICKS_TORCH.get(), RED_NETHER_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> BASALT_TORCH_ITEM = ITEMS.register("basalt_torch", () -> new StandingAndWallBlockItem(BASALT_TORCH.get(), BASALT_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> SMOOTH_BASALT_TORCH_ITEM = ITEMS.register("smooth_basalt_torch", () -> new StandingAndWallBlockItem(SMOOTH_BASALT_TORCH.get(), SMOOTH_BASALT_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> POLISHED_BASALT_TORCH_ITEM = ITEMS.register("polished_basalt_torch", () -> new StandingAndWallBlockItem(POLISHED_BASALT_TORCH.get(), POLISHED_BASALT_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> BLACKSTONE_TORCH_ITEM = ITEMS.register("blackstone_torch", () -> new StandingAndWallBlockItem(BLACKSTONE_TORCH.get(), BLACKSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> GILDED_BLACKSTONE_TORCH_ITEM = ITEMS.register("gilded_blackstone_torch", () -> new StandingAndWallBlockItem(GILDED_BLACKSTONE_TORCH.get(), GILDED_BLACKSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CHISELED_POLISHED_BLACKSTONE_TORCH_ITEM = ITEMS.register("chiseled_polished_blackstone_torch", () -> new StandingAndWallBlockItem(CHISELED_POLISHED_BLACKSTONE_TORCH.get(), CHISELED_POLISHED_BLACKSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> POLISHED_BLACKSTONE_TORCH_ITEM = ITEMS.register("polished_blackstone_torch", () -> new StandingAndWallBlockItem(POLISHED_BLACKSTONE_TORCH.get(), POLISHED_BLACKSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> POLISHED_BLACKSTONE_BRICKS_TORCH_ITEM = ITEMS.register("polished_blackstone_bricks_torch", () -> new StandingAndWallBlockItem(POLISHED_BLACKSTONE_BRICKS_TORCH.get(), POLISHED_BLACKSTONE_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CRACKED_POLISHED_BLACKSTONE_BRICKS_TORCH_ITEM = ITEMS.register("cracked_polished_blackstone_bricks_torch", () -> new StandingAndWallBlockItem(CRACKED_POLISHED_BLACKSTONE_BRICKS_TORCH.get(), CRACKED_POLISHED_BLACKSTONE_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> END_STONE_TORCH_ITEM = ITEMS.register("end_stone_torch", () -> new StandingAndWallBlockItem(END_STONE_TORCH.get(), END_STONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> END_STONE_BRICKS_TORCH_ITEM = ITEMS.register("end_stone_bricks_torch", () -> new StandingAndWallBlockItem(END_STONE_BRICKS_TORCH.get(), END_STONE_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> PURPUR_BLOCK_TORCH_ITEM = ITEMS.register("purpur_block_torch", () -> new StandingAndWallBlockItem(PURPUR_BLOCK_TORCH.get(), PURPUR_BLOCK_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> PURPUR_PILLAR_TORCH_ITEM = ITEMS.register("purpur_pillar_torch", () -> new StandingAndWallBlockItem(PURPUR_PILLAR_TORCH.get(), PURPUR_PILLAR_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> IRON_TORCH_ITEM = ITEMS.register("iron_torch", () -> new StandingAndWallBlockItem(IRON_TORCH.get(), IRON_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> GOLD_TORCH_ITEM = ITEMS.register("gold_torch", () -> new StandingAndWallBlockItem(GOLD_TORCH.get(), GOLD_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> REDSTONE_TORCH_ITEM = ITEMS.register("redstone_torch", () -> new StandingAndWallBlockItem(REDSTONE_TORCH.get(), REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> EMERALD_TORCH_ITEM = ITEMS.register("emerald_torch", () -> new StandingAndWallBlockItem(EMERALD_TORCH.get(), EMERALD_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> LAPIS_LAZULI_TORCH_ITEM = ITEMS.register("lapis_lazuli_torch", () -> new StandingAndWallBlockItem(LAPIS_LAZULI_TORCH.get(), LAPIS_LAZULI_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> DIAMOND_TORCH_ITEM = ITEMS.register("diamond_torch", () -> new StandingAndWallBlockItem(DIAMOND_TORCH.get(), DIAMOND_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> NETHERITE_TORCH_ITEM = ITEMS.register("netherite_torch", () -> new StandingAndWallBlockItem(NETHERITE_TORCH.get(), NETHERITE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> QUARTZ_TORCH_ITEM = ITEMS.register("quartz_torch", () -> new StandingAndWallBlockItem(QUARTZ_TORCH.get(), QUARTZ_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CHISELED_QUARTZ_TORCH_ITEM = ITEMS.register("chiseled_quartz_torch", () -> new StandingAndWallBlockItem(CHISELED_QUARTZ_TORCH.get(), CHISELED_QUARTZ_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> QUARTZ_BRICKS_TORCH_ITEM = ITEMS.register("quartz_bricks_torch", () -> new StandingAndWallBlockItem(QUARTZ_BRICKS_TORCH.get(), QUARTZ_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> QUARTZ_PILLAR_TORCH_ITEM = ITEMS.register("quartz_pillar_torch", () -> new StandingAndWallBlockItem(QUARTZ_PILLAR_TORCH.get(), QUARTZ_PILLAR_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> SMOOTH_QUARTZ_TORCH_ITEM = ITEMS.register("smooth_quartz_torch", () -> new StandingAndWallBlockItem(SMOOTH_QUARTZ_TORCH.get(), SMOOTH_QUARTZ_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> AMETHYST_TORCH_ITEM = ITEMS.register("amethyst_torch", () -> new StandingAndWallBlockItem(AMETHYST_TORCH.get(), AMETHYST_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> COPPER_TORCH_ITEM = ITEMS.register("copper_torch", () -> new StandingAndWallBlockItem(COPPER_TORCH.get(), COPPER_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CUT_COPPER_TORCH_ITEM = ITEMS.register("cut_copper_torch", () -> new StandingAndWallBlockItem(CUT_COPPER_TORCH.get(), CUT_COPPER_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> EXPOSED_COPPER_TORCH_ITEM = ITEMS.register("exposed_copper_torch", () -> new StandingAndWallBlockItem(EXPOSED_COPPER_TORCH.get(), EXPOSED_COPPER_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> EXPOSED_CUT_COPPER_TORCH_ITEM = ITEMS.register("exposed_cut_copper_torch", () -> new StandingAndWallBlockItem(EXPOSED_CUT_COPPER_TORCH.get(), EXPOSED_CUT_COPPER_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> WEATHERED_COPPER_TORCH_ITEM = ITEMS.register("weathered_copper_torch", () -> new StandingAndWallBlockItem(WEATHERED_COPPER_TORCH.get(), WEATHERED_COPPER_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> WEATHERED_CUT_COPPER_TORCH_ITEM = ITEMS.register("weathered_cut_copper_torch", () -> new StandingAndWallBlockItem(WEATHERED_CUT_COPPER_TORCH.get(), WEATHERED_CUT_COPPER_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> OXIDIZED_COPPER_TORCH_ITEM = ITEMS.register("oxidized_copper_torch", () -> new StandingAndWallBlockItem(OXIDIZED_COPPER_TORCH.get(), OXIDIZED_COPPER_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> OXIDIZED_CUT_COPPER_TORCH_ITEM = ITEMS.register("oxidized_cut_copper_torch", () -> new StandingAndWallBlockItem(OXIDIZED_CUT_COPPER_TORCH.get(), OXIDIZED_CUT_COPPER_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));

    public static final RegistryObject<Item> OAK_LOG_REDSTONE_TORCH_ITEM = ITEMS.register("oak_log_redstone_torch", () -> new StandingAndWallBlockItem(OAK_LOG_REDSTONE_TORCH.get(), OAK_LOG_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> OAK_PLANKS_REDSTONE_TORCH_ITEM = ITEMS.register("oak_planks_redstone_torch", () -> new StandingAndWallBlockItem(OAK_PLANKS_REDSTONE_TORCH.get(), OAK_PLANKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> SPRUCE_LOG_REDSTONE_TORCH_ITEM = ITEMS.register("spruce_log_redstone_torch", () -> new StandingAndWallBlockItem(SPRUCE_LOG_REDSTONE_TORCH.get(), SPRUCE_LOG_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> SPRUCE_PLANKS_REDSTONE_TORCH_ITEM = ITEMS.register("spruce_planks_redstone_torch", () -> new StandingAndWallBlockItem(SPRUCE_PLANKS_REDSTONE_TORCH.get(), SPRUCE_PLANKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> BIRCH_LOG_REDSTONE_TORCH_ITEM = ITEMS.register("birch_log_redstone_torch", () -> new StandingAndWallBlockItem(BIRCH_LOG_REDSTONE_TORCH.get(), BIRCH_LOG_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> BIRCH_PLANKS_REDSTONE_TORCH_ITEM = ITEMS.register("birch_planks_redstone_torch", () -> new StandingAndWallBlockItem(BIRCH_PLANKS_REDSTONE_TORCH.get(), BIRCH_PLANKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> JUNGLE_LOG_REDSTONE_TORCH_ITEM = ITEMS.register("jungle_log_redstone_torch", () -> new StandingAndWallBlockItem(JUNGLE_LOG_REDSTONE_TORCH.get(), JUNGLE_LOG_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> JUNGLE_PLANKS_REDSTONE_TORCH_ITEM = ITEMS.register("jungle_planks_redstone_torch", () -> new StandingAndWallBlockItem(JUNGLE_PLANKS_REDSTONE_TORCH.get(), JUNGLE_PLANKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> ACACIA_LOG_REDSTONE_TORCH_ITEM = ITEMS.register("acacia_log_redstone_torch", () -> new StandingAndWallBlockItem(ACACIA_LOG_REDSTONE_TORCH.get(), ACACIA_LOG_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> ACACIA_PLANKS_REDSTONE_TORCH_ITEM = ITEMS.register("acacia_planks_redstone_torch", () -> new StandingAndWallBlockItem(ACACIA_PLANKS_REDSTONE_TORCH.get(), ACACIA_PLANKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> DARK_OAK_LOG_REDSTONE_TORCH_ITEM = ITEMS.register("dark_oak_log_redstone_torch", () -> new StandingAndWallBlockItem(DARK_OAK_LOG_REDSTONE_TORCH.get(), DARK_OAK_LOG_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> DARK_OAK_PLANKS_REDSTONE_TORCH_ITEM = ITEMS.register("dark_oak_planks_redstone_torch", () -> new StandingAndWallBlockItem(DARK_OAK_PLANKS_REDSTONE_TORCH.get(), DARK_OAK_PLANKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> MANGROVE_LOG_REDSTONE_TORCH_ITEM = ITEMS.register("mangrove_log_redstone_torch", () -> new StandingAndWallBlockItem(MANGROVE_LOG_REDSTONE_TORCH.get(), MANGROVE_LOG_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> MANGROVE_PLANKS_REDSTONE_TORCH_ITEM = ITEMS.register("mangrove_planks_redstone_torch", () -> new StandingAndWallBlockItem(MANGROVE_PLANKS_REDSTONE_TORCH.get(), MANGROVE_PLANKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CRIMSON_STEM_REDSTONE_TORCH_ITEM = ITEMS.register("crimson_stem_redstone_torch", () -> new StandingAndWallBlockItem(CRIMSON_STEM_REDSTONE_TORCH.get(), CRIMSON_STEM_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CRIMSON_PLANKS_REDSTONE_TORCH_ITEM = ITEMS.register("crimson_planks_redstone_torch", () -> new StandingAndWallBlockItem(CRIMSON_PLANKS_REDSTONE_TORCH.get(), CRIMSON_PLANKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> WARPED_STEM_REDSTONE_TORCH_ITEM = ITEMS.register("warped_stem_redstone_torch", () -> new StandingAndWallBlockItem(WARPED_STEM_REDSTONE_TORCH.get(), WARPED_STEM_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> WARPED_PLANKS_REDSTONE_TORCH_ITEM = ITEMS.register("warped_planks_redstone_torch", () -> new StandingAndWallBlockItem(WARPED_PLANKS_REDSTONE_TORCH.get(), WARPED_PLANKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CHERRY_LOG_REDSTONE_TORCH_ITEM = ITEMS.register("cherry_log_redstone_torch", () -> new StandingAndWallBlockItem(CHERRY_LOG_REDSTONE_TORCH.get(), CHERRY_LOG_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CHERRY_PLANKS_REDSTONE_TORCH_ITEM = ITEMS.register("cherry_planks_redstone_torch", () -> new StandingAndWallBlockItem(CHERRY_PLANKS_REDSTONE_TORCH.get(), CHERRY_PLANKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> BAMBOO_BLOCK_REDSTONE_TORCH_ITEM = ITEMS.register("bamboo_block_redstone_torch", () -> new StandingAndWallBlockItem(BAMBOO_BLOCK_REDSTONE_TORCH.get(), BAMBOO_BLOCK_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> BAMBOO_PLANKS_REDSTONE_TORCH_ITEM = ITEMS.register("bamboo_planks_redstone_torch", () -> new StandingAndWallBlockItem(BAMBOO_PLANKS_REDSTONE_TORCH.get(), BAMBOO_PLANKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> STONE_REDSTONE_TORCH_ITEM = ITEMS.register("stone_redstone_torch", () -> new StandingAndWallBlockItem(STONE_REDSTONE_TORCH.get(), STONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> SMOOTH_STONE_REDSTONE_TORCH_ITEM = ITEMS.register("smooth_stone_redstone_torch", () -> new StandingAndWallBlockItem(SMOOTH_STONE_REDSTONE_TORCH.get(), SMOOTH_STONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> COBBLESTONE_REDSTONE_TORCH_ITEM = ITEMS.register("cobblestone_redstone_torch", () -> new StandingAndWallBlockItem(COBBLESTONE_REDSTONE_TORCH.get(), COBBLESTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> MOSSY_COBBLESTONE_REDSTONE_TORCH_ITEM = ITEMS.register("mossy_cobblestone_redstone_torch", () -> new StandingAndWallBlockItem(MOSSY_COBBLESTONE_REDSTONE_TORCH.get(), MOSSY_COBBLESTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> STONE_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("stone_bricks_redstone_torch", () -> new StandingAndWallBlockItem(STONE_BRICKS_REDSTONE_TORCH.get(), STONE_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> MOSSY_STONE_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("mossy_stone_bricks_redstone_torch", () -> new StandingAndWallBlockItem(MOSSY_STONE_BRICKS_REDSTONE_TORCH.get(), MOSSY_STONE_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CHISELED_STONE_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("chiseled_stone_bricks_redstone_torch", () -> new StandingAndWallBlockItem(CHISELED_STONE_BRICKS_REDSTONE_TORCH.get(), CHISELED_STONE_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> GRANITE_REDSTONE_TORCH_ITEM = ITEMS.register("granite_redstone_torch", () -> new StandingAndWallBlockItem(GRANITE_REDSTONE_TORCH.get(), GRANITE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> POLISHED_GRANITE_REDSTONE_TORCH_ITEM = ITEMS.register("polished_granite_redstone_torch", () -> new StandingAndWallBlockItem(POLISHED_GRANITE_REDSTONE_TORCH.get(), POLISHED_GRANITE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> DIORITE_REDSTONE_TORCH_ITEM = ITEMS.register("diorite_redstone_torch", () -> new StandingAndWallBlockItem(DIORITE_REDSTONE_TORCH.get(), DIORITE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> POLISHED_DIORITE_REDSTONE_TORCH_ITEM = ITEMS.register("polished_diorite_redstone_torch", () -> new StandingAndWallBlockItem(POLISHED_DIORITE_REDSTONE_TORCH.get(), POLISHED_DIORITE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> ANDESITE_REDSTONE_TORCH_ITEM = ITEMS.register("andesite_redstone_torch", () -> new StandingAndWallBlockItem(ANDESITE_REDSTONE_TORCH.get(), ANDESITE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> POLISHED_ANDESITE_REDSTONE_TORCH_ITEM = ITEMS.register("polished_andesite_redstone_torch", () -> new StandingAndWallBlockItem(POLISHED_ANDESITE_REDSTONE_TORCH.get(), POLISHED_ANDESITE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> DEEPSLATE_REDSTONE_TORCH_ITEM = ITEMS.register("deepslate_redstone_torch", () -> new StandingAndWallBlockItem(DEEPSLATE_REDSTONE_TORCH.get(), DEEPSLATE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> COBBLED_DEEPSLATE_REDSTONE_TORCH_ITEM = ITEMS.register("cobbled_deepslate_redstone_torch", () -> new StandingAndWallBlockItem(COBBLED_DEEPSLATE_REDSTONE_TORCH.get(), COBBLED_DEEPSLATE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CHISELED_DEEPSLATE_REDSTONE_TORCH_ITEM = ITEMS.register("chiseled_deepslate_redstone_torch", () -> new StandingAndWallBlockItem(CHISELED_DEEPSLATE_REDSTONE_TORCH.get(), CHISELED_DEEPSLATE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> POLISHED_DEEPSLATE_REDSTONE_TORCH_ITEM = ITEMS.register("polished_deepslate_redstone_torch", () -> new StandingAndWallBlockItem(POLISHED_DEEPSLATE_REDSTONE_TORCH.get(), POLISHED_DEEPSLATE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> DEEPSLATE_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("deepslate_bricks_redstone_torch", () -> new StandingAndWallBlockItem(DEEPSLATE_BRICKS_REDSTONE_TORCH.get(), DEEPSLATE_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CRACKED_DEEPSLATE_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("cracked_deepslate_bricks_redstone_torch", () -> new StandingAndWallBlockItem(CRACKED_DEEPSLATE_BRICKS_REDSTONE_TORCH.get(), CRACKED_DEEPSLATE_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> DEEPSLATE_TILES_REDSTONE_TORCH_ITEM = ITEMS.register("deepslate_tiles_redstone_torch", () -> new StandingAndWallBlockItem(DEEPSLATE_TILES_REDSTONE_TORCH.get(), DEEPSLATE_TILES_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CRACKED_DEEPSLATE_TILES_REDSTONE_TORCH_ITEM = ITEMS.register("cracked_deepslate_tiles_redstone_torch", () -> new StandingAndWallBlockItem(CRACKED_DEEPSLATE_TILES_REDSTONE_TORCH.get(), CRACKED_DEEPSLATE_TILES_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("bricks_redstone_torch", () -> new StandingAndWallBlockItem(BRICKS_REDSTONE_TORCH.get(), BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> PACKED_MUD_REDSTONE_TORCH_ITEM = ITEMS.register("packed_mud_redstone_torch", () -> new StandingAndWallBlockItem(PACKED_MUD_REDSTONE_TORCH.get(), PACKED_MUD_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> MUD_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("mud_bricks_redstone_torch", () -> new StandingAndWallBlockItem(MUD_BRICKS_REDSTONE_TORCH.get(), MUD_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> SANDSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("sandstone_redstone_torch", () -> new StandingAndWallBlockItem(SANDSTONE_REDSTONE_TORCH.get(), SANDSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CHISELED_SANDSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("chiseled_sandstone_redstone_torch", () -> new StandingAndWallBlockItem(CHISELED_SANDSTONE_REDSTONE_TORCH.get(), CHISELED_SANDSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> SMOOTH_SANDSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("smooth_sandstone_redstone_torch", () -> new StandingAndWallBlockItem(SMOOTH_SANDSTONE_REDSTONE_TORCH.get(), SMOOTH_SANDSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CUT_SANDSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("cut_sandstone_redstone_torch", () -> new StandingAndWallBlockItem(CUT_SANDSTONE_REDSTONE_TORCH.get(), CUT_SANDSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> RED_SANDSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("red_sandstone_redstone_torch", () -> new StandingAndWallBlockItem(RED_SANDSTONE_REDSTONE_TORCH.get(), RED_SANDSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CHISELED_RED_SANDSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("chiseled_red_sandstone_redstone_torch", () -> new StandingAndWallBlockItem(CHISELED_RED_SANDSTONE_REDSTONE_TORCH.get(), CHISELED_RED_SANDSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> SMOOTH_RED_SANDSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("smooth_red_sandstone_redstone_torch", () -> new StandingAndWallBlockItem(SMOOTH_RED_SANDSTONE_REDSTONE_TORCH.get(), SMOOTH_RED_SANDSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CUT_RED_SANDSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("cut_red_sandstone_redstone_torch", () -> new StandingAndWallBlockItem(CUT_RED_SANDSTONE_REDSTONE_TORCH.get(), CUT_RED_SANDSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> PRISMARINE_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("prismarine_bricks_redstone_torch", () -> new StandingAndWallBlockItem(PRISMARINE_BRICKS_REDSTONE_TORCH.get(), PRISMARINE_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> DARK_PRISMARINE_REDSTONE_TORCH_ITEM = ITEMS.register("dark_prismarine_redstone_torch", () -> new StandingAndWallBlockItem(DARK_PRISMARINE_REDSTONE_TORCH.get(), DARK_PRISMARINE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> NETHERRACK_REDSTONE_TORCH_ITEM = ITEMS.register("netherrack_redstone_torch", () -> new StandingAndWallBlockItem(NETHERRACK_REDSTONE_TORCH.get(), NETHERRACK_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> NETHER_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("nether_bricks_redstone_torch", () -> new StandingAndWallBlockItem(NETHER_BRICKS_REDSTONE_TORCH.get(), NETHER_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CRACKED_NETHER_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("cracked_nether_bricks_redstone_torch", () -> new StandingAndWallBlockItem(CRACKED_NETHER_BRICKS_REDSTONE_TORCH.get(), CRACKED_NETHER_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CHISELED_NETHER_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("chiseled_nether_bricks_redstone_torch", () -> new StandingAndWallBlockItem(CHISELED_NETHER_BRICKS_REDSTONE_TORCH.get(), CHISELED_NETHER_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> RED_NETHER_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("red_nether_bricks_redstone_torch", () -> new StandingAndWallBlockItem(RED_NETHER_BRICKS_REDSTONE_TORCH.get(), RED_NETHER_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> BASALT_REDSTONE_TORCH_ITEM = ITEMS.register("basalt_redstone_torch", () -> new StandingAndWallBlockItem(BASALT_REDSTONE_TORCH.get(), BASALT_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> SMOOTH_BASALT_REDSTONE_TORCH_ITEM = ITEMS.register("smooth_basalt_redstone_torch", () -> new StandingAndWallBlockItem(SMOOTH_BASALT_REDSTONE_TORCH.get(), SMOOTH_BASALT_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> POLISHED_BASALT_REDSTONE_TORCH_ITEM = ITEMS.register("polished_basalt_redstone_torch", () -> new StandingAndWallBlockItem(POLISHED_BASALT_REDSTONE_TORCH.get(), POLISHED_BASALT_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> BLACKSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("blackstone_redstone_torch", () -> new StandingAndWallBlockItem(BLACKSTONE_REDSTONE_TORCH.get(), BLACKSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> GILDED_BLACKSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("gilded_blackstone_redstone_torch", () -> new StandingAndWallBlockItem(GILDED_BLACKSTONE_REDSTONE_TORCH.get(), GILDED_BLACKSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CHISELED_POLISHED_BLACKSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("chiseled_polished_blackstone_redstone_torch", () -> new StandingAndWallBlockItem(CHISELED_POLISHED_BLACKSTONE_REDSTONE_TORCH.get(), CHISELED_POLISHED_BLACKSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> POLISHED_BLACKSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("polished_blackstone_redstone_torch", () -> new StandingAndWallBlockItem(POLISHED_BLACKSTONE_REDSTONE_TORCH.get(), POLISHED_BLACKSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> POLISHED_BLACKSTONE_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("polished_blackstone_bricks_redstone_torch", () -> new StandingAndWallBlockItem(POLISHED_BLACKSTONE_BRICKS_REDSTONE_TORCH.get(), POLISHED_BLACKSTONE_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CRACKED_POLISHED_BLACKSTONE_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("cracked_polished_blackstone_bricks_redstone_torch", () -> new StandingAndWallBlockItem(CRACKED_POLISHED_BLACKSTONE_BRICKS_REDSTONE_TORCH.get(), CRACKED_POLISHED_BLACKSTONE_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> END_STONE_REDSTONE_TORCH_ITEM = ITEMS.register("end_stone_redstone_torch", () -> new StandingAndWallBlockItem(END_STONE_REDSTONE_TORCH.get(), END_STONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> END_STONE_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("end_stone_bricks_redstone_torch", () -> new StandingAndWallBlockItem(END_STONE_BRICKS_REDSTONE_TORCH.get(), END_STONE_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> PURPUR_BLOCK_REDSTONE_TORCH_ITEM = ITEMS.register("purpur_block_redstone_torch", () -> new StandingAndWallBlockItem(PURPUR_BLOCK_REDSTONE_TORCH.get(), PURPUR_BLOCK_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> PURPUR_PILLAR_REDSTONE_TORCH_ITEM = ITEMS.register("purpur_pillar_redstone_torch", () -> new StandingAndWallBlockItem(PURPUR_PILLAR_REDSTONE_TORCH.get(), PURPUR_PILLAR_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> IRON_REDSTONE_TORCH_ITEM = ITEMS.register("iron_redstone_torch", () -> new StandingAndWallBlockItem(IRON_REDSTONE_TORCH.get(), IRON_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> GOLD_REDSTONE_TORCH_ITEM = ITEMS.register("gold_redstone_torch", () -> new StandingAndWallBlockItem(GOLD_REDSTONE_TORCH.get(), GOLD_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> REDSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("redstone_redstone_torch", () -> new StandingAndWallBlockItem(REDSTONE_REDSTONE_TORCH.get(), REDSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> EMERALD_REDSTONE_TORCH_ITEM = ITEMS.register("emerald_redstone_torch", () -> new StandingAndWallBlockItem(EMERALD_REDSTONE_TORCH.get(), EMERALD_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> LAPIS_LAZULI_REDSTONE_TORCH_ITEM = ITEMS.register("lapis_lazuli_redstone_torch", () -> new StandingAndWallBlockItem(LAPIS_LAZULI_REDSTONE_TORCH.get(), LAPIS_LAZULI_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> DIAMOND_REDSTONE_TORCH_ITEM = ITEMS.register("diamond_redstone_torch", () -> new StandingAndWallBlockItem(DIAMOND_REDSTONE_TORCH.get(), DIAMOND_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> NETHERITE_REDSTONE_TORCH_ITEM = ITEMS.register("netherite_redstone_torch", () -> new StandingAndWallBlockItem(NETHERITE_REDSTONE_TORCH.get(), NETHERITE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> QUARTZ_REDSTONE_TORCH_ITEM = ITEMS.register("quartz_redstone_torch", () -> new StandingAndWallBlockItem(QUARTZ_REDSTONE_TORCH.get(), QUARTZ_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CHISELED_QUARTZ_REDSTONE_TORCH_ITEM = ITEMS.register("chiseled_quartz_redstone_torch", () -> new StandingAndWallBlockItem(CHISELED_QUARTZ_REDSTONE_TORCH.get(), CHISELED_QUARTZ_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> QUARTZ_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("quartz_bricks_redstone_torch", () -> new StandingAndWallBlockItem(QUARTZ_BRICKS_REDSTONE_TORCH.get(), QUARTZ_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> QUARTZ_PILLAR_REDSTONE_TORCH_ITEM = ITEMS.register("quartz_pillar_redstone_torch", () -> new StandingAndWallBlockItem(QUARTZ_PILLAR_REDSTONE_TORCH.get(), QUARTZ_PILLAR_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> SMOOTH_QUARTZ_REDSTONE_TORCH_ITEM = ITEMS.register("smooth_quartz_redstone_torch", () -> new StandingAndWallBlockItem(SMOOTH_QUARTZ_REDSTONE_TORCH.get(), SMOOTH_QUARTZ_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> AMETHYST_REDSTONE_TORCH_ITEM = ITEMS.register("amethyst_redstone_torch", () -> new StandingAndWallBlockItem(AMETHYST_REDSTONE_TORCH.get(), AMETHYST_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> COPPER_REDSTONE_TORCH_ITEM = ITEMS.register("copper_redstone_torch", () -> new StandingAndWallBlockItem(COPPER_REDSTONE_TORCH.get(), COPPER_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> CUT_COPPER_REDSTONE_TORCH_ITEM = ITEMS.register("cut_copper_redstone_torch", () -> new StandingAndWallBlockItem(CUT_COPPER_REDSTONE_TORCH.get(), CUT_COPPER_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> EXPOSED_COPPER_REDSTONE_TORCH_ITEM = ITEMS.register("exposed_copper_redstone_torch", () -> new StandingAndWallBlockItem(EXPOSED_COPPER_REDSTONE_TORCH.get(), EXPOSED_COPPER_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> EXPOSED_CUT_COPPER_REDSTONE_TORCH_ITEM = ITEMS.register("exposed_cut_copper_redstone_torch", () -> new StandingAndWallBlockItem(EXPOSED_CUT_COPPER_REDSTONE_TORCH.get(), EXPOSED_CUT_COPPER_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> WEATHERED_COPPER_REDSTONE_TORCH_ITEM = ITEMS.register("weathered_copper_redstone_torch", () -> new StandingAndWallBlockItem(WEATHERED_COPPER_REDSTONE_TORCH.get(), WEATHERED_COPPER_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> WEATHERED_CUT_COPPER_REDSTONE_TORCH_ITEM = ITEMS.register("weathered_cut_copper_redstone_torch", () -> new StandingAndWallBlockItem(WEATHERED_CUT_COPPER_REDSTONE_TORCH.get(), WEATHERED_CUT_COPPER_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> OXIDIZED_COPPER_REDSTONE_TORCH_ITEM = ITEMS.register("oxidized_copper_redstone_torch", () -> new StandingAndWallBlockItem(OXIDIZED_COPPER_REDSTONE_TORCH.get(), OXIDIZED_COPPER_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> OXIDIZED_CUT_COPPER_REDSTONE_TORCH_ITEM = ITEMS.register("oxidized_cut_copper_redstone_torch", () -> new StandingAndWallBlockItem(OXIDIZED_CUT_COPPER_REDSTONE_TORCH.get(), OXIDIZED_CUT_COPPER_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));


    // Creates a creative tab with the id "examplemod:example_tab" for the example item, that is placed after the combat tab
    public static final RegistryObject<CreativeModeTab> MBT_TAB = CREATIVE_MODE_TABS.register("mbt_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT).title(Component.literal("More Beautiful Torches!"))
            .icon(() -> OAK_LOG_TORCH_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
//                output.accept(OAK_LOG_TORCH_ITEM.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
                output.accept(OAK_LOG_TORCH_ITEM.get());
                output.accept(OAK_PLANKS_TORCH_ITEM.get());
                output.accept(SPRUCE_LOG_TORCH_ITEM.get());
                output.accept(SPRUCE_PLANKS_TORCH_ITEM.get());
                output.accept(BIRCH_LOG_TORCH_ITEM.get());
                output.accept(BIRCH_PLANKS_TORCH_ITEM.get());
                output.accept(JUNGLE_LOG_TORCH_ITEM.get());
                output.accept(JUNGLE_PLANKS_TORCH_ITEM.get());
                output.accept(ACACIA_LOG_TORCH_ITEM.get());
                output.accept(ACACIA_PLANKS_TORCH_ITEM.get());
                output.accept(DARK_OAK_LOG_TORCH_ITEM.get());
                output.accept(DARK_OAK_PLANKS_TORCH_ITEM.get());
                output.accept(MANGROVE_LOG_TORCH_ITEM.get());
                output.accept(MANGROVE_PLANKS_TORCH_ITEM.get());
                output.accept(CRIMSON_STEM_TORCH_ITEM.get());
                output.accept(CRIMSON_PLANKS_TORCH_ITEM.get());
                output.accept(WARPED_STEM_TORCH_ITEM.get());
                output.accept(WARPED_PLANKS_TORCH_ITEM.get());
                output.accept(CHERRY_LOG_TORCH_ITEM.get());
                output.accept(CHERRY_PLANKS_TORCH_ITEM.get());
                output.accept(BAMBOO_BLOCK_TORCH_ITEM.get());
                output.accept(BAMBOO_PLANKS_TORCH_ITEM.get());
                output.accept(STONE_TORCH_ITEM.get());
                output.accept(SMOOTH_STONE_TORCH_ITEM.get());
                output.accept(COBBLESTONE_TORCH_ITEM.get());
                output.accept(MOSSY_COBBLESTONE_TORCH_ITEM.get());
                output.accept(STONE_BRICKS_TORCH_ITEM.get());
                output.accept(MOSSY_STONE_BRICKS_TORCH_ITEM.get());
                output.accept(CHISELED_STONE_BRICKS_TORCH_ITEM.get());
                output.accept(GRANITE_TORCH_ITEM.get());
                output.accept(POLISHED_GRANITE_TORCH_ITEM.get());
                output.accept(DIORITE_TORCH_ITEM.get());
                output.accept(POLISHED_DIORITE_TORCH_ITEM.get());
                output.accept(ANDESITE_TORCH_ITEM.get());
                output.accept(POLISHED_ANDESITE_TORCH_ITEM.get());
                output.accept(DEEPSLATE_TORCH_ITEM.get());
                output.accept(COBBLED_DEEPSLATE_TORCH_ITEM.get());
                output.accept(CHISELED_DEEPSLATE_TORCH_ITEM.get());
                output.accept(POLISHED_DEEPSLATE_TORCH_ITEM.get());
                output.accept(DEEPSLATE_BRICKS_TORCH_ITEM.get());
                output.accept(CRACKED_DEEPSLATE_BRICKS_TORCH_ITEM.get());
                output.accept(DEEPSLATE_TILES_TORCH_ITEM.get());
                output.accept(CRACKED_DEEPSLATE_TILES_TORCH_ITEM.get());
                output.accept(BRICKS_TORCH_ITEM.get());
                output.accept(PACKED_MUD_TORCH_ITEM.get());
                output.accept(MUD_BRICKS_TORCH_ITEM.get());
                output.accept(SANDSTONE_TORCH_ITEM.get());
                output.accept(CHISELED_SANDSTONE_TORCH_ITEM.get());
                output.accept(SMOOTH_SANDSTONE_TORCH_ITEM.get());
                output.accept(CUT_SANDSTONE_TORCH_ITEM.get());
                output.accept(RED_SANDSTONE_TORCH_ITEM.get());
                output.accept(CHISELED_RED_SANDSTONE_TORCH_ITEM.get());
                output.accept(SMOOTH_RED_SANDSTONE_TORCH_ITEM.get());
                output.accept(CUT_RED_SANDSTONE_TORCH_ITEM.get());
                output.accept(PRISMARINE_BRICKS_TORCH_ITEM.get());
                output.accept(DARK_PRISMARINE_TORCH_ITEM.get());
                output.accept(NETHERRACK_TORCH_ITEM.get());
                output.accept(NETHER_BRICKS_TORCH_ITEM.get());
                output.accept(CRACKED_NETHER_BRICKS_TORCH_ITEM.get());
                output.accept(CHISELED_NETHER_BRICKS_TORCH_ITEM.get());
                output.accept(RED_NETHER_BRICKS_TORCH_ITEM.get());
                output.accept(BASALT_TORCH_ITEM.get());
                output.accept(SMOOTH_BASALT_TORCH_ITEM.get());
                output.accept(POLISHED_BASALT_TORCH_ITEM.get());
                output.accept(BLACKSTONE_TORCH_ITEM.get());
                output.accept(GILDED_BLACKSTONE_TORCH_ITEM.get());
                output.accept(CHISELED_POLISHED_BLACKSTONE_TORCH_ITEM.get());
                output.accept(POLISHED_BLACKSTONE_TORCH_ITEM.get());
                output.accept(POLISHED_BLACKSTONE_BRICKS_TORCH_ITEM.get());
                output.accept(CRACKED_POLISHED_BLACKSTONE_BRICKS_TORCH_ITEM.get());
                output.accept(END_STONE_TORCH_ITEM.get());
                output.accept(END_STONE_BRICKS_TORCH_ITEM.get());
                output.accept(PURPUR_BLOCK_TORCH_ITEM.get());
                output.accept(PURPUR_PILLAR_TORCH_ITEM.get());
                output.accept(IRON_TORCH_ITEM.get());
                output.accept(GOLD_TORCH_ITEM.get());
                output.accept(REDSTONE_TORCH_ITEM.get());
                output.accept(EMERALD_TORCH_ITEM.get());
                output.accept(LAPIS_LAZULI_TORCH_ITEM.get());
                output.accept(DIAMOND_TORCH_ITEM.get());
                output.accept(NETHERITE_TORCH_ITEM.get());
                output.accept(QUARTZ_TORCH_ITEM.get());
                output.accept(CHISELED_QUARTZ_TORCH_ITEM.get());
                output.accept(QUARTZ_BRICKS_TORCH_ITEM.get());
                output.accept(QUARTZ_PILLAR_TORCH_ITEM.get());
                output.accept(SMOOTH_QUARTZ_TORCH_ITEM.get());
                output.accept(AMETHYST_TORCH_ITEM.get());
                output.accept(COPPER_TORCH_ITEM.get());
                output.accept(CUT_COPPER_TORCH_ITEM.get());
                output.accept(EXPOSED_COPPER_TORCH_ITEM.get());
                output.accept(EXPOSED_CUT_COPPER_TORCH_ITEM.get());
                output.accept(WEATHERED_COPPER_TORCH_ITEM.get());
                output.accept(WEATHERED_CUT_COPPER_TORCH_ITEM.get());
                output.accept(OXIDIZED_COPPER_TORCH_ITEM.get());
                output.accept(OXIDIZED_CUT_COPPER_TORCH_ITEM.get());

                output.accept(OAK_LOG_REDSTONE_TORCH_ITEM.get());
                output.accept(OAK_PLANKS_REDSTONE_TORCH_ITEM.get());
                output.accept(SPRUCE_LOG_REDSTONE_TORCH_ITEM.get());
                output.accept(SPRUCE_PLANKS_REDSTONE_TORCH_ITEM.get());
                output.accept(BIRCH_LOG_REDSTONE_TORCH_ITEM.get());
                output.accept(BIRCH_PLANKS_REDSTONE_TORCH_ITEM.get());
                output.accept(JUNGLE_LOG_REDSTONE_TORCH_ITEM.get());
                output.accept(JUNGLE_PLANKS_REDSTONE_TORCH_ITEM.get());
                output.accept(ACACIA_LOG_REDSTONE_TORCH_ITEM.get());
                output.accept(ACACIA_PLANKS_REDSTONE_TORCH_ITEM.get());
                output.accept(DARK_OAK_LOG_REDSTONE_TORCH_ITEM.get());
                output.accept(DARK_OAK_PLANKS_REDSTONE_TORCH_ITEM.get());
                output.accept(MANGROVE_LOG_REDSTONE_TORCH_ITEM.get());
                output.accept(MANGROVE_PLANKS_REDSTONE_TORCH_ITEM.get());
                output.accept(CRIMSON_STEM_REDSTONE_TORCH_ITEM.get());
                output.accept(CRIMSON_PLANKS_REDSTONE_TORCH_ITEM.get());
                output.accept(WARPED_STEM_REDSTONE_TORCH_ITEM.get());
                output.accept(WARPED_PLANKS_REDSTONE_TORCH_ITEM.get());
                output.accept(CHERRY_LOG_REDSTONE_TORCH_ITEM.get());
                output.accept(CHERRY_PLANKS_REDSTONE_TORCH_ITEM.get());
                output.accept(BAMBOO_BLOCK_REDSTONE_TORCH_ITEM.get());
                output.accept(BAMBOO_PLANKS_REDSTONE_TORCH_ITEM.get());
                output.accept(STONE_REDSTONE_TORCH_ITEM.get());
                output.accept(SMOOTH_STONE_REDSTONE_TORCH_ITEM.get());
                output.accept(COBBLESTONE_REDSTONE_TORCH_ITEM.get());
                output.accept(MOSSY_COBBLESTONE_REDSTONE_TORCH_ITEM.get());
                output.accept(STONE_BRICKS_REDSTONE_TORCH_ITEM.get());
                output.accept(MOSSY_STONE_BRICKS_REDSTONE_TORCH_ITEM.get());
                output.accept(CHISELED_STONE_BRICKS_REDSTONE_TORCH_ITEM.get());
                output.accept(GRANITE_REDSTONE_TORCH_ITEM.get());
                output.accept(POLISHED_GRANITE_REDSTONE_TORCH_ITEM.get());
                output.accept(DIORITE_REDSTONE_TORCH_ITEM.get());
                output.accept(POLISHED_DIORITE_REDSTONE_TORCH_ITEM.get());
                output.accept(ANDESITE_REDSTONE_TORCH_ITEM.get());
                output.accept(POLISHED_ANDESITE_REDSTONE_TORCH_ITEM.get());
                output.accept(DEEPSLATE_REDSTONE_TORCH_ITEM.get());
                output.accept(COBBLED_DEEPSLATE_REDSTONE_TORCH_ITEM.get());
                output.accept(CHISELED_DEEPSLATE_REDSTONE_TORCH_ITEM.get());
                output.accept(POLISHED_DEEPSLATE_REDSTONE_TORCH_ITEM.get());
                output.accept(DEEPSLATE_BRICKS_REDSTONE_TORCH_ITEM.get());
                output.accept(CRACKED_DEEPSLATE_BRICKS_REDSTONE_TORCH_ITEM.get());
                output.accept(DEEPSLATE_TILES_REDSTONE_TORCH_ITEM.get());
                output.accept(CRACKED_DEEPSLATE_TILES_REDSTONE_TORCH_ITEM.get());
                output.accept(BRICKS_REDSTONE_TORCH_ITEM.get());
                output.accept(PACKED_MUD_REDSTONE_TORCH_ITEM.get());
                output.accept(MUD_BRICKS_REDSTONE_TORCH_ITEM.get());
                output.accept(SANDSTONE_REDSTONE_TORCH_ITEM.get());
                output.accept(CHISELED_SANDSTONE_REDSTONE_TORCH_ITEM.get());
                output.accept(SMOOTH_SANDSTONE_REDSTONE_TORCH_ITEM.get());
                output.accept(CUT_SANDSTONE_REDSTONE_TORCH_ITEM.get());
                output.accept(RED_SANDSTONE_REDSTONE_TORCH_ITEM.get());
                output.accept(CHISELED_RED_SANDSTONE_REDSTONE_TORCH_ITEM.get());
                output.accept(SMOOTH_RED_SANDSTONE_REDSTONE_TORCH_ITEM.get());
                output.accept(CUT_RED_SANDSTONE_REDSTONE_TORCH_ITEM.get());
                output.accept(PRISMARINE_BRICKS_REDSTONE_TORCH_ITEM.get());
                output.accept(DARK_PRISMARINE_REDSTONE_TORCH_ITEM.get());
                output.accept(NETHERRACK_REDSTONE_TORCH_ITEM.get());
                output.accept(NETHER_BRICKS_REDSTONE_TORCH_ITEM.get());
                output.accept(CRACKED_NETHER_BRICKS_REDSTONE_TORCH_ITEM.get());
                output.accept(CHISELED_NETHER_BRICKS_REDSTONE_TORCH_ITEM.get());
                output.accept(RED_NETHER_BRICKS_REDSTONE_TORCH_ITEM.get());
                output.accept(BASALT_REDSTONE_TORCH_ITEM.get());
                output.accept(SMOOTH_BASALT_REDSTONE_TORCH_ITEM.get());
                output.accept(POLISHED_BASALT_REDSTONE_TORCH_ITEM.get());
                output.accept(BLACKSTONE_REDSTONE_TORCH_ITEM.get());
                output.accept(GILDED_BLACKSTONE_REDSTONE_TORCH_ITEM.get());
                output.accept(CHISELED_POLISHED_BLACKSTONE_REDSTONE_TORCH_ITEM.get());
                output.accept(POLISHED_BLACKSTONE_REDSTONE_TORCH_ITEM.get());
                output.accept(POLISHED_BLACKSTONE_BRICKS_REDSTONE_TORCH_ITEM.get());
                output.accept(CRACKED_POLISHED_BLACKSTONE_BRICKS_REDSTONE_TORCH_ITEM.get());
                output.accept(END_STONE_REDSTONE_TORCH_ITEM.get());
                output.accept(END_STONE_BRICKS_REDSTONE_TORCH_ITEM.get());
                output.accept(PURPUR_BLOCK_REDSTONE_TORCH_ITEM.get());
                output.accept(PURPUR_PILLAR_REDSTONE_TORCH_ITEM.get());
                output.accept(IRON_REDSTONE_TORCH_ITEM.get());
                output.accept(GOLD_REDSTONE_TORCH_ITEM.get());
                output.accept(REDSTONE_REDSTONE_TORCH_ITEM.get());
                output.accept(EMERALD_REDSTONE_TORCH_ITEM.get());
                output.accept(LAPIS_LAZULI_REDSTONE_TORCH_ITEM.get());
                output.accept(DIAMOND_REDSTONE_TORCH_ITEM.get());
                output.accept(NETHERITE_REDSTONE_TORCH_ITEM.get());
                output.accept(QUARTZ_REDSTONE_TORCH_ITEM.get());
                output.accept(CHISELED_QUARTZ_REDSTONE_TORCH_ITEM.get());
                output.accept(QUARTZ_BRICKS_REDSTONE_TORCH_ITEM.get());
                output.accept(QUARTZ_PILLAR_REDSTONE_TORCH_ITEM.get());
                output.accept(SMOOTH_QUARTZ_REDSTONE_TORCH_ITEM.get());
                output.accept(AMETHYST_REDSTONE_TORCH_ITEM.get());
                output.accept(COPPER_REDSTONE_TORCH_ITEM.get());
                output.accept(CUT_COPPER_REDSTONE_TORCH_ITEM.get());
                output.accept(EXPOSED_COPPER_REDSTONE_TORCH_ITEM.get());
                output.accept(EXPOSED_CUT_COPPER_REDSTONE_TORCH_ITEM.get());
                output.accept(WEATHERED_COPPER_REDSTONE_TORCH_ITEM.get());
                output.accept(WEATHERED_CUT_COPPER_REDSTONE_TORCH_ITEM.get());
                output.accept(OXIDIZED_COPPER_REDSTONE_TORCH_ITEM.get());
                output.accept(OXIDIZED_CUT_COPPER_REDSTONE_TORCH_ITEM.get());


            }).build());

    public MoreBeautifulTorches()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered
        BLOCKS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        ITEMS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so tabs get registered
        CREATIVE_MODE_TABS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        // forge recommends initializing with our tab with the items instead
//        if (event.getTabKey() == MBT_TAB.getKey())
//            event.accept(OAK_LOG_TORCH_ITEM);
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
