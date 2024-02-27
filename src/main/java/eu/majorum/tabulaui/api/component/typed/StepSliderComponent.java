package eu.majorum.tabulaui.api.component.typed;

import org.checkerframework.checker.index.qual.NonNegative;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.geysermc.floodgate.api.player.FloodgatePlayer;

import java.util.List;
import java.util.function.BiConsumer;

public interface StepSliderComponent extends ComponentTyped, org.geysermc.cumulus.component.StepSliderComponent {

    @Override
    default @NonNull List<String> getSteps() {
        return steps();
    }

    @Override
    default @NonNegative int getDefaultStep() {
        return defaultStep();
    }

    BiConsumer<FloodgatePlayer, String> getResponse();

}
