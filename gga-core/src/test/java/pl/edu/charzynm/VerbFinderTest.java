package pl.edu.charzynm;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VerbFinderTest {
    @Test
    public void findSeparableVerb() {
        String sentence = "Wir fangen an zu lesen!";

        VerbFinder verbFinder = new VerbFinder("anfangen", sentence);
        assertTrue(verbFinder.findSeparableVerb());
    }

    @Test
    public void findVerb() {
        String sentence = "Wir machen die Musik!";

        VerbFinder verbFinder = new VerbFinder("machen", sentence);
        assertTrue(verbFinder.findSeparableVerb());
    }
}
