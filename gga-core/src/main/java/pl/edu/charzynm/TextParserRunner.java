package pl.edu.charzynm;

import java.util.List;
import java.util.Map;

public class TextParserRunner {

    public static void main(String[] args) {
        String text = "Bei Dienstreisen von Mitarbeitern/innen auf die Budgetverantwortlichen der jeweiligen Universitätseinrichtungen. " +
            "Sofern durch eine Dienstreise von Mitarbeitern/innen die Lehre betroffen ist, muss die Dienstreise zusätzlich auch von " +
            "dem Dekan/von der Dekanin genehmigt werden. Dienstreisen für Mitarbeiter/innen der ZUV, die aus zentralen Mitteln " +
            "(Fonds 1003) finanziert werden, genehmigt weiterhin im Auftrag des Rektors das Personaldezernat/Reisekostenstelle.";

        TextParser textParser = new TextParser(text);
        List<Word> words = textParser.parseText();
        WordCounter wordCounter = new WordCounter(words);
        Map<String, Integer> map = wordCounter.count();
        map.forEach((word, counter) -> System.out.println(word + " " + counter));
    }

}
