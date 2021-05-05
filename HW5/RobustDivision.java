
public class RobustDivision{
  public static void main (String args[]){
    int[] test = {2,4,6,0,8,16};
    System.out.println(sumOfIntegerDiv(test, 3));
    System.out.println(sumOfIntegerDiv(test, 5));
  }

  /* this method takes an array of integers and returns the sum of the divisions of the index values up to the
  /* index value at int n. the divisions conducted are each elements by the preceding element.
  /* this method also catches certain exceptions and returns print statements notifying the user of the error
  /* then, it skips the operation and keeps going on until the method is finished.
  */
  public static int sumOfIntegerDiv(int[] a, int n){
    int result = 0;
    for(int i = 0; i < n; i++){
      try{
        result += a[i+1]/a[i];
      }
      catch (ArithmeticException e){
        System.out.println("Cannot divide by zero. Skipping index: " + (i+1));
      }
      catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Cannot access array at index: " + (i+1));
        return result;
      }
      catch (Exception e){
        System.out.println("Something went wrong! Skipping index: " + (i+1));
      }
    }
    return result;
  }
}
