package pl.edu.charzynm;

public class VerbFinder extends WordFinder {
    private final String sentence;

    public VerbFinder(String sentence) {
        super(sentence);
        this.sentence = sentence;
    }

    @Override
    public boolean find(Word word) {
        VerbAnalyzer verbAnalyzer = new VerbAnalyzer((Verb) word);
        if (verbAnalyzer.isSeparable()) {
            return findSeparableVerb(verbAnalyzer);
        } else if (this.sentence.contains(verbAnalyzer.getRoot())) {
            return true;
        }

        return false;
    }

    private boolean findSeparableVerb(VerbAnalyzer verbAnalyzer) {
        return this.sentence.contains(verbAnalyzer.getRoot()) && this.sentence.contains(verbAnalyzer.getSeparableParticle());
    }
}
