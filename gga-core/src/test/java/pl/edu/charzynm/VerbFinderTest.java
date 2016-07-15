package pl.edu.charzynm;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VerbFinderTest {
    @Test
    public void findSeparableVerb() {
        String sentence = "Wir fangen an zu lesen!";

        VerbFinder verbFinder = new VerbFinder(sentence);
        assertTrue(verbFinder.find(new Verb("anfangen")));
    }

    @Test
    public void findVerbWithASuffix() {
        String sentence = "Ich mache jetzt Würstchen ohne Fleisch.";

        Verb verb = new Verb("machen");
        VerbFinder verbFinder = new VerbFinder(sentence);
        assertTrue(verbFinder.find(verb));

        sentence = "Dinge, die du machst, wenn du besoffen nach Hause kommst.";

        verbFinder = new VerbFinder(sentence);
        assertTrue(verbFinder.find(verb));

        sentence = "Er macht jetzt wieder Straßenmusik";

        verbFinder = new VerbFinder(sentence);
        assertTrue(verbFinder.find(verb));
    }

    @Test
    public void findVerb() {
        String sentence = "Wir machen die Musik!";

        VerbFinder verbFinder = new VerbFinder(sentence);
        assertTrue(verbFinder.find(new Verb("machen")));
    }
}
