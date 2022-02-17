
public class twoDArrayAllValues {

	public static void main(String[] args) {

		int[][] grades = {
				{87, 76, 99},
				{76, 99, 100, 78, 84},
				{66, 98, 56},
				{77, 87, 98, 78}
		};
		
		System.out.println(grades.length);
		System.out.println(grades[1].length);
		
		System.out.println("------------------");
		
		for(int i=0; i<grades.length; i++) {
			for(int j=0; j<grades[i].length; j++) {
				System.out.println(grades[i][j]);
			}
		
		}
		
		

	}

}
