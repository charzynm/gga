package pl.edu.charzynm;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import pl.edu.charzynm.partofspeach.Noun;

public class NounFinderTest {
    @Test
    public void findNoun() {
        String sentence = "Wir machen die Musik!";

        NounFinder nounFinder = new NounFinder(sentence);
        assertTrue(nounFinder.find(new Noun("Musik")));
    }

    @Test
    public void findNounPluralForm() {
        String sentence = "Diese Fälle habe ich während meiner Tätigkeit als Wissenschaftlicher Mitarbeiter an der Universität Mannheim erstellt und in den Arbeitsgemeinschaften zum Schuldrecht besprochen.";

        NounFinder nounFinder = new NounFinder(sentence);
        assertTrue(nounFinder.find(new Noun("Fall", "Fälle")));

        sentence = "Oder sie wollten sowieso schon längst einmal Ihre Meinung zu dem einen oder anderen Fall zu Gehör bringen?";
        nounFinder = new NounFinder(sentence);
        assertTrue(nounFinder.find(new Noun("Fall", "Fälle")));
    }

    @Test
    public void testNounNotFound() {
        String sentence = "Wir machen die Musik!";

        NounFinder nounFinder = new NounFinder(sentence);
        assertFalse(nounFinder.find(new Noun("Test")));
    }
}
