public class Customer {

    private final int id;
    private final String name;
    private final int age;

    public Customer(int id, String name, int age) {

        if (id <= 0) {
            throw new IllegalArgumentException("Customer Id must be a positive number.");
        }

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Book title cannot be null or empty.");
        }
        if (age <= 5) {
            throw new IllegalArgumentException("Customer must be at least 5 years old.");
        }

        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.id + ": " + this.name + ", Age: " + this.age;
    }
}
