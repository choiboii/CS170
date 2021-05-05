import java.util.Arrays; //import this class to use the toString method.

public class TallyVowels{
  public static void main (String args[]){
    String test1 = "HEY! Apples and bananas!";
    System.out.println(Arrays.toString(tally(test1))); //returns [5,2,0,0,0]

    String test2 = "The gray fox jumped into the wooden box.";
    System.out.println(Arrays.toString(tally(test2))); //returns [1,4,1,5,1]
  }

  //this method takes a String and returns an array of the number of times each vowel shows up in the String.
  //the array is ordered as [a, e, i, o, u]. It also counts uppercase and lowercase vowels the same.
  public static int[] tally(String word){
    int[] vowels = {0,0,0,0,0}; //create an array with zeroes to add vowels in;
    word = word.toLowerCase(); //change all to lowercase to normalize string
    for(int n = 0; n < word.length(); n++){
      if(word.substring(n,n+1).equals("a")){  //each if block statement compares the letter to the vowel, and if they
        vowels[0]++;                          //equal, then add one to the corresponding element in the array.
      }
      if(word.substring(n,n+1).equals("e")){
        vowels[1]++;
      }
      if(word.substring(n,n+1).equals("i")){
        vowels[2]++;
      }
      if(word.substring(n,n+1).equals("o")){
        vowels[3]++;
      }
      if(word.substring(n,n+1).equals("u")){
        vowels[4]++;
      }
    }
    return vowels;
  }
}
