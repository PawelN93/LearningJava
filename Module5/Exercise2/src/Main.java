import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj date urodzenia (1988-01-31): ");
        String dateString = scanner.nextLine();

        LocalDate dateOfBirth = LocalDate.parse(dateString);

        LocalDate now = LocalDate.now();
        Period period = Period.between(dateOfBirth, now);

        System.out.println("Masz " + period.getYears() + " lat.");
        System.out.println("Masz " + period.getMonths() + " miesięcy.");
        System.out.println("Masz " + period.getDays() + " dni.");
    }
}