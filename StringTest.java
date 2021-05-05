
public class StringTest{
  public static void main (String args[]){
    String brush = "pencil";
    String pencil = "marker";
    int marker = 3;

    System.out.println(("" + pencil.charAt(2) + brush.substring(marker)).substring(1,3));
  }
}
