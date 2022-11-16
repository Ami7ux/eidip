/*
 * @author amuel12s
 */

public class Zeichenkette {
  public static String wiederhole(int n, String s, char t) {
    String ausgabe = "";
    for (int i = 0; i < n; i++) {
      ausgabe = ausgabe + s;
      if (i + 1 < n) {
        ausgabe = ausgabe + t;
      }
      // System.out.println(ausgabe); //Testzeile Inhalt der Variable ausgabe
    }
    return ausgabe;
  }
}
