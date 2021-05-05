
public class Garden{
  public static void main (String args[]){
    Turtle erin = new Turtle();
    erin.delay(10);
    garden(erin,6,5,2,50);
  }

  public static void petal(Turtle t, double size){
    for(int i = 0; i < 20; i++){
      t.forward(size/20);
      t.left(360.0/20);
    }
    t.penup();
    t.left(90);
    t.forward(2);
    t.fill();
    t.backward(2);
    t.right(90);
    t.pendown();
  }

  public static void flower(Turtle t, int numPetals, double size, double stem){
    randomColor(t);
    for (int i = 0; i < numPetals; i++){
      petal(t, size);
      t.forward(size/numPetals);
      t.right(360.0/numPetals);
    }
    t.penup();
    t.forward(size/numPetals/2);
    t.right(90);
    t.forward(size/numPetals);
    t.pendown();
    t.color("green");
    t.forward(stem);

    t.penup();
    t.backward(stem);
    t.backward(size/numPetals);
    t.left(90);
    t.backward(size/numPetals/2);
    t.pendown();
  }

  public static void garden(Turtle t, int numPetals, int numColumns, int numRows, double size){
    for(int i = 0; i < numRows; i++){
      for(int j = 0; j < numColumns; j++){
        flower(t,numPetals,size, size);
        t.penup();
        t.forward(size);
        t.pendown();
      }
      t.penup();
      t.backward(size*(numColumns));
      t.right(90);
      t.forward(size*2);
      t.left(90);
      t.pendown();
    }
  }

  public static void randomColor(Turtle t){
    int r = (int)(Math.random()*255);
    int g = (int)(Math.random()*255);
    int b = (int)(Math.random()*255);
    t.color(r,g,b);
  }

}
