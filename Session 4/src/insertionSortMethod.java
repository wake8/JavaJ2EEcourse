import java.util.Scanner;
public class insertionSortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array Space Separated input");
		String line = sc.nextLine();
		String[] stArr = line.split(" ");
		int[] intArr = new int[stArr.length];
		for(int i=0;i<stArr.length;i++) {
			intArr[i] = Integer.parseInt(stArr[i]);
		}
		sortItNow(intArr);
		System.out.println("After sorting with Insertion sort");
		traverse(intArr);

	}
	public static void traverse(int[] arr) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
    public static void sortItNow(int arr[]) {   
        for (int j = 1; j < arr.length; j++) {  
            int key = arr[j];  
            int i = j-1;  
            while ( (i > -1) && ( arr [i] > key ) ) {  
                arr [i+1] = arr [i];  
                i--;  
            }  
            arr[i+1] = key;  
        }  
    }

}
