package pl.edu.charzynm;

public class VerbFinder {
    private Verb verb;
    private String sentence;

    public VerbFinder(Verb verb, String sentence) {
        this.verb = verb;
        this.sentence = sentence;
    }

    public boolean findVerb() {
        if (this.verb.isSeparable()) {
            return findSeparableVerb();
        } else if (this.sentence.contains(verb.getName())) {
            return true;
        }

        return false;
    }

    private boolean findSeparableVerb() {
        return this.sentence.contains(verb.getLexicalCore()) && this.sentence.contains(verb.getSeparableParticle());
    }
}
