import java.lang.Math;
import java.util.Arrays;

/* 3 - Klasse MultipleStrings
In dieser Aufgabe sollen Sie auch das Benutzen einer bereits vorliegenden Klasse üben. Die Klasse String ist in Teilen
schon in der Vorlesung vorgestellt worden. Eine vollständige Beschreibung aller in String verfügbaren Methoden finden
Sie unter:http://docs.oracle.com/javase/8/docs/api/java/lang/String.html

Konzipieren Sie eine Klasse MultipleStrings , die ein Feld mit Texten String[] texts verwaltet. Implementieren Sie
für die Klasse MultipleStrings die folgenden Methoden auf der Basis der in der Klasse String verfügbaren
Methoden.
• Einen Konstruktor MultipleStrings( int n ) , der für texts ein Feld der Länge Math.abs(n) erzeugt.
• Eine Methode boolean addAtPosition( String s, int p ) , die den Text s am Index p in das Feld texts
einfügt. Bereits vorhandene Inhalte sollen dabei Überschrieben werden. Ist p kein gültiger Index, soll nichts geschehen
und false zurückgegeben werden; sonst soll true zurückgegeben werden.
• Eine Methode int size() , die die Anzahl der über texts erreichbaren Texte zurückgibt.
• Eine Methode int atEnd( String end ) , die zurückgibt, wie häufig der Text end als Teiltext am Ende der über
texts erreichbaren Texten auftritt.
• Eine Methode boolean inAll( char c ) , die true zurückgibt, falls das Zeichen c in jedem der über texts
erreichbaren Texte vorkommt. Sonst soll false zurückgegeben werden.
• Eine Methode void replace( char c, char r ) , die diejenigen über texts erreichbaren Texte, die das Zeichen
c enthalten, durch einen Text ersetzt, in dem c durch r ersetzt ist.*/


public class MultipleStrings{

String[] texts;

public MultipleStrings(int n){
  texts = new String[Math.abs(n)];
  texts[0] = "end";
  System.out.println(Arrays.toString(texts));
}

public boolean addAtPosition( String s, int p){
  if(p < 0 || p > texts.length){
    return false;
  } else{
  texts[p] = s;
  return true;
  }
} 

public int size(){
 int count = 0;
        for( String s : texts )
        {
            if ( s != null )
            {
                ++count;
            }
        }
        return count;
} 

public int atEnd(String end){
int count = 0;
        for( String s : texts )
        {
            if ( s != null && s.endsWith(end) )
            {
                ++count;
            }
        }
        return count;
} 

public boolean inAll(char c){

int i = 0;
while(i < texts.length){  
  if(texts[i].indexOf(c) == -1){
  //System.out.println(texts[i].indexOf(c));
  return false;
  }

i++;
}

return true;
}

// Unvollständig
public void replace(char c, char r){
  for ( int i = 0; i < texts.length; ++i )
        {
            if ( texts[i] != null )
            {
                texts[i] = texts[i].replace( c, r );
            }
        }

}
}