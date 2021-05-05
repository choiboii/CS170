
public class ReverseSentence{
  public static void main (String args[]){
    String test = "This is a test.";
    System.out.println(reverseSentence(test));

    String test1 = "First ladies rule the State and state the rule: ladies first.";
    System.out.println(reverseSentence(test1));
  }

  public static String reverseSentence(String sentence){
    String[] words = sentence.split(" ");
    int numWords = words.length;
    if(numWords == 1){
      return words[0];
    }
    else{
      String newSentence = "";
      for(int i = 0; i < words.length-1; i++){
        newSentence += words[i] + " ";
      }
      return words[words.length-1] + " " + reverseSentence(newSentence);
    }
  }
}
