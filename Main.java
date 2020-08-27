import java.lang.Math;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    // TESTAT 1.1
    //System.out.println(determineMaximum(7,14,21));
    //System.out.println(interval(0,0));
    //System.out.println(isPythaTriple(2,2,2));
    //System.out.println(digitSum(3455));
    //System.out.println(digitToString(7));
    //System.out.println(intToString(-103));
    //System.out.println(digitSumToString(-1));
    //System.out.println(isHarshad(100));
    //computeHarshads(777);
    //System.out.println(computeEuler(50));
    //showSawTeeth(5, 2);

   //System.out.println(greatestProperDivisor(8));
   // int[] a={1, 1, 3, 3, 1, 2, 2, 2, 1};
   //int[] b={1 ,3 ,3 ,3 ,3 ,2 ,2 ,5 ,5};
   //System.out.println(countPairs(b));
   //int[] c={232,1515,1997,141,3265,16564,1584};
   //int[] h={1,2,3,4,5,6};
   //int[] d={1 ,3 ,3 ,3 ,3 ,2 ,2 ,5 ,55555};
   //System.out.println(writtenboth(c, d));
   //System.out.println(notWrittenBoth(c, d));
   //System.out.println(countWrittenBoth(c, d));
   // System.out.println(allNrBigger(c, d));

// Testat 1.2
  //System.out.println(countNegatives(c));
 // System.out.println(sumUpNegatives(c));
 // System.out.println( maximum(c));
 // System.out.println(countMaximum(c));
 //System.out.println(isSorted(h));
 //int[] pali = {5 ,17 ,88 ,88 ,17 ,5};
 //System.out.println(checkArray(pali));
 //int[] add ={80,7,0,56,11,72,43,37};
// increaseArray(add, 17);
// System.out.println(Arrays.toString(add)); 
//doubleIfContainsPositive(add);
//System.out.println(Arrays.toString(add));
 // System.out.println(toString(add));
 //System.out.println(Arrays.toString(copyStartingValues(add)));
//System.out.println(Arrays.toString(copyAndInvert(add)));
//int[] negatives = {80,-7,1,0,0,0,0};
//System.out.println(Arrays.toString(selectNegatives(negatives)));
//System.out.println(Arrays.toString(addArrays(add, negatives)));
//System.out.println(countSequences(add));
//int[] istgleich ={2,3,4,3,7,7,4,1,2,1};
//System.out.println(twoTimes(istgleich));

// Testat 2.1
//Box a = new Box(2,2,2);
//Box b = new Box(1,1,1);
//System.out.println(a.isCube());

/*Period t = new Period(90,3);
System.out.println(t.toString());
Period j = t.clone();
System.out.println(j.toString());
t.change(30);
System.out.println(t.toString());
System.out.println(j.toString());
Period b = t.clone();
Period c = j.clone();
System.out.println(b.toString());
System.out.println(c.toString()); */

//PointInTime p = new PointInTime(1998, 14, 23);
//p.change(1);
//System.out.println(p.toString()); 

//Date d = new Date("MafiSucks", null, null);
//System.out.println(d.toString());

/*MultipleStrings s = new MultipleStrings(5);
for(int i = 0; i < 4; i++){
  s.addAtPosition("end", i);
  }
s.addAtPosition("hello", 4);
System.out.println(Arrays.toString(s.texts));

System.out.println(s.inAll('n')); */

//TESTAT 22

//System.out.println(digitSumRecursive(123));
//System.out.println(harm(5));
//System.out.println(power(2,0));
//System.out.println(powerPlus(2,5));
//System.out.println(binaryCode(6));
//int[] i = {-1,-3,4,5,-2};
//System.out.println(maximum(i, 3));
//System.out.println(isSorted(i, 4));

//System.out.println(contains(i, 3 , 3));
//System.out.println(countPositives(i, 1, 4));
//System.out.println(sumNegativesRecursive(i, 4));
int[] i = {1,2,3,4,5,6,7};
System.out.println(county(3));
System.out.println(containss(i, 6, i.length));
  }



public static int county(int value){
  int[] n = {1,2,3,4,5,3};
  int q = 0;
  for(int cand : n){
    if(value == cand){
      q+=1;
    }
  }
  return q;
}


public static boolean containss(int[] arr, int n, int limit){
  if(limit >= arr.length || limit < 0){
    throw new IllegalArgumentException();
  } else{
    if(arr[limit] == n){
      return true;
    } else{
      return contains(arr,n, limit);
    }
  }
}

