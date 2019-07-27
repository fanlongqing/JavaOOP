import model.Student;
public class test {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("崔高歌");
        student.setAge(18);
        student.setSex("男");
        student.setStudentNumber(1568);
        System.out.println(student.getName());
        System.out.println(student.getSex());
        System.out.println(student.getAge());
        System.out.println(student.getStudentNumber());
    }

}
