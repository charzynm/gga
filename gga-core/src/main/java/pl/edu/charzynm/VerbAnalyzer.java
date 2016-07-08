package pl.edu.charzynm;

import java.util.Optional;

public class VerbAnalyzer {
    private final Verb verb;

    public VerbAnalyzer(Verb verb) {
        this.verb = verb;
    }

    public boolean isSeparable() {
        return findSeparableParticle().isPresent();
    }

    public String getSeparableParticle() {
        return findSeparableParticle().orElse("");
    }

    public String getLexicalCore() {
        return this.verb.getName().replaceFirst(getSeparableParticle(), "");
    }

    private Optional<String> findSeparableParticle() {
        for (SeparableVerbsPrefixes prefix : SeparableVerbsPrefixes.values()) {
            if (this.verb.getName().startsWith(prefix.getValue())) {
                return Optional.of(prefix.getValue());
            }
        }
        return Optional.empty();
    }
}