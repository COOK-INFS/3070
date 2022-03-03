import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class allLinesinaFile {

	public static void main(String[] args) {
		
		BufferedReader reader;
		
		try {
			reader = new BufferedReader(new FileReader("friendsAppend.txt"));
			
			// Read all lines in the file
			String line;
			while((line = reader.readLine()) != null){ // Each iteration reads a line of text
				System.out.println(line);
			}
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
