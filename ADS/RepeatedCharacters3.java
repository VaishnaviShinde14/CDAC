public class RepeatedCharacters3{
	public static Set<Characters>findRepeatedChars(String str){
		Map<Character,Integer>charCount = new HashMap<>();
		for (char c : str.toCharArray()){
		charCount.put(c,charCount.getOrDefault(c,0)+1);
		}
		Set<Character>repeated = new HashSet<>();
		for(Map.Entry,Character,Integer> entrySet()){
		if (entry.getValue()>1){
		repeated.add(entry.getKet());
		}
		]
		return repeated;
		}
		public static void main(String []args){
		System.out.println(findRepeatedChars("programming"));
		System.out.println(findRepeatedChars("hello"));
	}
	}