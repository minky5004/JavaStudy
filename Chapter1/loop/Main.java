package Chapter1.loop;

public class Main

{
	public static void main(String[] args)
	{

        //for문

        int customers = 5;

        for (int i = 1; i <= customers ; i++) {
            if (i == 4) {
                System.out.println("정원이 꽉찼습니다. 죄송합니다");
                break;
            }
            else if (i == 2){
                System.out.println(i+ "번 너는 나가라!");
                continue;
            }
            System.out.println(i + "번째 손님 안녕하세요");
        }

        //while 문
        int i = 1;

        while (i <= 10) {
            System.out.println("안녕하세요!");
            i++;
        }


        //do-while 문
        int a = 1;

        do {
            System.out.println("안녕히가세요!");
            a++;
        }while (a <= 10);


    }
}
