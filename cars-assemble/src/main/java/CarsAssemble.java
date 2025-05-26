public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        return switch (speed) {
            case 5, 6, 7, 8 -> speed * (221 * .9);
            case 9 -> speed *  (221 * .8);
            case 10 -> speed * (221 * .77);
            default -> speed * 221;
        };
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
