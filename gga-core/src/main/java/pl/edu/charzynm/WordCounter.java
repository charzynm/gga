package pl.edu.charzynm;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import pl.edu.charzynm.partofspeach.Word;

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

    public Map<String, Integer> sort(Map<String, Integer> map) {
        Map<String, Integer> result = new LinkedHashMap<>();
        map.entrySet().stream()
            .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
            .forEachOrdered(e -> result.put(e.getKey(), e.getValue()));
        return result;
    }
}
