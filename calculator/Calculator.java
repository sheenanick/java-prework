import java.io.Console;

public class Calculator {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter two numbers and I will add them together");
    System.out.println("What is your first number?");
    String stringNum1 = myConsole.readLine();
    System.out.println("What is your second number?");
    String stringNum2 = myConsole.readLine();

    Integer num1 = Integer.parseInt(stringNum1);
    Integer num2 = Integer.parseInt(stringNum2);

    Integer sum = num1 + num2;
    String stringSum = Integer.toString(sum);

    System.out.println("The sum of " + stringNum1 + " and " + stringNum2 + " is " + stringSum + ".");
  }
}
