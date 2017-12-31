public class PangramChecker {

	public boolean isPangram(String input) {
		char[] alphabetList = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		String potentialPangram = input.toLowerCase();
		for (int i = 0; i < alphabetList.length; i++){
			if (!potentialPangram.contains(Character.toString(alphabetList[i]))){
				return false;
			}
		}
		return true;
	}
}