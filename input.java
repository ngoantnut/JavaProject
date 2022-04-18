import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("kmtinfo.txt",true);
            System.out.println("Nhap gi do:");
            Scanner sc = new Scanner(System.in);
            String input= sc.nextLine();

            myWriter.append(input);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
} 
