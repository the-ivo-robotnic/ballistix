package ballistix.registers;

import static ballistix.registers.BallistixBlocks.blockMissileSilo;

import com.google.common.collect.Sets;

import ballistix.References;
import ballistix.common.tile.TileMissileSilo;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BallistixBlockTypes {
	public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, References.ID);
	public static final RegistryObject<BlockEntityType<TileMissileSilo>> TILE_MISSILESILO = BLOCK_ENTITY_TYPES.register("missilesilo", () -> new BlockEntityType<>(TileMissileSilo::new, Sets.newHashSet(blockMissileSilo), null));

}
