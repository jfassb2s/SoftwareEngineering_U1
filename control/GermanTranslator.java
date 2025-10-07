package control;

public class GermanTranslator implements Translator {

    public String date = "Okt/2025"; // Default-Wert

    /**
     * Methode zur Übersetzung einer Zahl in eine String-Repraesentation
     */
    public String translateNumber(int number) {
        String[] zahlen = {
                "", "eins", "zwei", "drei", "vier", "fünf",
                "sechs", "sieben", "acht", "neun", "zehn"
        };

        if (number < 1 || number > 10) {
            return "Übersetzung der Zahl " + number +
                    " nicht möglich (" + Translator.version + ")";
        }

        return zahlen[number];
    }

    /**
     * Objektmethode der Klasse GermanTranslator zur Ausgabe einer Info.
     */
    void printInfo(){
        System.out.println( "GermanTranslator v1.9, erzeugt am " + this.date );
    }

    /**
     * Setzen des Datums, wann der Uebersetzer erzeugt wurde (Format: Monat/Jahr (Beispiel: "Okt/2024"))
     * Das Datum sollte system-intern durch eine Factory-Klasse gesetzt werden und nicht von externen View-Klassen
     */
    public void setDate( String date ) {
        this.date = date;
    }

}
