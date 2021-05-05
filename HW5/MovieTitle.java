
public class MovieTitle{
  public static void main (String args[]){
    //default test cases
    System.out.println(extractTitle("<item><title>Split (2017)</title><meta><imdb>6375308</imdb></meta>"));

    //additional test cases
    System.out.println(extractTitle("<item><title>A Quiet Place (2018) </title><meta><imdb>7182756</imdb></meta>"));
    System.out.println(extractTitle("<item><title>Avengers: Endgame (2019)</title><meta><imdb>7237512</imdb></meta>"));
  }

  /* this method takes a string representing IMDB movie information written in XML style
  /* this extracts all the data between <title> and </title>
  */
  public static String extractTitle(String title){
    String[] movieText = title.split("<(\\/)?title>");
    return movieText[1];
  }
}
