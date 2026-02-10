import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


     //   String carName = "";
        //   int speed = 0;
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();



        for (int i = 1; i <= 3; i++) {

            System.out.println(" - Введите название машины № " + i);
            String carName = scanner.next();
            int speed = 0;
            while (true) {
                System.out.println(" - Введите скорость машины № " + i);
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();

            if (speed > 250 || speed < 0) {
                break;
            } else {
                System.out.println("Введена некорректная скорость!");
            }
                } else {
                    System.out.println("Введите число!");
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














