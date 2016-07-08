package pl.edu.charzynm;

public enum WeakVerbSuffixes {
    EN("en"),
    EST("est"),
    ST("st"),
    ET("et"),
    E("e"),
    T("t");

    private String value;

    WeakVerbSuffixes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
