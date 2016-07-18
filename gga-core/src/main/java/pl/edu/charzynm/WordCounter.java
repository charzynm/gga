package pl.edu.charzynm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {
    private List<Word> words;

    public WordCounter(List<Word> words) {
        this.words = words;
    }

    public Map<String, Integer> count() {
        Map<String, Integer> result = new HashMap<>();
        this.words.forEach(word -> {
            Integer value = 1;
            String name = word.getName();
            if (result.containsKey(name)) {
                value = result.get(name) + 1;
            }
            result.put(name, value);
        });

        return result;
    }
}
