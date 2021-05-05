
public class AverageLength{
  public static void main (String args[]){
    System.out.println(avgLength(new String[]{"Hello","Q"}));
    System.out.println(avgLength(new String[]{}));
    System.out.println(avgLength(new String[]{"Hello","Goodbye"}));
  }

  //this method takes a String array and returns the average number of letters per word.
  //this also accounts for empty strings, where there are no values in the array itself or if there are empty strings.
  public static double avgLength(String[] x){
    double sum = 0.0;
    if(x.length == 0){ //if the array is empty, return 0.0, as it is not possible to divide by 0.0
      return 0.0;
    }
    for(int i = 0; i < x.length; i++){
      sum += x[i].length(); //add up all the lengths of the words
    }
    double average = sum/x.length; //divide by the number of terms in the array.
    return average;
  }
}
