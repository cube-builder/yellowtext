package cf.cubebuilder.yellowtext;

import org.bukkit.event.Event;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    public void onEnable() {
        getServer().getPluginManager().registerEvent(Event.Type.PLAYER_CHAT, (Listener)new YellowText(), Event.Priority.Normal, (Plugin)this);
    }

    public void onDisable() {}
}