// TESTAT 1.1
/*1 - Bestimmen des Maximums
Schreiben Sie eine Methode determineMaximum, die drei ganze Zahlen als Parameter besitzt. Die Methode soll den
größten der drei als Argumente übergebenen Werte bestimmen und zurückgeben.*/
  public static int determineMaximum(int z1, int z2, int z3){
    int max; 

    if(z1 > z2 & z1 > z3){
      max = z1;
      return max;
    } else if (z2 > z3){
      max = z2;
      return max;
    } else{
      max = z3;
      return max;
    }
  }

 /* 2 - Summe
Programmieren Sie eine Methode int interval( int a, int b ), die die Summe aller ganzzahligen Werte in dem geschlossenen Intervall mit den Grenzen a und b berechnet und zurückgibt. Dabei bildet immer der kleinere der Werte aus a und b die untere Grenze, der größere Wert die oberere Grenze des Intervalls.
Beispiele: 
interval( 5, 11 ) soll 56 zurückgeben, da 5+6+7+8+9+10+11=56 gilt. 
interval( 11, 5 ) soll ebenfalls 56 zurückgeben, da 5+6+7+8+9+10+11=56 gilt. 
interval( 3, -1 ) soll 5 zurückgeben, da -1+0+1+2+3=5 gilt. 
interval( 4, 4 ) soll 4 zurückgeben. 
interval( 0, 0 ) soll 0 zurückgeben. */

public static int interval(int a, int b){
  int start;
  
  int max;
  int sum = 0;
  if(a > b){
    start = b;
    
    max = a;
  } else {
    start = a;
    
    max = b;
  }
  for(int i = start;i<=max;i++){
    sum += i;
  }
  return sum;
}

/*3 - Pythagoreische Zahlentripel
Ein pythagoreisches Zahlentripel wird von drei natürlichen Zahlen gebildet, die als Längen der Seiten a, b und c eines rechtwinkeligen Dreiecks vorkommen können. Es muss also gelten: a2 + b2 = c2
Schreiben Sie eine Methode isPythaTriple, die drei ganze Zahlen als Parameter besitzt. Die Methode soll prüfen, ob diese Zahlen (in beliebiger Kombination) ein Pythagoreisches Zahlentripel bilden. Ist das der Fall, soll der booleanWert true zurückgegeben werden, sonst der Wert false.*/

public static boolean isPythaTriple(int a, int b, int c){
  if((a*a)+(b*b) == c*c){
    return true;
  } 
  else {
  return false; 
  } 
}

/*4 - Quersumme
Schreiben Sie eine Methode digitSum, die bei ihrer Ausführung eine ganze Zahl als Argument erhält und die Quersumme dieser Zahl zurückgibt. Die Quersumme ergibt sich als Summe der einzelnen Ziffern, die die Zahl bilden. Das
Vorzeichen spielt bei der Berechnung der Quersumme keine Rolle.
Beispiele: Die Quersumme von 345 ist 3+4+5=12, die Quersumme von -17 ist 1+7=8.
Hinweis: Im Dezimalsystem erhalten Sie die letzte Ziffer einer Zahl als Rest der Division durch 10.  */

public static int digitSum(int a){
/*if(a < 0){
  a *= -1;
}
if (a <= 9) return a;

  return a%10 + digitSum(a/10);*/
int z = 0;

  while(a/10 != 0){
z += a%10;
a /= 10;
}

z += a%10; // letzte ziffer
 return z; 
}

/*5 - Ziffer als Text
Schreiben Sie eine Methode digitToString, die bei ihrer Ausführung eine einstellige nicht-negative ganze Zahl (also
eine einzelne Ziffer zwischen 0 und 9) als Argument übergeben bekommt. Die Methode soll einen String zurückgeben,
der den Namen der Ziffer enthält. Für andere Argumente soll der leere Text zurückgegeben werden.
Beispiel: digitToString(7) soll als Ergebnis "sieben" liefern. */

public static String digitToString(int a){



if(a > 9){
  return "";
} else {
  String[] namen;
  namen = new String[10];
  namen[0] = "null";
  namen[1] = "eins";
  namen[2] = "zwei";
  namen[3] = "drei";
  namen[4] = "vier";
  namen[5] = "fünf";
  namen[6] = "sechs";
  namen[7] = "sieben";
  namen[8] = "acht";
  namen[9] = "neun";

  return namen[a];
  }
}
/* 6 - Zahl als Text
Schreiben Sie eine Methode intToString, die bei ihrer Ausführung eine ganze Zahl als Argument erhält und einen
String zurückgibt. Der String soll die Folge der Namen der Ziffern enthalten. Diese Namen sollen durch ’-’ getrennt
werden. Ist die übergebene Zahl negativ, soll das Wort "minus" vorangestellt werden. Benutzen Sie zur Lösung die
bereits erstellte Methode digitToString.
Beispiel: Das Argument -34 soll zu folgendem Text führen: "minus-drei-vier". */ 

public static String intToString(int a){

String text = "";

int i = a;
if( i < 0){
  i *= -1;
}
while(i > 0){ 
if((i/10) == 0){
    text = digitToString(i%10) + text;
} else{

  text = " - " + digitToString(i%10)  + text;
}
  i /= 10;
}

if(a < 0){
  text = "minus - " + text;
}
  return text;
}

