package StringPlusHashMap.CountFrequencyOfEachCharacter;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyCount {

    // -------------------------------
    // BRUTE FORCE APPROACH
    // -------------------------------
    public static Map<Character, Integer> frequencyBrute(String s) {
        // below line is not use for counting
        //Using it for:-
        // When i store a,then b,then c I want to print in that same order
        Map<Character, Integer> result = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {

            boolean alreadyCounted = false;

            // Check if this character appeared before
            for (int k = 0; k < i; k++) {
                if (s.charAt(i) == s.charAt(k)) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) continue;

            int count = 0;

            // Count full string
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            result.put(s.charAt(i), count);
        }

        return result;
    }

    // -------------------------------
    // BETTER APPROACH (ASCII ARRAY)
    // -------------------------------
    public static Map<Character, Integer> frequencyBetter(String s) {
        int[] freq = new int[256];
        boolean[] visited = new boolean[256];

        // Count frequencies
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        Map<Character, Integer> result = new LinkedHashMap<>(); // Create result Map (Final output container)

        // Build result in order of appearance
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!visited[ch]) {
                result.put(ch, freq[ch]);
                visited[ch] = true;
            }
        }

        return result;
    }

    // -------------------------------
    // OPTIMAL APPROACH (LinkedHashMap)
    // -------------------------------
    public static Map<Character, Integer> frequencyOptimal(String s) {
        Map<Character, Integer> result = new LinkedHashMap<>();

        for (char ch : s.toCharArray()) {
            result.put(ch, result.getOrDefault(ch, 0) + 1);
        }

        return result;
    }

    // -------------------------------
    // PRINTING FUNCTION
    // -------------------------------
    public static void printResult(String title, Map<Character, Integer> map) {
        System.out.println("\n" + title);
        System.out.println("---------------------");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // -------------------------------
    // MAIN FUNCTION (CONTROLLER)
    // -------------------------------
    public static void main(String[] args) {
        String input = "aabbbcc";

        Map<Character, Integer> bruteResult = frequencyBrute(input);
        Map<Character, Integer> betterResult = frequencyBetter(input);
        Map<Character, Integer> optimalResult = frequencyOptimal(input);

        printResult("Brute Force Result", bruteResult);
        printResult("Better Approach Result", betterResult);
        printResult("Optimal Approach Result (LinkedHashMap)", optimalResult);
    }
}

