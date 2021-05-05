
public class OrderedWord{
  public static void main (String args[]){
    //these should print (in order): true, true, false , false ,true.
    System.out.println(isOrdered("Aaabbbyyyy"));
    System.out.println(isOrdered("eFfFoRttT"));
    System.out.println(isOrdered("Ellie"));
    System.out.println(isOrdered("HellLoo"));
    System.out.println(isOrdered("effort"));
  }

  //this method takes a String s and returns true if the string's characters are sorted in alphabetical order.
  //otherwise, it returns false.
  public static boolean isOrdered(String s){
    String word = s.toLowerCase();  //normalize the string to either lowercase or uppercase.
    boolean isOrdered = true; //default is true; if one character is out of order, it automatically becomes false.
    int i = 1; //start at i = 1 to compare two characters each time.
    while(i < word.length()){
      if(word.charAt(i) < word.charAt(i-1)){ //if the character in front is less than the one behind it, return false.
        isOrdered = false;
      }
      i++;
    }
    return isOrdered;
  }
}
