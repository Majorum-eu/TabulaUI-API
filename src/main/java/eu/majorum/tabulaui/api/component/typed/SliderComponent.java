package eu.majorum.tabulaui.api.component.typed;

import com.google.common.base.Preconditions;
import com.google.gson.annotations.SerializedName;
import org.bukkit.entity.Player;
import org.checkerframework.checker.index.qual.Positive;
import org.geysermc.cumulus.component.util.ComponentType;
import org.geysermc.floodgate.api.player.FloodgatePlayer;

import java.util.function.BiConsumer;
import java.util.function.Predicate;

public interface SliderComponent extends ComponentTyped, org.geysermc.cumulus.component.SliderComponent {
    default float getMin() {
        return minValue();
    }

    default float getMax() {
        return maxValue();
    }

    default int getStep() {
        return (int)step();
    }

    default float getDefaultValue() {
        return defaultValue();
    }

    BiConsumer<FloodgatePlayer, Float> getResponse();

}
