
public class MultiSquareSpiral{
  public static void main (String args[]){
    Turtle amy = new Turtle();
    moveUp(amy,-400);
    multiSquare(amy,20,5);
    moveUp(amy,200);
    centerSquare(amy, 20, 5);
    moveUp(amy,400);
    squareSpiral(amy, 20, 20);

  }

  public static void moveUp(Turtle t, double dist){
    t.penup();
    t.forward(dist);
    t.pendown();
  }

  public static void square(Turtle t, double x){
    for (int i = 0; i < 4; i++){
      t.forward(x);
      t.left(90);
    }
  }

  public static void multiSquare(Turtle t, double base, int numSquares){
    for(int i = 0; i < numSquares; i++){
      square(t,(i+1)*base);
    }
  }

  public static void centerSquare(Turtle t, double base, int numSquares){
    for(int i = 0; i < numSquares; i++){
      square(t,(base*(i*2+1)))  ;
      t.penup();
      t.backward(base);
      t.left(90);
      t.backward(base);
      t.right(90);
      t.pendown();
    }
      t.penup();
      t.forward(numSquares*base);
      t.left(90);
      t.forward(numSquares*base);
      t.right(90);
      t.pendown();
  }

  public static void squareSpiral(Turtle t, double base, int numSides){
    for(int i = 0; i < numSides; i++){
      t.forward((i+1)*base);
      t.left(90);
    }
    t.penup();
    backwardSquareSpiral(t,base,numSides);
    t.pendown();
  }

  public static void backwardSquareSpiral(Turtle t, double base, int numSides){
    for(int i = numSides - 1; i >= 0; i--){
      t.right(90);
      t.backward((i+1)*base);
    }
  }

  public static void backwardSquareSpiral2(Turtle t, double base, int numSides){
    for(int i = 0; i < numSides; i++){
      t.right(90);
      t.backward((numSides-i)*base);
    }
  }
}
