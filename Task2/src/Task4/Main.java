package Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> family = new HashMap<>();
        family.put("Kyiv", "Petrenko");
        family.put("London", "Jonson");
        family.put("New-York", "Smith");
        family.put("Brussels", "Ivanov");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String str = reader.readLine();

            for (Map.Entry<String, String> f : family.entrySet()) {
                if (str.equals(f.getKey()))
                    System.out.println(f.getValue());
                else System.out.println("not found");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
