// Check if given Strings are anagrams

import java.util.Arrays;

public class StringAnagram {
    public static boolean isAnagram(String text1, String text2) {
        String[] text1split = text1.split("");
        String[] text2split = text2.split("");

        Arrays.sort(text1split);
        Arrays.sort(text2split);

        return Arrays.equals(text1split, text2split);
    }
}
