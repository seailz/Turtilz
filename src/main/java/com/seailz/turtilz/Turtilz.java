package com.seailz.turtilz;

import com.seailz.turtilz.commands.CommandTurtilz;
import games.negative.framework.BasePlugin;

public final class Turtilz extends BasePlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        registerCommands(new CommandTurtilz(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
