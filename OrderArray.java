
public class OrderArray{
  public static void main (String args[]){
    int[] test = {4,3,2,1};
    System.out.println(toPrint(test));
    orderArray(test);
    System.out.println(toPrint(test));
  }

  public static int[] orderArray(int[] numbers){
    int[] result = new int[numbers.length];
    int temp;
    for(int j = 0; j < numbers.length;j++){
      for(int i = 0; i < numbers.length-1; i++){
        if(numbers[i] > numbers[i+1]){
          temp = numbers[i+1];
          numbers[i+1] = numbers[i];
          numbers[i] = temp;
        }
      }
    }
    return result;
  }

  public static String toPrint(int[] list){
    String result = "[";
    for(int i = 0; i < list.length-1; i++){
      result += list[i] + ", ";
    }
    result += list[list.length-1] + "]";
    return result;
  }
}
