
public class WordCount{
  public static void main (String args[]){
    System.out.println(wordCount("This is a test!"));
    System.out.println(wordCount("This    is      a        test!"));
    System.out.println(wordCount(""));
    System.out.println(wordCount("YAy!!!Wahooo!!42"));
    System.out.println(wordCount("Wait, does this program actually work? Just wondering. "));
    System.out.println(wordCount("Oh, it actually does!     Sweet.    Can't wait to submit this hw.  :D"));
  }

  /*this method takes a String word, where it counts the number of words in this string. This does account for extra
  /*spaces in between the words, and it notably also does not use the split() method either. The String only contains
  /*letters, digits, punctuation, and spaces. The words are always separated by spaces as well.
  */
  public static int wordCount(String word){
    int count = 1;  //if word is not empty, we can assume that there is at least one word.
    word = word.trim(); //take out any unecessary white space at the ends.
    int length = word.length();
    if(word.isEmpty() == true){ //if string is empty, return 0;
      return 0;
    }
    for(int i = 0; i < length; i++){  //compares the next character with the previous one. If there is a space.
      if(word.charAt(i) == ' '){      //we first check whether there was already a space before it. if there is,
        if(word.charAt(i-1) == ' '){  //do nothing. otherwise, add one to the count of words.
        }
        else{
          count++;
        }
      }
    }
    return count;
  }
}
