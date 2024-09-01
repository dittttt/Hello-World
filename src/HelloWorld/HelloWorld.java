package HelloWorld;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        String capitalizedName = capitalizeFirstLetters(name);
        System.out.println("Hello, " + capitalizedName + "!");
        scanner.close();
    }
    public static String capitalizeFirstLetters(String str) {
        String[] words = str.split(" ");
        StringBuilder capitalized = new StringBuilder();
        
        for (String word : words) {
            if (word.length() > 0) {
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                           .append(word.substring(1).toLowerCase()).append(" ");
            }
        }
        return capitalized.toString().trim();
    }
}
