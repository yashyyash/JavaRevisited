public class CreateObjectinSameClass {

    Boolean isON;
    
    void turnOn(){
        isON = true;
        System.out.println("LIGHT IS ON ? "+isON);
    }
    void turnOFF(){
        isON = false;
        System.out.println("Light is OFF");
    }

    public static void main(String[] args) {
        CreateObjectinSameClass led = new CreateObjectinSameClass();
        led.turnOn();
        led.turnOFF();
    }
}