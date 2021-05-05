import java.text.DecimalFormat;

public class NewCar{
  public static void main (String args[]){
    System.out.println(compareCars(5));
    System.out.println("\n");
    System.out.println(compareCars(10));
  }

  //===============================================================================================================//
  //ANSWERS FOR TASKS 2 AND 3:
  /*  Task 2:
    For 5 years, I would take Car A over Car B, as the price of car A is $36265.10 while Car B is more expensive at
    a price of $41964.47.
    For 10 years, however, I would take Car B over Car A, as the price of car A is $63194.83 while Car B is less
    expensive at a price of $57656.17.
    This is interesting, as Car A is better in the short run with its lower initial cost, but Car B is better in the
    long run, as its mpg is more efficient and the maintence costs are lower as well compared to Car A.

      Task 3:
    Printing something versus returning a value or String is different from each other, as one has more flexibility
    than the other. When you print something, you are printing that value directly onto the command prompt. However,
    when returning a value, you can use the result from that method to either print it directly or to use it in a
    different method that may require that certain string, numeric, binary value or whichever data type is necessary.
    Returning a value is much better in programming than printing it directly, as it allows the programmer to use
    in any other way possible, whether to use it in an another method, instantiate another variable, or print it.
  */
  //===============================================================================================================//

  /*this method compares two cars, A and B, and its overall price based on the number of years of ownership.
  /*this takes into account the initial price, gas efficiency, maintence cost per year, which increases at a certain
  /*rate that is compounded yearly.
  /*this also prints a table of all the costs and the totals, and finally returns the name of the more economical car.
  */
  public static String compareCars(int years){
    DecimalFormat df = new DecimalFormat("$##00000.00");

    //overall variables:
    double distance = 15000; //miles
    double gas = 2.50;
    String carName = ""; //empty string to determine which one is the more economic car.

    //car A:
    double initialA = 20000.00;
    double priceA = initialA;
    int mpgA = 25;
    double maintenanceA = 1300.00;
    double maintenanceRateA = 1.15;

    //car B:
    double initialB = 30000.00;
    double priceB = initialB;
    int mpgB = 32;
    double maintenanceB = 1000.00;
    double maintenanceRateB = 1.10;

    //printing the table:
    System.out.println("==========================================");
    System.out.println("|  Year:  |     Car A:    |     Car B:   |");
    System.out.println("|    0    |   " + df.format(priceA) + "   |   " + df.format(priceB) + "  |");
    for(int i = 0; i < years; i++){
      priceA += distance/mpgA*gas + maintenanceA * Math.pow(maintenanceRateA,i);  //adding the yearly price
      priceB += distance/mpgB*gas + maintenanceB * Math.pow(maintenanceRateB,i);
      System.out.println("|    " + (i+1)+ "    |   " + df.format(priceA) + "   |   " + df.format(priceB) + "  |");
    }
    System.out.println("==========================================");

    //comparing overall prices:
    if(priceA > priceB){
      carName += "Car B";
    }
    else{
      carName += "Car A";
    }

    return carName;
  }
}
