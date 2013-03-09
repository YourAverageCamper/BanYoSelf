
package me.zeus.BanYoSelf;


import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;



public class BanMeCommand implements CommandExecutor {

    @SuppressWarnings("unused")
    private final BanYoSelf plugin;

    public BanMeCommand(final BanYoSelf plugin)
    {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args)
    {
        if (sender instanceof Player)
        {
            if (sender.hasPermission("BanYoSelf.Ban.Self"))
            {
                ((Player) sender).kickPlayer(ChatColor.RED + "" + ChatColor.MAGIC + "HACKS HACKING HACKER");
                ((Player) sender).setBanned(true);
            }
        }
        return false;
    }
}
