public class SquareOfSquares {
 public static void squareOfSquares(Turtle t, double x, int n) {
   for (int i = 0; i < 4; i++) {
      for (int j = 0; j < n; j++) {
          for (int k = 0; k < 4; k++) {
            t.forward(x / (j + 1));
            t.left(90);
          }
          t.forward(x / (j + 1));
        }
        t.right(90);
      }
 }

 public static void main(String[] args) {
   Turtle t = new Turtle();
   squareOfSquares(t, 75, 4);
  }
}