/* 7 - Quersumme als Text
Schreiben Sie nun die Methode digitSumToString, die die Methoden digitSum und intToString nutzt.
digitSumToString erhält bei ihrer Ausführung eine ganze Zahl als Argument übergeben und soll den Wert der Quersumme als Folge der Namen der Ziffern zurückgeben. */

public static String digitSumToString(int a){

String text = "";

text = intToString((digitSum(a)));
  return text;
} 

/* 8 - Harshad-Test
Eine natürliche Zahl heißt Harshad-Zahl, wenn Sie durch ihre Quersumme teilbar ist. Schreiben Sie eine Methode
isHarshad, die bei ihrer Ausführung eine ganze Zahl z als Argument erhält und true zurückgibt, falls z eine
Harshad-Zahl ist und sonst false.
Beispiel: 777 ist durch 7 + 7 + 7 = 21 teilbar und damit eine Harshad-Zahl. */

public static boolean isHarshad(int z){
int a = 0;
int zalt = z;

// Quersummenberechnung
while(z/10 != 0){
a += z%10;
z /= 10;
}

a += z%10; // letzte ziffer
 
// Harshad test, wenn Rest vorhanden return false
if(zalt % a >= 1){
 return false;
} else{
  return true;
  }
}

/* 9 - Harshad-Zahlen
Schreiben Sie eine Methode computeHarshads, die bei ihrer Ausführung eine ganze Zahl n als Argument erhält und
alle Harshad-Zahlen von 1 bis bis n bestimmt und am Bildschirm ausgibt.*/

public static void computeHarshads(int n){
int a; 
int ialt;
  for(int i = 1; i<=n;i++){
    ialt = i;
    a = 0;
    while(ialt/10 !=0){
      a += ialt%10;
      ialt /= 10;

    }
    a += ialt%10;
    if(i % a == 0){
      System.out.println(i);
    } 
  }
}

/* 10 - Eulersche Zahl
Programmieren Sie eine Methode computeEuler, die die Eulersche Zahl e = 2,71... berechnet. Die Berechnung soll
nach der Addition des n-ten Summenglieds abbrechen und die berechnete Summe zurückgeben. Der Wert n soll als
Argument übergeben werden. Überlegen Sie, welchen Typ die Summe besitzen muss. */

public static double computeEuler(int n){
  double e = 1;
  double z = 1;

  for(int i = 1; i < n; i++){
    z /= i;          
    e  += z;
  }
    return e;
  }

/* 11 - Sägezähne
Programmieren Sie eine Methode showSawTeeth( int n, int h ). Ein Aufruf von showSawTeeth soll n
«Sägezähne» aus / anzeigen, die gleichmäßig bis zu einer Höhe von h Zeichen ansteigen.
Beispiele:
 showSawTeeth( 3, 3 ) /  /  /
                     // // //  
                    ///////// */
  public static void showSawTeeth(int n, int h){
    for(int row = 1; row <=h; row++){
      for(int teeth = 0; teeth < n;teeth++){

        for(int blank = h - row; blank > 0;blank--){
          System.out.print(" ");
        }

        for(int slash = row; slash > 0; slash--){
          System.out.print("/");
        }
      }
      System.out.println();
    }
    
  }
/* Aufgabe 2: Größter echter Teiler
Konzipieren Sie einen effizienten Algorithmus, der für einen gegebenen Wert n > 1 den größten echten Teiler z bestimmt. Für echte Teiler gilt: n % z == 0 und n != z
Implementieren Sie eine Methode int greatestProperDivisor( int n ), die den Algo-
rithmus umsetzt.
Hinweis: Für Primzahlen ist der größte echte Teiler immer 1. */

public static int greatestProperDivisor(int n){
int z = 1;
int teiler = 0;

while(n != z){
  if(n%z == 0 & n!=z){ //teiler gefunden
  teiler = z;
  }
  z++;
}

  return teiler;
}

/* Aufgabe 3: Suche von Paaren in Feldern
Implementieren Sie eine Methode int countPairs( int[] arr ), die die Anzahl der Paa-
re von zwei unmittelbar aufeinander folgenden gleichen Werten in einem Feld bestimmt. Dabei
soll jedes Element des Feldes nur zu genau einem Paar gezählt werden.
Beispiele:
1 1 3 3 1 2 2 2 1 Besitzt drei Paare: 11, 33, 22
1 3 3 3 3 2 2 5 5 Besitzt vier Paare: 33, 33, 22, 55
Ergänzen Sie folgenden Code-Rahmen passend:
*/

public static int countPairs(int[] arr){
  int count = 0;
  for (int i = 1; i < arr.length; i++ )
  {
    if(arr[i-1]==arr[i]){
    count++;
    i++;
    }

    }
return count;
  }


