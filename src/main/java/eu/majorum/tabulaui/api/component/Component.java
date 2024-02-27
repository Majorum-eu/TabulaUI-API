package eu.majorum.tabulaui.api.component;

import org.bukkit.entity.Player;
import org.geysermc.floodgate.api.player.FloodgatePlayer;

import org.geysermc.floodgate.api.player.FloodgatePlayer;
import java.util.function.Predicate;

public interface Component extends Cloneable {


    Predicate<FloodgatePlayer> getPredicate();

    default boolean isVisible(FloodgatePlayer player) {
        if(getPredicate() != null) {
            return getPredicate().test(player);
        } else return true;
    }

    Component clone();

}
