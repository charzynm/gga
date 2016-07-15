package pl.edu.charzynm;

public class WordFinder {
    private final String sentence;

    public WordFinder(String sentence) {
        this.sentence = sentence;
    }

    public boolean find(Word word) {
        return this.sentence.contains(word.getName());
    }

    public boolean find(Verb verb) {
        return new VerbFinder(this.sentence).find(verb);
    }
}
