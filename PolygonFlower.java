
public class PolygonFlower{
  public static void main (String args[]){
    Turtle erin = new Turtle();
    erin.delay(5);
    flower(erin,7,15,30);
  }

  public static void polygon(Turtle t, int numSides, double length){
      for(int i = 0; i < numSides; i++){
        t.forward(length);
        t.left(360.0/numSides);
      }
  }

  public static void petal(Turtle t, int numLayers, double length){
    for(int i = 0; i < numLayers; i++){
      polygon(t,i+3,length);  
    }
  }

  public static void flower(Turtle t, int numPetals, int numLayers, double length){
    for(int i = 0; i < numPetals; i++){
      t.color(randomNumber(),randomNumber(),randomNumber());
      petal(t,numLayers,length);
      t.forward(length);
      t.right(360.0/numPetals);

    }
  }

  public static int randomNumber(){
    int randInt = (int)(Math.random() * 255);
    return randInt;
  }
}
