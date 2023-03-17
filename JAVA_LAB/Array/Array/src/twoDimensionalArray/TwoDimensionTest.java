package twoDimensionalArray;

public class TwoDimensionTest {

	public static void main(String[] args) {

		int[][] arr = new int [2][3];
		int[][] arr1 = {{1, 2, 3}, {4, 5, 6, 7}};
		
		System.out.println(arr.length); // 2
		System.out.println(arr[0].length); // 3
		
		int i, j;
		
		for (i = 0; i < arr1.length; i++) {
			for( j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
