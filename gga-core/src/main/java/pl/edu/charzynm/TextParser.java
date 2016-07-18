package pl.edu.charzynm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import pl.edu.charzynm.configuration.VocabularyList;

public class TextParser {
    private String text;

    public TextParser(String text) {
        this.text = text;
    }

    public List<Word> parseText() {
        List<Word> foundWords = new ArrayList<>();
        String[] sentences = this.text.split("\\.");
        Arrays.asList(sentences).forEach(sentence -> foundWords.addAll(getWordsList(sentence)));
        return foundWords;
    }

    private Collection<? extends Word> getWordsList(String sentence) {
        List<Word> words = new ArrayList<>();
        VocabularyList vocabularyList = new VocabularyList();
        vocabularyList.readVocabularyList().forEach(word -> {
            if (word.findWordInSentence(word, sentence)) {
                words.add(word);
            }
        });
        return words;
    }
}
