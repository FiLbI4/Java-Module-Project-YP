import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 1; i <= 3; i++) {
            String carName = "";
            while (true) {
                System.out.println(" - Введите название машины № " + i);
                carName = scanner.nextLine();
                if (carName.trim().isEmpty()) {
                    System.out.println("Вы не ввели название машины!");
                } else {
                    break;
                }
            }
            int speed;
            while (true) {
                System.out.println(" - Введите скорость машины № " + i);
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();

                    scanner.nextLine();

                    if (speed <= 250 && speed > 0) {
                    break;
                    } else {
                    System.out.println("Введена некорректная скорость! Введите скорость из диапазона от 0 до 250");
                }
                } else {
                    System.out.println("Введите целое число!");
                    scanner.next();
                }
            }
            Car car = new Car(carName, speed);
            race.getDistation(car);
        }
        scanner.close();
        System.out.println("Победитель " + race.leader);
    }
}














