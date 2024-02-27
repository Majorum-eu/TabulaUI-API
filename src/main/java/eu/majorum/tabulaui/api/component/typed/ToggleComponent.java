package eu.majorum.tabulaui.api.component.typed;

import com.google.gson.annotations.SerializedName;
import org.bukkit.entity.Player;
import org.geysermc.cumulus.component.util.ComponentType;
import org.geysermc.floodgate.api.player.FloodgatePlayer;

import java.util.function.BiConsumer;
import java.util.function.Predicate;

public interface ToggleComponent extends ComponentTyped, org.geysermc.cumulus.component.ToggleComponent {

    @Override
    default boolean getDefaultValue() {
        return defaultValue();
    }

    BiConsumer<FloodgatePlayer, Boolean> getResponse();
}
