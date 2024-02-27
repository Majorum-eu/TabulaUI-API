package eu.majorum.tabulaui.api.component.typed;

import com.google.gson.annotations.SerializedName;
import org.bukkit.entity.Player;
import org.geysermc.cumulus.component.util.ComponentType;
import org.geysermc.floodgate.api.player.FloodgatePlayer;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public interface InputComponent extends ComponentTyped, org.geysermc.cumulus.component.InputComponent {

    default String getPlaceholder() {
        return placeholder();
    }
    default String getDefaultText() {
        return defaultText();
    }

    BiConsumer<FloodgatePlayer, String> getResponse();

}
