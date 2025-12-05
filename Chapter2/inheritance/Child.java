package Chapter2.inheritance;

public class Child extends Parent {

    public String familyName = "minky";

    public Child() {
        super();
        System.out.println("자식 생성");
    }

    public void superTest() {
        System.out.println(super.familyName);
    }

    public void showSNS() {
        System.out.println("SNS도 합니다.");
    }

    // 오버라이드 : 부모클래스에서 선언된 기능을 재정의 할 수 있음
    @Override
    public void introduceFamily() {
        System.out.println("오버라이드 성공");
    }
}
