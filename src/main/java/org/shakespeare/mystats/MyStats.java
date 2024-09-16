package org.shakespeare.mystats;

import org.bukkit.plugin.java.JavaPlugin;

public final class MyStats extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("mystats").setExecutor(new MyStatsCommand());
        getCommand("mystats").setTabCompleter(new MyStatsTab());

    }
}
