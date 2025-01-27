import java.time.Duration;

public class AnnualMembership extends Membership {

    private int duration;
    private int cost;

    AnnualMembership(int membershipID, int memberID) {
        super(membershipID, memberID);
        this.duration = 12;
        this.cost = 300;
    }

    @Override
    double getCost() {
        return this.cost;
    }

    @Override
    public String toString() {
        return "MonthlyMembership, Cost: " + getCost() + ", Duration: " + this.duration + " months";
    }
}
