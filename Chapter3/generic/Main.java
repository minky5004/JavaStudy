package Chapter3.generic;

public class Main {

    public static void main(String[] args) {
        // 1. 재사용 불가
        Box box1 = new Box(100);
        // Box box1 = new Box("ABC"); 불가능

        // 2. 낮은 타입 안정성
        ObjectBox strBox = new ObjectBox("ABC");
        ObjectBox intBox = new ObjectBox(123);
        // item을 사용하기 위해서는 다운캐스팅을 해야함

        String item = (String) strBox.getItem();

        // 제네릭 활용
        // 1. 재사용성 보장 (타입 소거: T -> Object)
        GenericBox<String> strGBox = new GenericBox<>("ABC");
        GenericBox<Integer> intGBox = new GenericBox<>(123);
        GenericBox<Double> doubleGBox = new GenericBox<>(0.1);

        // 2. 타입 안정성 보장(타입 소거: 자동으로 다운캐스팅 삽입)
        String StrGBoxItem = strGBox.getItem();
        System.out.println("StrGBoxItem = " + StrGBoxItem);

        Integer intGBoxItem = intGBox.getItem();
        System.out.println("IntGBoxItem = " + intGBoxItem);

        double doubleGBoxItem = doubleGBox.getItem();
        System.out.println("DoubleGBox = " + doubleGBoxItem);

        // 일반 메서드
        strGBox.printItem();


    }
}
