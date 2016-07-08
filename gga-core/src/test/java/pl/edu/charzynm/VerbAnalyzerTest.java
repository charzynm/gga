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
    public void getRoot() {
        VerbAnalyzer verbAnalyzer = new VerbAnalyzer(new Verb("anfangen"));
        assertEquals("fang", verbAnalyzer.getRoot());

        verbAnalyzer = new VerbAnalyzer(new Verb("machen"));
        assertEquals("mach", verbAnalyzer.getRoot());
    }

    @Test
    public void isSeparable() {
        VerbAnalyzer verbAnalyzer = new VerbAnalyzer(new Verb("anfangen"));
        assertTrue(verbAnalyzer.isSeparable());

        verbAnalyzer = new VerbAnalyzer(new Verb("machen"));
        assertFalse(verbAnalyzer.isSeparable());
    }

    @Test
    public void hasSuffix() {
        VerbAnalyzer verbAnalyzer = new VerbAnalyzer(new Verb("macht"));
        assertTrue(verbAnalyzer.hasSuffix());

        verbAnalyzer = new VerbAnalyzer(new Verb("machst"));
        assertTrue(verbAnalyzer.hasSuffix());

        verbAnalyzer = new VerbAnalyzer(new Verb("machen"));
        assertTrue(verbAnalyzer.hasSuffix());
    }

    @Test
    public void getSuffix() {
        VerbAnalyzer verbAnalyzer = new VerbAnalyzer(new Verb("mache"));
        assertEquals("e", verbAnalyzer.getSuffix());

        verbAnalyzer = new VerbAnalyzer(new Verb("macht"));
        assertEquals("t", verbAnalyzer.getSuffix());

        verbAnalyzer = new VerbAnalyzer(new Verb("machst"));
        assertEquals("st", verbAnalyzer.getSuffix());

        verbAnalyzer = new VerbAnalyzer(new Verb("machen"));
        assertEquals("en", verbAnalyzer.getSuffix());
    }
}

