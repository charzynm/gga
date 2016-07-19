package pl.edu.charzynm;

public class Preposition extends Word {
    public Preposition(String name) {
        super(name);
    }

    @Override
    public boolean findWordInSentence(Word word, String sentence) {
        return new WordFinder(sentence).find(word);
    }
}
