
public class CountVowels{
  public static void main (String args[]){
    //this should print out 4, 2, 18, 7.
    System.out.println(countVowels("Humoungus"));
    System.out.println(countVowels("JAke"));
    System.out.println(countVowels("AEIOaeuIEUOiouUEOU"));
    System.out.println(countVowels("Yes I am doing great"));
  }

  //this method returns the number of vowels in String s which is provided in the parameter below.
  public static int countVowels(String s){
    int count = 0;  //accumlatory variable to count how many vowels.
    String word = s.toLowerCase();  //normalize the string so there are less cases to test.
    int i = 0;
    while(i < word.length()){
      if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
          || word.charAt(i) == 'u'){  //test all the vowels; if any one of these are true, add one to the count.
        count++;
      }
      i++;
    }
    return count;
  }
}
