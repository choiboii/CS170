
public class FractalFlowers{
  public static void main (String args[]){
    Turtle t = new Turtle();
    t.delay(1);
    t.penup();
    t.backward(250);
    t.pendown();
    fractalFlower(t,200,1);
    t.penup();
    t.forward(250);
    t.pendown();
    fractalFlower(t,250,3);
    t.penup();
    t.forward(250);
    t.pendown();
    fractalFlower(t,300,4);
  }

  //creates a simpler flower with 8 different lines extending from a base line. The base line length is determined by
  //the parameter size, and the smaller lines are size / 3.0.
  public static void simpleFlower(Turtle t, double size){
    t.left(90);
    t.forward(size*2.0/3.0); //base line goes to the center of the petals
    t.right(135);
    for(int i = 0; i < 7; i++){ //draws 7 smaller lines for the petals.
      t.forward(size/3.0); //draws petal lines
      t.backward(size/3.0);
      t.left(45);
    }
    t.forward(size*2.0/3.0);  //return to initial position.
    t.left(90);
  }

  //draws a fractal of the shape similar to the simpleFlower() method. size determines the length of the largest flower
  //the parameter int level determines the level of recursion; level == 1 is the base case.
  //the size of each flower decreases by a factor of 3.
  public static void fractalFlower(Turtle t, double size, int level){
    if(level == 1){ //base case
      simpleFlower(t,size);
    }
    else{
      t.left(90); //base line
      t.forward(size*2.0/3.0);
      t.right(180);
      for(int i = 0; i < 8; i++){
        fractalFlower(t,size/3.0,level-1); //recursive call within the petals
        t.left(45);
      }
      t.forward(size*2.0/3.0); //return to initial position.
      t.left(90);
    }
  }
}
