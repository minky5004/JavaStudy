package Chapter3.lambda;

public class Main {

    public static void main(String[] args) {


        // 인터페이스를 활용한 익명클래스 만들기
        // 필요할때 클래스 내에서 직접 선언하여 사용하기 (익명클래스)
        Calculater calculater1 = new Calculater() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        
        int ret1 = calculater1.sum(1, 2);
        System.out.println("ret1 = " + ret1);


        // 인터페이스를 활용한 람다식 만들기
        Calculater calculater2 = (a,b) -> a+b;
        int ret2 = calculater2.sum(3,4);
        System.out.println("ret2 = " + ret2);


        // 람다식을 매개변수로 전달하는 방법

        // 1. 익명클래스를 변수에 담아 매개변수로 전달
        Calculater ca1 = new Calculater() {
            @Override
                    public int sum(int a, int b){
                return a+b;
            }
        };

        int ret3 = ca1.sum(3,4);
        System.out.println("ret3 = " + ret3);

        // 2. 람다식을 변수에 담아 매개변수로 전달
        Calculater cal2 = (a,b) -> a+b;
        int ret4 = cal2.sum(3,4);
        System.out.println("ret4 = " + ret4);

        // 3. 람다식을 직접 매개변수로 전달
        int ret5 = calculate(5,5, (a,b) -> a+b);
        System.out.println("ret5 = " + ret5);
    }


    public static int calculate(int a, int b , Calculater calculater){
        return calculater.sum(a,b);
    }


}


