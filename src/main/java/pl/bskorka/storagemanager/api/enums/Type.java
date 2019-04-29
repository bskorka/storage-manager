package pl.bskorka.storagemanager.api.enums;

import java.util.Map;
import java.util.TreeMap;

public enum Type {

    BATTERY,
    BUTTONS,
    CABLE,
    CAMERA,
    CHARGER,
    DIGITZER,
    FLAP,
    FRAME,
    LCD,
    MODULE,
    GLUE_SEAL,
    HOUSING,
    RUBBER_PLUG,
    SPEAKER,
    USB;

    public static Map getComboTextForEnum() {
        Map<Type, String> comboTextByState = new TreeMap<>();
        comboTextByState.put(CAMERA, "Aparat / kamera");
        comboTextByState.put(BATTERY, "Bateria");
        comboTextByState.put(DIGITZER, "Digitzer (dotyk)");
        comboTextByState.put(SPEAKER, "Głośnik");
        comboTextByState.put(CABLE, "Kabel");
        comboTextByState.put(GLUE_SEAL, "Klej, uszczelka");
        comboTextByState.put(FLAP, "Klapka");
        comboTextByState.put(LCD, "LCD");
        comboTextByState.put(CHARGER, "Ładowarka");
        comboTextByState.put(MODULE, "Moduł");
        comboTextByState.put(HOUSING, "Obudowa");
        comboTextByState.put(BUTTONS, "Przycisk");
        comboTextByState.put(FRAME, "Ramka");
        comboTextByState.put(USB, "USB");
        comboTextByState.put(RUBBER_PLUG, "Zaślepka");

        return comboTextByState;
    }

}
