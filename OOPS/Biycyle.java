/**To Create a Class in Java we use 
 * 
 * class ClassName{
 * //fields
 * //methods 
 * }
 * 
 */

 /** 
 * |----------------------------------------|
 * |       To Create a Object we use        |
 * |                                        |
 * |   className object = new className();  | 
 * | ---------------------------------------|
 * 
 *  Fields and methods 
 *  Note: Fields and methods of a class are also called members of the class.
 * 
 *  // when we want to create the Object 
 *  Bicycle sportsBicycle = new Bicyle();
 *  
 *  //access field and method
 *  sportsBicycle.gear;          ----> access the field
 *  sportsBicycle.braking();     ----> acess the method
 * */ 

public class Biycyle {
    
    //state or field 
    private int gear = 5;

    //behaviour or method 
    public void braking(){
        System.out.print("hello");
    }

    // till here we have a Proto-type aka the class
}




