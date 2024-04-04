import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    public String name;
    public List<Student> students = new ArrayList<>();

    public StudentGroup(String name) {

        this.name = name;

    }

    public void addStudent(Student student) {

        if (students.size() >= 15) {
            throw new IllegalArgumentException("Grupa jest full");
        } else if (students.contains(student)) {
            throw new IllegalArgumentException("Stundent "+ student.fname+" "+student.lname+" jest juz dodany");
        }
        else {

            this.students.add(student);

        }
    }


    @Override
    public String toString() {
        return "StudentGroup{" + "name='" + name + ' ' + ", students=" + students + '}';
    }
}