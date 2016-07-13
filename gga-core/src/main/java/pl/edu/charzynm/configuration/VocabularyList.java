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

import pl.edu.charzynm.Verb;
import pl.edu.charzynm.Word;

public class VocabularyList {
    public List<? extends Word> readVocabularyList() {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine engine = scriptEngineManager.getEngineByName("javascript");

        String json = null;
        try {
            json = new String(Files.readAllBytes(Paths.get(getClass().getResource("/wortschatz_mittelpunktNeuB2.json").toURI())));
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException("An error has occured while reading a vocabulary list.", e);
        }

        String script = "Java.asJSONCompatible(" + json + ")";
        Object result = null;
        try {
            result = engine.eval(script);
        } catch (ScriptException e) {
            throw new RuntimeException("An error has occured while evaluating '.json' file with the vocabulary list.");
        }

        return readWordsFromAllVocabularyLists((Map) result);
    }

    private List<? extends Word> readWordsFromAllVocabularyLists(Map contents) {
        List<Word> words = new ArrayList<>();
        contents.forEach((vocabularyListKey, wordsValue) -> {
            words.addAll(readWordsFromAVocabularyList((Map) wordsValue));
        });
        return words;
    }

    private List<? extends Word> readWordsFromAVocabularyList(Map wordsValue) {
        List<Word> words = new ArrayList<>();
        wordsValue.forEach((wordsKey, wordValue) -> {
            Map wordInfo = (Map) wordValue;
            String wordType = wordInfo.get("wortart").toString();
            String name = wordInfo.get("name").toString();
            if ("verb".equals(wordType)) {
                words.add(new Verb(name));
            }
        });
        return words;
    }
}
