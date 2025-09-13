import java.util.Scanner;

class TrunkCall {
    int duration;

    public TrunkCall(int duration) {
        this.duration = duration;
    }

    public double calculateCharge() {
        return 0; // Default charge
    }
}

class OrdinaryCall extends TrunkCall {
    public OrdinaryCall(int duration) {
        super(duration);
    }

    public double calculateCharge() {
        return duration * 2; // ₹2 per minute
    }
}

class UrgentCall extends TrunkCall {
    public UrgentCall(int duration) {
        super(duration);
    }

    public double calculateCharge() {
        return duration * 3.5; // ₹3.5 per minute
    }
}

class LightningCall extends TrunkCall {
    public LightningCall(int duration) {
        super(duration);
    }

    public double calculateCharge() {
        return duration * 5; // ₹5 per minute
    }
}

public class exp5q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter call duration (minutes): ");
        int duration = sc.nextInt();

        System.out.println("Choose call type: 1. Ordinary  2. Urgent  3. Lightning");
        int type = sc.nextInt();

        TrunkCall call;
        if (type == 1)
            call = new OrdinaryCall(duration);
        else if (type == 2)
            call = new UrgentCall(duration);
        else if (type == 3)
            call = new LightningCall(duration);
        else {
            System.out.println("Invalid choice!");
            return;
        }

        System.out.println("Total charge: ₹" + call.calculateCharge());

        sc.close();
    }
}