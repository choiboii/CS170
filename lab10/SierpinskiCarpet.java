
public class SierpinskiCarpet{
  public static void main (String args[]){
    Turtle t = new Turtle();
    t.delay(5);
    sierpinskiCarpet(t,250,3);
  }

  public static void sierpinskiCarpet(Turtle t, double size, int level){
    int red = (int)(255 * Math.random());
    int blue = (int)(255 * Math.random());
    int green = (int)(255 * Math.random());
    t.color(red,green,blue);
    if(level == 0){
      square(t,size);
    }
    else{
      for(int i = 0; i < 4; i++){
        for(int j = 0; j < 3; j++){
          sierpinskiCarpet(t,size/5,level-1);
          t.penup();
          t.forward(2*size/5);
          t.pendown();
        }
        t.penup();
        t.backward(size/5);
        t.left(90);
        t.pendown();
      }
    }
  }

  public static void square(Turtle t, double size){
    for(int i = 0; i < 4; i++){
      t.forward(size);
      t.left(90);
    }
    t.left(45);
    t.penup();
    t.forward(size/2);
    t.fill();
    t.backward(size/2);
    t.pendown();
    t.right(45);
  }
}
