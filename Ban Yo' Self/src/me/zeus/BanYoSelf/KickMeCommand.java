
package me.zeus.BanYoSelf;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;



public class KickMeCommand implements CommandExecutor {

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

                tryToKick((Player) sender);

            }

        }
        return false;
    }

    void tryToKick(final Player p)
    {
        try
        {
            plugin.getServer().dispatchCommand(plugin.getServer().getConsoleSender(), "kick " + p.getName());
        } catch (final NullPointerException npe)
        {
            System.out.println("Tried to kick player - doesn't exist! " + "(" + p.getName() + ")");
        }
    }

}
