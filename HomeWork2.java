/**
	Java. Level 1. Lesson 2. HomeWork2
	
	@author Artem Valeev
	@version Aug 14, 2018
*/

public class HomeWork2
{
	static void printArray(int[] arr) {
		
		for (int i = 0; i < arr.length; i++)
			if (i == 0) 
				System.out.print("[" + arr[i] + ", ");
			else
				if (i == arr.length-1)
					System.out.print(arr[i] + "] \n");
				else
					System.out.print(arr[i] + ", ");		
	}
	
	static void printArrayArray(int[][] arr) {
		
		System.out.println("[");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("\t");
			printArray(arr[i]);
		}
		
		System.out.println("]");
	}
	
	static void invertBinArray() {
		
		int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
		
		for (int i = 0; i < arr.length; i++)
			arr[i] = arr[i] == 0 ? 1 : 0;
		
		printArray(arr);
	} 
	
	static void setArray() {
		
		int[] arr = new int[8];
		
		for (int i = 0, j = 0; i < arr.length; i++, j += 3)
			arr[i] = j;
		printArray(arr);
	}
	
	static void multTwo() {
		
		int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
		
		for (int i = 0; i < arr.length; i++)
			arr[i] = arr[i] < 6 ? arr[i] * 2 : arr[i];
		
		printArray(arr);
	}
	
	static void createMatrix(int d) {
		
		int[][] matrix = new int[d][d];
		
		for (int i = 0; i < matrix.length; i++) 
			for (int j = 0; j < matrix[i].length; j++) 
				matrix[i][j] = i == j || i ==  matrix[i].length - (j + 1) ? 1 : 0;
		
		printArrayArray(matrix);
	}
	
	static void findMinMax() {
		
		int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
		int min = arr[0];
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) 
				min = arr[i];
			if (max < arr[i])
				max = arr[i];
		}
			
		printArray(arr);
		
		System.out.println("minimum - " + min);
		System.out.println("maximum - " + max);			
	}
	
	static boolean checkBalance(int[] arr) {
		
		int sumLeft;
		int sumRight;
		
		for (int i = 0; i < arr.length - 1; i++) {
			sumLeft = 0;
			sumRight = 0;
			
			for (int j = 0; j < arr.length; j++)
				if (j <= i) 
					sumLeft += arr[j];
				else
					sumRight += arr[j];
				
			if (sumLeft == sumRight) return true;
			
		}
		
		return false;	
	}
	
	static int[] reverseArray(int[] arr) {
		
		int t;
		
		for (int i = 0; i < (arr.length - 1) / 2; i++) {
			t = arr[i];
			arr[i] = arr[(arr.length - 1) - i];
			arr[(arr.length - 1) - i] = t;
		}
		
		return arr;
	}
	
	static int[] offsetArray(int[] arr, int n) {

		int t;
		int l = n;
		
		if (n < 0) {
			arr = reverseArray(arr);
			l = -n;
		}
		
		for (int i = 0; i < l; i++) {
			t = arr[arr.length - 1];
			
			for (int j = arr.length - 1; j > 0 ; j--) {		
				arr[j] = arr[j-1];
			}
			
			arr[0] = t;
		}
		
		if (n < 0) arr = reverseArray(arr);
		
		return arr;
	}
	
	public static void main(String[] args){	
		
		invertBinArray(); //Mission 1
		
		setArray(); //Mission 2
		
		multTwo(); //Mission 3
		
		createMatrix(5); //Mission 4
		createMatrix(10); //Mission 4
		
		findMinMax(); //Mission 5
		
		System.out.println(checkBalance(new int[] { 1, 1, 1, 2, 1 })); //Mission 6
		System.out.println(checkBalance(new int[] { 2, 1, 1, 2, 1 })); //Mission 6
		System.out.println(checkBalance(new int[] { 10, 10 })); //Mission 6
		System.out.println(checkBalance(new int[] { 1, 5, 3 })); //Mission 6

		printArray(offsetArray(new int[] { 1, 2, 3, 4, 5 }, -1)); //Mission 7
		printArray(offsetArray(new int[] { 1, 2, 3, 4, 5 }, 1)); //Mission 7
	}
}
