
//this is explained a bit more at the sierpinskiTriangle() method, but essentially the structure of this fractal
//is based around a triangle. The triangle then splits into four different triangles, where the outer three are
//filled, and the center triangle is left blank. This is repeated until it creates what is called the Sierpinski
//Triangle.
public class DiscoSierpinski{
  public static void main (String args[]){
    Turtle bob = new Turtle();
    bob.delay(5);
    //sierpinskiTriangle(bob,200,0);
    //sierpinskiTriangle(bob,200,1);
    //sierpinskiTriangle(bob,200,2);
    //sierpinskiTriangle(bob,200,3);
    sierpinskiTriangle(bob,250,4);
  }

  //this method changes the color of the turtle based on the level of recursion that the triangle is in;
  public static void chooseColor(Turtle t, int levels){
    int red, green, blue; //initialize color variables
    if(levels % 3 == 2){//if it is levels % 3 = 2, it will be a random shade of red.
      red = (int)(Math.random()*200 + 55);
      green = 0;
      blue = 0;
    }
    else if(levels % 3 == 1){ //if it is levels % 3 = 1, it will be a random shade of green.
      red = 0;
      green = (int)(Math.random()*200 + 55);
      blue = 0;
    }
    else{ //if it is a multiple of 3, it will be a random shade of blue.
      red = 0;
      green = 0;
      blue = (int)(Math.random()*200 + 55);
    }
    t.color(red,green,blue);
  }

  //this method draws the sierpinski triangle, where it is a fractal based off of the triangle.
  //this uses the chooseColor() method to change the color and make it a "disco themed" siepinski triangle.
  //this also uses the method filledTriangle() as its base case and to fill in the triangles.
  public static void sierpinskiTriangle(Turtle t, double size, int levels){
    if(levels == 0){ //base case
      filledTriangle(t,size);
    }
    else{
      sierpinskiTriangle(t,size/2,levels-1); //recusive call #1
      chooseColor(t,levels); //change color

      t.penup();
      t.forward(size/2); //switch positions to next triangle
      t.pendown();

      sierpinskiTriangle(t,size/2,levels-1); //recusive call #2
      chooseColor(t,levels); //change color

      t.penup();
      t.left(60);
      t.forward(size/2); //switch positions to next triangle
      t.left(60);
      t.pendown();

      sierpinskiTriangle(t,size/2,levels-1); //recusive call #3
      chooseColor(t,levels); //change color

      t.penup();
      t.forward(size/2); //return to initial position
      t.right(60);
      t.backward(size);
      t.right(60);
      t.pendown();
    }
  }

  //this method creates a filled triangle, where double size determines the length of one side.
  //this is an equilateral triangle method.
  public static void filledTriangle(Turtle t, double size){
    for(int i = 0; i < 3; i++){
      t.forward(size);
      t.left(120);
    }
    t.penup(); //fill part of the method
    t.left(30);
    t.forward(5); //assume that the triangle is at least 5 pixels wide
    t.fill();
    t.backward(5);
    t.right(30);
    t.pendown();
  }
}
