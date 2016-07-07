package pl.edu.charzynm;

public class Verb {
    private String name;
    private boolean isSeparable;

    public Verb(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isSeparable() {
        for (SeparableVerbsPrefixes prefix : SeparableVerbsPrefixes.values()) {
            if (name.startsWith(prefix.getValue())) {
                return true;
            }
        }
        return false;
    }

}
