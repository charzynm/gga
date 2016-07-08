package pl.edu.charzynm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VerbAnalyzerTest {
    @Test
    public void getSeparableParticle() {
        VerbAnalyzer verbAnalyzer = new VerbAnalyzer(new Verb("anfangen"));
        assertEquals("an", verbAnalyzer.getSeparableParticle());
    }

    @Test
    public void getLexicalCore() {
        VerbAnalyzer verbAnalyzer = new VerbAnalyzer(new Verb("anfangen"));
        assertEquals("fangen", verbAnalyzer.getLexicalCore());
    }

    @Test
    public void isSeparable() {
        VerbAnalyzer verbAnalyzer = new VerbAnalyzer(new Verb("anfangen"));
        assertTrue(verbAnalyzer.isSeparable());

        verbAnalyzer = new VerbAnalyzer(new Verb("machen"));
        assertFalse(verbAnalyzer.isSeparable());
    }
}

