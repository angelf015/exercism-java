import java.util.Arrays;

class BirdWatcher {

    private final int[] birdsPerDay;
    private int count = 0;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        this.count = count + this.birdsPerDay[this.birdsPerDay.length - 1];
        return count;
    }

    public void incrementTodaysCount() {
        this.count++;
    }

    public boolean hasDayWithoutBirds() {
        for (int j : this.birdsPerDay) {
            return j == 0;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        if (numberOfDays > this.birdsPerDay.length) {
            sum = Arrays.stream(this.birdsPerDay).sum();
        } else {
            for (int j = 0; j < numberOfDays; j++) {
                sum += this.birdsPerDay[j];
            }
        }
        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int j : this.birdsPerDay) {
            if (j >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}
