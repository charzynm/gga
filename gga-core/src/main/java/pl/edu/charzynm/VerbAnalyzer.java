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

    public boolean hasSuffix() {
        return this.verb.isWeak() && findSuffix().isPresent();
    }

    public String getSeparableParticle() {
        return findSeparableParticle().orElse("");
    }

    public String getSuffix() {
        return findSuffix().orElse("");
    }

    public String getRoot() {
        String root = this.verb.getName().replaceFirst(getSeparableParticle(), "");
        if (hasSuffix()) {
            root = root.substring(0, root.indexOf(getSuffix()));
        }
        return root;
    }

    private Optional<String> findSeparableParticle() {
        for (SeparableVerbsPrefixes prefix : SeparableVerbsPrefixes.values()) {
            if (this.verb.getName().startsWith(prefix.getValue())) {
                return Optional.of(prefix.getValue());
            }
        }
        return Optional.empty();
    }

    private Optional<String> findSuffix() {
        for (WeakVerbSuffixes suffix : WeakVerbSuffixes.values()) {
            if (this.verb.getName().endsWith(suffix.getValue())) {
                return Optional.of(suffix.getValue());
            }
        }
        return Optional.empty();
    }
}