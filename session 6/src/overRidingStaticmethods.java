class myClass{
	public static void myMethod(int x, int y){
		System.out.printf("The values passed are %d and %d",x,y);
	}
}
public class overRidingStaticmethods extends myClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMethod(10,20);
	}
	/*
	 * Static methods can't be overridden because its not based on object instance at run time
	 * Normally in override technique it would be decided at run time
	 * Here the compiler decides which method is to be executed at compile time 
	 * Here below method child method is executed as a matter of fact that above parent method is hidden
	 * We can even check with Override annotation on child method, it gives error
	 * */
	public static void myMethod(int x, int z) {
		int s;
		s= x+z;
		System.out.println("From child class: "+s);
	}

}
