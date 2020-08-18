// Assignment:
		// 1. Print the Image using enhanced for loop i.e. just display pixel data with enhanced for loop
		// 2. Rotate the Image 90 degrees to clockwise
		/*
		 	pixel1, pixel2, pixel3
			pixel4, pixel5, pixel6
			pixel7, pixel8, pixel9
			
			
			pixel7, pixel4, pixel1
			pixel8, pixel5, pixel2
			pixel9, pixel6, pixel3
		 */
		// 3. GrayScale the image
		//    for every pixel, add up RGB values and divide by 3 i.e. take average and update the pizel values with the vaerage one
		//    255, 0, 0 -> 255 + 0 + 0 / 3 -> 85 			-> New Pixel becomes -> 85, 85, 85
		//    125, 111, 255 -> 125 + 111 + 255 /3 -> 163    -> New Pixel becomes -> 163, 163, 163
public class imagePixelRotation {

	public static void main(String[] args) {
		int[] pixel1 = {255, 0, 0}; // Red
		int[] pixel2 = {0, 255, 0}; // Green
		int[] pixel3 = {0, 0, 255}; // Blue
		
		int[] pixel4 = {125, 111, 255};
		int[] pixel5 = {225, 211, 155};
		int[] pixel6 = {135, 101, 25};
		
		int[] pixel7 = {15, 11, 125};
		int[] pixel8 = {25, 11, 205};
		int[] pixel9 = {12, 11, 115};
		
		int[][][] image = {
				{pixel1, pixel2, pixel3},
				{pixel4, pixel5, pixel6},
				{pixel7, pixel8, pixel9},
		};
		/////////////////=========================////////////////
		System.out.println("Printing with enhanced for loop");
		traverse(image);
		
		//Rotate the image clockwise 90 degrees
		int N = image.length;

		// Transpose the matrix
		for(int k=0;k<image.length;k++) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i; j++) {
				int temp = image[k][i][j];
				image[k][i][j] = image[k][j][i];
				image[k][j][i] = temp;
			}
		}
		}
		// swap columns
		for(int k=0;k<image.length;k++) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N / 2; j++) {
				int temp = image[k][i][j];
				image[k][i][j] = image[k][i][N - j - 1];
				image[k][i][N - j - 1] = temp;
			}
		}
		}
		////// After rotation
		System.out.println("After Rotating 90 degree");
		traverse(image);
		
		//////////========GreyScale===========
		System.out.println("Applying GreyScale......");
		applyGreyScale(pixel1);
		applyGreyScale(pixel2);
		applyGreyScale(pixel3);
		applyGreyScale(pixel4);
		applyGreyScale(pixel5);
		applyGreyScale(pixel6);
		applyGreyScale(pixel7);
		applyGreyScale(pixel8);
		applyGreyScale(pixel9);
		//ToDo: ask sir to teach on how to do this in nested for loop at one time for all
		System.out.println("After GreyScale");
		traverse(image);
		
	}
	public static void applyGreyScale(int[] pixel) {
		int sum = 0;
		for(int i=0;i<pixel.length;i++) {
			sum=sum+pixel[i];
		}
		for(int i=0;i<pixel.length;i++) {
			pixel[i]=sum/3;
		}
	}
	public static void traverse(int[][][] image) {
		for(int[][] i : image){
			for(int[] j: i) {
				for(int k: j) {
					System.out.print(k+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
