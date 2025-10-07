package tests;

import control.GermanTranslator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {

    private final GermanTranslator translator = new GermanTranslator();

    // --- Positivtests: gültige Zahlen 1–10 ---
    @Test
    void testValidNumbers() {
        assertEquals("eins", translator.translateNumber(1));
        assertEquals("zwei", translator.translateNumber(2));
        assertEquals("drei", translator.translateNumber(3));
        assertEquals("vier", translator.translateNumber(4));
        assertEquals("fünf", translator.translateNumber(5));
        assertEquals("sechs", translator.translateNumber(6));
        assertEquals("sieben", translator.translateNumber(7));
        assertEquals("acht", translator.translateNumber(8));
        assertEquals("neun", translator.translateNumber(9));
        assertEquals("zehn", translator.translateNumber(10));
    }

    // --- Negativtests: zu kleine Zahlen (<1) ---
    @Test
    void testTooSmallNumbers() {
        assertEquals("Übersetzung der Zahl 0 nicht möglich (1.1)", translator.translateNumber(0));
        assertEquals("Übersetzung der Zahl -1 nicht möglich (1.1)", translator.translateNumber(-1));
        assertEquals("Übersetzung der Zahl -100 nicht möglich (1.1)", translator.translateNumber(-100));
    }

    // --- Negativtests: zu große Zahlen (>10) ---
    @Test
    void testTooLargeNumbers() {
        assertEquals("Übersetzung der Zahl 11 nicht möglich (1.1)", translator.translateNumber(11));
        assertEquals("Übersetzung der Zahl 50 nicht möglich (1.1)", translator.translateNumber(50));
        assertEquals("Übersetzung der Zahl 100 nicht möglich (1.1)", translator.translateNumber(100));
    }
}
