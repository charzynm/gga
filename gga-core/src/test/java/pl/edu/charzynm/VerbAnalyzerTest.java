package pl.edu.charzynm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import pl.edu.charzynm.partofspeach.Verb;

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

    @Test
    public void testPrasensConjugation() {
        VerbAnalyzer verbAnalyzer = new VerbAnalyzer(new Verb("liebe"));
        assertEquals("e", verbAnalyzer.getSuffix());

        verbAnalyzer = new VerbAnalyzer(new Verb("liebst"));
        assertEquals("st", verbAnalyzer.getSuffix());

        verbAnalyzer = new VerbAnalyzer(new Verb("liebt"));
        assertEquals("t", verbAnalyzer.getSuffix());

        verbAnalyzer = new VerbAnalyzer(new Verb("lieben"));
        assertEquals("en", verbAnalyzer.getSuffix());
    }

    @Test
    public void testImperfektConjugation() {
        VerbAnalyzer verbAnalyzer = new VerbAnalyzer(new Verb("liebte"));
        assertEquals("te", verbAnalyzer.getSuffix());

        verbAnalyzer = new VerbAnalyzer(new Verb("liebtest"));
        assertEquals("test", verbAnalyzer.getSuffix());

        verbAnalyzer = new VerbAnalyzer(new Verb("liebten"));
        assertEquals("ten", verbAnalyzer.getSuffix());

        verbAnalyzer = new VerbAnalyzer(new Verb("liebtet"));
        assertEquals("tet", verbAnalyzer.getSuffix());
    }

    @Test
    public void testPartizipPerfektConjugation() {
        VerbAnalyzer verbAnalyzer = new VerbAnalyzer(new Verb("geliebt"));
        assertEquals("t", verbAnalyzer.getSuffix());

        verbAnalyzer = new VerbAnalyzer(new Verb("geliebter"));
        assertEquals("ter", verbAnalyzer.getSuffix());

        verbAnalyzer = new VerbAnalyzer(new Verb("geliebte"));
        assertEquals("te", verbAnalyzer.getSuffix());

        verbAnalyzer = new VerbAnalyzer(new Verb("geliebtes"));
        assertEquals("tes", verbAnalyzer.getSuffix());
    }

    @Test
    public void testPartizipPrasensConjugation() {
        VerbAnalyzer verbAnalyzer = new VerbAnalyzer(new Verb("liebend"));
        assertEquals("d", verbAnalyzer.getSuffix());

        verbAnalyzer = new VerbAnalyzer(new Verb("liebender"));
        assertEquals("der", verbAnalyzer.getSuffix());

        verbAnalyzer = new VerbAnalyzer(new Verb("liebende"));
        assertEquals("de", verbAnalyzer.getSuffix());

        verbAnalyzer = new VerbAnalyzer(new Verb("liebendes"));
        assertEquals("des", verbAnalyzer.getSuffix());
    }
}

