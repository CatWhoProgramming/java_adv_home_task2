package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        LinkedList<String> linkList = new LinkedList<>();
        Queue<String> queue = new PriorityQueue<>(2, new Comparator<String>() {
            @Override
            public int compare(String i1, String i2) {
                return i1.compareTo(i2);
            }
        });
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            String read = reader.readLine();
            String[] words = read.split(" ");
            for (String i : words) {
                arrList.add(i);
                linkList.add(i);
                queue.add(i);
                arrayDeque.add(i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Collections.sort(arrList);
        Collections.sort(linkList);
        arrList.clone();
        System.out.println(arrList);
        System.out.println(linkList);
        System.out.println(queue);
        System.out.println(arrayDeque);
        doubleValue(arrList);
    }

    private static void doubleValue(ArrayList<String> arrList) {
        arrList.addAll(arrList.size(), arrList);
        Collections.sort(arrList);
        System.out.println(arrList);
    }


}
