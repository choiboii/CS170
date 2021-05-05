import java.util.Arrays; //import this class to use the toString method.

public class ReverseArray{
  public static void main (String args[]){
    System.out.println(Arrays.toString(reverseCopy(new int[]{1,2,3})));
    System.out.println(Arrays.toString(reverseCopy(new int[]{1,4,6,2,3})));
  }

  //this method takes an int array and returns a copy of the int array in reverse order.
  public static int[] reverseCopy(int[] x){
    int[] result = new int[x.length];
    for(int i = x.length-1; i >= 0; i--){ //going in reverse order.
      result[x.length-1-i] = x[i]; //set the values of result with values of x in reverse order
    }
    return result;
  }
}
