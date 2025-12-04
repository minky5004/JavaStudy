package Chapter1.array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //모험가 명단 관리
        String name1 = "gimas";
        String name2 = "steve";
        String name3 = "tom";

        String[] adventuerList = {name1, name2,name3};

        // 1. 배열 선언
        int[] arr;

        // 2. 배열 길이 할당
        arr = new int[5];

        // 3. 배열 선언과 길이 동시 할당
        int[] arr2 = new int[5];

        // 배열 선언과 동시에 배열의 요소 할당
        int[] arr3 = {10,20,30,40,50,};

        System.out.println(arr3.length);

        //문자열 배열
        String[] strArr = new String[5];

        //논리형 배열
        boolean[] boolArr = new boolean[5];

        //2차원 배열

        boolean[][] board = new boolean[2][4];
        //[][][][]
        //[][][][] <-이렇게 생긴 2차원 배열 생김

        boolean[][] chess = {
                {true,false},
                {false,true},
        };
        System.out.println(chess[0][0]);
        System.out.println(chess[1][0]);


    }
}
