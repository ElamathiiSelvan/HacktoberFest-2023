import java.util.HashMap;

class Freq {
    public static void main(String args[]) {
        String s = "arijit das"; // Input string
        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            if (c != ' ') { // Ignore spaces
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }
        }

        // Print the frequency of each character
        for (char key : freqMap.keySet()) {
            System.out.println(key + "  " + freqMap.get(key));
        }
    }
}
