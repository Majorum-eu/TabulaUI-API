package eu.majorum.tabulaui.api.component.typed;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.geysermc.cumulus.component.Component;

import java.util.function.Predicate;

public interface ComponentTyped extends eu.majorum.tabulaui.api.component.Component, Component {


    @Override
    default org.geysermc.cumulus.util.ComponentType getType() {
        return org.geysermc.cumulus.util.ComponentType.values()[type().ordinal()];
    }

    default @NonNull String getText() {
        return text();
    }

    void setText(String text);

}
