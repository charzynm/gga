package pl.edu.charzynm;

public class Adjective extends Word {
    public Adjective(String name) {
        super(name);
    }

    @Override
    public boolean findWordInSentence(Word word, String sentence) {
        return new WordFinder(sentence).find(word);
    }
}
