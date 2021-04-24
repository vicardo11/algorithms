// Find all possible substrings from given String

public class AllSubstringsOfGivenString {
    public static void substrings(String text) {
        for (int i = 0; i < text.length(); i++) {
            for (int j = i + 1; j <= text.length(); j++) {
                System.out.println(text.substring(i, j));
            }
        }
    }
}
