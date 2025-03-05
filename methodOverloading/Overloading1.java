/**
 * Overloading by changing the number of parameters
 */
class Add {
    public int a, b;
    public float c, d;

    // Method with one int parameter
    void sum(int a) {
        int result = a + a;
        System.out.println("Sum of one int: " + result);
    }

    // Method with two int parameters
    void sum(int a, int b) {
        int result = a + b;
        System.out.println("Sum of two ints: " + result);
    }

    // Method with two float parameters
    void sum(float c, float d) {
        float result = c + d;
        System.out.println("Sum of two floats: " + result);
    }
}

class AdditionOverloadingMethod {
    public static void main(String[] args) {
        Add obj = new Add();
        
        obj.sum(1);             // Calls sum(int)
        obj.sum(1, 2);          // Calls sum(int, int)
        obj.sum(1.2f, 2.4f);    // Calls sum(float, float)
    }
}
