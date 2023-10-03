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

/*
Javautveckling - Inlämningsuppgift - Del 2 – Klasser och objekt (VG-NIVÅ)

Jag valde att skapa en räknare som kan beräkna hastighet, sträcka och tid, som man gjorde i skolan förutsatt att
hastigheten är konstant. Jag ville göra det lätt för mig att fokusera på kod istället för beräkningarna eller själva
programmet. Mitt mål var att få det att fungera och tänka till vad som krävs för att få ihop det.

Jag började med att skapa metoderna i Calculator-klassen och gjorde enkla dialoger i Main-klassen för att kontrollera
att både kopplingar och beräkningar fungerade. När första fungerade gjorde jag exakt likadant för respektive metod och
insåg att jag inte kan få ut rätt beräkningar genom att endast ställa frågan om sträcka, tid och hastighet till
användaren. Jag behövde hitta ett sätt att kontrollera vad användaren vill beräkna och se till att rätt metod används,
det var så jag kom fram till att switch-kontrollen kan vara en bra idé.

Vid dem första testerna insåg jag att för varje fråga och svar, så kan fel inmatning uppstå och lade till try-catch
metoden på alla rader som krävde ett svar. Detta fylldes på med varje test där detta saknades och exekveringen inte
gick som tänkt.

När jag upplevde att programmet fungerade någorlunda behövde jag se till att programmet körs så länge användaren skriver
"ja". Den tog största delen av processen, då jag skrev om do-while- och while-satserna många gånger och flyttade runt
på det innan det äntligen fungerade.

Efter att ha fått ihop detta tyckte jag att det var lite väl många upprepade while-satser för varje fråga och beräkning,
men här var jag egentligen redo att ge upp och nöja mig där efter alla felsökningar och tänkte ta det som eventuell
förbättring för framtiden. IntelliJ är som vi vet väldigt smart och såg detta och rekommenderade mig att skapa metoder
av dessa upprepningar, vilket jag gjorde och allt hamnade i botten av Main-klassen. Det blev renare i koden, men stökigt
i botten, så jag flyttade över allt till en ny klass "WhileRepeat.java" och kallade på metoderna genom att ange
klass-namnet och en punkt följt av metodnamnet.

En annan förbättring som hade kunnat göras är att programmet kan läsa in meter och sekunder, eller andra typer av
enheter för att ge snyggare svar som alternativ om man ska beräkna annat än körning. Jag har i detta program bestämt
att beräkna respektive för just körningen och inget annat.
 */