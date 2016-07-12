package pl.edu.charzynm.configuration;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import pl.edu.charzynm.Word;

public class VocabularyList {
    public List<Word> readVocabularyList() throws ScriptException, IOException, URISyntaxException {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine engine = scriptEngineManager.getEngineByName("javascript");

        String json = new String(Files.readAllBytes(Paths.get(getClass().getResource("/wortschatz_mittelpunktNeuB2.json").toURI())));
        String script = "Java.asJSONCompatible(" + json + ")";
        Object result = engine.eval(script);

        return readWordsFromAllVocabularyLists((Map) result);
    }

    private List<Word> readWordsFromAllVocabularyLists(Map contents) {
        List<Word> words = new ArrayList<>();
        contents.forEach((vocabularyListKey, wordsValue) -> {
            words.addAll(readWordsFromAVocabularyList((Map) wordsValue));
        });
        return words;
    }

    private List<Word> readWordsFromAVocabularyList(Map wordsValue) {
        List<Word> words = new ArrayList<>();
        wordsValue.forEach((wordsKey, wordValue) -> {
            words.addAll(readWordNameFromAVocabularyList((Map) wordValue));
        });
        return words;
    }

    private List<Word> readWordNameFromAVocabularyList(Map wordsValue) {
        List<Word> words = new ArrayList<>();
        wordsValue.forEach((wordsKey, wordValue) -> {
            words.add(new Word((String) wordValue));
        });
        return words;
    }

}
