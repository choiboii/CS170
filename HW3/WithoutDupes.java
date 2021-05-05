import java.util.Arrays; //import this class to use the toString method.

public class WithoutDupes{
  public static void main (String args[]){
    int[] test1 = {1,2,3};
    int[] test2 = {1,1,1,1,2,2,3,3};
    System.out.println(Arrays.toString(withoutDuplicates(test1)));
    System.out.println(Arrays.toString(withoutDuplicates(test2)));
  }

  //this method takes an array of ints, and returns an int array that only contains the unique values of the array.
  //the array returned has no empty terms; its length matches the number of unique terms in the array given.
  public static int[] withoutDuplicates(int[] x){
    int[] unique = new int[x.length]; //create an array for the unique values, don't worry about empty terms yet.
    int count = 0;
    for(int i = 0; i < x.length; i++){
      if(x[i] != 10000){ //if the term isn't some arbitrary value that won't be in the array, that value is unique.
        unique[count++] = x[i];       //(continued in line 22)

        for(int j = i+1; j < x.length; j++){
          if(x[i] == x[j]){
            x[j] = 10000; //then, if there are any other terms equal to that number in the array, change that number
          }               //into the arbitrary value referenced in line 17.
        }
      }
    }

    int result[] = new int[count]; //create one last array with unique values and correct number of terms.
    for(int k = 0; k < count; k++){
      result[k] = unique[k];
    }
    return result;
  }


}
