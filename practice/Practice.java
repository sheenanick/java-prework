import java.io.Console;

public class Practice {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter a adjective");
    String adjective = myConsole.readLine();
    System.out.println("Enter a noun");
    String noun = myConsole.readLine();
    System.out.println("Trong has " + adjective + " " + noun + ".");
  }
}
