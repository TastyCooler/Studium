/*1 - Klasse Box
Schreiben Sie eine Klasse Box, die eine Kiste in Form eines Quaders beschreibt. Ein Quader ist ein geometrischer Körper mit
sechs rechteckigen Flächen, bei dem alle Winkel 90 Grad haben. Ein Quader lässt sich durch drei Angaben spezifizieren:
Breite, Höhe und Tiefe. Nutzen Sie dazu reelle Zahlen des Typs double.
Schreiben Sie für die Klasse Box verschiedene Methoden:
• einen Konstruktor, der die Breite, Höhe und Tiefe setzt,
• drei Methoden, die die Breite, Höhe und Tiefe zurückgeben (getWidth, getHeight, getDepth),
• drei Methoden, die das Volumen (getVolumeSize), die Oberfläche (getAreaSize) und die Summe der Kantenlängen
(getEdgesLength) berechnen und zurückgeben,
• Die Methode boolean isCube() soll den Wert true zurückgeben, falls es sich um einen Würfel handelt, also alle
Kanten die gleiche Länge besitzen.
• Die Methode int compareTo( Box f ) dient dazu, zwei Kisten miteinander zu vergleichen, das aufrufende Objekt
und das als Parameter übergebene Objekt. Als Ergebnis soll zurückgegeben werden:
– einen Wert größer als 0, falls die aufrufende Box ein größeres Volumen als die als Parameter übergebene Box besitzt,
– der Wert 0, falls beide Kisten das gleiche Volumen besitzen,
– einen Wert kleiner als 0, falls die aufrufende Box ein kleineres Volumen als die als Parameter übergebene Box besitzt.
• eine Methode encloses, die bestimmt, ob eine als Parameter übergebene Kiste bei parallel liegenden Seitenflächen
vollständig in das aufrufende Objekt echt eingepasst werden kann, und einen entsprechenden Wahrheitswert zurückliefert. Beachten Sie bei der Implementierung, dass Kisten gedreht werden können: Eine Kiste 30x20x10 passt echt in eine
Kiste 11x31x21. */

public class Box{

private double width;
private double height;
private double depth;

public Box(double w, double h, double d){
  width = w;
  height = h;
  depth = d;
}

public double getWidth(){
 
  return width;
}

public double getHeight(){

return height;

}

public double getDepth(){

  return depth;
}

public double getVolumeSize(){
 return width * height * depth;
}

public double getAreaSize(){
return 2*((width*depth)+(width*height)+(depth*height));
}

public double getEdgesLength(){
return 4*(width+depth+height);
}

public boolean isCube(){
  if(width == height && width == depth && depth == height){
    return true;
  } else{
    return false;
  }
}

public int compareTo(Box f){
  if(getVolumeSize() > f.getVolumeSize()){
    return 1;
  } else if(getVolumeSize() == f.getVolumeSize()){
    return 0;
  } else{
    return -1;
  }
}

public boolean encloses(Box f){
  if(getWidth() > f.getWidth() && getWidth() > f.getHeight() && getWidth() > f.getDepth() && getHeight() > f.getDepth()){
    return true;
  } else {
    return false;
  }
}
}