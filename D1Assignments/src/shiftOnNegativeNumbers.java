
public class shiftOnNegativeNumbers {

	public static void main(String[] args) {
		int v = -80;
		int x = v;
		int sf = v>>2;
		System.out.println("Right shift of 2 is: "+ sf);
		int tf = v<<2;
		x = x<<2;
		System.out.println("Left shift of 2 is: "+ tf);
		System.out.println("Left shift of 2 is: "+ x);
		int r = 120;
		int rt = r>>>2;
		System.out.printf("triple right shift of %d is: %d",r,rt);
		System.out.println();

	}

}
