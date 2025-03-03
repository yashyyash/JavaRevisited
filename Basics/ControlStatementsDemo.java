import java.util.Scanner;
   
public class ControlStatementsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // If-Else Statement
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Positive number");
        } else if (num < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

        // Ternary Operator
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        int max = (x > y) ? x : y;
        System.out.println("Greater number: " + max);

        // Nested Ternary Operator
        System.out.print("Enter third number: ");
        int z = sc.nextInt();
        int largest = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
        System.out.println("Largest number among three: " + largest);

        // Switch Case
        System.out.print("Enter a day number (1-3): ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // While Loop
        System.out.print("Enter a number to count down from: ");
        int count = sc.nextInt();
        while (count > 0) {
            System.out.println(count);
            count--;
        }

        // Do-While Loop
        System.out.print("Enter a number greater than 0: ");
        int doNum = sc.nextInt();
        do {
            System.out.println("Number: " + doNum);
            doNum--;
        } while (doNum > 0);

        // For Loop
        System.out.print("Enter the limit for the for loop: ");
        int limit = sc.nextInt();
        for (int i = 1; i <= limit; i++) {
            if (i == 3) {
                System.out.println("Skipping 3 with continue");
                continue;
            }
            if (i == 5) {
                System.out.println("Breaking at 5");
                break;
            }
            System.out.println("Count: " + i);
        }

        // Label Break Example
        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Breaking outer loop at i=2 and j=2");
                    break outer;
                }
                System.out.println(i + " " + j);
            }
        }

        // For-Each Loop
        int[] numbers = {3, 9, 5, -5};
        for (int number : numbers) {
            System.out.println(number);
        }

        sc.close();
    }
}