/* Aufgabe 4: Klausurenstapel
Auf dem Präsenzblatt 2 haben Sie bereits in Aufgabe 3 verschiedene Algorithmen konzipiert,
die in dieser Aufgabe nun implementiert werden sollen.
Gehen sie in dieser Aufgabe davon aus, dass Ihnen für jeden der beiden Klausurstapel ein
(unsortiertes) Array der dazugehörigen Matrikelnummern zur Verfügung steht.
Implementieren Sie folgende Methoden:
• boolean writtenBoth ( int[] exam1, int[] exam2 )
soll true zurückge-
ben, falls es mindestens eine Matrikelnummer gibt, die sowohl in exam1 als auch in exam2
vorkommt. sonst soll false zurückgegeben werden.
• boolean notWrittenBoth ( int[] exam1, int[] exam2 ) soll true zurück-
geben, wenn es keinen Studierenden gibt, der beide Klausuren mitgeschrieben hat. An-
sonsten soll false zurückgegeben werden.
3• int countWrittenBoth ( int[] exam1, int[] exam2 ) soll die Anzahl an glei-
chen Matrikelnummern in exam1 und exam2 ermitteln.
• boolean allNrBigger ( int[] exam1, int[] exam2 ) soll true zurückgeben,
wenn alle Matrikelnummer in exam1 größer sind als in exam2, sonst false.
Zustazaufgabe: Implementieren Sie die obigen Methoden unter der Annahme, dass die Array
stets aufsteigend sortiert sind. */

public static boolean writtenboth(int[] exam1, int[] exam2){

  for(int i = 0; i < exam1.length; i++ ){
    for(int b = 0; b < exam2.length; b++){
      if(exam1[i] == exam2[b]){
        return true;
      }
    }
  }
  return false;
}

public static boolean notWrittenBoth(int[] exam1, int[] exam2){
 for(int i = 0; i < exam1.length; i++ ){
    for(int b = 0; b < exam2.length; b++){
      if(exam1[i] == exam2[b]){
        return false;
      }
    }
  }
  return true;
}

public static int countWrittenBoth(int[] exam1, int[] exam2){
  int count = 0;
  for(int i = 0; i < exam1.length; i++ ){
    for(int b = 0; b < exam2.length; b++){
      if(exam1[i] == exam2[b]){
        count++;
      }
    }
  }
  return count;
}

public static boolean allNrBigger(int[] exam1, int[] exam2){
 int biggest= 0;
 for (int b = 0; b < exam2.length; b++){
  if(exam2[b] > biggest){
   biggest = exam2[b];
   System.out.println(biggest);
   }
  }

  for(int i = 0; i < exam1.length; i++ ){
    if(exam1[i] < biggest){
      return false;
    }
    
  }
  return true;
}
// Zusatzaufgabe fehlt

/*Aufgabe 5: Primfaktorzerlegung
In der Vorlesung sind Methoden vorgestellt worden, mit denen eine Folge der Primzahlen bis
zu einer Obergrenze n erzeugt werden kann. Implementieren Sie eine statische Methode, die auf
Basis dieser Primzahlen für eine vorgegebene Zahl x > 0 deren Primfaktorzerlegung bestimmt.
Beispiele:
204 = 2 · 2 · 3 · 17
150 = 2 · 3 · 5 · 5
273 = 3 · 7 · 13 */

/*public static int Primfaktorzerlegung(int x){
  if(x <= 0){
    throw new IllegalArgumentException();
  }

  
} */

// TESTAT 1.2
/* 1 - Werte zählen
Schreiben Sie eine Methode countNegatives, die als Parameter ein eindimensionales Feld des Typs int besitzt. Die
Methode countNegatives soll die negativen Werte in diesem Feld zählen und den ermittelten Wert zurückgeben. 
*/



public static int countNegatives(int[] array){
  int count = 0;
  for(int i = 0; i < array.length; i++){
    if(array[i] < 0){
      count++;
    }
  }
  return count;
}

/* 2 - Werte aufsummieren
Schreiben Sie eine Methode sumUpNegatives, die als Parameter ein eindimensionales Feld des Typs int besitzt. Die
Methode sumUpNegatives soll die Summe der negativen Werte in diesem Feld bilden und den ermittelten Wert
zurückgeben */

public static int sumUpNegatives(int[] array){
int sum = 0;
  for(int i = 0; i < array.length; i++){
    if( array[i] < 0){
      sum += array[i];
    }
  }

  return sum;
}

/* 3 - Bestimmen des Maximums in einem Feld
Schreiben Sie eine Methode maximum, die ein Feld von int-Werten als Parameter besitzt und die den größten Wert in
diesem Feld bestimmt und zurückgibt.
Hinweis: Versuchen Sie, mit einem Durchlauf durch das Feld auszukommen.
 */

