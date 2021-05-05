
public class RegEx1{
  public static void main (String args[]){
    //yes
    System.out.println(regEx("xxyz"));
    System.out.println(regEx("yxyxyzz"));
    System.out.println(regEx("zxyzz"));
    //no
    System.out.println(regEx("9xyz"));
    System.out.println(regEx("xxyyz"));
    System.out.println(regEx("xyxyzzz"));
  }

  public static boolean regEx(String s){
    return s.matches("^\\D(xy)+z{1,2}");
  }
}
