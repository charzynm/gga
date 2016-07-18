package pl.edu.charzynm;

public class Verb extends Word {

    private boolean weak = true;

    public Verb(String name) {
        super(name);
    }

    public boolean isWeak() {
        return weak;
    }

    public void setWeak(boolean weak) {
        this.weak = weak;
    }

    @Override
    public boolean findWordInSentence(Word word, String sentence) {
        return new VerbFinder(sentence).find(word);
    }
}
