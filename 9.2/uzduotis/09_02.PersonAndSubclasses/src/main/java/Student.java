public class Student extends Person {
    private int credits;

    public Student(String fullName, String address) {
        super(fullName, address);

    }

    public int credits() {
        return credits;
    }

    public void study() {
        credits += 1;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + credits;
    }
}
