package Chapter2.clazz;

public class Person {

    // 1. 속성 - 변수 선언

    String name;
    int age;
    String address;

    // 2. 생성자
    // 클래스와 이름이 같아야함.
    // 반환 타입이 존재하지 않음
    // 여러개가 존재할 수 있음


    //Person() {} // 눈에 보이지 않는 기본 생성자
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 3. 기능
    // 게터
    // 내용을 가져옴
    String getName() {
        return this.name;
    }


    // 세터
    // 내용을 설정함
    void setAddress(String address) {
        this.address = address;
    }
}
