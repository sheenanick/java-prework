import java.io.Console;

public class PackageWeight {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("What is the weight of your package in grams?");
    String packageWeight = myConsole.readLine();
    System.out.println("What is the distance to your package destination in kilometers?");
    String distanceToTravel = myConsole.readLine();

    Integer weight = Integer.parseInt(packageWeight);
    Integer distance = Integer.parseInt(distanceToTravel);

    Integer price = (weight / 10) + (distance / 5) * 5;
    System.out.println("The estimated shipping cost of your package is $" + price + ".");
  }

}
