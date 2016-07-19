package pl.edu.charzynm;

public class Conjunction extends Word {
    public Conjunction(String name) {
        super(name);
    }

    @Override
    public boolean findWordInSentence(Word word, String sentence) {
        return new WordFinder(sentence).find(word);
    }
}
