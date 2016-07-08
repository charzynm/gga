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
    FORT("fort"),
    FUR("für"),
    GEGEN("gegen"),
    GEGENUBER("gegenüber"),
    HEIM("heim"),
    HINTERHER("hinterher"),
    HOCH("hoch"),
    LOS("los"),
    MIT("mit"),
    NACH("nach"),
    NEBEN("neben"),
    NIEDER("nieder"),
    VOR("vor"),
    WEB("weg"),
    WEITER("weiter"),
    ZU("zu"),
    ZURECHT("zurecht"),
    ZURUCK("zurück"),
    ZUSAMMEN("zusammen"),
    DA("da"),
    HIN("hin"),
    HER("her");

    private String value;

    SeparableVerbsPrefixes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
