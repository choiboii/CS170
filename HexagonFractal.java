
public class HexagonFractal{
  public static void main (String args[]){
    Turtle bob = new Turtle();
    bob.delay(5);
    bob.penup();
    bob.backward(400);
    bob.pendown();
    hexagonFractal(bob,100,0);
    bob.penup();
    bob.forward(250);
    bob.pendown();
    hexagonFractal(bob,100,1);
    bob.penup();
    bob.forward(250);
    bob.pendown();
    hexagonFractal(bob,100,3);
  }

  public static void hexagonFractal(Turtle t, double size, int levels){
    if(levels == 0){
      hexagon(t,size);
    }
    else{
      for(int i = 0; i < 3; i++){
        hexagonFractal(t,size/3,levels-1);

        t.penup();
        t.forward(2*size/3);
        t.pendown();

        hexagonFractal(t,size/3,levels-1);

        t.penup();
        t.forward(size/3);
        t.left(60);
        t.forward(size);
        t.left(60);
        t.pendown();
      }

    }
  }

  public static void hexagon(Turtle t, double size){
    for(int i = 0; i < 6; i++){
      t.forward(size);
      t.left(60);
    }
  }
}
