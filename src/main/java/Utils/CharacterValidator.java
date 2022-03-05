package Utils;

public class CharacterValidator {
    public static boolean onlyNumbers(String word) {
        System.out.println(word.matches("[\\d]"));
        return word.matches("[\\d]");
    }
    public static boolean onlyLetters(String word) {
        return !word.matches("[A-Za-z]");
    }
    public static boolean specialCharacters(String word) {
        return !word.matches("[A-Za-z0-9]");
    }
}
