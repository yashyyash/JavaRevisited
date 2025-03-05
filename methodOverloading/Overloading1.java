/**
 * 
 * Overloading by changing the number of parameters
 * 
 * */ 
class Add {
    public int a,b;
    public float c,d;
    
    Add(int a){
        int sum = a+a;
        System.out.println(sum);
    }
    Add(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
    Add(float c, float d){
        float sum = c+d;

        System.out.println(sum);
    }

}
class AdditionOverloadingMethod {
    public static void main(String[] args) {
        Add add1 = new  Add(1);
        Add add2 = new  Add(1,2);
        Add add3 = new  Add(1.2f, 2.4f);
    }    
}
