package eu.majorum.tabulaui.api.component.typed;

import org.geysermc.floodgate.api.player.FloodgatePlayer;

import java.util.function.BiConsumer;

public interface ToggleComponent extends ComponentTyped, org.geysermc.cumulus.component.ToggleComponent {

    @Override
    default boolean getDefaultValue() {
        return defaultValue();
    }

    BiConsumer<FloodgatePlayer, Boolean> getResponse();
}
