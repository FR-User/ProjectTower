package com.codeless.projectTower.event;

import org.bukkit.inventory.ItemStack;

import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.EventHandler;

import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryType.SlotType;

public class ShopClickEvent{
    
    /**
     * 인벤토리 클릭 전체를 담당하는 이벤트
     */
    @EventHandler
    public void shopClickEvent(InventoryClickEvent event){

        this.interactType = event.getClick();
        this.interactSlotType = event.getSlotType();
















        this.cancelEvent(event);
    }



    private ClickType interactType = null;
    private InventoryType.SlotType interactSlotType = null;
    private ItemStack item = null;













    /**
     * 이벤트를 취소하는 메소드
     */
    private void cancelEvent(InventoryClickEvent event){
        event.setCancelled(true);
    }
}