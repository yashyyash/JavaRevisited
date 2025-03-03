import java.util.Scanner;

public class StringMethodsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String Creation
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);

        // String Length
        System.out.println("Length of name: " + name.length());

        // Concatenation
        System.out.print("Enter your surname: ");
        String surname = sc.nextLine();
        String fullName = name.concat(" ").concat(surname);
        System.out.println("Full Name: " + fullName);

        // Character Extraction
        System.out.println("First character of name: " + name.charAt(0));

        // Substring
        System.out.println("Substring (0-3): " + name.substring(0, 3));

        // String Comparison
        System.out.print("Enter another name: ");
        String anotherName = sc.nextLine();
        System.out.println("Is name equal to another name: " + name.equals(anotherName));
        System.out.println("Ignoring case: " + name.equalsIgnoreCase(anotherName));

        // Searching Strings
        System.out.println("Index of 'a': " + name.indexOf('a'));
        System.out.println("Does name contain 'a': " + name.contains("a"));

        // String Replacement
        String replaced = name.replace("a", "@");
        System.out.println("After replacement: " + replaced);

        // Upper and Lower Case
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());

        // Trim
        String padded = "   Java   ";
        System.out.println("Trimmed: " + padded.trim());

        // Splitting Strings
        String sentence = "Java is awesome";
        String[] words = sentence.split(" ");
        System.out.println("Splitted words:");
        for (String word : words) {
            System.out.println(word);
        }

        // String to Char Array
        char[] charArray = name.toCharArray();
        System.out.println("Characters in name:");
        for (char c : charArray) {
            System.out.println(c);
        }

        // String Format
        String formatted = String.format("Welcome %s, your name length is %d", name, name.length());
        System.out.println(formatted);

        sc.close();
    }
}
