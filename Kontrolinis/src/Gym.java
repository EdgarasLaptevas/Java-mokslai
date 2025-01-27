import java.util.*;

public class Gym {

    private Map<Integer, String> members;
    private List<Membership> memberships;
    private List<GymClass> gymClasses;

    public Gym() {
        this.members = new HashMap<>();
        this.memberships = new ArrayList<>();
        this.gymClasses = new ArrayList<>();


    }

    public void addMember(int id, String name, int age) {
        this.members.put(id, ": " + name + ", Age: " + age);

    }

    public void printMembers() {
        this.members.forEach((key, value) -> System.out.println(key + value));
    }

    public void assignMembership(Membership membership) {
        this.memberships.add(membership);
    }

    public void printMembership() {
        this.memberships.forEach(System.out::println);
    }

    public void addGymClass(GymClass gymClass) {
        this.gymClasses.add(gymClass);
    }

    public String enrollMemberInClass(int memberId, String gymClassName) {
        if (this.members.containsKey(memberId)) {
            return "Member Id not found";
        }

        for (GymClass gymClass : this.gymClasses) {
            if (!gymClass.getClassName().equals(gymClassName)) {
                return "Class not found";
            } else {
                gymClass.enroll(this.members.get(memberId));
            }
        }
        return gymClassName;
    }

    public void printClassEnrollments() {
        System.out.println("Class Enrollments: \n" + gymClasses.toString());
    }


}


