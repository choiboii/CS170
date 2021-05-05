
public class PigLatin{

  public static String pigLatin(String word){
    String w = word;
    w += word.substring(0,1);
    w += "ay";
    return w;
  }

  public static void main (String args[]){
    System.out.println(pigLatin("slot"));
  }
}
