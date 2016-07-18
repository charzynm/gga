package pl.edu.charzynm;

public class Word {
    private String name;

    public Word(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean findWordInSentence(Word word, String sentence) {
        return new WordFinder(sentence).find(word);
    }
}
