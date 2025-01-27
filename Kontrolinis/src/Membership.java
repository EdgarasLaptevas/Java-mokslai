abstract class Membership {
    private int membershipID;
    private int memberID;

    Membership(int membershipID, int memberID) {
        this.membershipID = membershipID;
        this.memberID = memberID;
    }

    abstract double getCost();
}
