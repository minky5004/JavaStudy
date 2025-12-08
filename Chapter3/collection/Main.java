package Chapter3.collection;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // ArrayList 순서보장, 중복가능
        ArrayList<String> names = new ArrayList<>();

        names.add("Spartan");
        names.add("Steve");
        names.add("Isac");
        names.add("1");
        names.add("Spartan");

        // 순서 보장, 중복 허용
        System.out.println("names = " + names);

        String name1 = names.get(0);
        System.out.println("name1 = " + name1);

        names.remove("Steve");
        System.out.println("names = " + names);

        // HashSet 순서보장 안함, 중복불가
        HashSet<String> unigueNames = new HashSet<>();

        unigueNames.add("Spartan");
        unigueNames.add("Steve");
        unigueNames.add("Isac");
        unigueNames.add("1");
        unigueNames.add("2");
        unigueNames.add("Spartan");

        unigueNames.remove("Spartan");
        System.out.println("unigueNames = " + unigueNames);

        // HashMap <키, 값>형태로 저장
        // 순서보장 안함, 키 중복 불가(값이 대입됨)
        HashMap<String, Integer> memberMap = new HashMap<>();

        memberMap.put("Spartan",15 );
        memberMap.put("Steve",50);
        memberMap.put("Isac",10);
        memberMap.put("John",1);
        memberMap.put("Alice",2);

        Integer num = memberMap.get("Spartan");
        System.out.println("num = " + num);

        memberMap.remove("Spartan");

        System.out.println("memberMap = " + memberMap);

        // 키 확인
        Set<String> keys = memberMap.keySet();
        System.out.println("keys = " + keys);

        // 값 확인
        Collection<Integer> values = memberMap.values();
        System.out.println("values = " + values);
    }
}
