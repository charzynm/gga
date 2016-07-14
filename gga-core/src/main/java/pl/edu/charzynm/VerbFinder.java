package pl.edu.charzynm;

public class VerbFinder extends WordFinder {
    private final String sentence;
    private final VerbAnalyzer verbAnalyzer;

    public VerbFinder(Verb verb, String sentence) {
        super(verb, sentence);
        this.sentence = sentence;
        this.verbAnalyzer = new VerbAnalyzer(verb);
    }

    @Override
    public boolean find() {
        if (this.verbAnalyzer.isSeparable()) {
            return findSeparableVerb();
        } else if (this.sentence.contains(verbAnalyzer.getRoot())) {
            return true;
        }

        return false;
    }

    private boolean findSeparableVerb() {
        return this.sentence.contains(verbAnalyzer.getRoot()) && this.sentence.contains(verbAnalyzer.getSeparableParticle());
    }
}
