import java.util.HashMap;
import java.util.Map;

public class GenderNeutrality {
    public static void main(String[] args) {


        class GenderNeutralizer {
            public static void main(String[] args) {
                // Input paragraph
                String paragraph = "My son and daughter love their mother and father. A man and a woman should be treated equally.";

                // Gender-specific to gender-neutral word mapping
                Map<String, String> wordMap = new HashMap<>();
                wordMap.put("son", "child");
                wordMap.put("daughter", "child");
                wordMap.put("mother", "parent");
                wordMap.put("father", "parent");
                wordMap.put("man", "person");
                wordMap.put("woman", "person");

                // Process the paragraph
                String genderNeutralParagraph = replaceGenderSpecificWords(paragraph, wordMap);

                // Output result
                System.out.println("Original Paragraph: " + paragraph);
                System.out.println("Gender-Neutral Paragraph: " + genderNeutralParagraph);
            }

            public static String replaceGenderSpecificWords(String text, Map<String, String> wordMap) {
                for (Map.Entry<String, String> entry : wordMap.entrySet()) {
                    String genderSpecific = entry.getKey();
                    String genderNeutral = entry.getValue();
                    // Replace all occurrences (case-sensitive)
                    text = text.replaceAll("\\b" + genderSpecific + "\\b", genderNeutral);
                }
                return text;
            }
        }
    }
}