import java.io.*;
import java.util.Scanner;

public class App {    
    public static void main(String[] args) throws Exception {
        try {
            //writing to file
            FileWriter myWriter = new FileWriter("E:JavaFile.txt");
            myWriter.write("Welcome Samriddhi College!");              
            myWriter.close(); 
            System.out.println("Successfully wrote to the file.");

            // Reading From file
            File myObj = new File("E:JavaFile.txt");  
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
            }
            myReader.close();

            } 
            catch (IOException e) 
            {
            System.out.println("An error occurred.");
            e.printStackTrace();
            
            }

    }
}