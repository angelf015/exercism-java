public class ExperimentalRemoteControlCar implements RemoteControlCar {

    private int drive = 0;

    public void drive() {
        this.drive = this.drive + 20;
    }

    public int getDistanceTravelled() {
        return this.drive;
    }
}
