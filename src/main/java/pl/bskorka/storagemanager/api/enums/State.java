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
        Map<State, String> comboTextByState = new TreeMap<>();
        comboTextByState.put(NEW, "N - nowy");
        comboTextByState.put(USED, "U - używany");
        comboTextByState.put(REGENERATED, "R - regenerowany");

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
