package Chapter1.Operator;

public class Main {

    public static void main(String[] args) {

        //기본적인 사칙연산
        int a = 1;
        int b = 1;

        int sum = a + b;
        System.out.println(sum);

        int sub = a - b;
        System.out.println(sub);

        int mul = a * b;
        System.out.println(mul);

        int div = a / b;
        System.out.println(div);

        int mod = a % b; // 나머지 계산
        System.out.println(mod);

        // 복합대입

        int num = 1;
        num += 1;
        System.out.println(num);

        num -= 1;
        System.out.println(num);

        num *= 2;
        System.out.println(num);

        num /= 2;
        System.out.println(num);

        //증감 연산자

        num++; // 전위 연산 : 연산 후에 값이 활용
        ++num; // 후위 연산 : 연산 전에 값이 활용
        num--;
        --num;
        System.out.println(num);

        //비교 연산자/ true = 사실 false = 거짓

        System.out.println("10 == 10: " + (10 == 10)); // == 같은가?
        System.out.println("10 != 5: " + (10 != 5)); // != 다른가?

        System.out.println("10 < 5: " + (10 < 5)); // 오른쪽이 큰가?
        System.out.println("10 >= 10: " + (10 >= 10)); // 왼쪽이 같거나 큰가?
        System.out.println("10 <= 5: " + (10 <= 5)); // 오른쪽이 같거나 큰가?

        //논리 연산자

        System.out.println("true && true: " + (true && true));  // && = and 연산자 | 둘다 참 일 경우 true 하나라도 거짓일경우  false
        System.out.println("true || false: " + (true || false)); // || = or 연산자 | 둘중 하나라도 참 일 경우 true 둘 다 거짓일 경우 false
        System.out.println("!true: " + (!true));  // ! = not 연산자 | true라면 false 반환 / false라면 true 반환

        //문자열 비교
        String text1 = "Hello";
        String text2 = "Hello";

        boolean isEqual = text1.equals(text2);
        System.out.println(isEqual);
    }
}
