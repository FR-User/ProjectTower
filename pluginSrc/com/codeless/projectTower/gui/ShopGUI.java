package com.codeless.projectTower.gui;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.entity.Player;
import org.bukkit.conversable.Conversable;

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
                //빈 상점 제작...

                //사용되지 않음
            }
            case ShopManageType.EDIT : {
                //상점 수정 코드
            }
            case ShopManageType.OPEN : {
                //샵 호출

                
            }
            case ShopManageType.REMOVE : {
                
            }
            case ShopManageType.RENAME : {

            }
            default : {

                new SystemMessage().sendSysMsg((Conversable)player, SystemMessage.unExpectError);

            }
        }
    }

    

    private void shopRenderer(Inventory shopInv, Player player){

        Inventory virtualGUI = Bukkit.createInventory(null, 54, "hello shop");

        player.openInventory(virtualGUI);

    }
}