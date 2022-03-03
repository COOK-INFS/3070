import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileArrayExample {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		
		names.add("Bob");
		names.add("Jim");
		names.add("Susan");
		
		try {
			BufferedWriter fileWriting = new BufferedWriter(new FileWriter("C:\\Users\\rcook2\\OneDrive - University of Colorado Colorado Springs\\INFS3070\\DWIRE122-Podium-Git\\3070\\src\\array.txt"));
			
			fileWriting.write("This is my list of friends:");
			
			for (String name : names) {
				fileWriting.write("\n" + name);
			}
			
			
			fileWriting.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
