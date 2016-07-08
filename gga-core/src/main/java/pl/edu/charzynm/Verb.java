package pl.edu.charzynm;

public class Verb {
    private String name;
    private boolean weak = true;

    public Verb(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isWeak() {
        return weak;
    }

    public void setWeak(boolean weak) {
        this.weak = weak;
    }
}
