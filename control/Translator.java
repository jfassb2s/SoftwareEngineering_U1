package control;

/**
 * Das Translator Interface. Die Anzahl der Methoden ist fix
 * und darf NICHT erweitert werden. Sichtbarkeiten koennen
 * unter Umstaenden angepasst werden.
 *
 * @author jfassb2s
 *
 */

public interface Translator {

    double version = 1.1; // Version des Interface

    /*
     * Uebersetzt eine numerische Zahl in eine String-basierte
     * Repraesentation gemaess der Spezifikation in der Aufgabe 1-2
     */
    String translateNumber(int number);

}
