package cf.cubebuilder.yellowtext;

import org.bukkit.ChatColor;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerListener;

public class YellowText extends PlayerListener {
    public void onPlayerChat(PlayerChatEvent event) {
        if (event.getMessage().startsWith("#"))
            event.setMessage(ChatColor.YELLOW + event.getMessage());
    }
}
