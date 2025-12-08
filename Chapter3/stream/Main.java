package Chapter3.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1,2,3,4,5));


        // for 명령형 스타일 : 각 요소 * 10 처리
        ArrayList<Integer> ret1 = new ArrayList<>();
        for (Integer num : arrayList) {
            Integer multipliedNum = num * 10;
            ret1.add(multipliedNum);
        }
        System.out.println(ret1);


        // stream 선언형 스타일: 각 요소 * 10처리
        List<Integer> ret2 = arrayList.stream() // 1. 데이터 준비
                .map(num ->num * 10) // 2. 연산 등록
                .collect(Collectors.toList()); // 3. 최종 연산
        System.out.println("ret2 = " + ret2);


        // 1. 익명클래스 직접 만들어서 변수에 담아 매개변수로 전달
        Function<Integer, Integer> function = new Function<>() {
            @Override
            public Integer apply(Integer integer){
                return integer * 10;
            }
        };

        List<Integer> ret3 = arrayList.stream()
                .map(function)
                .collect(Collectors.toList());
        System.out.println("ret4 = " + ret3);

        // 2. 람다식을 만들어서 변수에 담아 매개변수로 전달
        Function<Integer, Integer> functionLambda = (integer -> integer * 10);

        List<Integer> ret4 = arrayList.stream()
                .map(functionLambda)
                .collect(Collectors.toList());
        System.out.println("ret4 = " + ret4);

        // 3. 람다식을 직접 매개변수로 전달
        List<Integer> ret5 = arrayList.stream()
                .map(num ->num * 10)
                .collect(Collectors.toList());
        System.out.println("ret5 = " + ret5);


        // 중간 연산을 함께 사용하는 방법(filter() + map())
        // TO DO 리스트에서 짝수를 찾아서 * 10
        // 1. 짝수 찾기
        // 2. * 10 하기

        List<Integer> ret10 = arrayList.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * 10)
                .collect(Collectors.toList());
        System.out.println("ret10 = " + ret10);

    }
}
