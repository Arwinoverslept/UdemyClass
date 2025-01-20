import java.util.HashMap;
import java.util.Map;


public class Hash {

	public static void main(String[] args) {
        String numString = "Eight hundred Seventy Three";
        System.out.println("The number is: " + convertWordToNumber(numString));
    }
	
	public static int convertWordToNumber(String numString) {
        // Mapping words to numbers
        Map<String, Integer> wordToNumber = new HashMap<>();
        wordToNumber.put("One", 1);
        wordToNumber.put("Two", 2);
        wordToNumber.put("Three", 3);
        wordToNumber.put("Four", 4);
        wordToNumber.put("Five", 5);
        wordToNumber.put("Six", 6);
        wordToNumber.put("Seven", 7);
        wordToNumber.put("Eight", 8);
        wordToNumber.put("Nine", 9);
        wordToNumber.put("Ten", 10);
        wordToNumber.put("Eleven", 11);
        wordToNumber.put("Twelve", 12);
        wordToNumber.put("Thirteen", 13);
        wordToNumber.put("Fourteen", 14);
        wordToNumber.put("Fifteen", 15);
        wordToNumber.put("Sixteen", 16);
        wordToNumber.put("Seventeen", 17);
        wordToNumber.put("Eighteen", 18);
        wordToNumber.put("Nineteen", 19);
        wordToNumber.put("Twenty", 20);
        wordToNumber.put("Thirty", 30);
        wordToNumber.put("Forty", 40);
        wordToNumber.put("Fifty", 50);
        wordToNumber.put("Sixty", 60);
        wordToNumber.put("Seventy", 70);
        wordToNumber.put("Eighty", 80);
        wordToNumber.put("Ninety", 90);
        wordToNumber.put("Hundred", 100);
        wordToNumber.put("Thousand", 1000);
        wordToNumber.put("Million", 1000000);

        // Split the string into words
        String[] words = numString.split(" ");
        int result = 0;
        int temp = 0;

        // Convert words to numbers
        for (String word : words) {
            if (wordToNumber.containsKey(word)) {
                int value = wordToNumber.get(word);

                // If the word is "Hundred", multiply the current value
                if (value == 100) {
                    temp *= value;
                } else if (value == 1000 || value == 1000000) {
                    // If the word is "Thousand" or "Million", multiply and add to the result
                    result += temp * value;
                    temp = 0;
                } else {
                    // Otherwise, add the current value to temp
                    temp += value;
                }
            }
        }

        // Add the remaining temp to the result
        result += temp;

        return result;
    }
	
}
