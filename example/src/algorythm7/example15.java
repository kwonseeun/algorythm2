package algorythm7;

public class example15 {
	public static void main(String[] args) {
	
		Goroke pizza = new Goroke("피자", 1000);
		Goroke yache = new Goroke("야채", 800);
		Goroke pot = new Goroke("팥", 500);
		
		// 고로케의 정보를 출력 
		System.out.println(pizza.str());
		System.out.println(yache.str());
		System.out.println(pot.str());
		
		}
	}
	
	class Goroke {
		String name;
		int price;
		
		Goroke(String n, int p) {
			name = n;
			price = p;
		}
	
	
	// 메소드 - 고로케 객체의 필드 정보를 문자열로 반환 
	// String.format() 메소드는 형식 문자열을 만들어주는 메소드이다. prinf와 흡사하지만, 
	// 출력을 하지 않고, 문자열만을 만들 뿐이다. 
		
	String str() {
		return String.format("Goroke { name: %s, price: %d원 }", name, price);
	}

}
