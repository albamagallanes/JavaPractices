import java.util.HashMap;

//http://community.topcoder.com/stat?c=problem_statement&pm=13067
public class Unique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeDuplicates("topcoder"));
		System.out.println(removeDuplicates("banana"));
	}

	public static String removeDuplicates(String S){
		HashMap memory = new HashMap<Character,Integer>();
		String output="";
		for(int i=0; i<S.length(); i++){
			if(!memory.containsKey(S.charAt(i))){
				output = output+S.charAt(i)+"";
				memory.put(S.charAt(i), 1);
			}
		}
		return output;
	}
}
