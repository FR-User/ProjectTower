package com.codeless.projectTower.message;

import org.bukkit.ChatColor;
import org.bukkit.conversable.Conversable;


public class SystemMessage{
    final public static String systemMessagePrefix = "[&aProject Tower&f]";

    final public static String onlyPLayerCanExecute "&6플레이어&f만이 명령어를 사용할 수 있습니다";

    final public static String noPermissions = "권한이 없습니다";

    final public static String syntaxError = "구문이 맞지 않습니다";

    final public static String unExpectError = "예상치 못한 오류가 발생했습니다";



    public void sendSysMsg(Conversable sender, String message){
        String totalMessage = ChatColor.translateAlternateColorCodes('&', this.systemMessagePrefix + " " + message);

        sender.sendRawMessage(totalMessage);
    }
}