
public class SwearFilterv2{
  public static void main (String args[]){
    String[] swears = {"duck","ship","whole"};
    System.out.println(swearFilter("A duck was sailing on a ship shipping whole wheat bread. Duck that SHIP!!!", swears));

    //additional test case
    System.out.println(swearFilter("A battleship shipped whole ducks. WHOLE DUCKS. That is a crazy ship.", swears));
  }

  /* this method takes a String text and filters out any "swear" words given in the string array called swear
  /* this method uses regular expressions and especially the replaceAll function.
  /* this method also accounts for different capital versions of the words, so it is not case-sensitive
  */
  public static String swearFilter(String text, String[] swear){
    for(int i = 0; i < swear.length; i++){ //go through each swear

      String swearReplace = "";
      for(int j = 0; j < swear[i].length(); j++){ //build the swearReplace string to replace the original text.
        if(j == 0 || j == swear[i].length()-1){
          swearReplace += swear[i].charAt(j) + "";
        }
        else{
          swearReplace += "*";
        }
      }
      /* this next section replaces all the different versions of ways that the swear can be replaced
      /* line 28 replaces the lowercase versions, line 29 replaces the uppercase versions,
      /* and line 30 replaces the version in which only the first letter is captialized.
      */
      text = text.replaceAll(swear[i],swearReplace);
      text = text.replaceAll(swear[i].toUpperCase(),swearReplace.toUpperCase());
      text = text.replaceAll((swear[i].charAt(0)+"").toUpperCase()+swear[i].substring(1,swear[i].length()),(swearReplace.charAt(0)+"").toUpperCase()+swearReplace.substring(1,swearReplace.length()));
    }
    return text;
  }
}
