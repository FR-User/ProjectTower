package com.codeless.projectTower.initial;

import org.bukkit.Bukkit;

import org.bukkit.event.Listener;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.codeless.projectTower.command.ShopManager;

public class registerCommands implements Listener{

    /**
     * 클래스 생성시 호출되는 생성자
     */
    public registerCommands(Plugin thisPlugin){
        ((JavaPlugin) thisPlugin).getCommand("shop").setExecutor(new ShopManager());
    }
}