class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int battery = 100;
    private int meters;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
       return this.batteryDrain > this.battery;
    }

    public int distanceDriven() {
        return this.meters;
    }

    public void drive() {
        if (!batteryDrained()) {
            this.meters = this.meters + this.speed;
            this.battery = this.battery - this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        if (!car.batteryDrained()) {
            return (100 / car.getBatteryDrain()) * car.getSpeed() >= this.distance;
        }
        return false;
    }
}
