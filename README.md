# Disclaimer
Der folgende Text wurde mit Hilfe von KI zusammengefasst.

# Software Engineering I - Übungsblatt 1 (WS 2025/2026)

## Aufgabe 1: Kommunikationsverbindung mit Fabrik

**Lösungskonzept:**  
- Es wird eine **Fabrik-Klasse** (`TranslatorFactory`) im Package `control` erstellt.  
- Der `Client` ruft diese Factory auf, um ein `Translator`-Objekt zu erhalten, **ohne direkt `new` zu verwenden**.  
- Die Fabrik setzt auch automatisch das Erstellungsdatum des Translators.

**Design Pattern:**  
- *Factory Method*  
- **Nutzen:** Entkopplung von Erzeugung und Nutzung, Client kennt nur Interface, einfache Erweiterbarkeit für andere Translator-Typen.

**Interface-Anpassung:**  
- `Translator` muss `public` sein, damit Klassen in anderen Packages (z. B. `view.Client`) darauf zugreifen können:
```java
public interface Translator {
    double version = 1.0;
    String translateNumber(int number);
}

### Blackbox-Test Fragen

**Vorteil einer separaten Test-Klasse:**  
- Trennung von Produktions- und Testcode  
- Bessere Wartbarkeit und Übersicht  
- Testcode wird nicht mit der Produktivsoftware ausgeliefert  
- Ermöglicht automatisierte Testläufe (z. B. CI/CD)

**Sinn von Äquivalenzklassen bei Blackbox-Tests:**  
- Eingaben werden in Klassen mit gleichem Verhalten eingeteilt  
- Reduziert die Anzahl der Testfälle, ohne Testqualität zu verlieren  
- Ein Repräsentant pro Klasse reicht aus, um das Verhalten zu prüfen

**Warum Blackbox-Test auf `Client` nicht direkt möglich:**  
- `Client.display()` gibt nur auf die Konsole aus (`System.out.println`)  
- Kein Rückgabewert oder messbarer Effekt über Schnittstelle  
- JUnit kann Standard-Ausgabe nur über Umleitung testen, daher nicht direkt prüfbar
