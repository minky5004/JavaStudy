package Chapter2.inheritance;

public class Parent {
    
    public String familyName = "스파르탄";
    public int honor = 10;

    public Parent() {
        System.out.println("부모 생성");
    }

    public void introduceFamily() {
        System.out.println("우리 가문은 " + familyName);
    }
}
