import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jak masz na imie?");
        String imie = scanner.nextLine();

        System.out.println("Jak masz na nazwisko?");
        String nazwisko = scanner.nextLine();

        System.out.println("Ile masz lat?");
        int wiek = scanner.nextInt();

        System.out.println("Imie: " + imie + "\nNazwisko: " + nazwisko + "\nWiek: " + wiek);
    }
}