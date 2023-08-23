package Task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        try (Scanner input = new Scanner(System.in)) {

            while (input.hasNext()) {
                String str = input.nextLine();
                if (!str.equals("end")) {
                    list.add(str);
                } else break;
            }

        }

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println("list: " + itr.next());
        }
    }
}
