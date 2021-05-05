
public class ValidEmail{
  public static void main (String args[]){
    //default test cases: true false
    System.out.println(isValidEmail("user_123@gmail.com"));
    System.out.println(isValidEmail("user123alpha@gmail.com"));

    //addiitonal test cases: true false false
    System.out.println(isValidEmail("testing@yahoo.org"));
    System.out.println(isValidEmail("thiswork?@domaintoolong.com"));
    System.out.println(isValidEmail("user123@outlook.asdf"));
  }

  /* this method takes a String parameter that is a email that follows these certain conditions:
  /* the first part is a sequence of word charaters that is 1 - 10 in length, first char must be a letter
  /* then it must be separated by an @ sign
  /* the next part is the domain in which it is a sequence of letters or digits that is 1 - 12 in length, first char must be a letter
  /* then it is separated by a period
  /* the last part is a sequence of lowercase letters that is 1 - 3 letters in length
  */
  public static boolean isValidEmail(String email){
    return email.matches("[a-zA-Z]\\w{1,9}\\@[a-zA-Z]\\w{1,11}\\.[a-z]{1,3}"); //this method returns true if it is a valid email; reutrns false otherwise
  }
}
