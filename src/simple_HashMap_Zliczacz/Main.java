package simple_HashMap_Zliczacz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberOfLines());
        System.out.println();

    }

    public static int numberOfLines() {
        int count = 0;
        try {
            File plik = new File("tekst.txt");
            FileReader czytnikFile = new FileReader(plik);
            BufferedReader czytnikBuffered = new BufferedReader(czytnikFile);
            String wiersz = null;
            while ((wiersz = czytnikBuffered.readLine()) != null) {
                System.out.println(wiersz);
                count++;
            }
            czytnikBuffered.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
}
