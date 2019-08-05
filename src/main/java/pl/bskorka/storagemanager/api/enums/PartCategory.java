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

    private String getLocaleText(PartCategory category) {
        Map<PartCategory, String> localeByCategory = new TreeMap<>();
        localeByCategory.put(PHONE, "Telefoniczna");
        localeByCategory.put(COMPUTER, "Komputerowa");
        localeByCategory.put(OTHER, "Inna");

        return localeByCategory.get(category);
    }

}
