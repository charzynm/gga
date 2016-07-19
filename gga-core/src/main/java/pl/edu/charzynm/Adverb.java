package pl.edu.charzynm;

public class Adverb extends Word{
    public Adverb(String name) {
        super(name);
    }

    @Override
    public boolean findWordInSentence(Word word, String sentence) {
        return new WordFinder(sentence).find(word);
    }
}
