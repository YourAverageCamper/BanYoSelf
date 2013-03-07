package me.zeus.BanYoSelf;

import org.bukkit.plugin.java.JavaPlugin;


public class BanYoSelf extends JavaPlugin {
    
    public BanYoSelf(){
        
    }
    
    public void onEnable(){
        getCommand("banme").setExecutor(new BanMeCommand(this));
        getCommand("kickme").setExecutor(new KickMeCommand(this));
    }
    
}
