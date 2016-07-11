package pl.edu.charzynm;

public enum WeakVerbConjugationSuffixes {
    //Partizip I präsens
    DER("der"),
    DES("des"),
    DE("de"),
    //Imperfekt (Präteritum)
    TEST("test"),
    //Präsens
    EST("est"),
    //Partizip II (Perfekt)
    TER("ter"),
    TES("tes"),
    //Imperfekt (Präteritum)
    TEN("ten"),
    TET("tet"),
    //Präsens
    EN("en"),
    //Imperfekt (Präteritum)
    TE("te"),
    //Präsens
    ST("st"),
    ET("et"),
    //Partizip II (Perfekt), Präsens
    T("t"),
    //Partizip I präsens
    D("d"),
    //Präsens
    E("e");


    private String value;

    WeakVerbConjugationSuffixes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
