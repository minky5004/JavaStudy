package Chapter2.wrapper;

public class Main {

    public static void main(String[] args) {
        
        // 기본형 변수
        int a = 1;
        System.out.println("a = " + a);
        
        // 참조형 변수
        Person personA = new Person();
        System.out.println("personA = " + personA);
        int[] arr = {1,2,3,4,5};
        System.out.println("arr = " + arr);

        // 래퍼클래스
        CustomInteger myInteger = new CustomInteger(10);
        String numString = myInteger.toString();


        //오토박싱 (기본형 -> 래퍼형)
        Integer numob = 10;
        //Integer numob = Integer.valueOf(10);

        //오토언박싱 (래퍼형 -> 기본형)
        Integer numuob = numob;
        //int numuob = numob.intValue(10);



    }
}
