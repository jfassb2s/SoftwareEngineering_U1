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