public static int maximum(int[] array){
  int max = 0;
  for(int i= 0; i < array.length; i++){
    for(int j= 1; j < array.length; j++){
      if (array[i] < array[j]){
      max = array[j];
      }
    } 
  }

  return max;
}
/* 4 - Bestimmen der Häufigkeit des Maximums in einem Feld
Schreiben Sie eine Methode countMaximum, die ein Feld von int-Werten als Parameter besitzt und die zählt, wie
häufig der größte Wert vorkommt. Die ermittelte Anzahl soll zurückgegeben werden. */

public static int countMaximum(int[] array){
  int max = maximum(array);
  int count = 0;
for(int i = 0; i < array.length; i++){
  if(max == array[i]){
    count++;
  }
}
return count;
}

/*5 - Sortierung prüfen
Schreiben Sie eine Methode boolean isSorted, die als Parameter ein eindimensionales Feld des Typs int besitzt.
Die Methode isSorted soll true zurückgeben, falls die im Feld enthaltenen Werte aufsteigend sortiert sind; sonst
soll false zurückgegeben werden. */

public static boolean isSorted(int[] array){
  boolean counter = false;
  int i = 0;
  int j = 1;
  while( i < array.length-1){
    if(array[i] < array[j]){
      counter = true;
    } else {
      return false;
      }
    i++;
    j++;
  }

  return counter;
}

/* 6 - Palindrome
Ein Palindrom ist eine Folge von int-Werten, die vorwärts und rückwärts identisch gelesen werden kann.
Beispiele sind die Folgen 12 34 78 34 12 oder 5 17 88 88 17 5.
Schreiben Sie eine Methode checkArray, die für ein über einen Parameter übergebenes Feld von int bestimmt, ob die
Folge der Zahlen ein Palindrom bildet. Die Methode soll einen Wert des Typs boolean zurückgeben. */

public static boolean checkArray(int[] array){
  boolean counter = false;

  int i = 0;
  int j = array.length-1;
  while(i < j){
    if(array[i] == array[j]){
      counter = true;
    } else{
      return false;
    }
    i++;
    j--;
  }

  return counter;
}

/* 7 - Erhöhen der Inhalte eines Feldes
Schreiben Sie eine Methode increaseArray, die als Parameter ein eindimensionales Feld des Typs int und einen
int-Wert besitzt. Die Methode increaseArray soll alle Werte des Feldes um den im zweiten Parameter übergebenen
Wert erhöhen und das veränderte Feld zurückgeben.
Beispiel: Werden ein Feld mit den Elementen 80,7,1,56,11,72,43,37 als erstes und der Wert 17 als zweites
Argument übergeben, so soll dieses Feld manipuliert und als 97,24,18,73,28,89,60,54 zurückgegeben werden. */

public static int[] increaseArray(int[] array, int adder){
  for(int i = 0; i < array.length; i++){
    array[i] += adder;
  }

  return array;
}

/* 8 - Bedingtes Verdoppeln der Inhalte eines Feldes
Schreiben Sie eine Methode doubleIfContainsPositive, die als Parameter ein eindimensionales Feld des
Typs int besitzt. Die Methode doubleIfContainsPositive soll alle Werte des Feldes verdoppeln, falls in dem
Feld mindestens ein positiver Wert vorkommt; sonst soll das Feld unverändert bleiben. Das (veränderte) Feld soll
zurückgegeben werden.
Beispiel: Wird ein Feld mit den Elementen 0,-7,1,5,-1,2,4 als Argument übergeben, so soll dieses Feld manipuliert
und als 0,-14,2,10,-2,4,8 zurückgegeben werden. */

public static int[] doubleIfContainsPositive(int[] array){
  for(int i = 0; i < array.length; i++){
    if(array[i] > 0){
      for(int j = 0; j < array.length; j++){
        array[j] *= 2;
      }
      return array;
    } 
  }
  return array;
}

/* 9 - Erzeugen eines Textes
Schreiben Sie eine Methode toString, die als Parameter ein eindimensionales Feld des Typs int besitzt. Die Methode
toString soll einen Text erzeugen, der alle Inhalte des Feldes in der Reihenfolge ihres Auftretens durch Kommas
getrennt enthält. Der erzeugte Text soll zurückgegeben werden. */

public static String toString(int[] array){
  String text = "";
  for(int i = 0; i < array.length; i++){
    text = text + array[i] ;
    if(i < array.length-1){
      text = text + ",";
    }
  }
  return text;
}

/* 10 - Erzeugen eines Feldes mit drei Elementen
Schreiben Sie eine Methode copyStartingValues , die als Parameter ein eindimensionales Feld des Typs int besitzt.
Die Methode copyStartingValues soll ein neues Feld erzeugen, das in seinen Elementen genau die ersten drei Werte
des als Argument übergebenen Feldes enthält, falls dieses mehr als zwei Elemente besitzt. Das erzeugte Feld soll zurück-
gegeben werden. Besitzt das als Argument übergebene Feld weniger als drei Elemente, soll vollständig kopiert werden.
Beispiel: Wird ein Feld mit den Elementen 80,7,1,56,11,72,43,37 als Argument übergeben, so soll ein neues Feld
mit den Werten 80,7,1 zurückgegeben werden. */ 

