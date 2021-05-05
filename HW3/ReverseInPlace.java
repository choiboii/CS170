import java.util.Arrays; //import this class to use the toString method.

public class ReverseInPlace{
  public static void main (String args[]){
    int[] test1 = {1,2,3};
    int[] test2 = {1,4,6,8,7,2};

    //testing if the reverse method works for two seperate arrays; before/after test.
    System.out.println(Arrays.toString(test1));
    reverse(test1);
    System.out.println(Arrays.toString(test1));

    System.out.println(Arrays.toString(test2));
    reverse(test2);
    System.out.println(Arrays.toString(test2));
  }

  //this method takes an array and reverses this original array directly
  public static void reverse(int[] x){
    int[] temp = new int[x.length]; //create a new array to store values of int[] x.
    for(int i = 0; i < x.length; i++){
      temp[i] = x[x.length-1-i]; //store the values of x in reverse order in temp
    }
    for(int j = 0; j < x.length; j++){
      x[j] = temp[j]; //then set all the values of x with temp.
    }
  }
}
