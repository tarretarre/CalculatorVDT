import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileRepeat {
    static void whileVelocity(Scanner sc, Calculator calculator) {
        while (true) {
            try {
                System.out.println("I vilken hastighet körde du (km/h)?");
                calculator.setVelocity(sc.nextDouble());
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Du måste ange ett hel- eller decimaltal.");
                sc.next();
            }
        }
    }

    static void whileTime(Scanner sc, Calculator calculator) {
        while (true) {
            try {
                System.out.println("Hur många timmar körde du?");
                calculator.setTime(sc.nextDouble());
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Du måste ange ett hel- eller decimaltal.");
                sc.next();
            }
        }
    }

    static void whileDistance(Scanner sc, Calculator calculator) {
        while (true) {
            try {
                System.out.println("Hur många kilometer körde du?");
                calculator.setDistance(sc.nextDouble());
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Du måste ange ett hel- eller decimaltal.");
                sc.next();
            }
        }
    }
}
