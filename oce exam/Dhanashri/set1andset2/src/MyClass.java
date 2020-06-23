import com.capgemini.set1andset2.MyString;

public class MyClass {

	public static void main(String[] args) {
		System.out.println("Hello" + new StringBuilder("Java SE 8"));
		System.out.println("Hello" + new MyString("Java SE 8").msg);

	}
}
