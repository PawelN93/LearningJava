//Stwórz prostą aplikację umożliwiającą wypożyczanie samochodów. Wykorzystaj do tego HashMapę, w której kluczem będzie
//nazwa samochodu, a wartością informacja czy samochód jest dostępny do wypożyczenia czy nie. Pozwól użytkownikowi na
//wyświetlanie wszystkich samochodów (wraz z informacją czy są dostępne czy nie), na wyświetlanie tylko dostępnych
//samochodów oraz wyświetlanie wypożyczonych przez niego samochodów. Nie pozwól, by użytkownik mógł wypożyczyć więcej niż
//3 samochody naraz.

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        HashMap<String, Boolean> carRental = new HashMap<>();
        ArrayList<String> userCars = new ArrayList<>();
        int maxRentedCars = 3;

        carRental.put("Toyota", true);
        carRental.put("Opel", true);
        carRental.put("BMW", true);
        carRental.put("Mercedes", true);
        carRental.put("Honda", true);
        carRental.put("Fiat", true);
        carRental.put("Renault", true);
        carRental.put("Citroen", true);
        carRental.put("Ford", true);
        carRental.put("Skoda", true);

        boolean loopCondition = true;
        while (loopCondition){
            System.out.println("all - to display all cars; free - to display available cars; rented - to display yours" +
                    " cars\nrent - to rent a car; return - to return a car\nquit - to exit program");
            System.out.println("Enter command: ");
            choice = scanner.nextLine().toLowerCase().strip();

            switch (choice){
                case "all" ->{
                    Set<String> keys = carRental.keySet();
                    System.out.println("ALL CARS:");
                    for (String key: keys){
                        System.out.println(key +" -> Available: " + carRental.get(key));
                    }
                }
                case "free" -> {
                    Set<String> keys = carRental.keySet();
                    System.out.println("FREE CARS:");
                    for (String key: keys){
                        if (carRental.get(key)){
                            System.out.println(key);
                        }
                    }
                }
                case "rented" -> {
                    System.out.println("RENTED CARS:");
                    for (String car : userCars){
                        System.out.println(car);
                    }
                }
                case "rent" -> {
                    if (userCars.size() < maxRentedCars){
                        System.out.println("Enter name of the car to rent:");
                        String car = scanner.nextLine();
                        if (carRental.containsKey(car) && carRental.get(car)){
                            userCars.add(car);
                            carRental.put(car, false);
                            System.out.println("SUCCESS!");
                        }
                        else{
                            System.out.println("No available car!");
                        }

                    }
                    else{
                        System.out.println("Cannot rent more than 3 cars!");
                    }
                }
                case "return" -> {
                    System.out.println("Enter name of ther car to return:");
                    String car = scanner.nextLine();
                    if (carRental.containsKey(car) && userCars.contains(car)){
                        carRental.put(car, true);
                        userCars.remove(car);
                        System.out.println("SUCCESS!");
                    }
                    else{
                        System.out.println("There is no car!");
                    }
                }
                case "quit" -> {
                    System.out.println("Exiting!");
                    loopCondition = false;
                }
                default -> {
                    System.out.println("Unknown command");
                }
            }

        }

    }
}