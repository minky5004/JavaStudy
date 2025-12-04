package Chapter1.variable;

public class Main {

    public static void main(String[] args) {


        // 여러가지 자료형
        int intBox = 1;
        boolean booleanBox = true;
        char charBox = 'a';
        String stringBox = "abc";
        short shortBox = 123;
        float floatBox = 12.3f;
        double doubleBox = 12.3d;

        // 다운 캐스팅 큰 데이터 -> 작은 데이터
        double bigBox = 10.123;
        int smallBox = (int)bigBox;

        // 업 캐스팅 작은 데이터 -> 큰 데이터
        int smallBox2 = 10;
        double bixBox2 = smallBox2;

        // 다운캐스팅은 데이터 손실이 발생할 수 있지만, 업 캐스팅은 발생하지 않음,
        //또한 다운 캐스팅은 형 변환이 자동으로 일어나지 않고, 업 캐스팅은 자동으로 형 변환을 해줌



    }
}
