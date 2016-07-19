package pl.edu.charzynm.partofspeach;

import java.util.Optional;

import pl.edu.charzynm.NounFinder;

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

    @Override
    public boolean findWordInSentence(Word word, String sentence) {
        return new NounFinder(sentence).find(word);
    }
}
