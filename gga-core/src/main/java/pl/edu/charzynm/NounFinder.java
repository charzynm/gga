package pl.edu.charzynm;

import java.util.Optional;

public class NounFinder extends WordFinder {
    private final String sentence;

    public NounFinder(String sentence) {
        super(sentence);
        this.sentence = sentence;
    }

    @Override
    public boolean find(Word word) {
        Optional<String> pluralForm = ((Noun) word).getPluralForm();
        return this.sentence.contains(word.getName()) || (pluralForm.isPresent() && this.sentence.contains(pluralForm.get()));
    }
}
