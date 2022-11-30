public class Daopatterndemo {
    public static void main(String[] args) {
       Studentdao studentDao = new Studentdaoimp();
      for(Student student:studentdao.getAllStudents()){
        System.out.println(student.getRollno()+student.getName());

      }
      Student student=studentdao.getAllStudents().get(0);
student.setName("michal");
studentdao.updateStudent(student);
studentdao.getStudent(0);
System.out.println(student.getRollno()+student.getName());
    }
 }
 