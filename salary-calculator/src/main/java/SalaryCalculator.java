public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 1 - (((double) 15 / 100) * 1) : 1;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = (1000.00 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold));
        return salary >= 2000 ? 2000 : salary;
    }
}
