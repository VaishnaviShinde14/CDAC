public class ReverseWords2  {
    public static void main(String[] args) {
        System.out.println(reverseWords("Hello World"));  
        System.out.println(reverseWords("Java Programming"));   
    }
    public static int reverseString(String sentence) {
		String[] words = sentence.split(" ");
		StringBuilder reversed = new StringBuilder();
		for (int i = words.length - 1; i >=0; i--){
			reversed.append(words[i]).append(" ");
		}
		return
		reversed.toString().trim();
	}
}
	