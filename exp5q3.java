// Superclass Worker
class Worker {
    String name;
    double salaryRate;

    // Constructor
    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    // Compute pay method (to be overridden by subclasses)
    public double computePay(int hours) {
        return 0;
    }
}

// Subclass: DailyWorker
class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        int daysWorked = hours / 8; // Assuming 8 hours per day
        return daysWorked * salaryRate;
    }
}

// Subclass: SalariedWorker
class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        return salaryRate * 40; // Fixed pay for 40 hours/week
    }
}

// Main class
public class exp5q3 {
    public static void main(String[] args) {
        Worker dailyWorker = new DailyWorker("John", 500); // ₹500 per day
        Worker salariedWorker = new SalariedWorker("Alice", 100); // ₹100 per hour (fixed for 40 hours)

        System.out.println("Daily Worker Pay: ₹" + dailyWorker.computePay(48));  // 6 days of work (48 hours)
        System.out.println("Salaried Worker Pay: ₹" + salariedWorker.computePay(50)); // Fixed for 40 hours
    }
}