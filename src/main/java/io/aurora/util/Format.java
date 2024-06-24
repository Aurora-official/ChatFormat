package io.aurora.util;

import io.aurora.ChatFormat;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.Plugin;

import static io.aurora.util.Time.TIME;

public class Format implements Listener {
    Plugin config = ChatFormat.getPlugin(ChatFormat.class);

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        if (config.getConfig().getBoolean("ChatFormat")) {
            event.setFormat(
                    ChatColor.GRAY + "[" +
                            ChatColor.DARK_PURPLE + TIME +
                            ChatColor.GRAY + "]" +
                            ChatColor.GRAY + "[" +
                            ChatColor.GOLD + player.getWorld().getName() +
                            ChatColor.GRAY + "] " +
                            ChatColor.AQUA + player.getName() +
                            ChatColor.WHITE + ": " +
                            ChatColor.RESET + event.getMessage()
            );
        }
    }
}
