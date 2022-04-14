import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Homework4 {
 
    public static void main(String[] args) throws FileNotFoundException {
        
    // Prompt user for names and ages and store in an ArrayList
    // From Week 4 Arrays
    ArrayList<String> name = new ArrayList<>();
    ArrayList<Integer> age = new ArrayList<>();
    
    Scanner keyboard = new Scanner(System.in);
    String answer = "";
    String file = "";
    String fileName = "";
    
    
    // Loop to prompt for additional records and store in the ArrayList
    // From Week 5 Loops
        do {
            System.out.print("Enter name: ");
            name.add(keyboard.next());
            
            System.out.print("Enter age: ");
            age.add(keyboard.nextInt());
            
            System.out.print("Do you want to add another record? yes/no");
            answer = keyboard.next();
            
           }
        while (answer.equals("yes"));
        
        if (answer.equals("yes"));
        
        else {
            System.out.println("The following records were added: ");
        for (int i = 0; i < name.size(); i++) 
            {
                System.out.print(name.get(i) + ": " + age.get(i) + "\n");
                //System.out.print(age.get(i));
                //System.out.println("");
                
            }
             }
    
        
    // Write results to file
    // From Week 7 Files
        System.out.println("\n" + "Would you like to write to a file? yes/no");
        file = keyboard.next();
        
        if (file.equals("yes"))
        {
            System.out.print("What is the name of your file? ");
            fileName = keyboard.next();
            
            PrintWriter outputFile = new PrintWriter(fileName);
            
        for (int i = 0; i < name.size(); i++)
            {
                outputFile.write(name.get(i) + ": "  + age.get(i) + "\n");
                System.out.println("Your records have been written.");
            }
            
            outputFile.close();
            keyboard.close();
        
        }
        else
        {
            System.out.println("Thanks for playing!");
        }
            
    }
 
}
