import java.util.Scanner;

public class CarFactory {
    Car buildCar() {
        Scanner keyin = new Scanner(System.in);

        System.out.print("Enter model: ");
        String model = keyin.nextLine();

        System.out.print("Enter Horse Power: ");
        int horsePower = Integer.parseInt(keyin.nextLine());
        keyin.close();

        // returning object/instance from method
        Car c = new Car(model, horsePower);

        return c;
    }

    void modifyCar(Car c, String model, Integer horsePower) {
        c.setModel(model);
        c.setHorsePower(horsePower);
    }
}
