package com.codeless.projectTower.gui;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.entity.Player;

import com.codeless.projectTower.enums.ShopManageType;

/**
 * ShopGUI 오브젝트 클래스
 * @author codeless
 */
public class ShopGUI{

    /**
     * 아이템이 저장되는 영역
     */
    private ArrayList<ItemStack>[] itemRegion = new ArrayList<ItemStack>();


    public ShopGUI(ShopManageType manageType, String shopName, Player player){
        switch(manageType){
            case ShopManageType.CREATE : {

            }
        }
    }

    

    private void shopRenderer(Player player){

        Inventory virtualGUI = Bukkit.createInventory(null, 54, "hello shop");

        player.openInventory(virtualGUI);

    }
}