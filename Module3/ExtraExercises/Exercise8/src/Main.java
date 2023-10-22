//Stwórz ArrayListę, na której znajdzie się dziesięć elementów. Stwórz nową listę i przypisz do niej elementy z pierwszej
//listy w losowej kolejności. Wykorzystaj do tego klasę Random(). Przykładowe użycie klasy Random jest następujące:
//
//        Random random = new Random();
//        random.nextInt(11);
//Powyższy kod wylosuje liczbę z przedziału 0 – 10. Jeżeli zamiast nextInt(11) napiszemy nextInt(10) losowana liczba
//będzie z przedziału 0 – 9.

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> elements = new ArrayList<>();
        ArrayList<String> randomElements = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            elements.add("Element " + i);
        }

        Random random = new Random();

//      1 method
//        ArrayList<Integer> existingIndexes = new ArrayList<>();
//        while(randomElements.size() != elements.size()){
//            int temp = random.nextInt(elements.size());
//            if (!existingIndexes.contains(temp)){
//                randomElements.add(elements.get(temp));
//                existingIndexes.add(temp);
//
//            }
//        }

//        2 method
        ArrayList<String> tempList = new ArrayList<>(elements);

        while(!tempList.isEmpty()){
            int temp = random.nextInt(tempList.size());
            randomElements.add(tempList.get(temp));
            tempList.remove(temp);
        }


        for (int i = 0; i < elements.size(); i++){
            System.out.println(elements.get(i) + "\t" + randomElements.get(i));
        }
    }
}