package algorythm4;

public class User {

	private static Long serialNumber = 1000L;
	private Long userId;
	private String userName;
	
	public User(String userName) {
		this.userName = userName;
		serialNumber++;
		this.userId = serialNumber;
	}
	
	public static Long getSerialNumber() {
		return serialNumber;
	}
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + "]";
	}

	public static void main(String[] args) {
		
		System.out.println(User.getSerialNumber());
		
	User user1 = new User("가");
	System.out.println(User.getSerialNumber());

	User user2 = new User("나");
	System.out.println(User.getSerialNumber());
	
	User user3 = new User("다");
	System.out.println(User.getSerialNumber());
	
	System.out.println(user1);
	System.out.println(user2);
	System.out.println(user3);
	}

}
