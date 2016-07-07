package pl.edu.charzynm;

public enum SeparableVerbsPrefixes {
    AB("ab");
    //, an, auf, aus, auseinander, bei, ein, empor, entgegen, entlang, entzwei, fern, fest, fort
    //, für, gegen, gegenüber, heim, hinterher, hoch, los, mit, nach, neben, nieder, vor, weg, weiter, zu, zurecht, zurück, zusammen, da, hin, her

    private String value;

    SeparableVerbsPrefixes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
