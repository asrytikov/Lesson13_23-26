package p2;

import p1.People;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>();
        names.put(1, "Alex");
        names.put(2, "Ivan");
        names.put(3, "Nick");
        names.put(4, "Masha");
        String val1 = names.get(2);
        System.out.println(val1);

        Set<Integer> set = names.keySet();
        Collection<String> collection = names.values();
        System.out.println(set);
        System.out.println(collection);
        names.replace(1, "Katya");
        names.remove(3);

        for(Map.Entry<Integer, String> entry : names.entrySet()){
            System.out.printf("Key %d Value %s \n", entry.getKey(), entry.getValue());
        }

        Map<String, People> peopleMap = new HashMap<>();
        peopleMap.put("jhghf65", new People("Alex", 32));
        peopleMap.put("sdfg34", new People("Masha", 33));
        peopleMap.put("dfvsgv", new People("Misha", 19));

        for(Map.Entry<String, People> entry: peopleMap.entrySet()){
            System.out.printf("Key: %s Value: %s \n", entry.getKey(), entry.getValue().toString());
        }

    }
}
