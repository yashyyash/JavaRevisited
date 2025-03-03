import java.util.Scanner;
 
public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. One-Dimensional Array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt(); // Taking size input from user
        int[] arr = new int[size]; // Creating one-dimensional array

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt(); // Storing array elements
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " "); // Displaying array elements
        }
        System.out.println();

        // 2. Two-Dimensional Array
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt(); // Taking row input from user
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt(); // Taking column input from user
        int[][] matrix = new int[rows][cols]; // Creating two-dimensional array

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt(); // Storing matrix elements
            }
        }

        System.out.println("Matrix elements are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " "); // Displaying matrix elements
            }
            System.out.println();
        }

        // 3. Jagged Array (Array of Arrays with Different Column Sizes)
        System.out.print("Enter number of rows for jagged array: ");
        int jaggedRows = sc.nextInt(); // Taking jagged array row input
        int[][] jaggedArray = new int[jaggedRows][]; // Declaring jagged array

        for (int i = 0; i < jaggedRows; i++) {
            System.out.print("Enter number of columns for row " + i + ": ");
            int jaggedCols = sc.nextInt(); // Taking column size for each row
            jaggedArray[i] = new int[jaggedCols];
            for (int j = 0; j < jaggedCols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                jaggedArray[i][j] = sc.nextInt(); // Storing elements in jagged array
            }
        }

        System.out.println("Jagged array elements are:");
        for (int i = 0; i < jaggedRows; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " "); // Displaying jagged array elements
            }
            System.out.println();
        }
        // Note: Jagged arrays allow each row to have different column lengths.

        // 4. Array Copy
        int[] copyArr = new int[size];
        System.arraycopy(arr, 0, copyArr, 0, size); // Copying array elements using System.arraycopy()
        System.out.println("Copied array elements:");
        for (int i : copyArr) {
            System.out.print(i + " "); // Displaying copied array elements
        }
        System.out.println();

        // 5. Enhanced For Loop with Array
        System.out.println("Array elements using enhanced for loop:");
        for (int element : arr) {
            System.out.print(element + " "); // Displaying array elements using enhanced for loop
        }
        System.out.println();

        sc.close(); // Closing Scanner
    }
}
