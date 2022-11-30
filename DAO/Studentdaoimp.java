import java.util.ArrayList;
import java.util.List;

public class Studentdaoimp implements Studentdao{
    List<Student>students;
    public Studentdaoimp(){
        students=new ArrayList<Student>();
        Student student1=new Student("rajini",1);
        Student student2=new Student("kamal",2);
        students.add(student1);
        students.add(student2);
    }
    public void deleteStudent(Student student){
        students.remove(student.getRollno());
System.out.print(student.getRollno());
    }
    public List<Student>getAllStudents(){
        return students;
    }

    public Student getStudent(int rollno) {
        return students.get(rollno);
     }
  
     public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
     }
  }

