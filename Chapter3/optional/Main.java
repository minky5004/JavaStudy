package Chapter3.optional;

public class Main {

    public static void main(String[] args) {

        Camp camp = new Camp();
        Student student = camp.getStudent();
        Student steve = new Student("Steve");
        camp.setStudent(steve);

        System.out.println("student = " + student);

        // 직접적인 null 처리 방법
        String studentName;
        if (student != null) {
            studentName = student.getName();
        }
        else {
            System.out.println("등록된 학생이 아닙니다.");
        }

        // 2. NullPointerException 존재하지 않는것을 get을 호출해서 예외 발생
//        String studentName = student.getName();
//        System.out.println("studentName = " + studentName);


    }
}
