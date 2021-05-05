
public class LetterCount{
  public static void main (String args[]){
    //this should return 2, 0, 1, 0.
    System.out.println(letterCount("abc 123 abc-ABC","a"));
    System.out.println(letterCount("This is getting interesting!","z"));
    System.out.println(letterCount("Thiz is getting interesting!","z"));
    System.out.println(letterCount("","h"));
  }

  //this methods counts the number of times the String c (which is a letter) appears in String s.
  //String s can be of any length (it can be empty, be one letter long, or be an entire sentence).
  public static int letterCount(String s, String c){
    int count = 0;
    int i = 0;
    if(s.contains(c) == false){ //first check if the String c appears at all in String s. If false, return 0.
      return 0;
    }
    while(i < s.length()){
      String letter = s.substring(i,i+1); //set a String letter equal to a separate letter of String s.
      if(letter.equals(c) == true){ //if letter is equal to c, then add one to the count.
        count++;
      }
      i++;
    }
    return count;
  }
}
