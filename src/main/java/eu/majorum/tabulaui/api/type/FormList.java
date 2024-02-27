package eu.majorum.tabulaui.api.type;

import eu.majorum.tabulaui.api.component.ButtonComponent;
import org.geysermc.cumulus.form.SimpleForm;
import org.geysermc.cumulus.util.FormImage;
import org.geysermc.floodgate.api.player.FloodgatePlayer;

import java.util.function.Consumer;
import java.util.function.Predicate;

public interface FormList extends Form, SimpleForm {

    interface Builder extends Form.Builder {

        Builder title(String title);

        Builder button(String text);

        Builder button(String text, FormImage image);

        Builder button(String text, Consumer<FloodgatePlayer> consumer);

        Builder button(String text, FormImage image, Consumer<FloodgatePlayer> consumer);

        Builder button(String text, Consumer<FloodgatePlayer> consumer, Predicate<FloodgatePlayer> predicate);

        Builder button(String text, FormImage image, Consumer<FloodgatePlayer> consumer, Predicate<FloodgatePlayer> predicate);

        Builder button(ButtonComponent button);

        Builder content(String content);
    }
}
