package eu.majorum.tabulaui.api;

import eu.majorum.tabulaui.api.event.FormListener;
import eu.majorum.tabulaui.api.type.Form;
import eu.majorum.tabulaui.api.type.FormCustom;
import eu.majorum.tabulaui.api.type.FormInfo;
import eu.majorum.tabulaui.api.type.FormList;
import org.geysermc.cumulus.util.FormImage;

import java.util.UUID;

public interface TabulaAPI {

    TabulaAPI INSTANCE = null;

    FormImage getFormImage(String data);

    void sendForm(UUID player, Form aForm);

    void registerListener(Class<?> owner, FormListener listener);

    FormCustom.Builder createCustom();

    FormInfo.Builder createInfo();

    FormList.Builder createList();

}
