
public class SomeMath{
  public static void main (String args[]){
    System.out.println(sumOfSquares(4));
    System.out.println(product(8,11));
    System.out.println(compoundInterest(1000,0.05,3));
    System.out.println(polySpiralLength(3,20,5));
  }

  //returns an int sum of the squares of n from 1 to n. for example, for sumOfSquares(4), it returns 1^2 + 2^2 + 3^2 +
  //4^2 = 30.
  public static int sumOfSquares(int n){
    int sum = 0;
    for(int i = 0; i < n; i++){
      sum += Math.pow(i+1,2); //adds the square of each number leading up to n to the int sum.
    }
    return sum;
  }

  //returns the product of two numbers without using the multiplication operator. this is done through adding the
  //number x together y times. for example, for product(4,5), it adds the number 4 together 5 times.
  public static int product(int x, int y){
    int product = 0;
    for(int i = 0; i < y; i++){
      product += x; //adds the number x to the variable product, y times.
    }
    return product;
  }

  //returns the compound interest of a deposit in double money based on given interest rate and years, which is
  //provided in the variables double interestRate, and int years.
  public static double compoundInterest(double money, double interestRate, int years){
    double total = money;
    double interest = money; //have two variables to set up; one for determining the total money, while the other for
    for(int i = 1; i <= years; i++){  //calculating the current year's interest.
      total += interest * 0.05;
      interest = total;
    }
    return total;
  }

  /*returns the total distance the turtle travels when creating a polygon spiral. this is originally based off of other
  /*method Polyspiral, in which the turtle draws a spiral in the shape of a regular polygon. the parameter int n
  /*determines the number of sides of the polygon, while double base determines the length of the first length the
  /*turtle travels. int rounds indicates the number of rounds the turtle goes around.
  */
  public static double polySpiralLength(int n, double base, int rounds){
    double length = 0;
    for(int i = 1; i <= n*rounds; i++){ //the total lengths the turtle travels is n * rounds.
      length += base * i; //the distance the travel travels each time
    }
    return length;
  }
}
