package Chapter2.polymorphism;

public class Cat implements Animal{
    @Override
    public void makessound() {
        System.out.println("냐옹");
    }

    @Override
    public void exist() {
        System.out.println("고양이가 존재합니다.");
    }

    public void scratch(){
        System.out.println("스크래치");
    }
}
