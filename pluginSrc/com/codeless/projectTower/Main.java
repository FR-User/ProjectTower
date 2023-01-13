package com.codeless.projectTower;

import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;

import org.codeless.projectTower.initial.registerEvents;

public class Main extends JavaPlugin implements Listener{

    @Override
    public void onEnable(){

        Bukkit.getPluginManager().registerEvents(this, this);

        new registerEvents(this);
        new registerCommands(this);
    }

    @Override
    public void onDisable(){

    }

}