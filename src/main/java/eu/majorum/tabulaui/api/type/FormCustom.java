package eu.majorum.tabulaui.api.type;

import eu.majorum.tabulaui.api.component.typed.ComponentTyped;
import org.bukkit.entity.Player;
import org.geysermc.cumulus.form.CustomForm;
import org.geysermc.cumulus.response.CustomFormResponse;
import org.geysermc.cumulus.util.FormImage;

import java.util.List;
import org.geysermc.floodgate.api.player.FloodgatePlayer;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

//CUSTOM == CUSTOM
public interface FormCustom extends Form, CustomForm {

    interface Builder extends Form.Builder {

        Builder title(String title);
        Builder icon(FormImage.Type type, String data);

        Builder icon(FormImage formImage);

        Builder label(String text);

        Builder label(String text, Predicate<FloodgatePlayer> predicate);

        Builder input(String text);

        Builder input(String text, Predicate<FloodgatePlayer> predicate);

        Builder input(String text, String placeHolder);

        Builder input(String text, String placeHolder, Predicate<FloodgatePlayer> predicate);

        Builder input(String text, String placeHolder, String defaultText);

        Builder input(String text, String placeHolder, String defaultText, Predicate<FloodgatePlayer> predicate);

        Builder input(String text, String placeHolder, String defaultText, Predicate<FloodgatePlayer> predicate, BiConsumer<FloodgatePlayer, String> response);

        Builder dropDown(String text, int defaultOption, String... options);

        Builder dropDown(String text, int defaultOption, List<String> options, Predicate<FloodgatePlayer> predicate);

        Builder dropDown(String text, int defaultOption, List<String> options, Predicate<FloodgatePlayer> predicate, BiConsumer<FloodgatePlayer, String> response);

        Builder stepSlider(String text, int defaultStep, String... steps);
        Builder stepSlider(String text, int defaultStep, List<String> steps, Predicate<FloodgatePlayer> predicate);
        Builder stepSlider(String text, int defaultStep, List<String> steps, Predicate<FloodgatePlayer> predicate, BiConsumer<FloodgatePlayer, String> response);

        Builder slider(String text, int min, int max);
        Builder slider(String text, int min, int max, Predicate<FloodgatePlayer> predicate);
        Builder slider(String text, int min, int max, Predicate<FloodgatePlayer> predicate, BiConsumer<FloodgatePlayer, Float> response);


        Builder slider(String text, int min, int max, int step);

        Builder slider(String text, int min, int max, int step, Predicate<FloodgatePlayer> predicate);

        Builder slider(String text, int min, int max, int step, int defaultValue, Predicate<FloodgatePlayer> predicate);
        Builder slider(String text, int min, int max, int step, int defaultValue, Predicate<FloodgatePlayer> predicate, BiConsumer<FloodgatePlayer, Float> response);


        Builder toggle(String text);

        Builder toggle(String text, Predicate<FloodgatePlayer> predicate);

        Builder toggle(String text, boolean defaultValue);

        Builder toggle(String text, boolean defaultValue, Predicate<FloodgatePlayer> predicate);
        Builder toggle(String text, boolean defaultValue, Predicate<FloodgatePlayer> predicate, BiConsumer<FloodgatePlayer, Boolean> response);

        Builder component(ComponentTyped component);

    }

}
