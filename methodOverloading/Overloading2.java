/**
 * Method Overloading by changing the data type of parameters
 */
class Multiply {

    // Method with two int parameters
    void product(int a, int b) {
        int prod = a * b;
        System.out.println("Product of two integers: " + prod);
    }

    // Method with one String parameter
    void product(String str) {
        System.out.println("String is: " + str);
    }
}

class Overloading2 {
    public static void main(String[] args) {
        Multiply mul = new Multiply();

        mul.product("Yash");     // Calls product(String)
        mul.product(5, 6);       // Calls product(int, int)
    }
}
