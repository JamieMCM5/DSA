/**
 * Hashmaps
 */

import java.util.*;
public class Hashmaps {

    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Jamie", 19);
        people.put("Alana", 17);
        people.put("Lisa", 50);
        people.put("Lauren", 24);
        people.put("Val", 55);
        people.put("Other Jamie", 19);

        int alanaAge = people.get("Alana");
        int target = 19;

        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            if(entry.getValue().equals(target)){
                System.out.println(entry.getKey());
            }
        }
        System.out.println(alanaAge);
    }
}