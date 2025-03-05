/**
 * 
 *  Method Overloading by changing the data type of parameters
 * 
 * */ 


class  Multiply {
    int a,b;
    String str;

    Multiply(int a, int b){
        int prod = a * b;
            System.out.println(prod);
    }

    Multiply(String str){
        String A = str;
            System.out.println(A);
    }
    
}
class Overloading2 {
    public static void main(String[] args) {
        Multiply Mul = new Multiply("yash");
        Multiply Mul1 = new Multiply(5, 6);
    }
}
