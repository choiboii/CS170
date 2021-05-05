
public class RegEx2{
  public static void main (String args[]){
    //yes
    System.out.println(regEx("cars 123"));
    System.out.println(regEx("r 16"));
    System.out.println(regEx("mast 0"));
    //no
    System.out.println(regEx("catch 22"));
    System.out.println(regEx("Sink 1"));
    System.out.println(regEx("nice-1"));
    System.out.println(regEx("true"));
  }

  public static boolean regEx(String s){
    return s.matches("^[a-z]\\w{0,3}\\s\\d+");
  }
}
