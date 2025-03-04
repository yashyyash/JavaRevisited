/** HERE WE HAVE CREATED oBJECTS IN dIFFERENT CLASS */
class Lamp{
  boolean isOn;

  void turnON(){
    isOn = true;
    System.out.println("Lightis on ? "+isOn);;
  }

  void turnOff(){
    isOn =false;
    System.out.print("Light is off ? " +isOn);
  }

}
public class ObjectCreationDifferentClass {
  public static void main(String[] args) {
    Lamp L1 = new Lamp();
    L1.turnON();
    L1.turnOff();
  }
}

/** 
 * 
 * we have created a class named Lamp. It contains a variable: isOn and two methods: turnOn() and turnOff().
 * Inside the Main class, we have created two objects: led and halogen of the Lamp class. We then used the objects to call the methods of the class.
 * led.turnOn() - It sets the isOn variable to true and prints the output.
 * halogen.turnOff() - It sets the isOn variable to false and prints the output.
 * The variable isOn defined inside the class is also called an instance variable. It is because when we create an object of the class, it is called an instance of the class. And, each instance will have its own copy of the variable.
 * That is, led and halogen objects will have their own copy of the isOn variable.
*/