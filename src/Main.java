import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String continueAnswer;
        boolean continueCalculator = true;

        while (continueCalculator) {
            int input = 0;
            boolean continueInput = false;

            System.out.println("Vad vill du beräkna med din körning? Ange 1, 2 eller 3. ");
            System.out.println("1. Hastighet.");
            System.out.println("2. Sträcka.");
            System.out.println("3. Tid.");
            do {
                try {
                    input = sc.nextInt();
                    sc.nextLine();
                    if (input >= 1 && input <= 3) {
                        continueInput = true;
                    } else {
                        System.out.println("ERROR: Ange 1, 2 eller 3.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("ERROR: Du måste ange ett heltal: 1, 2 eller 3.");
                    sc.nextLine();
                }
            } while (!continueInput);

            switch (input) {
                case 1 -> {
                    WhileRepeat.whileDistance(sc, calculator);
                    WhileRepeat.whileTime(sc, calculator);
                    calculator.calculatedVelocity();
                }

                case 2 -> {
                    WhileRepeat.whileVelocity(sc, calculator);
                    WhileRepeat.whileTime(sc, calculator);
                    calculator.calculatedDistance();
                }

                case 3 -> {
                    WhileRepeat.whileVelocity(sc, calculator);
                    WhileRepeat.whileDistance(sc, calculator);
                    calculator.calculatedTime();
                }
            }
            System.out.println("Vill du göra en ny beräkning?");
            continueAnswer = sc.next().toLowerCase();
            if (!continueAnswer.equals("ja")) {
                System.out.println("Programmet är avslutat.");
                continueCalculator = false;
            }
        }
    }
}
