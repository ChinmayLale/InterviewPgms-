interface PI1 {
	default void show()
	{
		System.out.println("Default PI1");
	}
}

// Interface 2
interface PI2 {
	// Default method
	default void show()
	{
		System.out.println("Default PI2");
	}
}

// Main class
// Implementation class code
class MultipleInheri implements PI1, PI2 {
	@Override
	public void show()
	{
		// method of PI1 interface
		PI1.super.show();//Should not be used directly in the main method;
		PI2.super.show();//Should not be used directly in the main method;
	}

	public void showOfPI1() {
		PI1.super.show();//Should not be used directly in the main method;
	}

	public void showOfPI2() {
		PI2.super.show(); //Should not be used directly in the main method;
	}

	public static void main(String args[])
	{
		MultipleInheri d = new MultipleInheri();
		d.show();
		System.out.println("Now Executing showOfPI1() showOfPI2()");
		d.showOfPI1();
		d.showOfPI2();
	}
}
