
public class WordsVowels{
  public static void main (String args[]){
    String text1 = "I am your biggest fan!!";
    String text2 = "What is up guys, it's Sykkuno here?!";
    System.out.println(text1);
    startingLetterCounter(text1);
    System.out.println(text2);
    startingLetterCounter(text2);
  }

  public static void startingLetterCounter(String s){
    String[] words = s.split(" ");
    int vowels = 0;
    int consonant = 0;
    for(int i = 0; i < words.length; i++){
      if((words[i].substring(0,1)).matches("[aAeEiIoOuU]")){
        vowels++;
      }
      else{
        consonant++;
      }
    }
    System.out.println("Number of words starting with vowels: " + vowels);
    System.out.println("Number of words starting with consonants: " + consonant);
  }
}
