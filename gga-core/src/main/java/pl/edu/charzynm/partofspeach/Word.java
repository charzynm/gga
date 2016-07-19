package pl.edu.charzynm.partofspeach;

public abstract class Word {
    private String name;

    public Word(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean findWordInSentence(Word word, String sentence);
}
