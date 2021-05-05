
public class MultiplicationTable{
  public static void main (String args[]){
    System.out.println(arrayToString(multiTable(12)));
  }

  public static int[][] multiTable(int max){
    int[][] products = new int[max][max];
    for(int i = 0; i < max; i++){
      for(int j = 0; j < max; j++){
        products[i][j] = (i+1)*(j+1);
      }
    }
    return products;
  }

  public static String arrayToString(int[][] x) {
    String result = "[";
    for (int i = 0; i < x.length; i++) {
      for(int j = 0; j < x.length - 1; j++){
        result += x[i][j] + ", ";
      }
      result += x[i][x.length-1] + "]\n";
    }
    return result;
  }
}
