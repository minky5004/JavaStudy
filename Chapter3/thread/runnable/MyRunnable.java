package Chapter3.thread.runnable;

public class MyRunnable extends MyNewClass implements Runnable {
    // runnable 쓰는 이유 : Java는 클래스 다중 상속을 지원하지 않기 때문에 runnable이라는 인터페이스를 활용하여 클래스를 상속받을 수 있게 만든다
    // 기능을 화장하기에도 용이
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("현재 시작된 쓰레드 : " + threadName);

        for(int i = 0; i < 10; i++) {
            System.out.println("현재 쓰레드 : " + threadName + " - " + i);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("현재 종료된 쓰레드 : " + threadName);

    }
}
