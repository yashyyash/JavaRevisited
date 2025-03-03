public class OperatorsDemo{
    public static void main(String[] args) {
        int a = 10, b = 5;
        
        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus
        
        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b = " + (a & b)); // AND
        System.out.println("a | b = " + (a | b)); // OR
        System.out.println("a ^ b = " + (a ^ b)); // XOR
        System.out.println("~a = " + (~a));       // NOT
        System.out.println("a << 1 = " + (a << 1)); // Left Shift
        System.out.println("a >> 1 = " + (a >> 1)); // Right Shift
        
        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not Equal
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or Equal
        System.out.println("a <= b: " + (a <= b)); // Less than or Equal
        
        // Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println("(a > b) && (b > 0): " + ((a > b) && (b > 0))); // AND
        System.out.println("(a > b) || (b < 0): " + ((a > b) || (b < 0))); // OR
        System.out.println("!(a == b): " + !(a == b)); // NOT
        
        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = a; // Assignment
        System.out.println("c = " + c);
        c += b; // Add and Assign
        System.out.println("c += b: " + c);
        c -= b; // Subtract and Assign
        System.out.println("c -= b: " + c);
        c *= b; // Multiply and Assign
        System.out.println("c *= b: " + c);
        c /= b; // Divide and Assign
        System.out.println("c /= b: " + c);
        c %= b; // Modulus and Assign
        System.out.println("c %= b: " + c);
        
        // Increment and Decrement Operators
        System.out.println("\nIncrement/Decrement Operators:");
        System.out.println("++a: " + (++a)); // Pre-increment
        System.out.println("a++: " + (a++)); // Post-increment
        System.out.println("--b: " + (--b)); // Pre-decrement
        System.out.println("b--: " + (b--)); // Post-decrement
    }
}