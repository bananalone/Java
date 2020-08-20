package adapter;

public class ElectricAdapter implements Motor{

    private ElectricMotor electricMotor;

    public ElectricAdapter(ElectricMotor electricMotor) {
        this.electricMotor = electricMotor;
    }

    @Override
    public void drive() {
        electricMotor.electricDrive();
    }
}
