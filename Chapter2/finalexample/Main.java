package Chapter2.finalexample;

public class Main {

    public static void main(String[] args) {

        // final을 사용했을 경우 이후에 수정할수 없다.

        // 상수 활용법
        System.out.println("파이는 ? : " + Circle.PI);

        //불변 객체 활용
        final Circle c1 = new Circle(2);
        System.out.println("c1 = " + c1);

        // 불변 객체의 내부 상태 변경이 필요한 경우
        // 새로운 객체를 만들기 or 새로운 메소드를 만들어 활용
        Circle c3 = c1.changeRadius(20);;
    }
}
