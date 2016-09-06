import java.io.Console;

public class NumberChecker {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter a two digit number.");
    String inputNum = myConsole.readLine();
    Integer inputNumInt = Integer.parseInt(inputNum);

    if (inputNumInt <= 99 && inputNumInt >= 10) {
      System.out.println("Your number is " + inputNumInt + ".");
    } else {
      System.out.println(inputNumInt + " is not a two digit number.");
    }
    
  }

}
