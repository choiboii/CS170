
public class DigitCount{
  public static void main (String args[]){
    System.out.println(digitCount(456234,4));
    System.out.println(digitCount(456234,5));
    System.out.println(digitCount(456234,8));
    System.out.println(digitCount(456234,6));
    System.out.println(digitCount(0,0));
  }

  /*this digit takes two parameters: a integer (negative or positive) that can have any given number of digits, and
  /*a test digit that ranges from 0 to 9. this method counts the number of times the test digit appears in the
  /*given number, and it returns this int at the end of the method.
  */
  public static int digitCount(int number, int digit){
    int num = Math.abs(number);
    int fill;
    int count = 0;
    if(digit > 9){ //testing for whether the int digit is not a digit; if it is greater than 9, return -1.
      return -1;
    }
    if(num == 0 && digit == 0){ //test for the 0 and 0 case.
      return 1;
    }
    while(num > 0){ //while the num is greater than zero, test each digit of the number to the given test digit.
      fill = num % 10; //isolate one digit.
      if(fill == digit){ //if digit is equal to test digit, add one to the count.
        count++;
      }
      num = num / 10; //take out the digit tested.
    }
    return count;
  }
}
