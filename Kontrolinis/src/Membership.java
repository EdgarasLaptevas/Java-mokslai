abstract class Membership {
    final private int membershipID;
    final private int memberID;

    Membership(int membershipID, int memberID) {
        this.membershipID = membershipID;
        this.memberID = memberID;
    }

    abstract double getCost();
}
