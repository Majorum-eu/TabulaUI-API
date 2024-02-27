package eu.majorum.tabulaui.api.component.typed;

import com.google.common.base.Preconditions;
import com.google.gson.annotations.SerializedName;
import org.bukkit.entity.Player;
import org.checkerframework.checker.index.qual.NonNegative;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.geysermc.cumulus.component.util.ComponentType;
import org.geysermc.floodgate.api.player.FloodgatePlayer;

import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

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
