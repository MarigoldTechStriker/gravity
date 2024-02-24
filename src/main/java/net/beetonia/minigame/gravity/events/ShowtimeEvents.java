package net.beetonia.minigame.gravity.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;

public class ShowtimeEvents implements Listener {

    @EventHandler
    public void onPlayerJoin(AsyncPlayerPreLoginEvent e) {
        e.disallow(AsyncPlayerPreLoginEvent.Result.KICK_FULL, "&cThis game is already in progress! Try again later!");
    }

}
