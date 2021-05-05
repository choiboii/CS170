
public class lab11_s1{
  public static void main (String args[]){
    sentimentalAnalysis("GOT Season 8 is out :| Winter is coming :( The Last Lannister will pay all the debts :(");
    sentimentalAnalysis("Happy Friday :) It will be raining all weekend :( Will get some work done instead :| and watch movies :)");
    noWord("jack is a student! he is a good person. why are we asking these questions! not sure? goodbye!");
  }

  public static void sentimentalAnalysis(String tweet){
    String[] words = tweet.split(" ");
    int happiness = 0;
    int sadness = 0;
    int neutral = 0;
    for(int i = 0; i < words.length; i++){
      if(words[i].equals(":)")){
        happiness++;
      }
      if(words[i].equals(":(")){
        sadness++;
      }
      if(words[i].equals(":|")){
        neutral++;
      }
    }
    System.out.println("Happiness score: " + happiness + "\nSadness score: " + sadness
                          + "\nNeutral score: " + neutral);
  }

  public static void noWord(String str){
    String[] words = str.split(" ");
    System.out.println("Number of words with duplication: " + words.length);
  }
}
