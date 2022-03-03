import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readingFileExample {

	public static void main(String[] args) {
		
		BufferedReader reader;
			
			try {
				reader = new BufferedReader(new FileReader("friendsAppend.txt"));
				System.out.println(reader.readLine());
				
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
		
	}

}
