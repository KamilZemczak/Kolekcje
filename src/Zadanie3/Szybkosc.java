package Zadanie3;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Kamil Zemczak
 */
public class Szybkosc {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        
        long startTime;
        
        System.out.println("1. Wstawianie elementu na początek.");
        startTime = System.nanoTime();
        arrayList.add(0, 0);
        System.out.println("ArrayList: " + (System.nanoTime() - startTime)/1000 + " mikrosekund");
        startTime = System.nanoTime();
        linkedList.add(0, 0);
        System.out.println("LinkedList: " + (System.nanoTime() - startTime)/1000 + " mikrosekund");
        System.out.println();
        
        System.out.println("2. Wstawianie elementu do środka.");
        startTime = System.nanoTime();
        arrayList.add(2, 6);
        System.out.println("ArrayList: " + (System.nanoTime() - startTime)/1000 + " mikrosekund");
        startTime = System.nanoTime();
        linkedList.add(2,6);
        System.out.println("LinkedList: " + (System.nanoTime() - startTime)/1000 + " mikrosekund");
        System.out.println();
        
        System.out.println("3. Wstawianie elementu na koniec.");
        startTime = System.nanoTime();
        arrayList.add(7);
        System.out.println("ArrayList: " + (System.nanoTime() - startTime)/1000 + " mikrosekund");
        startTime = System.nanoTime();
        linkedList.add(7);
        System.out.println("LinkedList: " + (System.nanoTime() - startTime)/1000 + " mikrosekund");
        System.out.println();
        
        System.out.println("4. Usunięcie z początku.");
        startTime = System.nanoTime();
        arrayList.remove(0);
        System.out.println("ArrayList: " + (System.nanoTime() - startTime)/1000 + " mikrosekund");
        startTime = System.nanoTime();
        linkedList.remove();
        System.out.println("LinkedList: " + (System.nanoTime() - startTime)/1000 + " mikrosekund");
        System.out.println();
        
        System.out.println("5. Usunięcie ze środka.");
        startTime = System.nanoTime();
        arrayList.remove(2);
        System.out.println("ArrayList: " + (System.nanoTime() - startTime)/1000 + " mikrosekund");
        startTime = System.nanoTime();
        linkedList.remove(2);
        System.out.println("LinkedList: " + (System.nanoTime() - startTime)/1000 + " mikrosekund");
        System.out.println();
        
        System.out.println("6. Usunięcie z końca.");
        startTime = System.nanoTime();
        arrayList.remove(5);
        System.out.println("ArrayList: " + (System.nanoTime() - startTime)/1000 + " mikrosekund");
        startTime = System.nanoTime();
        linkedList.removeLast();
        System.out.println("LinkedList: " + (System.nanoTime() - startTime)/1000 + " mikrosekund");
        System.out.println();
        
        System.out.println("7. Zwrócenie wartości pierwszego elementu.");
        startTime = System.nanoTime();
        arrayList.get(0);
        System.out.println("ArrayList: " + (System.nanoTime() - startTime)/1000 + " mikrosekund");
        startTime = System.nanoTime();
        linkedList.getFirst();
        System.out.println("LinkedList: " + (System.nanoTime() - startTime)/1000 + " mikrosekund");
        System.out.println();
        
        System.out.println("8. Zwrócenie wartości środkowego elementu.");
        startTime = System.nanoTime();
        arrayList.get(2);
        System.out.println("ArrayList: " + (System.nanoTime() - startTime)/1000 + " mikrosekund");
        startTime = System.nanoTime();
        linkedList.get(2);
        System.out.println("LinkedList: " + (System.nanoTime() - startTime)/1000 + " mikrosekund");
        System.out.println();
        
        System.out.println("9. Zwrócenie wartości ostatniego elementu.");
        startTime = System.nanoTime();
        arrayList.get(4);
        System.out.println("ArrayList: " + (System.nanoTime() - startTime)/1000 + " mikrosekund");
        startTime = System.nanoTime();
        linkedList.getLast();
        System.out.println("LinkedList: " + (System.nanoTime() - startTime)/1000 + " mikrosekund");
        System.out.println();
    }
}
