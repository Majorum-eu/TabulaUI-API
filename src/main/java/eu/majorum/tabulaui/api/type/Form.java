package eu.majorum.tabulaui.api.type;

import org.geysermc.floodgate.api.player.FloodgatePlayer;

import java.util.function.BiFunction;

public interface Form {

    interface Builder {

        Form build(FloodgatePlayer player, BiFunction<String, FloodgatePlayer, String> formatter);

        Form build();

    }
}
