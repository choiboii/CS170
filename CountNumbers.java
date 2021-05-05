
public class CountNumbers{
  public static void main (String args[]){
    System.out.println(countNumbers("I can't believe it!"));
    System.out.println(countNumbers("There's 4 of them?"));
    System.out.println(countNumbers("1 thing 2 say 3 words 4 you:"));
    System.out.println(countNumbers("I'll have 2 number 9s, a number 9 large, and a number 6 with extra dip."));
  }

  public static int countNumbers(String word){
    int count = 0;
    char[] characters = word.toCharArray();
    for(int i = 0; i < characters.length; i++){
      if (characters[i] == '0' || characters[i] == '1' || characters[i] == '2' || characters[i] == '3' ||
        characters[i] == '4' || characters[i] == '5' || characters[i] == '6' || characters[i] == '7' ||
        characters[i] == '8' || characters[i] == '9'){
          count++;
      }
    }
    return count;
  }
}
