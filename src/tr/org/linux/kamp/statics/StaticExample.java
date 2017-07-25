package tr.org.linux.kamp.statics;

public class StaticExample {

	public static String myStaticString = "BU BİR STATİK STRING";

	public static String myStaticStringMethod() {
		return "BU BİR STATİK METOD";
	}

	static {
		System.out.println("Bu bir statik blok");
	}

	static {
		System.out.println("Bu da bir statik blok");
	}

	static {
		int x = 5;
		System.out.println(x);
		System.out.println("Bu da üçüncü statik blok");
	}

}
