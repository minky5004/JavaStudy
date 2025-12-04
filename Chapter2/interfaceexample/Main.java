package Chapter2.interfaceexample;

public class Main {

    public static void main(String[] args) {
        // 인스턴스화
        LuxuryCar luxuryCar = new LuxuryCar();
        SpeedCar speedCar = new SpeedCar();


        luxuryCar.drive();
        luxuryCar.stop();
        speedCar.drive();
        speedCar.stop();

        luxuryCar.charge();
        speedCar.autoParking();

    }
}
