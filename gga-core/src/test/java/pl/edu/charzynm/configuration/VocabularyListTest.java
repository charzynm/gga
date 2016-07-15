package pl.edu.charzynm.configuration;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;

import javax.script.ScriptException;

import org.junit.Test;
import pl.edu.charzynm.Word;

public class VocabularyListTest {
    @Test
    public void readVocabularyList() throws ScriptException, IOException, URISyntaxException {
        VocabularyList vocabularyList = new VocabularyList();
        List<? extends Word> wordList = vocabularyList.readVocabularyList();
        
        final Iterator<? extends Word> iterator = wordList.iterator();
        assertEquals("ausprobieren", iterator.next().getName());
        assertEquals("funktionieren", iterator.next().getName());
        assertEquals("Bedeutung", iterator.next().getName());
    }
}
