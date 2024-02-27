package eu.majorum.tabulaui.api.type;

import eu.majorum.tabulaui.api.component.ButtonComponent;
import org.bukkit.entity.Player;
import org.geysermc.cumulus.form.ModalForm;

import org.geysermc.floodgate.api.player.FloodgatePlayer;
import java.util.function.Consumer;

//INFO == MODAL
public interface FormInfo extends Form, ModalForm {


    String content() ;

    String button1();

    String button2();

    ButtonComponent brutButton1();

    ButtonComponent brutButton2();

    interface Builder extends Form.Builder {


        Builder title(String title);

        Builder content(String content);

        Builder trueButton(String text);

        Builder trueButton(String text, Consumer<FloodgatePlayer> consumer);

        Builder trueButton(ButtonComponent button);

        Builder falseButton(String text);

        Builder falseButton(String text, Consumer<FloodgatePlayer> consumer);

        Builder falseButton(ButtonComponent button);

    }

}
