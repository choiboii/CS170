
public class Reverse{
  public static void main (String args[]){
    System.out.println(isReverse("happy","yppah"));
    System.out.println(isReverse("cool","loac"));
    System.out.println(isReverse("",""));
  }

  //this method compares two strings using recursion, and if the two strings are not reverses of each other, then
  //it returns false. otherwise, it returns true.
  public static boolean isReverse(String s1, String s2){
    if(s1.length() == 0 && s2.length() == 0){ //if the strings are both empty then return true.
      return true;
    }
    else if(s1.charAt(0) != s2.charAt(s2.length()-1)){ //compares the first character of s1 and last of s2
      return false; //if unequal, return false.
    }
    else{
      return isReverse(s1.substring(1,s1.length()),s2.substring(0,s2.length()-1));  //recursive call; compares the
    }                                                    //substring of the strings with characters compared taken out.
  }
}
