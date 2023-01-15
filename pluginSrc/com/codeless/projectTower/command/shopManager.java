package com.codeless.projectTower.command;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import org.bukkit.entity.Player;
import org.bukkit.conversations.Conversable;

import com.codeless.projectTower.gui.ShopGUI;
import com.codeless.projectTower.enums.ShopManageType;

public class shopManager implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        //커맨드 사용자가 플레이어가 아니라면 종료
        if(!(sender instanceof Player)){

            new SystemMessage().sendSysMsg((Conversable)sender, SystemMessage.onlyPlayerCanExecute);

            return true;

        }



        //sender가 Player이므로 player에 저장
        Player player = (Player) sender;



        //권한이 없을 때 종료
        if(!(player.hasPermission(Permissions.executeShopManager))){
            
            new SystemMessage().sendSysMsg((Conversable)player, Permissions.executeShopManager + " " + SystemMessage.noPermissions);

            return true;
        }



        try{

            //인자 수가 맞지 않을 때 종료
            if(args.length != 2){

                new SystemMessage().sendSysMsg((Conversable)player, SystemMessage.syntaxError);
                new SystemMessage().sendSysMsg((Conversable)player, "hello world");

                return true;
            }







            /**
             * args[0] ==> 샵 매니저 조건
             * args[1] ==> 샵 이름
             */
            switch(args[0]){
                case "create" : {
                    //샵 생성

                    new ShopGUI(ShopManageType.CREATE, args[1], player);
                }
                case "edit" : {
                    //샵 수정

                    new ShopGUI(ShopManageType.EDIT, args[1], player);
                }
                case "open" : {
                    //샵 호출

                    new ShopGUI(ShopManageType.OPEN, args[1], player);
                }
                case "remove" : {
                    //샵 삭제

                    new ShopGUI(ShopManageType.REMOVE, args[1], player);
                }
                case "rename" : {
                    //샵 개명
                    
                    new ShopGUI(ShopManageType.RENAME, args[1], player);
                }
                default : {

                    new SystemMessage().sendSysMsg((Conversable)player, SystemMessage.syntaxError);

                    return true;
                }
            }




        }catch(Exception e){

            //오류 로그 표시
            e.printStackTrace();

        }finally{

            //커맨드 코드가 종료되었음을 알림.
            return true;

        }



    }

}