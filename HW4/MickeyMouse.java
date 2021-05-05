
public class MickeyMouse{
  public static void main (String args[]){
    Turtle mickey = new Turtle();
    mickey.delay(1);
    //fractalMickeyMouse(mickey,150,0);
    //fractalMickeyMouse(mickey,150,3);
    fractalMickeyMouse(mickey,150,6);
  }

  //draws a face based on the parameter double r. the initial and final position is the center of the circle.
  //the eyes and nose are also circles, which are arbitrary in length/size.
  //the smile is a semicircle that is parallel to the face's outline.
  public static void mickeyFace(Turtle t, double r){
    //main outline of face
    t.penup();
    t.right(90);
    t.forward(r);
    t.left(90);
    t.pendown();
    for(int i = 0; i < 360; i++){ //approximation of the circle.
      t.forward(Math.PI*r/180.0);
      t.left(1);
    }
    t.penup();
    t.right(90);
    t.backward(r);
    t.left(90);

    t.left(30);
    t.forward(r/3);
    t.right(30);
    t.pendown();
    //eyes
    for(int j = 0; j < 360; j++){ //r = r/6
      t.forward(Math.PI*r/1080.0);
      t.left(1);
    }

    t.penup();
    t.left(90);
    t.forward(1);
    t.fill();
    t.backward(1);
    t.right(60);
    t.backward(r/3);
    t.right(60);
    t.backward(r/3);
    t.left(30);
    t.pendown();
    for(int k = 0; k < 360; k++){
      t.forward(Math.PI*r/1080.0); //r = r/6
      t.left(1);
    }
    t.penup();
    t.left(90);
    t.forward(1);
    t.fill();
    t.backward(1);
    t.right(120);
    t.forward(r/3);
    t.left(30);

    t.right(90);
    t.forward(r/4);
    t.left(90);
    t.pendown();
    for(int k = 0; k < 360; k++){
      t.forward(Math.PI*r/1260.0); //r = r/7
      t.left(1);
    }
    t.penup();
    t.left(90);
    t.forward(1);
    t.fill();
    t.forward(r/4-1);
    t.right(90);

    //smile
    t.forward(r*0.8);
    t.right(90);
    for(int m = 0; m < 180; m++){
      if(m <= 15 || m >= 165){  //since it is not a perfect semicircle (ends are missing), account for that by making
        t.penup();              //the ends transparent (at least from 15 < angle < 165.)
      }
      else{
        t.pendown();
      }
      t.forward(Math.PI*r*0.8/180.0);
      t.right(1);
    }
    t.penup();
    t.right(90);
    t.forward(r*0.8);
    t.pendown();
  }

  //draws a fractal based on the method mickeyFace(). this is a recursive method that uses the parameter int level to
  //determine the recursion levels. double r determines the radius of the first and largest circle.
  //the ears' radii are 1/2 of the face.
  public static void fractalMickeyMouse(Turtle t, double r, int level){
    if(level == 0){ //base case
      mickeyFace(t,r);
    }
    else{
      mickeyFace(t,r); //draw initial circle.
      t.left(45);
      t.penup();
      t.forward(r*1.5); //move to right side
      t.pendown();
      t.right(45);
      fractalMickeyMouse(t,r/2,level-1); //recusive call #1
      t.left(45);
      t.penup();
      t.backward(r*1.5); //go towards the left side
      t.right(90);
      t.backward(r*1.5);
      t.pendown();
      t.left(45);
      fractalMickeyMouse(t,r/2,level-1); //recursive call #2
      t.right(45);
      t.penup();
      t.forward(r*1.5); //return to the initial position of the previous circle.
      t.pendown();
      t.left(45);
    }
  }
}
