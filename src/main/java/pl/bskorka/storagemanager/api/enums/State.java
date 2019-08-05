package pl.bskorka.storagemanager.api.enums;

import java.util.Map;
import java.util.TreeMap;

public enum State {

    NEW("N"),
    USED("U"),
    REGENERATED("R");

    private String state;

    State(String state) {
        this.state = state;
    }

    public static Map getComboTextForEnum() {
        Map<String, String> comboTextByState = new TreeMap<>();
        comboTextByState.put(NEW.name(), "N - nowy");
        comboTextByState.put(USED.name(), "U - używany");
        comboTextByState.put(REGENERATED.name(), "R - regenerowany");

        return comboTextByState;
    }

    public String getValue() {
        return this.state;
    }

    public State parse(String value) {
        for (State state : State.values()) {
            if (state.getValue().equals(value))
                return state;
        }

        return null;
    }

    @Override
    public String toString() {
        return this.getValue();
    }

}
