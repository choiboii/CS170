
public class L337Changer{
  public static void main (String args[]){
    String text1 = "Hey guys! How are you all doing today?";
    String text2 = "I can't believe you just did that!";
    System.out.println(text1);
    System.out.println(replaceWithNumbers(text1));
    System.out.println(text2);
    System.out.println(replaceWithNumbers(text2));
  }

  public static String replaceWithNumbers(String s){
    String result = "";
    for(int i = 0; i < s.length(); i++){
      if((s.substring(i,i+1)).matches("[iIlL]")){
        result += "1";
      }
      else if((s.substring(i,i+1)).matches("[eE]")){
        result += "3";
      }
      else if((s.substring(i,i+1)).matches("[aA]")){
        result += "4";
      }
      else if((s.substring(i,i+1)).matches("[sS]")){
        result += "5";
      }
      else if((s.substring(i,i+1)).matches("[Tt]")){
        result += "7";
      }
      else if((s.substring(i,i+1)).matches("[oO]")){
        result += "0";
      }
      else{
        result += s.substring(i,i+1);
      }
    }
    return result;
  }
}
