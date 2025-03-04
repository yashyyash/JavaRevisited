// Class definition for Lamp
// A Lamp object represents a simple light with on/off functionality
class Lamp {
  
  // Instance variable to store the light state
  // true = light is ON
  // false = light is OFF
  boolean isOn;

  // Method to turn on the light
  // This method sets the isOn variable to true and prints the status
  void turnOn() {
    isOn = true; // Turn on the light
    System.out.println("Light on? " + isOn); // Display the current state of the light
  }

  // Method to turn off the light
  // This method sets the isOn variable to false and prints the status
  void turnOff() {
    isOn = false; // Turn off the light
    System.out.println("Light on? " + isOn); // Display the current state of the light
  }
}

// Main class that contains the entry point of the program
public class Main {
  public static void main(String[] args) {

    // Create two Lamp objects (led and halogen)
    // The new keyword allocates memory and calls the default constructor
    Lamp led = new Lamp(); // First lamp object
    Lamp halogen = new Lamp(); // Second lamp object

    // Turn on the LED lamp by calling the turnOn() method
    // This will set isOn to true and print the message
    led.turnOn();

    // Turn off the Halogen lamp by calling the turnOff() method
    // This will set isOn to false and print the message
    halogen.turnOff();
  }
}