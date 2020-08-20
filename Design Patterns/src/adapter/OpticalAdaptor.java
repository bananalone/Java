package adapter;

public class OpticalAdaptor implements Motor {

    private OpticalMotor opticalMotor;

    public OpticalAdaptor(OpticalMotor opticalMotor) {
        this.opticalMotor = opticalMotor;
    }

    @Override
    public void drive() {
        opticalMotor.opticalDrive();
    }
}
