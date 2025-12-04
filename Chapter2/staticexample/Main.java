package Chapter2.staticexample;

public class Main {


    // static 변수와 메서드 활용
    public static void main(String[] args) {
        System.out.println("static 변수 활용 : " + Person.Population);
        Person.printPopulation();


        // 인스턴스 멤버 활용
        Person p1 = new Person();
        Person p2 = new Person();

        // 인스턴스 변수 활용
        p1.name = "minky";
        p2.name = "steve";

        // 인스턴스 메서드 활용
        p1.printName();
        p2.printName();

        Person.printPopulation();
    }
}
