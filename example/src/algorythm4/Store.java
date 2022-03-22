package algorythm4;

public class Store {

	private static Store instance = new Store();
	
	private Store() {}
	
	public static Store getInstance() {
		return instance;
	}
	
}
