
public class Polywheel{
  public static void main (String args[]){
    Turtle bob = new Turtle();
    //given test cases
    polywheel(bob,3,70);
    //polywheel(bob,4,50);
    //polywheel(bob,5,40);
    //polywheel(bob,6,30);
    //polywheel(bob,12,15);

    //two more additional test cases
    //polywheel(bob,20,5);
    //polywheel(bob,8,20);

  }

  //creates a wheel of the same polygon; uses polygon().
  //int numSides defines the number of sides the polygon has, while double length defines the length of each side.
  public static void polywheel(Turtle t, int numSides, double length){
    for(int i = 0; i < numSides; i++){
      polygon(t,numSides,length);
      t.forward(length);
      t.right(360.0/numSides);
    }
  }

  //creates a polygon based off the number of sides in int numSides and the length of each side in double length.
  //helper method for polywheel().
  public static void polygon(Turtle t, int numSides, double length){
    for(int i = 0; i < numSides; i++){
      t.forward(length);
      t.left(360.0/numSides);
    }
  }
}
