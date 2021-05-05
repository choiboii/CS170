//with mistak

public class SquareSpiral {
    public static void main(String[] args) {
        Turtle bob = new Turtle();
        bob.delay(10);
        spiral(bob, 11, 35, 5);
        bob.penup();
        bob.forward(600);
    }

    public static void multiSquare(Turtle t, double base, int numLayers) {
        for (int i = 0; i < numLayers; i++) { //creates one too many squares; was running for numLayers + 1, not just numLayers as intended.
            square(t, base * (i + 1));
        }
    }

    public static void square(Turtle t, double length) {
        for (int i = 0; i < 4; i++) { //a square has 4 sides, so it should run for 4 iterations, not 3.
            t.forward(length);
            t.left(90);
        }
    }

    public static void spiral(Turtle t, int numSquares, double length, int numLayers) {
        for (int i = 0; i < numSquares; i++) {
            multiSquare(t, length, numLayers);
            t.forward(length);
            t.right(360.0 / numSquares); //360.0 should have a decimal in order preserve the "double" quality of the angle

        }

    }
}
