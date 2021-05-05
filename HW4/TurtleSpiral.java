
public class TurtleSpiral{
  public static void main (String args[]){
    Turtle erin = new Turtle();
    //turtleSpiral(erin, 300,10);
    turtleSpiralIter(erin, 300,10);
  }

  //this method creates a square spiral. The parameters double size and double minSize determine the bounds for the
  //spiral. The size determines the length of the first line and the minSize determines the length of the last line.'
  //this is a recursive method.
  public static void turtleSpiral(Turtle t, double size, double minSize){
    if(size < minSize){ //base case; if the size < minSize, draws the minSize line.
      t.forward(minSize);
    }
    else{
      t.forward(size);  //draws the line
      t.right(90);
      turtleSpiral(t,size * .9, minSize); //recursive call; size is decreased by 10%
    }
  }

  //this method creates a square spiral. The parameters double size and double minSize determine the bounds for the
  //spiral. The size determines the length of the first line and the minSize determines the length of the last line.
  //this is an iterative method.
  public static void turtleSpiralIter(Turtle t, double size, double minSize){
    int i = 0;  //sets counting variable
    while(size * Math.pow(.9,i) > minSize){ //while the size is multiplied by a power of 0.9 based on i.
      t.forward(size * Math.pow(.9,i)); //go forwards the size multiplied by power of 0.9 based on i.
      t.right(90);
      i++;
    }
    t.forward(minSize); //last line to account for last line as the while loop skips that iteration.
  }
}
