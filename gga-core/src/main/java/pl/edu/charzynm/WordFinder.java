package pl.edu.charzynm;

public class WordFinder {
    private final Word word;
    private final String sentence;

    public WordFinder(Word word, String sentence) {
        this.word = word;
        this.sentence = sentence;
    }

    public boolean findWord() {
        return this.sentence.contains(this.word.getName());
    }
}
