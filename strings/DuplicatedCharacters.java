// Find all duplicated characters in String

import java.util.HashMap;
import java.util.Map;

public class DuplicatedCharacters {
    public static void duplicatedCharacters(String text1) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text1.length(); i++) {
            char character = text1.charAt(i);

            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            }
            else{
                map.put(character, 1);
            }
        }

        for (Character character : map.keySet()) {
            if (map.get(character) > 1){
                System.out.println(character + ": " + map.get(character) + " occurrences");
            }
        }
    }
}
