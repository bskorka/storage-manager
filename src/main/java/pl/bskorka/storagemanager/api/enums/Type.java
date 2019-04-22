package pl.bskorka.storagemanager.api.enums;

import java.util.Map;
import java.util.TreeMap;

public enum Type {
    LCD,
    BATTERY,
    DIGITZER,
    HOUSING,
    CABLE,
    BUTTON,
    SPEAKER,
    CAMERA,
    RUBBER_PLUGS;

    public static Map getComboTextForEnum() {
        Map<Type, String> comboTextByState = new TreeMap<>();
        comboTextByState.put(CAMERA, "Aparat / kamera");
        comboTextByState.put(BATTERY, "Bateria");
        comboTextByState.put(DIGITZER, "Digitzer (dotyk)");
        comboTextByState.put(SPEAKER, "Głośnik");
        comboTextByState.put(RUBBER_PLUGS, "Gumowa uszczelka, zaślepka");
        comboTextByState.put(CABLE, "Kabel");
        comboTextByState.put(LCD, "LCD");
        comboTextByState.put(HOUSING, "Obudowa");
        comboTextByState.put(BUTTON, "Przycisk");

        return comboTextByState;
    }

}
