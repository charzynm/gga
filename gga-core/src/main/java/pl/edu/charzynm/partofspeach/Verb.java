package pl.edu.charzynm.partofspeach;

import pl.edu.charzynm.VerbFinder;

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
