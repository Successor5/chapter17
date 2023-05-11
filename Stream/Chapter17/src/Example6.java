import java.util.HashMap;

public class Example6 {

        public static void main(String[] args) {
            // Create a new HashMap
            HashMap<String, Integer> hashMap = new HashMap<>();

            // Add some key-value pairs to the HashMap
            hashMap.put("Alice", 25);
            hashMap.put("Bob", 30);
            hashMap.put("Charlie", 35);

            // Access the value associated with a key
            int aliceAge = hashMap.get("Alice");
            System.out.println("Alice's age is " + aliceAge);

            // Iterate through the key-value pairs in the HashMap
            for (String name : hashMap.keySet()) {
                int age = hashMap.get(name);
                System.out.println(name + " is " + age + " years old");
            }

    }

}
