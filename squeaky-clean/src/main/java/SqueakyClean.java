import java.util.HashMap;
import java.util.Map;

class SqueakyClean {
    static String clean(String identifier) {
        identifier = identifier.replaceAll(" ", "_");
        identifier = toCamelCase(identifier);
        identifier = convertLeetSpeak(identifier);
        return identifier.replaceAll("[^a-zA-Z_]", "");
    }

    public static String toCamelCase(String input) {
        String[] words = input.split("-");
        StringBuilder camelCaseString = new StringBuilder(words[0].toLowerCase());

        for (int i = 1; i < words.length; i++) {
            camelCaseString.append(words[i].substring(0, 1).toUpperCase())
                    .append(words[i].substring(1).toLowerCase());
        }

        return !input.contains("-") ? input : camelCaseString.toString();
    }

    public static String convertLeetSpeak(String input) {
        Map<Character, Character> leetMap = new HashMap<>();
        leetMap.put('4', 'a');
        leetMap.put('3', 'e');
        leetMap.put('0', 'o');
        leetMap.put('1', 'l');
        leetMap.put('7', 't');

        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            result.append(leetMap.getOrDefault(c, c));
        }

        return result.toString();
    }

}
