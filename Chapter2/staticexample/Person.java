package Chapter2.staticexample;

public class Person {

    // 인스턴스 변수
    String name;

    // static 변수
    static int Population = 0;

    // 인스턴스 메서드
    void printName() {
        System.out.println("name = " + name);
    }

    Person() {
        Population++;
    }


    // static 메서드
    static void printPopulation() {
        System.out.println("Population = " + Population);
    }
}
