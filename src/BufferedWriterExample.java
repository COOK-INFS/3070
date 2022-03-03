import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) {

		try {
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter
					("C:\\Users\\rcook2\\OneDrive - University of Colorado Colorado Springs\\INFS3070\\DWIRE122-Podium-Git\\3070\\src\\config.ini"));
			
				fileWriter.write("This is my first line in my first file!");
				fileWriter.write("\nThis is my second line.");
				
				fileWriter.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
