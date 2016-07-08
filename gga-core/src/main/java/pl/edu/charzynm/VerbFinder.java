package pl.edu.charzynm;

public class VerbFinder {
    private final Verb verb;
    private final String sentence;
    private final VerbAnalyzer verbAnalyzer;

    public VerbFinder(Verb verb, String sentence) {
        this.verb = verb;
        this.sentence = sentence;
        this.verbAnalyzer = new VerbAnalyzer(verb);
    }

    public boolean findVerb() {
        if (this.verbAnalyzer.isSeparable()) {
            return findSeparableVerb();
        } else if (this.sentence.contains(verb.getName())) {
            return true;
        }

        return false;
    }

    private boolean findSeparableVerb() {
        return this.sentence.contains(verbAnalyzer.getLexicalCore()) && this.sentence.contains(verbAnalyzer.getSeparableParticle());
    }
}
