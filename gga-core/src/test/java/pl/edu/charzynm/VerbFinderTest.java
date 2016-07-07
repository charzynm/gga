package pl.edu.charzynm;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VerbFinderTest {
    @Test
    public void findSeparableVerb() {
        String sentence = "Wir fangen an zu lesen!";

        VerbFinder verbFinder = new VerbFinder(new Verb("anfangen"), sentence);
        assertTrue(verbFinder.findVerb());
    }

    @Test
    public void findVerb() {
        String sentence = "Wir machen die Musik!";

        VerbFinder verbFinder = new VerbFinder(new Verb("machen"), sentence);
        assertTrue(verbFinder.findVerb());
    }
}
