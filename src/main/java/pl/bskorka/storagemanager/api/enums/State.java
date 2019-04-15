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

}
