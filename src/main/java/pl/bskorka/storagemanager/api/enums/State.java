package pl.bskorka.storagemanager.api.enums;

public enum State {

    NEW("N"),
    USED("U"),
    REGENERATED("R");

    private String state;

    State(String state) {
        this.state = state;
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
