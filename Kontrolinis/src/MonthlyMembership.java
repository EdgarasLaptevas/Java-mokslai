public class MonthlyMembership extends Membership {
    private int duration;

    MonthlyMembership(int membershipID, int memberID, int duration) {
        super(membershipID, memberID);
        this.duration = duration;
    }

    @Override
    double getCost() {
        return (double) this.duration * 30;
    }

    @Override
    public String toString() {
        return "MonthlyMembership, Cost: " + getCost() + ", Duration: " + this.duration + " months";
    }
}
