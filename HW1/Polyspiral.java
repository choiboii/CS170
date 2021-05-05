
public class Polyspiral{
  public static void main (String args[]){
    Turtle bob = new Turtle();
    bob.delay(5);
    //given test cases
    polyspiral(bob,3,20,5);
    //polyspiral(bob,5,10,4);
    //polyspiral(bob,8,5,3);

    //three different test cases
    //polyspiral(bob,20,1,4);
    //polyspiral(bob,4,30,3);
    //polyspiral(bob,6,5,7);
  }

  /*creates a spiral in the shape of a polygon
  /*the parameter n determines the number of sides of the polygon
  /*the paraeter base determines the size of the smallest side of the spiral
  /*the parameter rounds determines the number of revolutions of the spiral
  */
  public static void polyspiral(Turtle t, int n, double base, int rounds){
    double interiorAngle = 180.0*(n-2)/n; // gives interior angle;
    double centralAngle = 180.0 - interiorAngle; //180 - the interior angle gives the central angle of the polygon
    int count = 0; //this variable helps to count the number of times the turtle travels
    for(int i = 0; i < rounds; i++){
      for(int j = 0; j < n; j++){
        t.forward(base*(count+1));
        t.right(centralAngle);
        count++; //increase the count by one so t.forward() method in line 21 works
      }
    }
    t.penup();
    t.forward(base*count/2);
    t.right(90);
    t.forward(base*count/2*Math.tan(interiorAngle/2*Math.PI/180));  //calculated when drawing a triangle between
    t.left(90);                                                     //the center, one vertice, and the half point of
    t.pendown();                                                    //the corresponding edge of the polygon.
  }
}
