package eu.majorum.tabulaui.api.component.typed;

import org.checkerframework.checker.index.qual.NonNegative;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.geysermc.floodgate.api.player.FloodgatePlayer;

import java.util.List;
import java.util.function.BiConsumer;

public interface DropdownComponent extends ComponentTyped, org.geysermc.cumulus.component.DropdownComponent {

    @Override
    default @NonNull List<String> getOptions() {
        return options();
    }

    @Override
    default @NonNegative int getDefaultOption() {
        return defaultOption();
    }

    BiConsumer<FloodgatePlayer, String> getResponse();

}
