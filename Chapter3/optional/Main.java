package Chapter3.optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Camp camp = new Camp();
        Student steve = new Student("Steve");
        camp.setStudent(steve);

        Optional<Student> studentOptional =camp.getStudent();
        boolean flag = studentOptional.isPresent();

        if(flag) {
            Student student = studentOptional.get();
            String studentName = student.getName();
            System.out.println("studentName = " + studentName);
        }
        else {
            System.out.println("학생 데이터가 없음");
        }

    }
}
