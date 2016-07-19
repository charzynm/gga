package pl.edu.charzynm;

import java.util.Optional;
import java.util.regex.Pattern;

import pl.edu.charzynm.partofspeach.Noun;
import pl.edu.charzynm.partofspeach.Word;

public class NounFinder extends WordFinder {
    private final String sentence;

    public NounFinder(String sentence) {
        super(sentence);
        this.sentence = sentence;
    }

    @Override
    public boolean find(Word word) {
        Pattern pattern = Pattern.compile("\\b" + word.getName() + "\\b");

        Optional<String> pluralForm = ((Noun) word).getPluralForm();
        boolean containsPluralForm = false;
        if (pluralForm.isPresent()) {
            Pattern patternPluralForm = Pattern.compile("\\b" + pluralForm.get() + "\\b");
            containsPluralForm = patternPluralForm.matcher(this.sentence).find();
        }

        return pattern.matcher(this.sentence).find() || containsPluralForm;
    }
}
