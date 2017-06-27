
public class HashTest {

	public static void main(String[] args) {
		String str = "harvey";
		int strlen = str.length();
		int hash = 7;
		for (int i = 0; i < strlen; i++) {
		    hash = hash*31 + str.charAt(i);
		}
	}
	
}
