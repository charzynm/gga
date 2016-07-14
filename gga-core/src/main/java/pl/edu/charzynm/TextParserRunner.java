package pl.edu.charzynm;

import java.util.List;

public class TextParserRunner {

    public static void main(String[] args) {
        String text = "Bei Dienstreisen von Mitarbeitern/innen auf die Budgetverantwortlichen der jeweiligen Universitätseinrichtungen. Sofern durch eine Dienstreise von Mitarbeitern/innen die Lehre betroffen ist, muss die Dienstreise zusätzlich auch von dem Dekan/von der Dekanin genehmigt werden. Dienstreisen für Mitarbeiter/innen der ZUV, die aus zentralen Mitteln (Fonds 1003) finanziert werden, genehmigt weiterhin im Auftrag des Rektors das Personaldezernat/Reisekostenstelle.";

        TextParser textParser = new TextParser(text);
        List<Word> words = textParser.parseText();
        words.forEach(word -> System.out.println(word.getName()));
    }

}
