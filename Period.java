/* 2 - Klassen Period, PointInTime und Date
Klasse Period
Definieren Sie eine Klasse Period, die als einziges Attribut eine Zeitangabe in Minuten verwaltet. Eine negative Dauer soll
nicht möglich sein. Das Attribut minutes soll nicht-öffentlich angelegt werden.
Programmieren Sie:
• Zwei Konstruktoren, die mit einem Parameter (nur Minuten) bzw. zwei Parametern (Minuten und Stunden) ausgestattet
sind. Bei negativen Parameterwerten soll 0 zur Initialisierung verwendet werden.
• Die Methode getMinutes, die als Rückgabewert die Anzahl der abgelegten Minuten liefert.
• Die Zugriffsmethode getHours, die die Zahl der in den abgelegten Minuten enthaltenen ganzen Stunden zurückgibt.
• Die Zugriffsmethode getMinorMinutes, die den Wert der nicht in ganzen Stunden enthaltenen Minuten angibt, so dass
gilt: getHours()*60+getMinorMinutes()==minutes.
• Eine Methode toString, die die Dauer als Text der Form hh:mm zurückgibt.
• Eine Methode clone, die eine Kopie des Period-Objektes erstellt und zurückgibt. Beachten Sie, dass hierzu das
Erstellen eines neuen Objekts mit gleichen Inhalten notwendig wird.
• Eine Methode change, die eine als Parameter übergebene Anzahl von Minuten zu der Dauer hinzuaddiert. Wird dieser
Methode ein negativer Wert übergeben, so soll nichts geschehen.
Testen Sie Ihre Klasse Period, indem Sie mit den Konstruktoren Period-Objekte anlegen und für diese die Methoden
aufrufen.
*/

public class Period{

private int minutes;

public Period(int m){

if(m < 0){
  this.minutes = 0;
}else{
  this.minutes = m;
}

}

public Period(int m, int h){

if(m <0){
  this.minutes = 0;
}else{
  this.minutes = m+(h*60);
}

}

public int getMinutes(){
  return minutes;
}

public int getHours(){
  return minutes / 60;
}

public int getMinorMinutes(){
  return minutes - getHours()*60;
}

public String toString(){
  return getHours() + ":" + getMinorMinutes();
} 

public Period clone(){
 return new Period(minutes);
}

public void change(int m){
  if(m > 0){
    minutes += m;
  } 
  
}

}