public class DataTypesDemo {
    public static void main(String[] args) {
        // Primitive Data Types
        byte b = 100;               // 1 byte
        short s = 30000;            // 2 bytes
        int i = 123456;             // 4 bytes
        long l = 123456789L;        // 8 bytes
        float f = 12.34f;           // 4 bytes
        double d = 123.456;         // 8 bytes
        char c = 'A';               // 2 bytes
        boolean bool = true;        // 1 bit

        System.out.println("Primitive Data Types:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        // Reference Data Types
        String str = "Hello, CDAC!";  // String class (Reference Type)
        int[] numbers = {1, 2, 3, 4, 5};  // Array (Reference Type)
        DataTypesDemo obj = new DataTypesDemo(); // Object (Reference Type)

        System.out.println("\nReference Data Types:");
        System.out.println("String: " + str);
        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Object: " + obj); 
    } 
} 