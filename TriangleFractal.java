
public class TriangleFractal{
  public static void main (String args[]){
    Turtle bob = new Turtle();
    bob.delay(10);

    //bob.penup();
    //bob.backward(200);
    //bob.pendown();

    triangleFractal(bob,100,0);

    //bob.penup();
    //bob.forward(150);
    //bob.pendown();

    //triangleFractal(bob,100,1);

    //bob.penup();
    //bob.forward(150);
    //bob.pendown();

    //triangleFractal(bob,100,3);
  }

  public static void triangleFractal(Turtle t, double size, int levels){
    if(levels == 0){
      triangle(t,size);
    }
    else{
      triangleFractal(t,size/2,levels-1);

      t.penup();
      t.forward(size/2);
      t.pendown();

      triangleFractal(t,size/2,levels-1);

      t.penup();
      t.left(60);
      t.forward(size/2);
      t.left(60);
      t.pendown();

      triangleFractal(t,size/2,levels-1);

      t.penup();
      t.forward(size/2);
      t.right(60);
      t.backward(size);
      t.right(60);
      t.pendown();
    }
  }

  public static void triangle(Turtle t, double size){
    for(int i = 0; i < 3; i++){
      t.forward(size);
      t.left(120);
    }
  }
}
