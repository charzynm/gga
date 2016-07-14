package pl.edu.charzynm;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VerbFinderTest {
    @Test
    public void findSeparableVerb() {
        String sentence = "Wir fangen an zu lesen!";

        VerbFinder verbFinder = new VerbFinder(new Verb("anfangen"), sentence);
        assertTrue(verbFinder.find());
    }

    @Test
    public void findVerbWithASuffix() {
        String sentence = "Ich mache jetzt Würstchen ohne Fleisch.";

        VerbFinder verbFinder = new VerbFinder(new Verb("machen"), sentence);
        assertTrue(verbFinder.find());

        sentence = "Dinge, die du machst, wenn du besoffen nach Hause kommst.";

        verbFinder = new VerbFinder(new Verb("machen"), sentence);
        assertTrue(verbFinder.find());

        sentence = "Er macht jetzt wieder Straßenmusik";

        verbFinder = new VerbFinder(new Verb("machen"), sentence);
        assertTrue(verbFinder.find());
    }

    @Test
    public void findVerb() {
        String sentence = "Wir machen die Musik!";

        VerbFinder verbFinder = new VerbFinder(new Verb("machen"), sentence);
        assertTrue(verbFinder.find());
    }
}
