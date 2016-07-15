package pl.edu.charzynm;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class TextParserTest {
    @Test
    public void parseText() {
        TextParser textParser = new TextParser(
            "Für Studenten, die eher kreativ arbeiten wollen, seien Unternehmen passend, in denen interdisziplinäre Teams gemeinsam an einem Projekt arbeiten " +
                "– und Firmen, zu deren Selbstverständnis es gehört, dass man viel ausprobieren darf, sagt Claudius Terkowsky von der TU Dortmund. " +
                "Die AusweisApp2 verfügt über einen integrierten Dienst, mit dem Sie ausprobieren können, wie einfach das Online-Ausweisen funktioniert." +
                "Erfahren Sie mehr über die Bedeutung von Vornamen und wozu Namen überhaupt gut sind.");
        List<Word> wordList = textParser.parseText();
        Iterator<Word> iterator = wordList.iterator();
        assertEquals("ausprobieren", iterator.next().getName());
        assertEquals("ausprobieren", iterator.next().getName());
        //assertEquals("funktionieren", iterator.next().getName());
        assertEquals("Bedeutung", iterator.next().getName());
    }
}
