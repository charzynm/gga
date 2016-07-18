package pl.edu.charzynm;

import java.util.Optional;

public class Noun extends Word {
    private String pluralForm;

    public Noun(String name) {
        super(name);
    }

    public Noun(String name, String pluralForm) {
        super(name);
        this.pluralForm = pluralForm;
    }

    public Optional<String> getPluralForm() {
        return Optional.ofNullable(this.pluralForm);
    }
}
