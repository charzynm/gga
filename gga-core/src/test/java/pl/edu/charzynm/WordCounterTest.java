package pl.edu.charzynm;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import pl.edu.charzynm.partofspeach.Noun;
import pl.edu.charzynm.partofspeach.Word;

public class WordCounterTest {
    @Test
    public void testWordCounter() {
        List<Word> wordList = new ArrayList<>();
        wordList.add(new Noun("test"));
        wordList.add(new Noun("test"));
        wordList.add(new Noun("test"));
        wordList.add(new Noun("test1"));
        wordList.add(new Noun("test1"));
        wordList.add(new Noun("test2"));

        WordCounter wordCounter = new WordCounter(wordList);
        Map<String, Integer> map = wordCounter.count();

        assertEquals(new Integer(3), map.get("test"));
        assertEquals(new Integer(2), map.get("test1"));
        assertEquals(new Integer(1), map.get("test2"));
    }
}
