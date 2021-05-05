
public class Storyteller{
  public static void main (String args[]){
    storyteller("Diana","Rachel","purses",12,"frogs","guilty","cake");
  }

  /*This method creates a story based on a number of parameters. The first two parameters take the names of two girls. The next parameter is an object which
  /*causes one girl to be envious of the other. The reason behind this envy is the sheer number and quantity, which is provided in the parameter int n. The
  /*first girl should have n items, while the second girl has half of the first. The last three parameters are other pieces of information that are provided
  /*to add the story a bit of flavor and extra details.
  /*This method uses the three magicword() methods (see below for more details) to create the magic word phrase used in the story below. For more info on
  /*those specific methods, go down to the header of each method.
  */
  public static void storyteller(String name1, String name2, String item, int n, String other1, String other2, String other3){
    //exposition:
    System.out.print(name1 + " was a righteous queen. ");
    System.out.print(name2 + " was an evil sorceress. ");
    System.out.print(name2 + " was jealous of " + name1 + ", as " + name1 + " had " + n+" "+item + ", while " + name2 + " only had " + (n/2)+" "+item + ". ");

    //rising action:
    System.out.print("Because " + name2 + " was envious of " + name1 + "'s " + item + ", " + name2 + " cast a spell on " + name1 + ", saying these words: ");

    //climax:
    System.out.print("\""+magicword1(name1) + " " + magicword2(name2) + " " + magicword3(item) + "! ");
    System.out.print(magicword1(name1).toUpperCase() + " " + magicword2(name2).toUpperCase() + " " + magicword3(item).toUpperCase() + "!\". ");
    System.out.print("Then, poof! All of " + name1 + "'s " + item + " turned into " + other1 + "! As a result, " + name1 + " became very depressed. ");

    //falling action:
    System.out.print(name2 + " saw that " + name1 + " was very sad, and she felt " + other2 + ". ");
    System.out.print("So she decided to reverse the spell she had casted on " + name1 + ". ");

    //resolution:
    System.out.print(name2 + " apologized to " + name1 + " and the two had " + other3 + " and lived happily ever after.");
  }

  /*magic word methods:
  /*in each magic word method, it takes a lone String parameter, in which it takes the last letter, then adds a string of two vowels, then adds the first
  /*letter onto the magic word. For example, for magicwordn("Rob"), it prints "Bxxr", where the n in magicwordn describes the number of which magic word
  /*method, while the xx describes the two vowels that are added in the magic word, which can correspond to "aa", "ee", or "ii".
  */

  //creates a magic word based off of a String name provided in the lone parameter.
  //in this case, it adds the two vowels "aa" in the middle of the magic word.
  public static String magicword1(String name){
    String word = "";
    int length = name.length();
    word += (name.substring(length-1)).toUpperCase();
    word += "aa";
    word += (name.substring(0,1)).toLowerCase();
    return word;
  }

  //creates a magic word based off of a String name provided in the lone parameter.
  //in this case, it adds the two vowels "ee" in the middle of the magic word.
  public static String magicword2(String name){
    String word = "";
    int length = name.length();
    word += (name.substring(length-1)).toUpperCase();
    word += "ee";
    word += (name.substring(0,1)).toLowerCase();
    return word;
  }

  //creates a magic word based off of a String name provided in the lone parameter.
  //in this case, it adds the two vowels "ii" in the middle of the magic word.
  public static String magicword3(String name){
    String word = "";
    int length = name.length();
    word += (name.substring(length-1)).toUpperCase();
    word += "ii";
    word += (name.substring(0,1)).toLowerCase();
    return word;
  }
}
