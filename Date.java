/* Klasse Date
Ein Termin besteht aus einer Bezeichnung, einem Startzeitpunkt und einer Dauer. Implementieren Sie die Klasse Date unter
Zuhilfenahme der Klassen PointInTime und Period . Alle Attribute sollen nicht-öffentlich angelegt werden.
Die Klasse Date soll einen Konstruktor mit je einem Parameter für die Bezeichnung, den Zeitpunkt und die Dauer. Es soll
möglich sein, für den Zeitpunkt oder die Dauer kein Objekt - sondern den Wert null – zu übergeben. Dann soll der Termin
einen unbestimmten Beginn oder eine unbestimmte Dauer besitzen.
Weiterhin soll die Klasse Date folgende Methoden bieten:
• Eine Methode clone zum Kopieren eines Termins.
• Drei Methoden zum Zurückgeben der drei Attribute.
• Eine Methode set , die einen Termin ändert. Diese Methode soll zwei Parameter für den Zeitpunkt und die Dauer
besitzen, die die entsprechenden Werte des Objekts überschreiben.
• Eine Methode change , die einen Termin verschiebt. Diese Methode soll einen Parameter des Typs int besitzen, von der
die Anzahl der Stunden angibt, um die der Startzeitpunkt des Termins verschoben werden soll. Beachten Sie, dass
Termine einen unbestimmten Beginn besitzen können. Dann ist keine Verschiebung möglich.
• Eine Methode toString , die eine geeignete Darstellung der Attribute des Termins als String zurückgibt. */



public class Date{

    private String description;
    private PointInTime start;
    private Period duration;

    public Date( String d, PointInTime s, Period p )
    {
       description = d;
       start = s;
       duration = p;
    }
    
    public Date clone()
    {
        return new Date( description, start.clone(), duration.clone() );
    }

    public void set( PointInTime s, Period d )
    {        
        start = s;
        duration = d;
    }
    
    public void change( int hours )
    {        
        if ( start != null )
        {
            start.change( hours );
        }
    }
    
    public String toString()
    {
        String s =  description + ":  start = ";
        if ( start != null ) 
        {
            s += start.toString();
        } 
        else 
        {
            s += "unbestimmt";
        }
        s += "  duration = ";
        if ( duration != null )
        {
           s += duration.toString();
        }
        else
        {
            s += "unbestimmt";
        }
        return s;
    }
 
} 