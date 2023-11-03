import java.util.HashMap;

public class HashMapBasics {

   // hashMap --> functions like put, get, remove, containsKey, keySet() these are working in avg O(1) time complexity
    public static void main(String[] args) {
        HashMap<String, Integer> populationMap = new HashMap<>();

        // put data in HashMap
        populationMap.put("India", 127);
        populationMap.put("USA", 90);
        populationMap.put("Canda", 30);
        populationMap.put("China", 120);

        System.out.println("After Put");
        System.out.println(populationMap);

        // Update Data in HashMap
        populationMap.put("India", 130);
        populationMap.put("india", 130);
        System.out.println("After Update India population");
        System.out.println(populationMap);


        // Remove Data from HashMap
        populationMap.remove("india");
        System.out.println("After Remove india from population");
        System.out.println(populationMap);

        // Get Data From HashMap
        populationMap.get("India");

        // Error --> key not found
        populationMap.get("Germany");

        // Key is present or not --> T/F
        System.out.println(populationMap.containsKey("India")); // --> true
        System.out.println(populationMap.containsKey("Germany")); // --> false


        // Loops of HashMap
        // loop on key
        for (String key: populationMap.keySet()) {
            int population = populationMap.get(key);

            System.out.println(key + " ---> " + population);
        }

        // directly accessing the values
        for (int population: populationMap.values()) {
            System.out.println(population);
        }
    }

}