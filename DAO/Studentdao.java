import java.util.List;
public interface Studentdao {

    public List<Student>getAllStudents();
    public Student getStudent(int rollno);
    public void deleteStudent(Student student);
    public void updateStudent(Student student);

}
