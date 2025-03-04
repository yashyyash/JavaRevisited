/**
 * 
 * A method is a block of code that performs a specific task.
 * 
 * Suppose you need to create a program to create a circle and color it. You can create two methods to solve this problem:
 * --> a method to draw the circle
 * =-> a method to color the circle
 * --> Dividing a complex problem into smaller chunks makes your program easy to understand and reusable.
 * --> In Java, there are two types of methods:
 * --> User-defined Methods: We can create our own method based on our requirements.
 * --> Standard Library Methods: These are built-in methods in Java that are available to use.
 * 
 * 
 * --> The Syntax we use for 
 * 
 *  |-------------------------------------------------|      
 *  |   This is a simple syntax of declaring a Method |
 *  |-------------------------------------------------|
 * 
 *  returnType methodName(){
 *  // method body
 *  }
 * 
 * 
 *  |-------------------------------------------------|      
 *  |   Original syntax of declaring a Method         |
 *  |-------------------------------------------------|
 *  modifier static returnType nameOfMethod (parameter1, parameter2, ...) {
 *  // method body
 * }
 * 
 * 
 */

 

public class MethodsCreation {
    
    public static int add(int a, int b) {
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        MethodsCreation obj = new MethodsCreation();
        int result = obj.add(9, 10);
        System.out.println("RESULT IS "+result);
    }
}



