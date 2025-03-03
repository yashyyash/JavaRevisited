# README - Java Arrays and Reference Type Data

## Introduction
This README provides an overview of how arrays and reference type data work in Java. It includes examples of various array types and operations.

## 1. One-Dimensional Array
A one-dimensional array stores a list of elements of the same type.

### Example
```java
int[] arr = new int[5];
```
**Explanation:**
- `int[] arr` declares an integer array.
- `new int[5]` allocates memory for 5 elements.

### Input and Output Example
- Take user input for array elements.
- Display the elements using a loop.

## 2. Two-Dimensional Array
A two-dimensional array represents a table with rows and columns.

### Example
```java
int[][] matrix = new int[3][3];
```
**Explanation:**
- `int[][] matrix` declares a two-dimensional array.
- `new int[3][3]` allocates memory for a 3x3 matrix.

### Input and Output Example
- Input matrix elements using nested loops.
- Display the matrix in tabular form.

## 3. Jagged Array
A jagged array is an array of arrays where each row may have different column sizes.

### Example
```java
int[][] jaggedArray = new int[3][];
jaggedArray[0] = new int[2];
jaggedArray[1] = new int[3];
jaggedArray[2] = new int[1];
```
**Explanation:**
- Each row is assigned a different number of columns.
- Useful when column sizes are dynamic.

### Input and Output Example
- Input elements for each row.
- Display the jagged array with nested loops.

## 4. Array Copy
Java provides methods to copy array elements.

### Example
```java
System.arraycopy(sourceArray, 0, destArray, 0, length);
```
**Explanation:**
- `System.arraycopy()` efficiently copies elements from one array to another.

## 5. Enhanced For Loop
The enhanced for loop simplifies array traversal.

### Example
```java
for (int element : arr) {
    System.out.println(element);
}
```
**Explanation:**
- Automatically iterates through array elements.
- Provides a clean syntax for array traversal.

## Conclusion
Arrays in Java provide a versatile way to store and manipulate collections of data. Understanding one-dimensional, two-dimensional, jagged arrays, and their operations is crucial for mastering Java programming.


# README - Java Array Methods

## Introduction
This README provides an overview of common array methods in Java, including built-in methods and techniques for array manipulation.

## 1. Sorting Arrays
Java provides methods to sort arrays using the `Arrays` class.

### Example
```java
import java.util.Arrays;
int[] arr = {5, 2, 8, 1, 3};
Arrays.sort(arr);
```
**Explanation:**
- `Arrays.sort()` sorts the array elements in ascending order.

### Output
```
1 2 3 5 8
```

## 2. Copying Arrays
Arrays can be copied using the `System.arraycopy()` method or the `Arrays.copyOf()` method.

### Example
```java
int[] original = {1, 2, 3};
int[] copy = Arrays.copyOf(original, original.length);
```
**Explanation:**
- `Arrays.copyOf()` creates a new array with the same elements as the original.

### Output
```
1 2 3
```

## 3. Filling Arrays
The `Arrays.fill()` method fills all elements of an array with a specified value.

### Example
```java
int[] arr = new int[5];
Arrays.fill(arr, 10);
```
**Explanation:**
- All elements of the array are set to `10`.

### Output
```
10 10 10 10 10
```

## 4. Searching Arrays
The `Arrays.binarySearch()` method searches for an element in a sorted array.

### Example
```java
int[] arr = {1, 2, 3, 4, 5};
int index = Arrays.binarySearch(arr, 3);
```
**Explanation:**
- `Arrays.binarySearch()` returns the index of the element if found.

### Output
```
2
```

## 5. Comparing Arrays
The `Arrays.equals()` method compares two arrays for equality.

### Example
```java
int[] arr1 = {1, 2, 3};
int[] arr2 = {1, 2, 3};
boolean isEqual = Arrays.equals(arr1, arr2);
```
**Explanation:**
- Returns `true` if both arrays have the same elements in the same order.

### Output
```
true
```

## Conclusion
Java provides various built-in methods to manipulate arrays effectively. Understanding these methods enhances array operations and makes code more efficient.

# README - Java Array Methods

## Introduction
This README provides an overview of all common array methods in Java, including built-in methods and techniques for array manipulation.

## 1. Sorting Arrays
Java provides methods to sort arrays using the `Arrays` class.

### Example
```java
import java.util.Arrays;
int[] arr = {5, 2, 8, 1, 3};
Arrays.sort(arr);
```
**Explanation:**
- `Arrays.sort()` sorts the array elements in ascending order.

### Output
```
1 2 3 5 8
```

## 2. Copying Arrays
Arrays can be copied using the `System.arraycopy()`, `Arrays.copyOf()`, and `Arrays.copyOfRange()` methods.

### Example
```java
int[] original = {1, 2, 3, 4, 5};
int[] copy = Arrays.copyOf(original, original.length);
int[] partialCopy = Arrays.copyOfRange(original, 1, 4);
```
**Explanation:**
- `Arrays.copyOf()` copies the entire array.
- `Arrays.copyOfRange()` copies a range of elements from the array.

### Output
```
1 2 3 4 5
2 3 4
```

## 3. Filling Arrays
The `Arrays.fill()` method fills all or part of an array with a specified value.

### Example
```java
int[] arr = new int[5];
Arrays.fill(arr, 10);
Arrays.fill(arr, 1, 4, 20);
```
**Explanation:**
- `Arrays.fill()` sets all elements to `10`.
- `Arrays.fill(arr, 1, 4, 20)` fills elements from index 1 to 3 with `20`.

### Output
```
10 20 20 20 10
```

## 4. Searching Arrays
The `Arrays.binarySearch()` method searches for an element in a sorted array.

### Example
```java
int[] arr = {1, 2, 3, 4, 5};
int index = Arrays.binarySearch(arr, 3);
```
**Explanation:**
- `Arrays.binarySearch()` returns the index of the element if found.
- The array must be sorted before using this method.

### Output
```
2
```

## 5. Comparing Arrays
The `Arrays.equals()` method compares two arrays for equality.

### Example
```java
int[] arr1 = {1, 2, 3};
int[] arr2 = {1, 2, 3};
boolean isEqual = Arrays.equals(arr1, arr2);
```
**Explanation:**
- Returns `true` if both arrays have the same elements in the same order.

### Output
```
true
```

## 6. Converting Arrays to Strings
The `Arrays.toString()` method converts an array into a readable string representation.

### Example
```java
int[] arr = {1, 2, 3};
String str = Arrays.toString(arr);
```
**Explanation:**
- Converts the array into a string with square brackets and elements separated by commas.

### Output
```
[1, 2, 3]
```

## 7. Multi-Dimensional Arrays String Conversion
The `Arrays.deepToString()` method converts multi-dimensional arrays into a string representation.

### Example
```java
int[][] matrix = {{1, 2}, {3, 4}};
String str = Arrays.deepToString(matrix);
```
**Explanation:**
- Converts multi-dimensional arrays into a nested string format.

### Output
```
[[1, 2], [3, 4]]
```

## 8. Checking Arrays Equality (Multi-Dimensional)
The `Arrays.deepEquals()` method checks equality for multi-dimensional arrays.

### Example
```java
int[][] arr1 = {{1, 2}, {3, 4}};
int[][] arr2 = {{1, 2}, {3, 4}};
boolean isEqual = Arrays.deepEquals(arr1, arr2);
```
**Explanation:**
- Compares multi-dimensional arrays for element-wise equality.

### Output
```
true
```

## Conclusion
Java provides various built-in methods to manipulate arrays effectively. Understanding these methods enhances array operations and makes code more efficient.

