# RacingSnails

1. Rennschnecke
- Erstelle eine Klasse "Rennschnecke"
- Rennschnecken sollen folgende Eigenschaften(Objektvariablen) besitzen:
    einen Namen
    eine Rasse
    eine Maximalgeschwindigkeit (Veränderung der Strecke pro Schritt)
    die Schnecke soll wissen welchen Weg sie bereits zurück gelegt hat
- Erstelle für die Klasse Rennschnecke einen Konstruktor, der den Instanzvariablen beim Erstellen einer neuen Instanz (Objekt zu dieser Klasse) Werte zuweist.
- Lege in der Klasse "Rennschnecke" eine Methode "krieche()" an, welche die Schnecke abhängig von ihrer Maximalgeschwindigkeit eine zufällige Strecke weiter bewegt. Soll heißen: Sie kriecht eine zufällige Strecke größer null und kleiner ihrer Maximalgeschwindigkeit. Nimm als Zeiteinheit 1 an.
- Tipp: Schaut euch die Methode Math.random() aus der Java API an.
- Lege in der Klasse "Rennschnecke" eine Methode "public String toString()" an, welche die Daten der Schnecke mit return als String zurückgibt.
- Teste deine Klasse, indem du probehalber ein Rennschneckenobjekt erzeugst und seine Daten auf der Konsole ausgibst.
- Tipp:Verwende zum Ausgeben der Daten die toString() Methode der Rennschnecke.

2. Rennen
- Erstelle eine Klasse "Rennen"
- Ein Rennen hat folgende Eigenschaften:
    einen Namen
    die Anzahl der teilnehmenden Schnecken
    die teilnemenden Schnecken selbst, als:
      Array: einfachere Umsetzung mit konstanter Teilnehmerzahl
      ArrayList: schönere Umsetzung mit variabler Teilnehmerzahl
        Tipps:
          Verwende als Datentyp ArrayList<Rennschnecke>
          Verwende beim Erstellen new ArrayList<Rennschnecke>()
    die Länge der zu kriechenden Strecke
- Überlege dir, welche dieser Werte bereits im Konstruktor gesetzt werden sollten.
- Lege in der Klasse "Rennen" eine Methode "void addRennschnecke(Rennschnecke neueSchnecke)" an, welche dem Rennen eine Schnecke hinzufügt.
- Lege in der Klasse "Rennen" eine Methode "void removeRennschnecke(String name)" an, welche eine Schnecke aus dem Rennen entfernt. (nicht so einfach und kann erstmal übersprungen werden)
- Lege in der Klasse "Rennen" eine Methode "public String toString()" an, welche die Daten des Rennens mit return als String zurückgibt.
- Tipp: Um die Daten der beteiligten Schnecken zurückzugeben, könnt ihr deren toString() Funktion benutzen.
- Teste deine Klasse vom Hauptprogramm aus!
- Lege in der Klasse "Rennen" eine Methode "Rennschnecke ermittleGewinner()" an, welche null zurückliefert, wenn noch keine der teilnemenden Schnecken das Ziel erreicht hat und anderenfalls die Gewinnerschnecke zurückgibt.
- Lege in der Klasse "Rennen" eine Methode "void lasseSchneckenKriechen()" an, welche alle teilnemenden Schnecken einmal kriechen lässt.
- Lege in der Klasse "Rennen" eine Methode "void durchfuehren()" an, welche so lange lasseSchneckenKriechen() aufruft, bis eine der Schnecken das Ziel erreicht hat.
- Tipp: Ob eine Schnecke im Ziel angekommen ist, kannst du mit deiner Methode ermittleGewinner() herrausfinden.

3. Wettbüro
- Erstelle eine Klasse Wettbuero.
- Ein Wettbuero hat die folgenden Eigenschaften:
    Es weiß, für welches Rennen es seine Wetten entgegennimmt.
    Es verfügt über eine Liste (z.B. eine ArrayList) von angenommenen Wetten.
    Es hat einen festen Faktor, mit welchem Wetteinsätze bei einem Gewinn multipliziert werden.
- Lege in der Klasse "Wettbuero" eine Methode "wetteAnnehmen(String schneckenName, int wettEinsatz, String spieler)" an, welche eine Wette entgegennimmt. Die Wette ist bezogen auf eine Schnecke für das Rennen, das von dem Büro bearbeitet wird.
- Um die einzelnen Wetten speichern zu können, sollten ihre Daten in eigenen Objekten der Klasse "Wette" gespeichert werden. Erstellt euch diese Klasse selbst.
- Tipp: Denkt an toString().
- Lege in der Klasse "Wettbuero" eine Methode "rennenDurchfuehren()" an, welche das betreute Rennen durchfuert.
- Lege in der Klasse "Wettbuero" eine Methode "toString()" an, welche die Daten des Wettbueros, die Daten des Rennens sowie sämtliche abgeschlossende Wetten als String zurückgibt.
- Teste dein Programm!
