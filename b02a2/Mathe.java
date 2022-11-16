/*
 * @author amuel12s
 */
public class Mathe {

  public static int abs(int n) {
    if (n < 0) {
      n = n * -1;
      return n;
    } else {
      return n;
    }
  }

  public static int max3(int x, int y, int z) {
    if (x > y & x > z) {
      return x;
    } else if (y > z) {
      return y;
    } else {
      return z;
    }
  }
}
