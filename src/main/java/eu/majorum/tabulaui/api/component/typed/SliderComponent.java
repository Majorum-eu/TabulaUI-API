package eu.majorum.tabulaui.api.component.typed;

import org.geysermc.floodgate.api.player.FloodgatePlayer;

import java.util.function.BiConsumer;

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
