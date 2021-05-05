import java.util.Arrays; //import this to use the toString method provided in the Arrays class.

public class SwearFilter{
  public static void main (String args[]){
    String test = "A duck was sailing on a ship shipping whole wheat bread. Duck that SHIP!!!";
    System.out.println(swearFilter(test, new String[]{"duck","ship","whole"}));
  }

  //this method filters a given String text using a list of "swear words" in the String array swear.
  //this filter is not case sensitive, so it detects both lowercase, uppercase, or a combination of both.
  //this also detects swear words which are embedded in words or have punctuation attached to them.
  public static String swearFilter(String text, String[] swear){
    String result = "";
    String words[] = text.split(" "); //split the String into individual words to analyze each word for swears.
    for(int i = 0; i < words.length; i++){
      String temp = words[i]; //set the temp to add in case it does not have any swears.
      for(int j = 0; j < swear.length; j++){ //a for loop to go through each swear word in the list.
        if(words[i].toLowerCase().contains(swear[j])){ //set to lowercase temporarily to normalize the comparison.
          int indexSwear = index(words[i],swear[j]); //using the index method (defined below), find the index of swear.
          temp = words[i].substring(0,indexSwear); //add beginning of word if needed
          temp += censor(words[i].substring(indexSwear,indexSwear+swear[j].length())); //censor method to censor swear.
          temp += words[i].substring(indexSwear+swear[j].length(), words[i].length()); //add rest of the word if needed
        }
      }
      result += temp + " "; //add the temp string along with a space to preserve spacing.
    }
    return result;
  }

  //this method returns the index of a word within another word. This assumes that one of the words (String test)
  //is already proven to be in the other word.
  //this method finds the index by first comparing the first letter, then if that turns out to be true, comparing each
  //letter of the word and test. If each letter is not equal to each other exactly, the loops is broken, and the
  //method then moves on to the next letter and tries the exact same thing again.
  public static int index(String word, String test){
    int index = 0;
    for(int i = 0; i < word.length(); i++){
      if(word.charAt(i) == test.charAt(0)){ //compare the initial letters of the word and the test word
        for(int j = 1; j < test.length(); j++){ //then compare each letter of the test word to the word
          if(word.charAt(i+j) != test.charAt(j)){ //if even one letter is wrong, break the statement and move on to the
            break;                                //next iteration.
          }
          else{                                 //if each letter matches, the index is i.
            index = i;
          }
        }
      }
    }
    return index;
  }

  //this method censors the given String word, by preserving the first and last letter of the word, and filling the
  //rest of the String with asterisks.
  public static String censor(String word){
    String result = word.charAt(0) + ""; //start with the first character.
    if(word.length() <= 3){ //if the word is less than three characters, disregard the need to censor words.
      return word;
    }
    else{
      for(int i = 0; i < word.length()-2;i++){ //add an asterisk for word.length()-2 times in order to match the
        result += "*";                         //initial length of the word.
      }
      result += word.charAt(word.length()-1) + ""; //add the last character.
    }
    return result;
  }
}
