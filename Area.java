
public class Area{

  public static double area(int numSides, double perimeter){
    double angle = Math.toRadians(180.0*(numSides-2)/numSides);
    double apothem = perimeter / (2.0 * numSides) * Math.tan(angle/2.0);
    double area = 0.5 * perimeter * apothem;
    return area;
  }

  public static void main (String args[]){
    System.out.println(area(3,60));
    System.out.println(area(4,160));
    System.out.println(area(6,300));
    System.out.println(area(8,120));
  }
}
