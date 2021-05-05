
public class DecimalBinary{
  public static void main (String args[]){
    System.out.println(decimalToBinary(23));
  }

  //returns a string that converts a int n (where n < 256) into an 8-digit byte in binary.
  //for example, decimalToBinary(23) returns "00010111" or decimalToBinary(255) returns "11111111".
  public static String decimalToBinary(int n){
    String numberString = ""; //two varibles; one to make the string, the other to keep track of the int n.
    int number = n;
    for(int i = 7; i >= 0; i--){ //the greatest value of the byte is 64 (2^7) so start at 7 and go to 0.
      if(number >= Math.pow(2,i)){ //if the number is greater than 2^i, then add a 1.
        numberString += "1";
        number -= Math.pow(2,i); //then subtract the value of 2^i.
      }
      else{                     //if it isn't larger than 2^i, then just add a 0 to the string.
        numberString += "0";
      }
    }
    return numberString;
  }
}
