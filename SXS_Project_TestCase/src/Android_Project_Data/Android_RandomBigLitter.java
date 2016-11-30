package Android_Project_Data;

public class Android_RandomBigLitter {

	public String randombiglitter() {
		String str = "";
		for (int i = 0; i < 3; i++) {
			str = str + (char) (Math.random() * 26 + 'A');
		}
		return str;
	}
}