package Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LinkedListTask {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int a = Integer.parseInt(String.valueOf(reader.readLine()));
            System.out.println(a);
            getIntegerList(a, list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void getIntegerList(int a, LinkedList<Integer> list) {
        System.out.println(a);
        for (int i = 0; i < a; i++) {
            list.add(i, (int) (Math.random() * 100));
        }
        System.out.println("list is: " + list);
        findMinimum(list);
    }

    private static void findMinimum(LinkedList<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int i : list) {
            if (i < min)
                min = i;
        }
        System.out.println("min is: " + min);
    }
}
