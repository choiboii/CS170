
public class Multistar{
  public static void main (String args[]){
    Turtle bob = new Turtle();
    bob.delay(10); //speed up drawing process
    //given test cases
    multistar(bob,7,100);
    //multistar(bob,10,70);
    //multistar(bob,25,120);

    //two more additional test cases
    //multistar(bob,6,50);
    //multistar(bob,5,200);
  }

  //create a multistar; this method uses star() within so it makes a star at the tip of each ray of the main star.
  //int n defines the amount of rays, while double length determines the length of each ray of the main star.
  //the length of the smaller stars are all length/4.
  public static void multistar(Turtle t, int n, double length){
    for(int i = 0; i < n; i++){
      t.forward(length);
      star(t,n,length/4);
      t.backward(length);
      t.right(360.0/n);
    }
  }

  //creates a star. int n defines the amount of rays, while double length determines the length of each ray.
  public static void star(Turtle t, int n, double length){
    for(int i = 0; i < n; i++){
      t.forward(length);
      t.backward(length);
      t.right(360.0/n);
    }
  }
}
