package Chapter1.condition;

public class Main

{
	public static void main(String[] args)
	{

        //조건문 if문

        String light = "노란불";

        if (light.equals("초록불")){
            System.out.println("건너세요!");
        }
        else if (light.equals("빨간불")) {
            System.out.println("멈추세요!");
        }
        else {
            System.out.println("...");
        }

        //switch문

        int num = 1;

        switch (num){

            case 1:
                System.out.println("1입니다.");
                break;
            case 2:
                System.out.println("2입니다.");
                break;
            default:
                System.out.println("1도 아니고 2도 아닙니다.");

        }
        System.out.println("끝났습니다");
    }
}
