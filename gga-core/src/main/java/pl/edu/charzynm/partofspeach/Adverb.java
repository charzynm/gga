package pl.edu.charzynm.partofspeach;

import pl.edu.charzynm.WordFinder;

public class Adverb extends Word{
    public Adverb(String name) {
        super(name);
    }

    @Override
    public boolean findWordInSentence(Word word, String sentence) {
        return new WordFinder(sentence).find(word);
    }
}
