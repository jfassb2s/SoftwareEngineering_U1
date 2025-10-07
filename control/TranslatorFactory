package control;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class TranslatorFactory {

    public static Translator createGermanTranslator() {
        GermanTranslator t = new GermanTranslator();

        String month = LocalDate.now()
                .getMonth()
                .getDisplayName(TextStyle.SHORT, Locale.GERMAN);
        int year = LocalDate.now().getYear();
        t.setDate(month + "/" + year);

        return t;
    }
}
