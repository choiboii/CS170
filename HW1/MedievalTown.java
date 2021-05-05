
public class MedievalTown{
  public static void main (String args[]){

    //grid to test out the dimensions of the product
    Turtle test = new Turtle();
    test.delay(1);
    move(test,-200,-170);
    test.color(216,216,216);
    grid(test,61,37,10);
    
    Turtle jake = new Turtle();
    jake.penup();
    jake.backward(200); //just to set space aside to create the drawing
    jake.pendown();
    jake.delay(5);  //speed up draw time

    move(jake,50,160);  //create stars
    star(jake,20);
    move(jake,40,-40);
    star(jake,20);
    move(jake,40,40);
    star(jake,20);
    move(jake,80,30);
    star(jake,20);
    move(jake,40,-70);
    star(jake,20);
    move(jake,130,50);
    star(jake,20);
    move(jake,60,-60);
    star(jake,20);
    move(jake,80,50);
    star(jake,20);

    move(jake,-520,-150);         //create mountains
    mountain(jake,80,40,160,60);
    move(jake,180,40);
    mountain(jake,80,40,160,60);
    move(jake,210,-20);
    mountain(jake,80,40,160,60);

    move(jake,120,-150);          //create trees
    rowOfTrees(jake,40,10*Math.sqrt(2),10,4,30); //the branch length is a diagonal of a square, so x*sqrt(2).

    move(jake,-40,-40);
    rowOfTrees(jake,40,10*Math.sqrt(2),10,4,30);

    move(jake,-340,20);         //create walls
    wall(jake,10, 5, 8, 7);

    move(jake,120,0);
    wall(jake,10, 5, 8, 7);

    move(jake,80,0);              //create towers
    tower(jake,50,100,20,10,10,5);

    move(jake,-250,0);
    tower(jake,50,100,20,10,10,5);

    move(jake,130,0);             //create arches
    arch(jake,10,30,20,10);

    move(jake,180,30);
    arch(jake,10,30,20,10);

    move(jake,40,20);
    arch(jake,10,30,20,10);

    move(jake,40,20);
    arch(jake,10,30,20,10);

  }


  // creates a star; starting position is the center of the star, the size determines the diameter of the star.
  public static void star(Turtle t, double size){
    //for each leg of the star
    for(int i = 0; i < 8; i++){
      t.forward(size/2);
      t.backward(size/2);
      t.left(45);
    }
  }


  /* creates a mountain; starting position is on the far left. the peak determines the height of the mountain,
  /* trough determines the bottom of the mountain. x1 refers to the first x where the peak is horizontally,
  /* x2 is where it ends horizontally as well.
  */
  public static void mountain(Turtle t, double peak, double trough, double x1, double x2){
    uphill(t,peak,x1);
    //since the uphill() method leaves us at the peak, the downhill method has to go to the trough + peak
    downhill(t,trough+peak,x2);
    move(t,-(x2+x1),trough); //return to initial position
  }

  //helper method for mountain(). draws the uphill slope, parameters are described in the mountain method comment.
  //this method leaves the turtle at the ending position, which works in tandem with the downhill() method.
  public static void uphill(Turtle t, double peak, double x1){
    double angle = Math.atan(peak/x1)*180/Math.PI;
    double length = Math.sqrt(Math.pow(peak,2)+Math.pow(x1,2)); //pythagorean theorem
    t.left(angle);
    t.forward(length);
    t.right(angle);
  }

  //helper method for mountain(). draws the downhill slope, parameters are described in the mountain method comment.
  //this method leaves the turtle at the ending position.
  public static void downhill(Turtle t, double trough, double x2){
    double angle = (Math.atan(trough/x2))*180/Math.PI;
    double length = Math.sqrt(Math.pow(trough,2)+Math.pow(x2,2));
    t.right(angle);
    t.forward(length);
    t.left(angle);
  }


  //creates a row of trees; some of the parameters are already described in the tree method.
  //numTrees refers to the number of trees in the row, while space denotes the space between each tree in the row.
  public static void rowOfTrees(Turtle t, double trunk, double branch, int numBranches, int numTrees, double space){
    for(int i = 0; i < numTrees; i++){
      tree(t,trunk,branch,numBranches);
      move(t,space,0);
    }
    move(t,-space*numTrees,0); //return to inital position
  }

  /*creates a tree; trunk determines the length of the trunk, leaves determines the length of one branch, while
  /*numBranches determines the number of each individual branch.
  /*the initial position of the tree is at the root of the trunk.
  */
  public static void tree(Turtle t, double trunk, double branch, int numBranches){
    t.left(90);
    t.forward(trunk);
    t.right(90);
    for(int i = 0; i < numBranches/2; i++){ //numBranches/2 as branches come in pairs
      t.right(45);
      t.forward(branch);
      t.backward(branch);
      t.right(90);
      t.forward(branch);
      t.backward(branch);
      t.left(45);
      t.forward(5);
      t.left(90);
    }
    move(t,0,-(trunk-(5*numBranches/2)));
  }

  /*creates a wall; the double length and height refer to the indiviual height and length of a brick.
  /*int numLayers refers to the amount of layers that the wall has, while the numBricks refers to the number of
  /*bricks in each row.
  /*initial position is at the bottom-left corner.
  */
  public static void wall(Turtle t, double length, double height, int numBricks, int numLayers){
    for(int i = 0; i < numLayers; i++){
      if((i+1) % 2 == 1){
        brickRow(t,length,height,numBricks);
      }
      else if((i+1) % 2 == 0){
        halfBrickRow(t,length,height,numBricks);
      }
      move(t,0,height);
    }
    move(t,0,-(height*numLayers));
  }

