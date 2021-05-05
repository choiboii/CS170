
public class Houseline{
  public static void main (String args[]){
    Turtle dad = new Turtle();
    dad.delay(10);
    //given test case
    //houseline(dad, 20);

    //more test cases
    //houseline(dad,10);
    houseline(dad,1);
  }

  //draws a line of houses; uses the method house() in the for loop.
  //the parameter numHouses describes the amount of houses that will be drawn in a line.
  public static void houseline(Turtle t, int numHouses){
    for(int i = 1; i <= numHouses; i++){
      house(t,i);
      t.penup();
      t.forward(100/i); //the distance that the turtle needs to travel to seperate itself from other houses decreases.
      t.pendown();
    }
    t.penup();
    for(int j = numHouses; j >= 1; j--){ //return to initial position by retracing the turtle's steps.
      t.backward(100/j);
    }
    t.pendown();
  }

//==================================================================================================================//

  /*in general, the house method and each of the other methods used in the creation of this house were hard coded
  /*previously, so it was necessary to add an additional parameter ratio to be able to manipulate the dimensions of
  /*the house effectively. in this case, the parameter double ratio is added to every method below.
  /*the parameter double ratio is attached to every t.forward or t.backward statement, where it divides the current
  /*static value by the ratio.
  */
  public static void house(Turtle t, double ratio) {
    front(t,ratio);
    t.left(90);
    t.forward(80/ratio);
    t.right(90);
    top(t,ratio);
    t.left(90);
    t.backward(80/ratio);
    t.right(90);
  }

  public static void front(Turtle t, double ratio) {
    walls(t,ratio);
    t.forward(30/ratio);
    door(t,ratio);
    t.penup();
    t.left(90);
    t.forward(50/ratio);
    t.right(90);
    t.backward(20/ratio);
    t.pendown();
    windows(t,ratio);
    t.penup();
    t.backward(10/ratio);
    t.left(90);
    t.backward(50/ratio);
    t.right(90);
    t.pendown();
  }

  public static void top(Turtle t, double ratio) {
    roof(t,ratio);
    t.penup();
    t.forward(10/ratio);
    t.left(90);
    t.forward(10/ratio);
    t.right(90);
    t.pendown();
    chimney(t,ratio);
    t.penup();
    t.backward(10/ratio);
    t.right(90);
    t.forward(10/ratio);
    t.left(90);
    t.pendown();
  }

  public static void walls(Turtle t, double ratio) {
    square(t, 80/ratio);
  }

  public static void windows(Turtle t, double ratio) {
    square(t, 20/ratio);
    t.penup();
    t.forward(40/ratio);
    t.pendown();
    square(t, 20/ratio);
    t.penup();
    t.backward(40/ratio);
    t.pendown();
  }

  public static void door(Turtle t, double ratio) {
    for (int i = 0; i < 2; i++) {
      t.forward(20/ratio);
      t.left(90);
      t.forward(30/ratio);
      t.left(90);
    }
  }

  public static void roof(Turtle t, double ratio) {
    t.forward(80/ratio);
    t.left(135);
    t.forward(40/ratio * Math.sqrt(2));
    t.left(90);
    t.forward(40/ratio * Math.sqrt(2));
    t.left(135);
  }

  public static void chimney(Turtle t, double ratio) {
    t.left(90);
    t.forward(20/ratio);
    t.right(90);
    t.forward(10/ratio);
    t.right(90);
    t.forward(10/ratio);
    t.backward(10/ratio);
    t.left(90);
    t.backward(10/ratio);
    t.left(90);
    t.backward(20/ratio);
    t.right(90);
  }

  public static void square(Turtle t, double x) {
    for (int i = 0; i < 4; i++) {
      t.forward(x);
      t.left(90);
    }
  }
}
