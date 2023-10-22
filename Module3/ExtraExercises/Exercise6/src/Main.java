//Stwórz aplikację, która będzie pozwalała użytkownikowi na dodawanie, usuwanie oraz wyświetlanie imion z listy.
//W przypadku, gdy imię do usunięcia będzie obecne na liście wielokrotnie, usuń wszystkie wystąpienia. Aplikacja powinna
//działać do momentu, gdy użytkownik nie wybierze opcji kończącej działanie aplikacji.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        boolean programLoop = true;
        while (programLoop){
            System.out.println("Enter choice:");
            System.out.println("add or\t remove or\t display names\t quit to exit:");
            String choice = scanner.nextLine().strip().toLowerCase();
            switch (choice){
                case "add" -> {
                    System.out.println("Enter the name to add: ");
                    names.add(scanner.nextLine());
                }
                case "remove" ->{
                    System.out.println("Enter the name to remove: ");
                    String tempName = scanner.nextLine();
                    while (names.contains(tempName)){
                        names.remove(tempName);
                    }
                }
                case "display" ->{
                    for (String name : names){
                        System.out.println(name);
                    }
                }
                case "quit" -> {
                    programLoop = false;
                }
                default -> {
                    System.out.println("Unknown command");
                }
            }
        }
    }
}