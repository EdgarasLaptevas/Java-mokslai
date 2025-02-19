import java.util.ArrayList;
import java.util.List;

public class GymClass {
    final private String className;
    final private String schedule;
    final private List<Member> enrolledMembers;

    public GymClass(String className, String schedule) {
        this.className = className;
        this.schedule = schedule;
        this.enrolledMembers = new ArrayList<>();
    }

    public void enroll(Member member) {
        this.enrolledMembers.add(member);
    }

    public String getClassName() {
        return className;
    }

    public List<Member> getEnrolledMembers() {
        return enrolledMembers;
    }

    @Override
    public String toString() {
        StringBuilder names = new StringBuilder();
        if (!enrolledMembers.isEmpty()) {
            enrolledMembers.forEach((member) -> names.append(member.getName()).append(", "));
            names.delete(names.length() - 2, names.length() - 1);
            return this.className + " (" + this.schedule + ") : " + names;
        }
        return this.className + " (" + this.schedule + ")";
    }


}
