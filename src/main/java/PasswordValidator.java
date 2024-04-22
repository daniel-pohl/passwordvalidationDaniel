import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PasswordValidator {

    public static void main(String[] args) throws IOException {
        //System.out.println(isCommonPassword("12345"));
    }

    public static boolean validateLength(String password) {
        final int MIN_LENGTH = 8;
        return password.length() >= MIN_LENGTH;
    }

    public static boolean containsDigits(String password) {
      for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsUpperCaseAndLowerCase(String password) {
        boolean UpperCase = false;
        boolean LowerCase = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                UpperCase = true;
            } else if (Character.isLowerCase(c)) {
                LowerCase = true;
            }
            if (UpperCase && LowerCase) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCommonPassword(String password) throws IOException {
        List<String> wordList = new ArrayList<>();
        String jsonFilePath = "C:/NeueFische/passwordvalidationDaniel/src/passwords.json";

        try {
            String jsonContent = new String(Files.readAllBytes(Paths.get(jsonFilePath)));
            JSONObject jsonObject = new JSONObject(jsonContent);
            // Array von Wörtern aus dem JSON-Objekt erhalten
            JSONArray wordsArray = jsonObject.getJSONArray("passwords");
            // Wörter aus dem Array lesen und der Liste hinzufügen
            for (int i = 0; i < wordsArray.length(); i++) {
                wordList.add(wordsArray.getString(i));
            }
        } catch (IOException | JSONException e) {
            System.err.println("Fehler beim Lesen der Datei oder Parsing des JSON: " + e.getMessage());
            return false;
        }
        return wordList.contains(password);
    }
    public static boolean containsSpecialCharacter(String password) {
        boolean SpecialCharacter = false;

        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                SpecialCharacter = true;
                break;
            }
        }
        return SpecialCharacter;
    }
}
