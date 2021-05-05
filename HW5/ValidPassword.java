
public class ValidPassword{
  public static void main (String args[]){
    //default test cases; true false false
    System.out.println(isValidPassword("Tr7s6d_"));
    System.out.println(isValidPassword("@abc2-bc"));
    System.out.println(isValidPassword("ALphaa%"));

    //additional test cases; true true false false
    System.out.println(isValidPassword("@abc2_bc"));
    System.out.println(isValidPassword("#letsgo_"));
    System.out.println(isValidPassword("!oh_okay3"));
    System.out.println(isValidPassword("!hmmm 2"));
  }

  /* this method takes a String parameter that is a password that follows these certain conditions:
  /* the first character is either an Uppercase letter or ! @ #
  /* the next characters are followed by word characters, from 5 - 7 in length, extrema included
  /* the last character cannot be * . or %
  /* the password does not contain any whitespace characters
  /* this means that each valid password will be 6 - 8 characters in length
  */
  public static boolean isValidPassword(String password){
    return password.matches("^[A-Z!@#]\\w{5,6}[^*.%]$"); //if the password is valid, this method returns true; if not, returns false.
  }
}
