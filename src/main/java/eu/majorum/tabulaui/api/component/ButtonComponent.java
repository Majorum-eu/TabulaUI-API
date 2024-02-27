package eu.majorum.tabulaui.api.component;

import org.geysermc.cumulus.util.FormImage;
import org.geysermc.floodgate.api.player.FloodgatePlayer;

import java.util.function.Consumer;

public interface ButtonComponent extends Component, org.geysermc.cumulus.component.ButtonComponent {

    void setText(String text);

    void setImage(FormImage image);

    Consumer<FloodgatePlayer> getResponse();

    void setResponse(Consumer<FloodgatePlayer> response);
}
