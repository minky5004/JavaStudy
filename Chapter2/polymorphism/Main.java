package Chapter2.polymorphism;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.exist();
        animal2.exist();

        animal1.makessound();
        animal2.makessound();

        // 형변환
        // 업캐스팅 자식 -> 부모 | 자식의 고유 기능을 사용할 수 없음
        // animal1.scratch() 불가 X

        // 다운캐스팅 부모 -> 자식 | 사용자가 직접 형 변환을 해주어야 함 | 자식의 고유 기능 사용 가능
        Cat cat = (Cat) animal1;
        cat.scratch();

        // 다운 캐스팅 주의점!
        // Cat cat2 = (cat) animl2; animl2 는 dog객체인데 다운캐스팅할때 실행시키기 전까지는 오류로 보여주지 않음
        // 이때 사용할것이 instanceof

        if (animal2 instanceof Cat){
            Cat cat2 = (Cat) animal1;
        }else {
            System.out.println("객체가 고양이가 아닙니다.");
        }
    }
}
