
public class Pyramid{
  public static void main (String args[]){
    Turtle t = new Turtle();
    t.delay(10);
    pyramid(t,200,5);
    //pyramid(t,200,10);
    //pyramid(t,300,10);

    //pyramid(t,500,20);
    //pyramid(t,100,7);
  }

  /*creates a pyramid; uses the helper method square()
  /*the parameter base is the length of the total base on the bottom layer of the pyramid.
  /*the parameter levels describes the number of levels of the pyramid.
  */
  public static void pyramid(Turtle t, double base, int levels){
    double length = base/(2*levels-1); //the length of each square
    for(int i = levels; i > 0; i--){
      for(int j = 0; j < (2*i)-1; j++){  //this nested for loop creates all of the squares
        square(t,length);
        t.forward(length);
      }
      t.backward(length*((2*i)-1)); //back to initial position of the row
      t.penup();
      t.left(45);
      t.forward(length*Math.sqrt(2)); //up to next row; multiply for sqrt(2) as it is a diagonal
      t.right(45);
      t.pendown();
    }
    t.penup();    //return to initial position
    t.left(45);
    t.backward(levels*length*Math.sqrt(2));
    t.right(45);
    t.pendown();
  }

  //creates a square; helper method
  //double length is the length of each side of the square.
  public static void square(Turtle t, double length){
    for(int i = 0; i < 4; i++){
      t.forward(length);
      t.left(90);
    }
  }
}
