import java.io.Console;

public class RatedR {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("What is your age?");
    String age = myConsole.readLine();
    Integer ageInt = Integer.parseInt(age);

    if (ageInt > 17){
      System.out.println("You are old enough to watch this movie.");
    } else {
      System.out.println("Sorry, you are not old enough to watch this movie.");
    }
    
  }
}
