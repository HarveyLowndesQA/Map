
public class Main {

	
	public static void main(String[] args) {
		
		MiMap<String, String> map = new MiMap<String, String>(5);
		
		map.put("John", "Sucks");
		map.put("Harvey", "Rocks");
		
		System.out.println(map.get("John"));
		System.out.println(map.get("Harvey"));
	}
	
}