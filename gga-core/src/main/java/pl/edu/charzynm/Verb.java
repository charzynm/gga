package pl.edu.charzynm;

import java.util.Optional;

public class Verb {
    private String name;

    public Verb(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isSeparable() {
        return findSeparableParticle().isPresent();
    }

    private Optional<String> findSeparableParticle() {
        for (SeparableVerbsPrefixes prefix : SeparableVerbsPrefixes.values()) {
            if (name.startsWith(prefix.getValue())) {
                return Optional.of(prefix.getValue());
            }
        }
        return Optional.empty();
    }

    public String getSeparableParticle() {
        return findSeparableParticle().orElse("");
    }

    public String getLexicalCore() {
        return name.replaceFirst(getSeparableParticle(), "");
    }
}
