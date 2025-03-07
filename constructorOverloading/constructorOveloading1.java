/**
 * 
 * Java Constructors are same name as class and no return type
 *  
 * class Test{
 *    Test(){
 *      // Constructor body 
 *      }
 *  }
 * 
 * */ 
class Plane{
    private String name;
        
        //constructor
        Plane(){
            System.out.println("Constructor Called");
            name = "Programiz";
        }
        Plane(int a){
           int yash  = a;
           System.out.println("Para meterized Constructor Called "+yash);

        }
}
class constructorOveloading1 {
public static void main(String[] args) {
    // constructor is invoked while
    // creating an object of the main class 
    Plane plane = new Plane();
    Plane plane1 = new Plane(2);
    }
    
}
