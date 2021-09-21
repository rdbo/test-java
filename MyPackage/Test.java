/*
 * MyPackage folder. 'MyClass.java' will be imported automatically
 * as it is also part of the 'MyPackage' package.
 */
package MyPackage;

public class Test {
	public static void main(String[] args) {
		/*
		 * Testing types
		 */
		
		int uinum = 10;
		long ulnum = 10;
		Integer inum = 10;
		float flnum = 1.0f;
		double dnum = 1.0;
		boolean b = false;
		char c = 'c';
		char[] cstr = "Hello".toCharArray();
		String str = "Hello";
		final int constant = 10;
		System.out.println(cstr);

		/* Testing Class/Object stuff */
		MyClass myobj = new MyClass();
		// myobj.MyFunction(); // Cannot call private method
		myobj.CallMyFunction();
		myobj.CallMyFunction();
	}
}
