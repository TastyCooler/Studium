/*Ein Zeitpunkt soll aus drei nicht-öffentlichen Attributen bestehen:
• einer Jahresangabe,
• der Nummer eines Tages im Jahr und
• einer Stundenangabe.
Die Jahresangabe soll immer positiv und vierstellig (also größer als 999 und kleiner als 10000) sein. Schaltjahre werden nicht
berücksichtigt, so dass der Tag zwischen 1 und 365 und die Stundenangabe zwischen 0 und 23 liegen dürfen. Die Klasse
PointInTime soll einen geeigneten Konstruktor und Methoden zum Zurückgeben der drei Attribute bereitstellen. Zudem
soll die Klasse folgende Methoden anbieten:
• Eine Methode toString , die den Zeitpunkt als Text der Form jjjj/ttt/hh zurückgibt.
• Eine Methode clone , die eine Kopie des PointInTime -Objektes erstellt und zurückgibt.
• Eine Methode change , die eine als Parameter übergebene Anzahl von Stunden zu dem Zeitpunkt hinzuaddiert. Wird
dieser Methode ein negativer Wert übergeben, so soll nichts geschehen.
Testen Sie Ihre Klasse PointInTime , indem Sie mit den Konstruktoren PointInTime -Objekte anlegen und für diese die
Methoden aufrufen. */



public class PointInTime
{

    private int year, day, hour;

    public PointInTime(int year, int day, int hour)
    {
        if ( (year > 999 && year < 10000) && (day > 0 && day < 366) && (hour >= 0 && hour < 24) )
        {
            this.year = year;
            this.day  = day;
            this.hour = hour;
        }
        else
        {
            this.year = 0;
            this.day  = 0;
            this.hour = 0;
        }
    }

    public int getYear()
    {
       return year; 
    }
    
    public int getDay()
    {
       return day; 
    }
    
    public int getHour()
    {
       return hour; 
    }
        
    public String toString()
    {
        String d, h;
        if (day < 10)
        {
            d = "00" + day;
        }
        else if (day < 100)
        {
            d = "0" + day;
        }
        else
        {
            d = "" + day;
        }       
        if (hour < 10)
        {
            h = "0" + hour;
        }
        else
        {
            h = "" + hour;
        }
        return year + "/" + d + "/" + h;
    }
    
    public PointInTime clone()
    {
       return new PointInTime(year, day, hour);
    }
      
    /**
     * In der Methode change werden die Uebertraege fuer Tage und Jahre beruecksichtigt.
     * 
     * Fuer Jahre werden die Uebertraege einfach aufaddiert. Es wird dabei auch zugelassen, 
     * dass die Jahreszahl 9999 ueberschritten wird.
     * 
     * Da die Tage des Jahres mit 1 anfangen, wird zur korrekten Beruecksichtigung des 
     * aktuellen Jahres und des (der) Folgejahre(s) eine Fallunterscheidung vorgenommen.
     */
    
    public void change(int h)
    {
       int ueberTragY, ueberTragD;
       if (h > 0)
       {
           ueberTragD = (hour + h) / 24; //  1
           hour = (hour + h) % 24; // 0 
           if (day + ueberTragD < 366)
           {
               ueberTragY = 0;
               day += ueberTragD; 
            }
            else
            {
                ueberTragY = 1 + (day + ueberTragD - 366) / 365;
                day = (day + ueberTragD) % 365;
                year += ueberTragY;
            }
        }
    }
    
}

