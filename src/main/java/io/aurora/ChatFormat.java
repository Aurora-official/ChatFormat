package io.aurora;

import io.aurora.util.Format;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;

public final class ChatFormat extends JavaPlugin {
    private static final Logger log = Bukkit.getLogger();

    @Override
    public void onLoad() {
        log.info("Loading ChatFormat");
    }

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Format(), this);
        log.info("Enabling ChatFormat");
    }

    @Override
    public void onDisable() {
        log.info("Disabling ChatFormat");
    }
}
