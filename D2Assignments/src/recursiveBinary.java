import java.util.Scanner;
public class recursiveBinary {

	static void showBinary(int x) {
		/*step 1: if x>1 -> push the number to stack
		          recursively call function with x/2
		  step 2: pop x from stack and divide it with string and print its remainder
		  
		  ex:  input: 4
		       2|_4___ ->push 4 on stack
		       2|_2___ ->push 2 on stack
		       2|_1___ ->finally x!>1
		       ---------> first prints 1
		       ---------> then pops 2 and prints 2%2 i.e., 0
		       ---------> then pops 4 and prints 4%2 i.e., 0
		       output: 100
		 */
		if(x>1) {
			showBinary(x/2);
		}
		System.out.print(x%2);
	}
	public static void main(String[] args) {
		System.out.print("Enter number to find its binary: ");
		int x;
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		scan.close();
		showBinary(x);
	}

}
