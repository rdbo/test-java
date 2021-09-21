package MyPackage;

public class MyClass {
	private int x = 0;

	private void MyFunction() { /* Can only be accessed by 'MyClass' */
		System.out.println("Value of X: " + this.x);
	}

	public void CallMyFunction()
	{
		this.MyFunction();
		this.x += 1;
	}
}
