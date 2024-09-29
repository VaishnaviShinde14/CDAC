 public class FirstNonRepeatedChar1 {
    public static Character findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatedChar("stress"));  // t
        System.out.println(findFirstNonRepeatedChar("aabbcc"));  // null
    }
}



