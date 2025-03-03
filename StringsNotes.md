# README - Java Strings Methods (Detailed)

## Introduction
This README provides a detailed explanation of Java Strings, their properties, methods, and techniques for string manipulation.

## 1. What is a String?
A string is a sequence of characters. In Java, strings are objects of the `String` class, which is part of the `java.lang` package.

### Syntax
```java
String str = "Hello World";
```
Strings are immutable, meaning once a string is created, it cannot be changed.

## 2. String Creation
- Using String Literals
- Using `new` Keyword

### Example
```java
String s1 = "Hello"; // String Literal
String s2 = new String("Hello"); // Using new Keyword
```

## 3. Common String Methods

### 1. Length of a String
Returns the number of characters in the string.
```java
String str = "Hello";
System.out.println(str.length());
```
Output:
```
5
```

### 2. Concatenation
Combines two strings.
```java
String s1 = "Hello";
String s2 = " World";
String result = s1.concat(s2);
System.out.println(result);
```
Output:
```
Hello World
```

### 3. Character Extraction
- `charAt()`
```java
String str = "Java";
System.out.println(str.charAt(2));
```
Output:
```
v
```

### 4. Substrings
Extracts a portion of the string.
```java
String str = "Hello World";
System.out.println(str.substring(6));
System.out.println(str.substring(0, 5));
```
Output:
```
World
Hello
```

### 5. String Comparison
- `equals()`
- `equalsIgnoreCase()`
- `compareTo()`
```java
String s1 = "Hello";
String s2 = "hello";
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s2));
System.out.println(s1.compareTo(s2));
```
Output:
```
false
true
-32
```

### 6. Searching Strings
- `indexOf()`
- `lastIndexOf()`
- `contains()`
```java
String str = "Hello World";
System.out.println(str.indexOf('o'));
System.out.println(str.lastIndexOf('o'));
System.out.println(str.contains("World"));
```
Output:
```
4
7
true
```

### 7. String Replacement
```java
String str = "Java is fun";
String newStr = str.replace("fun", "awesome");
System.out.println(newStr);
```
Output:
```
Java is awesome
```

### 8. Conversion to Upper and Lower Case
```java
String str = "Java";
System.out.println(str.toUpperCase());
System.out.println(str.toLowerCase());
```
Output:
```
JAVA
java
```

### 9. String Trim
Removes leading and trailing spaces.
```java
String str = "   Hello   ";
System.out.println(str.trim());
```
Output:
```
Hello
```

### 10. Splitting Strings
Splits the string into an array based on a delimiter.
```java
String str = "apple,banana,grape";
String[] fruits = str.split(",");
for(String fruit : fruits) {
    System.out.println(fruit);
}
```
Output:
```
apple
banana
grape
```

### 11. String to Char Array
```java
String str = "Hello";
char[] chars = str.toCharArray();
for (char c : chars) {
    System.out.println(c);
}
```
Output:
```
H
e
l
l
o
```

### 12. String Format
```java
String name = "John";
int age = 25;
String formatted = String.format("Name: %s, Age: %d", name, age);
System.out.println(formatted);
```
Output:
```
Name: John, Age: 25
```

## Conclusion
Java provides a rich set of methods to work with strings efficiently. Understanding these methods is essential for text manipulation and data processing tasks.
