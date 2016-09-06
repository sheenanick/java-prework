import java.io.Console;

public class OddEven {
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("Enter a number");
    String stringNum = console.readLine();
    Integer num = Integer.parseInt(stringNum);

    for (Integer i = 1; i <= num; i++){
      if (i % 2 == 0){
        System.out.println("even");
      } else {
        System.out.println("odd");
      }
    }
  }
}
