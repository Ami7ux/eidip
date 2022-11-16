/*
 * @author amuel12s
 */

public class Mathe {
  public static String vielfache(int a, int n) {
    String ausgabe = ""; //Interner Ausgabewert
    int wert = 0; //Rechenwert der Multiplikation
    for (int i = 1; i <= n; i++) { //Zähler i der Interationen
      wert = i * a;
      ausgabe = ausgabe + wert + " ";
    }
    return ausgabe + "\n";
  }

  public static String einmaleins(int n) {
    String ausgabe = "";
    for (int j = 1; j <= n; j++) { //Zähler j der Interationen
      ausgabe = ausgabe + vielfache(j, n);
    }
    return ausgabe;
  }
}
