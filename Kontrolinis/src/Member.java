public class Member {
    final private int id;
    final private String name;
    final private int age;

    public Member(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return id + ": " + name + ", Age: " + age;
    }
}
