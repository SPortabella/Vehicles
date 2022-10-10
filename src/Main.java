import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(askPlate(),askBrand(),askColour());

        System.out.println("The plate:" + car.getPlate());
        System.out.println("The brand:" + car.getBrand());
        System.out.println("The colour:" + car.getColour());
    }

    private static String askColour() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the colour:");
        return sc.nextLine();
    }

    private static String askBrand() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the brand:");
        return sc.nextLine();
    }

    private static String askPlate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the plate:");
        return sc.nextLine();
    }


}