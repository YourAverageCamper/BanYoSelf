
package me.zeus.BanYoSelf;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;



public class KickMeCommand implements CommandExecutor {

    @SuppressWarnings("unused")
    private final BanYoSelf plugin;

    public KickMeCommand(final BanYoSelf plugin)
    {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args)
    {
        if (sender instanceof Player)
        {

            if (sender.hasPermission("BanYoSelf.Kick.Self"))
            {
                ((Player) sender).kickPlayer("Well don't you feel stupid!");

            }

        }
        return false;
    }

}
