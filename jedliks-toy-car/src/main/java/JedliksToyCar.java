public class JedliksToyCar {
    private int meters = 0;
    private int percent = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + meters + " meters";
    }

    public String batteryDisplay() {
        if (percent <= 0) {
            return "Battery empty";
        }
        return "Battery at " + percent + "%";
    }

    public void drive() {
        if (percent > 0) {
            this.meters = meters + 20;
            this.percent--;
        }
    }
}
