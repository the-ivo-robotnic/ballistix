package ballistix.compatibility.jei.util.psuedorecipes;

import java.util.ArrayList;

import ballistix.registers.BallistixItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class BallistixPsuedoRecipes {

	public static ArrayList<ItemStack> BALLISTIX_ITEMS = new ArrayList<>();

	public static void addBallistixRecipes() {

		addBallistixItems();

	}

	private static void addBallistixItems() {
		/* MISSILES */
		Item[] missiles = { BallistixItems.ITEM_MISSILECLOSERANGE.get(), BallistixItems.ITEM_MISSILEMEDIUMRANGE.get(), BallistixItems.ITEM_MISSILELONGRANGE.get() };
		BALLISTIX_ITEMS.addAll(formItemStacks(missiles, 1));

	}

	private static ArrayList<ItemStack> formItemStacks(Item[] items, int countPerItemStack) {
		ArrayList<ItemStack> inputItems = new ArrayList<>();

		for (int i = 0; i < items.length; i++) {
			inputItems.add(new ItemStack(items[i]));
			inputItems.get(i).setCount(countPerItemStack);
		}
		return inputItems;
	}
}
