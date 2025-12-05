package Chapter2.inheritance;

public class Main {

    public static void main(String[] args) {

        Child child = new Child();
        System.out.println(child.familyName);
        System.out.println(child.honor);
        child.introduceFamily();
        child.superTest();
        child.showSNS();

    }
}
