
public class Sum{
  public static void main (String args[]){
    System.out.println(sum(8));
  }

  public static int sum(int max){
    if(max == 1){
      return 1;
    }
    else{
      return max + sum(max-1);
    }
  }
}
