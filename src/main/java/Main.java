import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 1; i <= 3; i++) {
            //Работа с наименованием
            String carName = "";
            while (true) {
                System.out.println(" - Введите название машины № " + i);
                carName = scanner.nextLine();
                if (carName.isBlank()) {
                    System.out.println("Вы не ввели название машины!");
                } else {
                    break;
                }
            }
            //Работа со скоростью
            int speed;
            while (true) {
                System.out.println(" - Введите скорость машины № " + i);
                String input = scanner.nextLine();

                if (input.isBlank()) {
                    System.out.println("Вы ввели пустую строчку!");
                    continue;
                }
                try {
                    speed = Integer.parseInt(input);
                    if (speed <= 250 && speed > 0) {
                        break;
                    } else {
                        System.out.println("Введена некорректная скорость! Введите скорость из диапазона от 0 до 250");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Введите целое число!");
                }
            }
            Car car = new Car(carName, speed);
            race.getDistation(car);
        }
        scanner.close();
        System.out.println("Самая быстрая машина: " + race.leader);
    }
}










