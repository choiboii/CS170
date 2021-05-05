
public class DrawTriangleFractal{
  public static void main (String args[]){
    Turtle drew = new Turtle();
    fractalTriangle(drew, 100, 1);
  }

  public static void triangle(Turtle t, double length){
    for(int i = 0; i < 3; i++){
      t.forward(length);
      t.left(120);
    }
  }

  public static void fractalTriangle(Turtle t, double length, int num){
    if(num == 1){
      triangle(t,length);
    }
    else{
      triangle(t,length);
      fractalTriangle(t,length/2,num-1);
      t.forward(length/2);
      t.left(60);
      fractalTriangle(t,length/2,num-1);
      t.forward(length/2);
      t.left(60);
      fractalTriangle(t,length/2,num-1);
      t.forward(length/2);
      t.left(60);
    }
  }
}
