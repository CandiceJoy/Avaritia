package fox.spiteful.avaritia.items;

import cpw.mods.fml.common.registry.GameRegistry;
import fox.spiteful.avaritia.Avaritia;
import fox.spiteful.avaritia.Config;
import fox.spiteful.avaritia.items.tools.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

import static net.minecraft.item.Item.ToolMaterial;

public class LudicrousItems {

    public static Item resource;
    public static Item singularity;
    public static Item skull_sword;
    public static Item ultimate_stew;
    public static Item cosmic_meatballs;
    public static Item endest_pearl;
    public static Item fractured_ore;
    public static Item matter_cluster;

    public static Item infinity_pickaxe;
    public static Item infinity_sword;
    public static Item infinity_shovel;
    public static Item infinity_axe;
    public static Item infinity_bow;

    public static Item infinity_helm;
    public static Item infinity_armor;
    public static Item infinity_pants;
    public static Item infinity_shoes;

    public static Item akashic_record;
    public static Item armok_orb;
    
    

    public static EnumRarity cosmic = EnumHelper.addRarity("COSMIC", EnumChatFormatting.RED, "Cosmic");

    public static void grind(){
        resource = new ItemResource();
        GameRegistry.registerItem(resource, "Resource");

        if(Config.craftingOnly)
            return;

        singularity = new ItemSingularity();
        GameRegistry.registerItem(singularity, "Singularity");
        infinity_pickaxe = new ItemPickaxeInfinity();
        GameRegistry.registerItem(infinity_pickaxe, "Infinity_Pickaxe");
        infinity_sword = new ItemSwordInfinity();
        GameRegistry.registerItem(infinity_sword, "Infinity_Sword");
        skull_sword = new ItemSwordSkulls();
        GameRegistry.registerItem(skull_sword, "Skull_Sword");
        ultimate_stew = new ItemFood(20,20.0f,false).setPotionEffect(Potion.regeneration.getId(), 300, 1, 1.0f).setTextureName("avaritia:stew").setUnlocalizedName("avaritia_stew").setCreativeTab(Avaritia.tab);
        GameRegistry.registerItem(ultimate_stew, "Ultimate_Stew");
        cosmic_meatballs = new ItemFood(20,20.0f,false).setPotionEffect(Potion.damageBoost.getId(), 300, 1, 1.0f).setTextureName("avaritia:meatballs").setUnlocalizedName("avaritia_meatballs").setCreativeTab(Avaritia.tab);
        GameRegistry.registerItem(cosmic_meatballs, "Cosmic_Meatballs");
        endest_pearl = new ItemEndestPearl();
        GameRegistry.registerItem(endest_pearl, "Endest_Pearl");
        infinity_helm = new ItemArmorInfinity(0);
        GameRegistry.registerItem(infinity_helm, "Infinity_Helm");
        infinity_armor = new ItemArmorInfinity(1);
        GameRegistry.registerItem(infinity_armor, "Infinity_Chest");
        infinity_pants = new ItemArmorInfinity(2);
        GameRegistry.registerItem(infinity_pants, "Infinity_Pants");
        infinity_shoes = new ItemArmorInfinity(3);
        GameRegistry.registerItem(infinity_shoes, "Infinity_Shoes");
        fractured_ore = new ItemFracturedOre();
        GameRegistry.registerItem(fractured_ore, "Fractured_Ore");
        matter_cluster = new ItemMatterCluster();
        GameRegistry.registerItem(matter_cluster, "Matter_Cluster");
        infinity_bow = new ItemBowInfinity();
        GameRegistry.registerItem(infinity_bow, "Infinity_Bow");
        infinity_shovel = new ItemShovelInfinity();
        GameRegistry.registerItem(infinity_shovel, "Infinity_Shovel");
        infinity_axe = new ItemAxeInfinity();
        GameRegistry.registerItem(infinity_axe, "Infinity_Axe");
        
        MinecraftForge.EVENT_BUS.register(new ItemArmorInfinity.abilityHandler());
    }

    public static boolean isInfinite(EntityPlayer player){
        if(player.getEquipmentInSlot(1) == null || player.getEquipmentInSlot(2) == null
                || player.getEquipmentInSlot(3) == null || player.getEquipmentInSlot(4) == null)
            return false;
        if(player.getEquipmentInSlot(1).getItem() == infinity_shoes && player.getEquipmentInSlot(2).getItem() == infinity_pants
                && player.getEquipmentInSlot(3).getItem() == infinity_armor && player.getEquipmentInSlot(4).getItem() == infinity_helm)
            return true;
        else
            return false;
    }
}
