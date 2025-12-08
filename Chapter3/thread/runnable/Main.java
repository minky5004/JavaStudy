package Chapter3.thread.runnable;

public class Main {

    public static void main(String[] args) {

        // runnable 쓰는 이유 : Java는 클래스 다중 상속을 지원하지 않기 때문에 runnable이라는 인터페이스를 활용하여 클래스를 상속받을 수 있게 만든다
        MyRunnable myTask = new MyRunnable();

        Thread thread0 = new Thread(myTask);
        Thread thread1 = new Thread(myTask);

        thread0.start();
        thread1.start();

        myTask.printMessage();

    }
}
