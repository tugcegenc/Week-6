import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
            // Get input from the user
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a text: ");
            String text = reader.readLine();

            // Write the input to a file
            FileWriter fileWriter = new FileWriter("Notepad/notes.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(text);

            // Close resources
            printWriter.close();
            fileWriter.close();

            // Read the content of the file
            BufferedReader br = new BufferedReader(new FileReader("Notepad/notes.txt"));
            String readText = br.readLine();

            // Print the content
            System.out.println("Content of the file: " + readText);

            // Close resources
            br.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
