package adapter;

public class Main {
    public static void main(String[] args) {

        Motor motor1 = new ElectricAdapter(new ElectricMotor());
        Motor motor2 = new OpticalAdaptor(new OpticalMotor());

        motor1.drive();
        motor2.drive();

    }
}