public static int[] copyStartingValues(int[] array){
if(array.length > 2){
int[] newArray = new int[3];
  for(int i = 0; i < newArray.length; i++){
    newArray[i] = array[i];

}
return newArray;
} else{
int[] newArray = new int[array.length];
for(int i  = 0; i < newArray.length; i++){
  newArray[i] = array[i];
}
return newArray;
}
  
}

/* 11 - Erzeugen eines Feldes mit ausgesuchten Inhalten
Schreiben Sie eine Methode selectNegatives, die als Parameter ein eindimensionales Feld des Typs int besitzt.
Die Methode selectNegatives soll ein Feld zurückgeben, in dem ausschließlich die negativen Werte des des als
Argument übergebenen Feldes enthalten sind. Die Methode countNegatives kann dazu benutzt werden, die Größe
des zurückgegebenen Feldes zu bestimmen.
Beispiel: Wird ein Feld mit den Elementen 80,-7,1,56,-11,-72,0,37 als Argument übergeben, so soll ein neues
Feld mit den Werten -7,-11,-72 zurückgegeben werden  */

public static int[] selectNegatives(int[] array){
  int[] negatives = new int[countNegatives(array)];
  int b = 0;
  for(int i = 0; i < array.length; i++){
    if(array[i] < 0){
      negatives[b] = array[i];
      b++;
    }
  }
  return negatives;
}
/* 12 - Erzeugen eines Feldes mit invertiertem Inhalt
Schreiben Sie eine Methode copyAndInvert, die als Parameter ein eindimensionales Feld des Typs int besitzt. Die
Methode copyAndInvert soll ein Feld zurückgeben, das alle Werte des als Argument übergebenen Feldes in umgekehrter Reihenfolge enthält.
Beispiel: Wird ein Feld mit den Elementen 80,-7,1,56,-11,-72,0,37 als Argument übergeben, so soll ein neues
Feld mit den Werten 37,0,-72,-11,56,1,-7,80 zurückgegeben werden.*/

public static int[] copyAndInvert(int[] array){
 int j = array.length - 1; 
 
  for(int i = 0; i < array.length / 2; i++){ 
    int temp = array[i]; 
    array[i] = array[j];  
    array[j] = temp; 
    j--;
  }
  return array;
}

/* 13 - Zusammenführen von Feldern
Schreiben Sie eine Methode addArrays, die zwei int-Felder als Parameter besitzt. Haben diese Felder die gleiche
Länge, so sollen die Werte mit dem gleichen Index addiert und die Summe unter diesem Index in einem dritten int-Feld
abgelegt werden. Dieses Feld soll als Ergebnis des Aufrufs von addArrays zurückgegeben werden. Unterscheiden sich
die als Argumente übergebene Felder in ihrer Länge, soll ein leeres Feld zurückgegeben werden. */

public static int[] addArrays(int[] arr1, int[] arr2){
  if(arr1.length == arr2.length){
    int[] newArr = new int[arr1.length];
    for(int i = 0; i < arr1.length; i++){
      newArr[i] = arr1[i] + arr2[i];
    }
    return newArr;
  } else{
    int[] empty = {};
    return empty;
  }
}

/*14 - Zählen von Folgen
Schreiben Sie eine Methode countSequences, die ein Feld von int-Werten als Parameter besitzt. Die Methode
countSequences soll die Anzahl der im Feld enthaltenen Zahlenfolgen ermitteln, in denen nicht der Wert 0 vorkommt.
Eine solche Zahlenfolge endet immer mit dem Auftreten einer 0 oder dem Ende des Feldes. Die ermittelte Anzahl soll
von der Methode zurückgegeben werden.
Beispiel: Wird ein Feld mit den Elementen 80,7,1,0,11,72,0,0,37,61 als Argument übergeben, so soll der Aufruf
von countSequences als Ergebnis 3 liefern, da die Folgen 80,7,1 und 11,72 und 37,61 auftreten. 
 int[] add ={80,7,0,56,11,72,43,37}; <- 2 */

public static int countSequences(int[] arr){
  int count = 0;

  for(int i = 1; i < arr.length; i++){
     
     if(arr[i] == 0 && arr[i-1] != 0){
      count++;
     }
     
  }
    
    if(arr[arr.length -1] != 0) {

     count++;
    }
  return count;
}

/* 15 - Analyse eines Felds
Programmieren Sie eine Methode boolean twoTimes( int[] arr ), die true zurückgibt, wenn das Feld arr
mindestens 2 Elemente besitzt und jeder im Feld vorkommende Wert dort genau zweimal auftritt. Sonst soll false
zurückgegeben werden. */

