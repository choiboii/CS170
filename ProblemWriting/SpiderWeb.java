
public class SpiderWeb{
  public static void main (String args[]){
    Turtle charlotte = new Turtle();
    charlotte.delay(10);
    spiderweb(charlotte,10,10,10);
  }

  //creates spiderweb; uses methods slice() and polygon() to create.
  //numSides indicates number of sides of the polygon, while layers describes how many polygons/circles in the web.
  //the parameter size indicates the length of each side of the polygon.
  public static void spiderweb(Turtle t, int numSides, int layers, double size){
    frame(t,numSides,size); //creates the webbing frame.
    double angleToCenter = (180 - 360.0/numSides)/2;  //caluclate angle to go to the center
    for(int i = 0; i < layers; i++){                  //for future use in the method.
      polygon(t,numSides,size*(i+1)); //create polygon in the center; increases in size over iterations
      t.penup();
      t.left(angleToCenter);
      t.backward(size/Math.cos(angleToCenter*Math.PI/180.0)/2); //goes backward relative to center.
      t.right(angleToCenter);
      t.pendown();
    }
    t.penup();
    t.left(angleToCenter);
    t.forward(layers*size/Math.cos(angleToCenter*Math.PI/180.0)/2); //return to initial position
    t.right(angleToCenter);
    t.pendown();
  }

  //creates a polygon based on the number of sides (numSides) and length of each side (size).
  public static void polygon(Turtle t, int numSides, double size){
    for(int i = 0; i < numSides; i++){
      t.forward(size);
      t.left(360.0/numSides);
    }
  }

  //creates the webbing frame of the web.
  //based on parameters numSides and size, this creates a frame in which creates rays going outwards from the
  //center of the web.
  public static void frame(Turtle t, int numSides, double size){
    t.penup();
    double angleToCenter = (180 - 360.0/numSides)/2; //angle that goes towards the center of the web.
    t.left(angleToCenter);
    t.forward(size/Math.cos(angleToCenter*Math.PI/180.0)/2); //distance to the center of the polygons.
    t.right(angleToCenter);
    t.pendown();
    for(int i = 0; i < numSides; i++){  //creates rays outwards .
      t.left(360.0/numSides);
      t.forward(size*numSides*2); //the *2 is a little arbitrary; just to make sure the web is all covered.
      t.backward(size*numSides*2);
    }
    t.penup();
    t.left(angleToCenter);
    t.backward(size/Math.cos(angleToCenter*Math.PI/180.0)/2); //return to initial position.
    t.right(angleToCenter);
    t.pendown();
  }
}
