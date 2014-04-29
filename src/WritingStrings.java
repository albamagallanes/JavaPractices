import java.util.HashMap;

//http://community.topcoder.com/stat?c=problem_statement&pm=13072
public class WritingStrings {

	/**
	 * @param args
	 */
	static HashMap abc = new HashMap<Character, Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		abc.put('A', 1); abc.put('B', 2); abc.put('C', 3); abc.put('D', 4); abc.put('E', 5); abc.put('F', 6);
		abc.put('G', 7); abc.put('H', 8); abc.put('I', 9); abc.put('J', 10); abc.put('K', 11); abc.put('L', 12);
		abc.put('M', 13); abc.put('N', 14); abc.put('O', 15); abc.put('P', 16); abc.put('Q', 17); abc.put('R', 18);
		abc.put('S', 19); abc.put('T', 20); abc.put('U', 21); abc.put('V', 22); abc.put('W', 23); abc.put('X', 24);
		abc.put('Y', 25); abc.put('Z', 26);
		
		System.out.println(countTypes("VAMOSGIMNASIA"));
		System.out.println(countTypes("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ"));
	}
	
	public static int countTypes(String word){
		int sum=0;
		for (int i=0; i< word.length(); i++){
			if(abc.containsKey(word.charAt(i))){
				sum += (int)abc.get(word.charAt(i));
			}
		}
		return sum;
	}

}
