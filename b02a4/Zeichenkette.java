/*
 * @author amuel12s
 */

public class Zeichenkette  {

  public static String grussMitZeit(int stunde, String name) {
    if (stunde < 12) {
      return "Guten Morgen, " + name + "!";
    } else if (stunde >= 18 & stunde <= 23) {
      return "Guten Abend, " + name + "!";
    } else {
      return "Guten Tag, " + name + "!";
    }
  }

  public static String zitronenEis(int n) {
    String s = "";
    String z = "Z";
    int zeahler = 1;
    while (zeahler <= n) {
      s = "super" + s;
      z = "Z" + z;
      zeahler = zeahler + 1;
    }
    return s + "leckeres " + z + "itroneneis";
  }
}


