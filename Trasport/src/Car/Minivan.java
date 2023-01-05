package Car;

public class Minivan extends Car {

    @Override
    public void driveOn() {
        super.driveOn();
        changeGear();
        // + 10 special lines due to AWD
        changeGear();
    }
}
