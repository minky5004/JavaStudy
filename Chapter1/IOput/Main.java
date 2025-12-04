package Chapter1.IOput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // sout 이후 탭
        System.out.println("Hello");
        System.out.println("Java");

        System.out.print("안녕");
        System.out.print("자바\n");

        //개행문자

        System.out.println("안녕\n자바");

        //입력을 위한 Scanner 사용
        Scanner stdin = new Scanner(System.in);

        System.out.println("좋아하는 문장 입력하세요 : ");
        String Answer = stdin.nextLine();

        System.out.println(Answer);
    }

}
