// Check if given Strings are inverse of each other

public class InverseStrings {
    public static boolean areInverseStrings(String text1, String text2) {
        StringBuilder stringBuilder = new StringBuilder(text1);
        StringBuilder reverseText1 = stringBuilder.reverse();
        String reverseText1AsString = reverseText1.toString();

        return reverseText1AsString.equals(text2);
    }
}
