import java.io.*;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("ReadNumbersFromFile/file.txt"))) {
            String line;
            int total = 0;

            while ((line = reader.readLine()) != null) {
                try {
                    // Her satırdaki sayıları toplamak için
                    int number = Integer.parseInt(line.trim());
                    total += number;
                } catch (NumberFormatException e) {
                    // Sayıya dönüştürme hatası
                    System.out.println(e.getMessage());
                }
            }

            System.out.println("Dosyadaki sayıların toplamı: " + total);
            reader.close();

        } catch (IOException e) {
            // Dosya okuma hatası
            e.printStackTrace();
        }
    }
}
