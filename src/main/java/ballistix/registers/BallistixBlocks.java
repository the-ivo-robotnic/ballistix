package ballistix.registers;

import static electrodynamics.registers.UnifiedElectrodynamicsRegister.supplier;

import java.util.HashMap;

import ballistix.References;
import ballistix.common.block.BlockExplosive;
import ballistix.common.block.BlockMissileSilo;
import ballistix.common.block.subtype.SubtypeBlast;
import electrodynamics.api.ISubtype;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BallistixBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, References.ID);

	public static final HashMap<ISubtype, RegistryObject<Block>> SUBTYPEBLOCKREGISTER_MAPPINGS = new HashMap<>();

	public static BlockMissileSilo blockMissileSilo;

	static {
		BLOCKS.register("missilesilo", supplier(() -> blockMissileSilo = new BlockMissileSilo()));
		for (SubtypeBlast subtype : SubtypeBlast.values()) {
			SUBTYPEBLOCKREGISTER_MAPPINGS.put(subtype, BLOCKS.register(subtype.tag(), supplier(() -> new BlockExplosive(subtype), subtype)));
		}
	}
}
