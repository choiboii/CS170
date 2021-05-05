
public class DrawingTurtle{
  public static void main (String args[]){
    Turtle clara = new Turtle();
    apothemPolygon(clara,6,600);
  }

  public static void apothemPolygon(Turtle t, int numSides, double perimeter){
    for(int i = 0; i < numSides; i++){
      t.forward(perimeter/numSides);
      t.left(360.0/numSides);
    }
    apothem(t,numSides,perimeter);
  }

  public static void apothem(Turtle t, int numSides, double perimeter){
    t.forward(perimeter/(2*numSides));
    t.left(90);
    t.forward(perimeter / (2.0 * numSides) * Math.tan(Math.toRadians(180.0*(numSides-2)/numSides)/2.0));
    t.backward(perimeter / (2.0 * numSides) * Math.tan(Math.toRadians(180.0*(numSides-2)/numSides)/2.0));
    t.right(90);
    t.backward(perimeter/(2*numSides));
  }
}
