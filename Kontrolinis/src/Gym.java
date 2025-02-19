import java.util.*;

public class Gym {

    final private Map<Integer, ArrayList<String>> members;
    final private List<Membership> memberships;
    final private List<GymClass> gymClasses;

    public Gym() {
        this.members = new HashMap<>();
        this.memberships = new ArrayList<>();
        this.gymClasses = new ArrayList<>();


    }

    public void addMember(int id, String name, int age) {
        ArrayList<String> memberDetails = new ArrayList<>();
        memberDetails.add(name);
        memberDetails.add(String.valueOf(age));
        this.members.put(id, memberDetails);
    }

    public void printMembers() {
        this.members.forEach((key, value) ->
                System.out.println(key + ": " + value.getFirst() + ", Age: " + value.get(1)));
    }

    public void assignMembership(Membership membership) {
        this.memberships.add(membership);
    }

    public void printMembership() {
        this.memberships.forEach(System.out::println);
    }

    public void addGymClass(String gymClass, String schedule) {
        this.gymClasses.add(new GymClass(gymClass, schedule));
    }

    public void enrollMemberInClass(int memberId, String gymClassName) {
        if (!this.members.containsKey(memberId)) {
            System.out.println("Member Id not found");
            return;
        }

        for (GymClass gymClass : this.gymClasses) {
            if (gymClass.getClassName().equals(gymClassName)) {
                gymClass.enroll(new Member(memberId, this.members.get(memberId).get(0),
                        Integer.parseInt((this.members.get(memberId).get(1)))));
                return;
            }
        }
        System.out.println("Class not found");
    }

    public void printClassEnrollments() {
        System.out.println("Class Enrollments: ");
        gymClasses.forEach(System.out::println);
    }


}