public static boolean twoTimes(int[] arr){
  int count = 0;
  for(int i = 0; i < arr.length; i++){
   
      for(int j = 0; j < arr.length; j++){
        if(arr[i] == arr[j]){
          count++;
        }
      }
        if(count != 2 ){
          return false;
        } else{
          count = 0;
        }
  } 
return true;
}

//Testat 22
/* 1 - Quersumme
Entwickeln Sie eine rekursive Methode int digitSum( int n ) , die für einen int -Parameter n die Quersumme des
Wertes von n berechnet.
Hinweis: Die Quersumme einer Zahl ergibt sich aus der Addition der letzten Ziffer mit der Summe der restlichen Ziffern.*/

public static int digitSumRecursive(int n){

if (n <= 9) return n;

  return n%10 + digitSumRecursive(n/10);

  // 3 + dsr(123/10)
  // 3 + 2 + dsr(12/10)
  // 3+ 2 + 1 + dsr(1/10) -> abbruch n < 9
}

/* 2 - Harmonische Zahl
Entwickeln Sie eine rekursive Methode double harm( int n ) , die für einen positiven int -Parameter n die n -te
harmonische Zahl, d.h. die Summe der ersten n Brüche 1/n, als reelle Zahl zurückgibt. Es soll also die folgende Summe
gebildet werden: 1/1 + 1/2 + 1/3 + ... 1/n.
Beispiel: harm(5) ergibt 1/1+1/2+1/3+1/4+1/5=2,28*/

public static double harm(int n){
  if(n == 0){
    return n;
  }
  System.out.println("n is: " + n);
    return (double)1/n + harm(n-1);
// 1/3 + harm(3-1)
// 1/3 + 1/2 + harm(2-1)
// 1/3 + 1/2 + 1/1 harm(1-1)


}

/* 3 - Potenz
Entwickeln Sie eine rekursive Methode int power( int a, int n ) , die für zwei int -Parameter a und n die n -te
Potenz des Wertes von a berechnet. */

public static int power(int a, int n){
if(n == 0){
  return 1;
}
if(n == 1){
  return a;
} 
 System.out.println("n is: " + n);

return a*power(a,n-1);

// power(2,3)
// 2 * 2 + power(2,3-1)
// 4 * 2 + power(2,2-1)
  
}

/* - optimierte Berechnung der Potenz
Entwickeln Sie eine weitere rekursive Methode int powerPlus( int a, int n ) , die für zwei int -Parameter a und
n die n -te Potenz des Wertes von a berechnet.
Dabei soll die Zahl der rekursiven Aufrufe und damit der Berechnungen klein gehalten werden, indem die Rechnung
folgendermaßen ausgeführt wird:
a^n = 1 für n = 0;
a^n = a^n/2 * a^n/2 für gerade n;
a^n = a * a^(n-1)/2 * a^(n-1)/2 für ungerade n
Hinweis: Überlegen Sie zunächst, wie mit der oben stehenden Formel die Zahl der Berechnungen reduziert werden kann. */

public static int powerPlus(int a, int n){
if(n == 0){
 return 1;
} else if(n%2 == 0){
  return (powerPlus(a,n/2))*(powerPlus(a,n/2)); 
} else{
  return a*(powerPlus(a,(n-1)/2)) * (powerPlus(a,(n-1)/2));
  
}


}

/* 5 - Binärdarstellung
Entwickeln Sie eine rekursive Methode String binaryCode( int i ) , die für einen positiven int -Wert dessen Binär-
darstellung als String aus den Werten 0 und 1 bestimmt und diesen String zurückgibt.
Hinweis: Die Binärdarstellung einer Dezimalzahl ergibt sich aus den rückwärts zusammengefassten Resten einer wieder-
holt ausgeführten Division der Zahl durch 2.
Beispiel: 6/2 = 3 Rest 0, 3/2 = 1 Rest 1, 1/2 = 0 Rest 1 ergibt also die Binärdarstellung 110 für den Dezimalwert 6. */

public static String binaryCode(int i){
String text = "";
if(i < 0){
  return "Negative Number";
} else if(i != 0){
  text += i%2 ;
return  binaryCode(i/2) + text ;
} else{
  return text;
}

}
/*  Rekursion mit Feldern
Verzichten Sie in allen Lösungen völlig auf die Benutzung von for- oder while-Schleifen!
1 - Bestimmung des Maximums
Entwickeln Sie eine rekursive Methode int maximum( int[] arr, int i ) , die für ein Feld arr das Maximum im
Bereich von arr[0] bis arr[i] mit 0<=i<arr.length bestimmt und zurückgibt.*/

public static int maximum(int[] arr, int i){
 
  if( i != 0){
    if(arr[i] > arr[i-1]){
      arr[i-1] = arr[i];
      return maximum(arr,i-1);
    } else {
      return maximum(arr, i-1);
    }
  } else{
    return arr[0];
  }
}


