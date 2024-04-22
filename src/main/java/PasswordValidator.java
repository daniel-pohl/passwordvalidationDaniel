public class PasswordValidator {

    public static boolean validateLength(String password) {
        final int MIN_LENGTH = 8;
        return password.length() >= MIN_LENGTH;
    }


//    public static boolean containsDigits(String password) {
//      for (char c : password.toCharArray()) {
//            if (Character.isDigit(c)) {
//                return true;
//            }
//        }
//        return false;
//
//    }
//
//
//    public static boolean containsUpperCaseAndLowerCase(String password) {
//        // Implementierung der Überprüfung auf Groß- und Kleinbuchstaben hier
//        // Rückgabetyp: boolean
//        // Parameter: String password
//    }
//
//
//    public static boolean isCommonPassword(String password) {
//        // Implementierung der Überprüfung auf häufig verwendete Passwörter hier
//        // Rückgabetyp: boolean
//        // Parameter: String password
//    }
}
