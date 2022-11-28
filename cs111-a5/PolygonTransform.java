/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author:
 *
 *************************************************************************/

public class PolygonTransform {


  // Returns a new array that is an exact copy of the given array.
  // The given array is not mutated.
  public static double[] copy(double[] array) {
        double [] aw = new double [array.length];
        for (int i = 0; i < array.length; i++) {
            aw[i] = array[i];
        }

        return aw;
  }

  // Scales the given polygon by the factor alpha.
  public static void scale(double[] x, double[] y, double alpha) {
    for (int i = 0; i < x.length; i++) {
      x[i] = x[i] * alpha;
    }

    for (int j = 0; j < x.length; j++) {
      y[j] = y[j] * alpha;
    }
  }

  // Translates the given polygon by (dx, dy).
  public static void translate(double[] x, double[] y, double dx, double dy) {
    for (int i = 0; i < x.length; i++) {
      x[i] = x[i] + dx;
    }

    for (int j = 0; j < x.length; j++) {
      y[j] = y[j] + dy;
    }
  }

  // Rotates the given polygon theta degrees counterclockwise, about the origin.
  public static void rotate(double[] x, double[] y, double theta) {
    double[] xx = new double[y.length];
    xx = copy(y);
    double a = 0;

    theta = Math.toRadians(theta);

    for (int j = 0; j < x.length; j++) {
      a = x[j];
      x[j] = x[j] * Math.cos(theta) - y[j] * Math.sin(theta);
      y[j] = y[j] * Math.cos(theta) + x[j] * Math.sin(theta);
      

  }
  }

  // Tests each of the API methods by directly calling them.
  public static void main(String[] args) {


  }
}
