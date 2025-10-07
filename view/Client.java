package view;

import control.Translator;
import control.TranslatorFactory;

public class Client {

    /**
     * Methode zur Ausgabe einer Zahl auf der Console
     * (auch bezeichnet als CLI, Terminal)
     *
     */
    void display( int aNumber ){
        Translator translator = TranslatorFactory.createGermanTranslator();
        String result = translator.translateNumber(aNumber);
        System.out.println("Das Ergebnis der Berechnung: " + result);
    }

    public static void main(String[] args) {
        new Client().display(5);
    }
}
