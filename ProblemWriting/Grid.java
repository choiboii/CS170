
public class Grid{

  public static void grid(Turtle t, int l, int h, int w){
    for(int j = 0; j < h; j++){
      for(int k = 0; k < l; k++){
        createSquare(t,w);
        t.forward(w);
      }
        t.penup();
        t.backward(w*l);
        t.left(90);
        t.forward(w);
        t.right(90);
        t.pendown();
    }
    t.penup();
    t.right(90);
    t.forward(w*h);
    t.left(90);
    t.pendown();
  }

  public static void createSquare(Turtle t, int s){
    for (int i = 0; i < 4; i++){
      t.forward(s);
      t.left(90);
    }
  }

  public static void main (String args[]){
    Turtle bob = new Turtle();
    grid(bob, 10, 10, 20);
  }
}
