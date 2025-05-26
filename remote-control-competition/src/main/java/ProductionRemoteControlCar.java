class ProductionRemoteControlCar
    implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    private int drive = 0;
    private int victories;

    public void drive() {
        this.drive = this.drive + 10;
    }

    public int getDistanceTravelled() {
        return this.drive;
    }

    public int getNumberOfVictories() {
        return this.victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.victories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar pro) {
        return pro.getNumberOfVictories() - this.victories;
    }
}