/*2 - Prüfen einer Sortierung
Entwickeln Sie eine rekursive Methode boolean isSorted( int[] arr, int i ), die für ein Feld arr im Bereich
von arr[0] bis arr[i] mit 0<=i<arr.length feststellt, ob das Feld aufsteigend sortiert ist, also für alle k mit
0<=k<i gilt: arr[k]<=arr[k+1]. Ist das der Fall, soll true zurückgegeben werden, sonst false.  */

public static boolean isSorted(int[] arr, int i){

  if( i!= 0){
    if(arr[i] >= arr[i-1]){
      return isSorted(arr, i-1);
    } else{
      return false;
    }
  } else{
    System.out.println(Arrays.toString(arr));
    return true;
  }
}

/*3 - Inhaltsüberprüfung
Entwickeln Sie eine rekursive Methode boolean contains( int[] arr, int i, int x ), die für ein Feld arr im
Bereich von arr[0] bis arr[i] mit 0<=i<arr.length bestimmt, ob dort der Wert x vorkommt. Ist das der Fall,
soll true zurückgegeben werden, sonst false. */

public static boolean contains(int[] arr, int i , int x){
  if(i != 0){
    if(arr[i] == x){
      return true;
    } else{
      return contains(arr, i-1, x);
    }
  } else{
    return false;
  }
}

/*4 - Zählen von positiven Werten
Entwickeln Sie eine rekursive Methode int countPositives( int[] arr, int d, int t ), die für ein Feld arr im
Bereich von jeweils einschließlich arr[d] bis arr[t] mit d<=t<arr.length die Anzahl der positiven Werte
bestimmt und zurückgibt.  */

public static int countPositives(int[] arr, int d, int t){
  if(t != d){
    if(arr[t] > 0){
      return 1 + countPositives( arr, d, t-1 );
    } else{
      return countPositives( arr, d, t-1 );
    }
  } else if(arr[d]> 0){

    return 1;
  } else{
    return 0;
  }
  } 

  /*5 - Gleichheit von Feldinhalten
Entwickeln Sie eine rekursive Methode boolean contentCheck( char[] arr1, char[] arr2, int i ), die für die
beiden als Parameter übergebenen Felder feststellt, ob die Folgen der Zeichen im Bereich der Indizes von 0 bis i mit
0<=i<arr.length gleich sind. Die Methode soll einen Wert des Typs boolean zurückgeben.  */
  
public static boolean contentCheck(char[] arr1, char[] arr2, int i){
  if(i >= 0){
    if(arr1[i] == arr2[i]){
      return contentCheck(arr1,arr2,i-1);
    } else{
      return false;
    }
  }
  return true;
}

/*6 - Palindrome
Ein Palindrom ist eine Zeichenfolge, die vorwärts und rückwärts identisch gelesen werden kann.
Entwickeln Sie eine rekursive Methode boolean palindromCheck( char[] arr, int i ), die durch den Aufruf
palindromCheck( a, 0 ) für ein Feld a von Zeichen ermittelt, ob die Folge der Zeichen in a ein Palindrom bildet.
Der Parameter i soll dazu benutzt werden, den betrachteten Bereich des Feldes arr einzuschränken. Die Methode soll
einen Wert des Typs boolean zurückgeben.  */

public static boolean palindromCheck(char[] arr)
    {
        return palindromCheck(arr, 0);
    }

    private static boolean palindromCheck(char[] arr, int i)
    {
        if (i<0 || i>arr.length-1)
            return false;
        else
        {
            int j=arr.length-1-i; /* rechter Index */
            if (i > j)
            {
                return true;
            }
            else
            {
                return arr[i] == arr[j] && palindromCheck(arr, i+1);
            }
        }
    }  


    /* 7 - Ermitteln des Index
Vervollständigen Sie die Methode int getIndex( Fraction[] arr, int i, Fraction x ), die den kleinsten
Index zurückgeben soll, an dem der Wert x in arr im Bereich von arr[0] bis arr[i] mit 0<=i<arr.length
vorkommt. Kommt x nicht vor oder wird für i ein Wert außerhalb der Grenzen des Felds arr übergeben, soll -1
zurückgegeben werden.*/


public static int getIndex(int[] arr, int i, int x){
if ( i < 0 || i>arr.length-1 )
        {
            return -1;
        }
        else
        {
            int lower = getIndex( arr, i-1, x );
            if ( lower != -1 || arr[i] != x )
            {
                return lower;
            }
            else
            {
                return i;
            }
        }
}

/* Summe aller negativen Werte zurückgeben*/

public static int sumNegativesRecursive(int[] arr, int i){
  if(i != 0){
    if(arr[i] < 0){
      return arr[i] + sumNegativesRecursive(arr, i-1);
    } else{
      return sumNegativesRecursive(arr, i-1);
    }
  } else if(i == 0 && arr[i] < 0){
    return arr[i];
  } else{
    return 0;
  }
  }
}




 

