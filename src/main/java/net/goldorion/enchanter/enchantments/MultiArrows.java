package net.goldorion.enchanter.enchantments;

import net.goldorion.enchanter.ModEnchantments;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantments;
import org.jetbrains.annotations.NotNull;

public class MultiArrows extends Enchantment {

    public MultiArrows() {
        super(Rarity.RARE, EnchantmentCategory.BOW, ModEnchantments.HANDS);
    }

    public int getMinCost(int level) {
        return 20;
    }

    public int getMaxCost(int level) {
        return 50;
    }

    public int getMaxLevel() {
        return 4;
    }

    public boolean checkCompatibility(@NotNull Enchantment enchantment) {
        return super.checkCompatibility(enchantment) && enchantment != Enchantments.INFINITY_ARROWS;
    }
}
