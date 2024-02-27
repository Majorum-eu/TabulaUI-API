package eu.majorum.tabulaui.api.component.typed;

import org.geysermc.floodgate.api.player.FloodgatePlayer;

import java.util.function.BiConsumer;

public interface InputComponent extends ComponentTyped, org.geysermc.cumulus.component.InputComponent {

    default String getPlaceholder() {
        return placeholder();
    }
    default String getDefaultText() {
        return defaultText();
    }

    BiConsumer<FloodgatePlayer, String> getResponse();

}
