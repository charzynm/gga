package pl.edu.charzynm;

import java.util.List;
import java.util.Map;

import pl.edu.charzynm.partofspeach.Word;

public class TextParserRunner {

    public static void main(String[] args) {
        String text = "Überlebenstraining in Surinam\n" +
            "Ein außergewöhnliches Abenteuer wartet im tiefen Dschungel\n" +
            "von Guyana bzw. Surinam auf Sie. Entscheiden Sie selbst, ob Sie\n" +
            "belastbar sind oder die Grenzen Ihrer Leistungsfähigkeit kennen\n" +
            "lernen wollen. Wenn ja, liegen Sie bei uns richtig!\n" +
            "Preis für das 14-tägige Survival-Training: 2.550,– € p. P. Leistungen:\n" +
            "Flug von vielen Flughäfen Europas via Amsterdam nach\n" +
            "Paramaribo und zurück. Alle Transfers, drei oder vier Nächte in\n" +
            "Paramaribo inkl. Frühstück, Instruktionen und Survival-Trip." +
            "Namibia & Südafrika\n" +
            "13-tägige Kombinationsreise in\n" +
            "Mittelklassehotels inkl. Frühstück\n" +
            "und Wüstenfahrt in der KalahariWüste,\n" +
            "ab 1399,– h. Faszinierende,\n" +
            "bizarre und endlos weite\n" +
            "Landschaften der Namib-Wüste\n" +
            "erwarten Sie. Die spannenden\n" +
            "Kontraste des Landes werden Sie\n" +
            "beeindrucken." +
            "Weimar und die deutsche Klassik\n" +
            "für 1.500,- Euro im Luxushotel\n" +
            "1. Tag: Anreise (bis 18 Uhr)\n" +
            "2. Tag: Das dichterische Weimar – Rundgang\n" +
            "mit Besuch des Goethehauses und des Schillerhauses\n" +
            "und vieles mehr\n" +
            "3. Tag: Das höfische Weimar – Rundgang vom\n" +
            "historischen Markt bis zum Schlösserbereich,\n" +
            "dem politischen Zentrum der\n" +
            "Weimarer Klassik. Besichtigung der HerzoginAnna-Amalia-Bibliothek.\n" +
            "Vorbei am Haus der\n" +
            "Frau von Stein geht es zu Goethes Gartenhaus.\n" +
            "Nach einem kurzen Besuch können Sie sich im\n" +
            "malerischen Park an der Ilm entspannen und\n" +
            "sich auf eine Abendvorstellung im Deutschen\n" +
            "Nationaltheater freuen.\n" +
            "4. Tag: Zeit für einen Tagesausflug z. B. zu den\n" +
            "Schlössern der Umgebung\n" +
            "5. Tag: Abreise (morgens)" +
            "Von Oberstdorf nach Meran – zu Fuß über die Alpen –\n" +
            "7-tägige Trekkingtour\n" +
            "Diese Wanderung führt auf einem besonders beliebten und\n" +
            "abwechslungsreichen Abschnitt des E5 von Oberstdorf an der\n" +
            "Alpennordseite nach Meran an der Alpensüdseite.\n" +
            "- Gipfelglück in 3.000 m Höhe\n" +
            "- Hüttenerlebnisse in gemütlicher Atmosphäre\n" +
            "- Übernachtung in Alpenvereinshütten und Pensionen\n" +
            "Routenverlauf: Oberstdorf – Kemptener Hütte – Holzgau\n" +
            "(Lechtal) – Memminger Hütte – Seescharte – Zams (Inntal)\n" +
            "– Pitztal – Braunschweiger Hütte – Rettenbachjöchl – Vent\n" +
            "– Similaunhütte – Schnalstal – Meran\n" +
            "Teilnehmeranzahl: mindestens 6 Personen; höchstens\n" +
            "12 Personen" +
            "Herbst – Topangebot:\n" +
            "Goldene Herbstwochen\n" +
            "7 Tage mit ¾-Verwöhnpension:\n" +
            "742 Euro pro Person\n" +
            "in der traumhaften Suite DELUXE\n" +
            "Immer inklusive: Hallenschwimmbad,\n" +
            "Freibad, riesige Saunawelt mit 6 Saunen,\n" +
            "Wassergymnastik, Yoga, Mountainbikes,\n" +
            "großes neues Fitness-Center, Hotspot\n" +
            "(Wireless Lan) im Haus" +
            "3 Tage Zürich\n" +
            "3-Sterne-Hotel inkl. Frühstück und ZürichCard\n" +
            "ab 99 €. Erleben Sie die heimelige\n" +
            "Altstadt und verweilen Sie an einem der\n" +
            "einmaligen Aussichtspunkte, z. B. am\n" +
            "Lindenhof. Zahlreiche Museen warten auf\n" +
            "Ihren Besuch – oder bummeln Sie einfach\n" +
            "über die berühmte Bahnhofsstraße mit\n" +
            "ihren exklusiven Geschäften. Auch das\n" +
            "Nachtleben der Metropole bietet für jeden\n" +
            "Geschmack etwas. Auf Wunsch kann der\n" +
            "Aufenthalt auch auf 5 volle Tage verlängert\n" +
            "werden." +
            "Steiermark / Österreich\n" +
            "6-tägiger Wellnessurlaub im 4-Sterne-Schlosshotel inkl.\n" +
            "Frühstück und 3 x Abendessen ab 399 €. Ihr Urlaubsort:\n" +
            "Fohnsdorf – zwischen Graz und Klagenfurt – in\n" +
            "verkehrsgünstiger, aber doch ruhiger Lage. Freizeit- und\n" +
            "Wellnessangebot: In der kürzlich eröffneten Sauna-Oase\n" +
            "vergessen Sie den Alltag und tauchen ein in die Welt der\n" +
            "Entspannung. Die Oase verfügt über finnische Sauna,\n" +
            "Dampfkammer und Ruhebereich." +
            "Liebe Pia,\n" +
            "wie du weißt, hatten wir ja diesmal über ein Reisebüro gebucht: Ein ruhiges Hotel, abseits\n" +
            "des Touristenalltags, wir wollten einfach nur ausspannen.\n" +
            "Wir kamen gegen 16 Uhr im Hafen an. Von dort ging es mit dem Taxi weiter. Zuerst etwa\n" +
            "10 km auf einer halbwegs asphaltierten Landstraße, dann eine ganze Zeit auf einem\n" +
            "Schotterweg und schließlich noch etwa 10 Minuten auf einer Staubpiste durch meterhohe\n" +
            "Schilfrohralleen. Schließlich sahen wir das Hotel. Es lag total einsam, inmitten von Bäumen\n" +
            "und Blumen. Nachdem wir unser Gepäck ins Zimmer gebracht hatten, erkundigten wir uns,\n" +
            "wie wir am besten in die Stadt kommen könnten. Die Beschreibung war abenteuerlich:\n" +
            "erst ca. 500 m bis zum Meer, dann etwa einen Kilometer am Strand entlang, danach\n" +
            "rechts durch die Dünen zur Endhaltestelle des Busses. Der brauche 45 Minuten bis ins\n" +
            "Zentrum. Abends das Gleiche umgekehrt. Wir sollten uns am besten eine Taschenlampe\n" +
            "besorgen. Wir könnten aber auch für 20 Euro am Tag die Hotelfahrräder für die Fahrt bis zur\n" +
            "Bushaltestelle ausleihen. Tja, das taten wir dann.\n" +
            "Gegen 21 Uhr machten wir uns auf den Rückweg, obwohl wir den Weg im Dunkeln gar nicht\n" +
            "mehr wiedererkannten. Wir fuhren einfach los – und verfuhren uns ständig. Gegen 22.30\n" +
            "klopften wir schließlich genervt an die Tür eines Hauses, wo wir noch Licht sahen. Der\n" +
            "Mann, der uns öffnete, kannte zwar das Hotel, den Weg dorthin könne er uns jedoch nicht\n" +
            "erklären, besonders nicht in der Dunkelheit. Er bot uns aber an, dass wir für 30 € bei ihm\n" +
            "übernachten könnten. Fast verzweifelt machten wir kehrt. Eine äußerst hilfsbereite Dame in\n" +
            "einem in der Nähe liegenden Hotel brachte schließlich die Rettung. Sie rief einen Taxifahrer\n" +
            "an. Der beschrieb ihr alles, sie erklärte es uns anschließend auf Englisch und gab uns\n" +
            "einen Notizzettel mit den wichtigsten Informationen mit und so kamen wir endlich – wenn\n" +
            "auch wieder über Feldwege, Schotterstraßen und Staubpisten – gegen 23.30 Uhr ziemlich\n" +
            "erschöpft und ärgerlich im Hotel an. Am nächsten Tag zogen wir um.\n" +
            "Herzliche Grüße und bis bald\n" +
            "Carla" +
            "Nomaden der Neuzeit\n" +
            "1\n" +
            "die anderen sind im Job ständig auf\n" +
            "Achse. Und dann gibt es noch diejenigen,\n" +
            "die gleich an den Arbeitsort\n" +
            "gezogen sind, weil er einfach zu weit\n" +
            "entfernt ist. Viele von uns sind mächtig\n" +
            "in Bewegung, wenn es um Job oder\n" +
            "Ausbildung geht. Arbeit macht mobil.\n" +
            "2\n" +
            "Wir sind ihrer Meinung nach Jobnomaden,\n" +
            "die durch die zivilisierte Wildnis\n" +
            "streifen – von Arbeitsplatz zu Arbeitsplatz,\n" +
            "von Abenteuer zu Abenteuer.\n" +
            "Wir sind die „Generation N“: Nomaden,\n" +
            "die sich ihre individuelle Existenz\n" +
            "aus dem prall gefüllten Baukasten der\n" +
            "Wahlmöglichkeiten immer wieder neu\n" +
            "zusammenbauen. Gleich den TuwaNomaden\n" +
            "in der Mongolei würden\n" +
            "wir dabei nomadische Lebensweisen\n" +
            "trainieren wie „die Fähigkeit, immer\n" +
            "wieder aufzubrechen, wenig Ballast mit\n" +
            "sich zu schleppen, lockere Beziehungsnetze\n" +
            "zu knüpfen, autark zu sein.“\n" +
            "3\n" +
            "Es bedeutet Beweglichkeit und Flexibilität.\n" +
            "Und die werden bei immer mehr\n" +
            "von uns als Persönlichkeitsmerkmale\n" +
            "erwartet. Sie sind die zentralen Stichworte\n" +
            "der heutigen Arbeitswelt und\n" +
            "oftmals die Voraussetzung für beruflichen\n" +
            "Erfolg. Sich rasch auf Veränderungen\n" +
            "einzustellen, nicht zu fest an\n" +
            "Bestehendem festzuhalten, offen für\n" +
            "neue Entwicklungen zu sein, ist das\n" +
            "Gebot der modernen Ökonomie.\n" +
            "4\n" +
            "so der Mainzer Soziologe Norbert\n" +
            "Schneider in seiner Studie über „Berufsmobilität\n" +
            "und Lebensform\". Sich\n" +
            "wegen des Jobs in Bewegung setzen\n" +
            "zu müssen, das habe es immer schon\n" +
            "gegeben. Man denke an die Welle von\n" +
            "Auswanderern nach Amerika Ende\n" +
            "des 19. Jahrhunderts. „Aber in dieser\n" +
            "Ausprägung ist das relativ neu\",\n" +
            "urteilt Schneider mit Blick auf das\n" +
            "Zusammentreffen von Konjunktur-\n" +
            "flaute, hoher Arbeitslosigkeit und\n" +
            "Umbau der Sozialsysteme.\n" +
            "5\n" +
            "Fernpendler mit täglichen langen Anfahrtswegen\n" +
            "zur Arbeit, Umzugsmobile,\n" +
            "die gleich zum Arbeitsort gezogen\n" +
            "sind, und Varimobile, sprich Beschäftigte\n" +
            "mit mobilen Berufen. Vor allem\n" +
            "viele Studenten und Paare unter 30\n" +
            "führen deshalb eine Beziehung auf Distanz.\n" +
            "16 Prozent der bundesdeutschen\n" +
            "Erwerbsfähigen, sprich jede sechste\n" +
            "Beziehung, ist eine Fernliebe.\n" +
            "6\n" +
            "Lebenspläne ändern sich viel schneller\n" +
            "als zuvor. Verbindungen werden\n" +
            "geschlossen und rasch wieder gelöst.\n" +
            "Das hat Folgen. 67 Prozent aller Mobilen\n" +
            "zwischen 20 und 49 Jahren, die\n" +
            "Soziologe Schneider befragte, klagen\n" +
            "über lange, anstrengende Fahrten,\n" +
            "den Verlust sozialer Kontakte, Zeitmangel,\n" +
            "Entfremdung vom Partner\n" +
            "bzw. von der Familie und finanzielle\n" +
            "Belastungen. Das ist die eine Seite.\n" +
            "7\n" +
            "Dies werde dadurch erleichtert, dass\n" +
            "wir heute natürlich über ganz andere\n" +
            "Reise- und Kommunikationsmöglichkeiten\n" +
            "verfügen, als sie die Menschen\n" +
            "noch vor 50 Jahren hatten. Durch billige\n" +
            "und schnelle Transportmittel wie\n" +
            "Flugzeug oder ICE mit einem gut ausgebauten\n" +
            "Streckennetz sowie E-Mail\n" +
            "oder Telefon ist Mobilität unkomplizierter\n" +
            "und der Zusammenhalt der\n" +
            "Menschen auch über größere Entfernungen\n" +
            "hinweg einfacher geworden.";
/*
        String text = "Bei Dienstreisen von Mitarbeitern/innen auf die Budgetverantwortlichen der jeweiligen Universitätseinrichtungen. " +
            "Sofern durch eine Dienstreise von Mitarbeitern/innen die Lehre betroffen ist, muss die Dienstreise zusätzlich auch von " +
            "dem Dekan/von der Dekanin genehmigt werden. Dienstreisen für Mitarbeiter/innen der ZUV, die aus zentralen Mitteln " +
            "(Fonds 1003) finanziert werden, genehmigt weiterhin im Auftrag des Rektors das Personaldezernat/Reisekostenstelle.";
*/

        TextParser textParser = new TextParser(text);
        List<Word> words = textParser.parseText();
        WordCounter wordCounter = new WordCounter(words);
        Map<String, Integer> map = wordCounter.sort(wordCounter.count());
        map.forEach((word, counter) -> System.out.println(word + " " + counter));
    }

}
