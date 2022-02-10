import java.util.Arrays;

public class multidimensionalArrayExample {

	public static void main(String[] args) {
		
		// ArrayList style
		int [][] rent = {
				{400, 450, 510},
				{500, 560, 630},
				{625, 676, 740},
				{1000, 1250, 1600}
				};
		
		
		/* Old fashioned way
		int [][] rent = new int [3][4];
		rent [0][0] = 400;
		rent [0][1] = 450;
		rent [0][2] = 510;
		rent [1][0] = 500;
		rent [1][1] = 560;
		rent [1][2] = 630;
		rent [2][0] = 1000;
		rent [2][1] = 1250;
		rent [2][2] = 1600;
		*/
		
		/* Get values from 2d Array one at a time
		System.out.println(rent[0][0]);
		System.out.println(rent[0][1]);
		*/
		
		// Show all values in the array in a single line
		System.out.println(Arrays.deepToString(rent));
		
		int rows;
		int cols;
		
		rows = rent.length;
		cols = rent[0].length;
		
		System.out.println(rows);
		System.out.println(cols);
		
		// Calculate the sum of each row in the array 
		for (int i=0; i < rows; i++) {
			int sumRow = 0;
			
			for (int j=0; j < cols; j++) {
				sumRow = sumRow + rent[i][j];
			}
			
			System.out.println("Sum of row " + (i+1) + ": " + sumRow);
		}
		
		

	}

}
