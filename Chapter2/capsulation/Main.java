package Chapter2.capsulation;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("minky","???");
        // private로 설정된 객체에는 생성자를 통해서 선언시에 private로 선언된 값에 접근할 수 있음


        // private로 선언된 값은 게터를 사용해 가져올 수 있다.
        String name = person.getName();
        System.out.println("name = " + name);

        // private로 선언된 값은 세터를 사용해 수정할 수 있다.
        person.setName("steve");
        System.out.println("name = " + name);;

    }
}
