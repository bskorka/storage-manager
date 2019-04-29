package pl.bskorka.storagemanager.api.enums;

import java.util.Map;
import java.util.TreeMap;

public enum PartCategory {

    PHONE,
    COMPUTER,
    OTHER;

    public static Map getComboTextForEnum() {
        Map<PartCategory, String> comboTextByState = new TreeMap<>();
        comboTextByState.put(PHONE, "Telefoniczna");
        comboTextByState.put(COMPUTER, "Komputerowa");
        comboTextByState.put(OTHER, "Inna");

        return comboTextByState;
    }
}
