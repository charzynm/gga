package pl.edu.charzynm;

public enum SeparableVerbsPrefixes {
    AB("ab"),
    AN("an"),
    AUF("auf"),
    AUS("aus"),
    AUSEINANDER("auseinander"),
    BEI("bei"),
    EIN("ein"),
    EMPOR("empor"),
    ENTGEGEN("entgegen"),
    ENTLANG("entlang"),
    ENTZWEI("entzwei"),
    FERN("fern"),
    FEST("fest"),
    FORT("fort");
    //, für, gegen, gegenüber, heim, hinterher, hoch, los, mit, nach, neben, nieder, vor, weg, weiter, zu, zurecht, zurück, zusammen, da, hin, her

    private String value;

    SeparableVerbsPrefixes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
