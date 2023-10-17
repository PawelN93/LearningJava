/*
Stwórz program, który przekształci (a następnie wyświetli w konsoli) obiekt
typu String o wartośći "   Jak nauczyć się programowania   " w następujący
sposób:
- usunięte zostaną spacje z początku i końca
- wszystkie litery zostaną zamianienione na duże
- ze Stringa usunięte zostanie pierwsze słowo

Wynik działania programu powinien być następujący
NAUCZYĆ SIĘ PROGRAMOWANIA
 */

public class Main {
    public static void main(String[] args) {
        String zdanie = "   Jak nauczyć się programowania   ";
        String zdanie2 = "   Jak nauczyć się programowania   ";

        zdanie = zdanie.strip().toUpperCase().replace("JAK ", "");
        //lub
        zdanie2 = zdanie2.strip().toUpperCase().substring(4);
        System.out.println(zdanie2);

        System.out.println(zdanie);
    }
}