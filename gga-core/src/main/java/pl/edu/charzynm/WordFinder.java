package pl.edu.charzynm;

import java.util.regex.Pattern;

public class WordFinder {
    private final String sentence;

    public WordFinder(String sentence) {
        this.sentence = sentence;
    }

    public boolean find(Word word) {
        Pattern pattern = Pattern.compile("\\b" + word.getName() + "\\b");
        return pattern.matcher(this.sentence).find();
    }
}
