# Contact Manager

Das Ihnen vorliegende Programm stellt rudimentäre Funktionalitäten zur Verwaltung von Kontakten zur Verfügung. Die Klasse `Contact` repräsentiert hierbei einen einzelnen Kontakt bestehend aus Vorname, Nachname, Mobilnummer und Adressdaten. In der Klasse `ContactBook` befindet sich eine einfache Logik, um mehrere Kontakte zu verwalteten. In `App` befindet sich die `main` Methode, der Großteil des Codes ist aktuell jedoch noch auskommentiert.

## Aufgaben

1. Werfen Sie einen Blick in die Klasse `Contact`. Fassen Sie die Attribute `street`, `zipCode` und `city` zu einer neuen Klasse `Address` zusammen. Stellen Sie in der neuen Klasse `Address` einen Konstruktor zur Verfügung, der die Initialisierung der Attribute erlaubt. Fügen Sie anschließend der Klasse `Contact` ein neues Attribut `address` vom neuen Datentyp `Address` hinzu. Passen Sie dazu ebenfalls den vorhandenen Konstruktor an.


2. Ergänzen Sie in der neuen Klasse `Address` eine `toString` Methode, welche aus den vorhandenen Attributen einen String in der folgenden Form erzeugt: `Warschauer Str. 1 in 12345 Berlin`.


3. Fügen Sie der Klasse `Contact` 3 weitere Konstruktoren zur Verfügung:
    - Initialisierung von `firstName` und `lastName` (`address` und `mobile` sind `null`)
    - Initialisierung von `firstName`, `lastName` und `address` (`mobile` ist `null`)
    - Initialisierung von `firstName`, `lastName` und `mobile` (`address` ist `null`)
    - Achtung: Vermeiden Sie Code-Redundanzen, indem Sie den bestehenden Konstruktor wiederverwenden.


4. Schreiben Sie in der Klasse `Contact` eine `toString` Methode, welche aus den vorhandenen Attributen einen String in der folgenden Form erzeugt:
   - `Megan Gilmore, n/a, n/a`
   - `Harry Fisher, +491253490723, n/a`
   - `Robert White, n/a, Warschauer Str. 1 in 12345 Berlin`
   - `Mary Stuart, +491239730943, Warschauer Str. 2 in 12345 Berlin`
   - Im String soll `n/a` verwendet werden, wenn `address` oder `mobile` den Wert `null` hat.


5. Entfernen Sie in der Klasse `App` die Kommentare aus den Zeilen 7 und 8 sowie 11 bis 13. Wenn Sie bis hierhin alle richtig gemacht haben, sollte der Code kompilieren. Kompiliert der Code nicht, dann wenden Sie sich bitte erneut den vorangegangenen Aufgaben zu.


6. Führen Sie die `main` Methode aus. Sie erhalten eine Ausgabe in der Form:
    
   ```shell
    Megan Gilmore, n/a, n/a
    Harry Fisher, +491253490723, n/a
    Robert White, n/a, Warschauer Str. 1 in 12345 Berlin
    Mary Stuart, +491239730943, Warschauer Str. 2 in 12345 Berlin
    Bobby Martinez, n/a, n/a
    ```
   
    Ihnen ist sicher nicht entgangen, dass Ihnen sowohl die Kontakte von Alice als auch von Bob angezeigt werden. Schreiben Sie den gesamten Code so um, dass Sie sowohl für Alice als auch für Bob ein eigenes `ContactBook` verwenden können, sodass die Kontakte der beiden voneinander getrennt sind. Am Ende wird eine Ausgabe in der folgenden Form erwartet:

   ```shell
    These are the contacts of Alice:
    Megan Gilmore, n/a, n/a
    Harry Fisher, +491253490723, n/a
   
    These are the contacts of Bob:
    Robert White, n/a, Warschauer Str. 1 in 12345 Berlin
    Mary Stuart, +491239730943, Warschauer Str. 2 in 12345 Berlin
    Bobby Martinez, n/a, n/a
    ```