import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> carArrayList = new ArrayList<>();
        Race race = new Race();
       // Car car = new Car(carName, speed);


        for (int i = 1; i <= 3; i++) {

            System.out.println(" - Введите название машины № " + i);
            String carName = scanner.next();


            System.out.println(" - Введите скорость машины № " + i);

            int speed = scanner.nextInt();
            while (speed > 250 || speed < 0) {
                System.out.println("Введена некорректная скорость!");
                System.out.println(" - Введите скорость машины № " + i);
                speed = scanner.nextInt();


            }

            Car car = new Car(carName, speed);

            carArrayList.add(car);
            race.getDistation(carName, speed);




        }

        for (Car cars : carArrayList) {
            System.out.print("Название автомобиля: " + cars.name + ", скорость: " + cars.speed + "\n");
        }
    }
}













