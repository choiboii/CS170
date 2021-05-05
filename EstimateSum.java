
public class EstimateSum{
  public static void main (String args[]){
    int[] sumTest = {14,5,2,6,8,4,2,16};
    System.out.println(actualSum(sumTest));
    System.out.println(estimateSum(sumTest));
  }

  public static double actualSum(int[] numberList){
    double result = 0;
    for(int i = 0; i < numberList.length; i++){
      result += numberList[i];
    }
    return result;
  }

  public static double estimateSum(int[] numberList){
    int max, min;
    double result;
    max = maxValue(numberList);
    min = minValue(numberList);
    result = (max + min) * numberList.length/2.0;
    return result;
  }

  public static int maxValue(int[] numberList){
    int max = numberList[0];
    for(int i = 1; i < numberList.length; i++){
      if(max > numberList[i]){
        max = numberList[i];
      }
    }
    return max;
  }

  public static int minValue(int[] numberList){
    int min = numberList[0];
    for(int i = 1; i < numberList.length; i++){
      if(min < numberList[i]){
        min = numberList[i];
      }
    }
    return min;
  }
}
