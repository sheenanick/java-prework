import java.io.Console;

public class Encrypt {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter a sentence and this program will encrypt it for you");
    String sentence = myConsole.readLine();
    String encryptedSentence = sentence.replaceAll("a", "love");
    System.out.println(encryptedSentence);
  }
}
