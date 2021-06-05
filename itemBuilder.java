package u.util.utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class itemBuilder {
    private ItemStack itemStack;
    private ItemMeta itemMeta;
    public itemBuilder(Material mat){
        itemStack = new ItemStack(mat);
        itemMeta = itemStack.getItemMeta();
    }
    public itemBuilder setDisplayName(String name){
        itemMeta.setDisplayName(name);
        return this;
    }
    public itemBuilder setLocalizedName(String name){
        itemMeta.setLocalizedName(name);
        return this;
    }
    public itemBuilder setLore(String... s){
        itemMeta.setLore(Arrays.asList(s));
        return this;
    }
    public itemBuilder setUnbreakable(boolean s){
        itemMeta.setUnbreakable(s);
        return this;
    }
    public itemBuilder addItemFlags(ItemFlag... s){
        itemMeta.addItemFlags(s);
        return this;
    }
    public itemBuilder addEnchantment(Enchantment enchantment, int duration, boolean IgnoreMaxLevel){
        itemMeta.addEnchant(enchantment, duration, IgnoreMaxLevel);
        return this;
    }
    public ItemStack build(){
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }
}
