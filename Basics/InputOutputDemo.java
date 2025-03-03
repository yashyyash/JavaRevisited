import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer Input
        System.out.print("Enter an integer: ");
        int intNum = sc.nextInt();
        System.out.println("You entered: " + intNum);

        // Float Input
        System.out.print("Enter a float: ");
        float floatNum = sc.nextFloat();
        System.out.println("You entered: " + floatNum);

        // String Input (Without Space)
        System.out.print("Enter a word: ");
        String word = sc.next();
        System.out.println("You entered: " + word);

        // String Input (With Space using nextLine())
        sc.nextLine(); // Consume the newline
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.println("You entered: " + sentence);

        // Character Input
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("You entered: " + ch);

        // Double Input
        System.out.print("Enter a double: ");
        double doubleNum = sc.nextDouble();
        System.out.println("You entered: " + doubleNum);

        sc.close();
    }
}
