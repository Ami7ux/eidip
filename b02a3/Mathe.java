/*
 * @author amuel12s
 */

public class Mathe {
  public static int fakRek(int n) {
    if (n == 1) {
      return 1;
    } else {
      return fakRek(n - 1) * n;
    }
  } //System.out.println(Mathe.fakRek(4));  <Zum Testen

  public static int fakLoop(int n) {
    int ausgabe = 1; //Ausgabewert
    for (int i = 1; i <= n; i++) {
      ausgabe = ausgabe * i;
    }
    return ausgabe;
  }

  public static void quadrateAusgabeRueck(int n) {
    int i = 0; //Zähler
    while (i < n) {
      System.out.println(n * n);
      n = n - 1;
    }
  }

  public static int fak(int x) {
    return fakLoop(x);
  }
}
