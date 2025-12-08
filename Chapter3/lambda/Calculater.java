package Chapter3.lambda;


// 함수형 인터페이스를 사용할 경우 인터페이스에 추상메소드 한개만 선언이 가능
// 람다는 추상메소드가 2개 이상일 경우 사용 불가능하기에 인터페이스를 함수형으로
// 선언하는것이 강제된다
@FunctionalInterface
public interface Calculater {

    int sum(int a, int b);

}
