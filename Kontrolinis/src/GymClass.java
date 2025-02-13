import java.util.ArrayList;
import java.util.List;

public class GymClass {
    private String className;
    private String schedule;
    private List<Member> enrolledMembers;

    public GymClass(String className, String schedule) {
        this.className = className;
        this.schedule = schedule;
        this.enrolledMembers = new ArrayList<Member>();
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
            enrolledMembers.forEach((member) -> names.append(member.getName()).append(" "));
            return this.className + " (" + this.schedule + ") : " + names;
        }
        return this.className + " (" + this.schedule + ")";
    }


}
