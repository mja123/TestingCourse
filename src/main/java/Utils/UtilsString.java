package Utils;

public class UtilsString {
    public static boolean isEmpty(String word) {
        if (word.isEmpty() || word.trim().isEmpty() || word == null) {
            return false;
        }
        return true;
    }
}
