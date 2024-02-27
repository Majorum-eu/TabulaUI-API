package eu.majorum.tabulaui.api.event;

import eu.majorum.tabulaui.api.type.Form;
import org.geysermc.floodgate.api.player.FloodgatePlayer;

public interface FormListener {

    boolean onOpen(FloodgatePlayer player, Form form);
}