  //creates a row that contains half bricks at the ends. this is always placed on the even numbered layers.
  public static void halfBrickRow(Turtle t, double length, double height, int numBricks){
    brick(t,length/2,height);
    t.forward(length/2);
    for(int i = 0; i < numBricks - 1; i++){ //numBricks - 1 as the two halfBricks add up to one missing brick length.
      brick(t,length,height);
      t.forward(length);
    }
    brick(t,length/2,height);
    t.forward(length/2);
    move(t,-(length*numBricks),0);
  }

  //creates a row that only contains full bricks. this is always placed on the odd numbered layers.
  public static void brickRow(Turtle t, double length, double height, int numBricks){
    for(int i = 0; i < numBricks; i++){
      brick(t,length,height);
      t.forward(length);
    }
    move(t,-(length*numBricks),0);
  }

  //creates a brick, helper method for the wall method. the brick's length and height are defined by parameters
  //length and height, respectively.
  public static void brick(Turtle t, double length, double height){
    for(int i = 0; i < 2; i++){
      t.forward(length);
      t.left(90);
      t.forward(height);
      t.left(90);
    }
  }

  /*create a tower; this uses methods base(), top(), and window() to create the entirety of it all.
  /*the parameter length and height refer to the overall dimensions of the rectanular base.
  /*parameters x and y refer to the relative coordinates from the corner of the rectangular base to the slant line.
  /*for more info on parameters x and y, see the comment description above the method base().
  /*the parameter width in this case refers to the width of both the windows and also the small pillars/teeth on the
  /*top of the tower. the last parameter, numColumns, refers to the number of the small pillars/teeth on the top.
  */
  public static void tower(Turtle t, double length, double height, double x, double y, double width, int numColumns){
    base(t,length,height,x,y);
    move(t,-x,height+y);
    top(t,width,numColumns);
    move(t,x+width,-(y+width+height/2));
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 2; j++){
        window(t,width);
        move(t,width*2,0);
      }
      move(t,-width*4,width*2);
    }
    move(t,-width,-10*width);
  }

  //creates a window (square); width refers to the width of the window.
  public static void window(Turtle t, double width){
    for(int i = 0; i < 4; i++){
      t.forward(width);
      t.left(90);
    }
  }

  /*creates the base of the tower; this includes both the bottom and also the slant lines connecting to the top.
  /*the length refers to the length of the base, while the height controls how tall it is
  /*the x and y refer to the relative coordinates from the corner of the rectangular base and the end of the slant
  /*line. important thing to notice is that the lengths x, y, and the slant line produce a right triangle.
  */
  public static void base(Turtle t, double length, double height, double x, double y){

    t.left(90);       //first half of the base
    t.forward(height);
    double angle = 90 - (Math.atan(y/x))*180/Math.PI;
    double diagonal = Math.sqrt(Math.pow(x,2)+Math.pow(y,2)); //both angles and diagonals work for both sides as the
    t.left(angle);                                            //tower is symmetrical
    t.forward(diagonal);

    t.right(angle+90);    //return to initial position
    move(t,x,-(y+height));

    t.forward(length);    //other half of the base
    t.left(90);
    t.forward(height);
    t.right(angle);
    t.forward(diagonal);

    t.right(90-angle);
    move(t,-(x+length),-(y+height)); //return to initial position

  }

  //creates the top of the tower; the width determines the overall width of the small pillars/teeth at the top
  //the parameter numColumns controls the number of small pillars/teeth that are on the top of the tower.
  public static void top(Turtle t, double width, int numColumns){
    t.left(90);
    t.forward(width);
    for(int j = 0; j < 3; j++){
      t.forward(width);
      t.right(90);
    }
    for(int i = 0; i < numColumns-1; i++){
      t.backward(width);
      t.right(90);
      for(int j = 0; j < 3; j++){
        t.forward(width);
        t.right(90);
      }
    }
    t.left(90);
    t.forward(width);
    t.left(90);
    move(t,-((2*numColumns-1)*width),0);
  }

  /*create an arch; this uses the methods pillar() and semiCircle().
  /*the width and height refer to the rectangular dimensions of the pillars.
  /*the parameters r1 and r2 where r1 > r2 refer to the radii of the semicircles used to construct the arch.
  */
  public static void arch(Turtle t, double width, double height, double r1, double r2){
    pillar(t,width,height);
    move(t,0,height);
    semiCircle(t,r1);
    move(t,width,0);
    semiCircle(t,r2);
    move(t,2*r2,-height);
    pillar(t,width,height);
    move(t,-(r2+width),0);
  }

  //create a pillar; helper method for arch().
  //the width determines the base of the pillar while the height controls how high it goes up
  public static void pillar(Turtle t, double width, double height){
    t.left(90);
    t.forward(height);
    t.backward(height);
    t.right(90);
    t.forward(width);
    t.left(90);
    t.forward(height);
    t.right(90);
    move(t,-width,-height);
  }

  //create a semicircle; helper method for arch()
  //based on given radius r, create a semicircle.
  public static void semiCircle(Turtle t, double r){
    t.left(90);
    for(int i = 0; i < 180; i++){
      t.forward(Math.PI*r/180);
      t.right(1);
    }
    t.left(90);
    move(t,-2*r,0);
  }

  /*this method is a general helper method in which shifts the turtle from its initial position forwards in the
  /*horizontal direction x and vertical direction y.
  /*the turtle must be in the default position, where it is faced right, completely horizontal.
  */
  public static void move(Turtle t, double x, double y){
    t.penup();
    t.forward(x);
    t.left(90);
    t.forward(y);
    t.right(90);
    t.pendown();
  }


  //===============================================================================================================//

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
}
