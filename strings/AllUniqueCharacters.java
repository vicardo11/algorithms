// Check if given String has all unique characters

import java.util.HashSet;
import java.util.Set;

public class AllUniqueCharacters {
    public static boolean areAllCharactersUnique(String text1) {
        Set<Character> set = new HashSet<>();
      
        for (int i = 0; i < text1.length(); i++) {
            boolean add = set.add(text1.charAt(i));
            if (!add){
                return false;
            }
        }
        return true;
    }
}
