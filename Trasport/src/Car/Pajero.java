package Car;

public class Pajero extends FrameJeep {
    @Override
    public void driveOn() {
        super.driveOn();
        // + 2 special lines due to AWD
    }

    @Override
    protected void changeGear() {
        super.changeGear();
        // ADD 2 lines of code
    }
}

