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
        String s = "";
        String trim = s.trim();
        try {
            File plik = new File("tekst.txt");
            FileReader czytnikFile = new FileReader(plik);
            BufferedReader czytnikBuffered = new BufferedReader(czytnikFile);
            String wiersz = null;
            while ((wiersz = czytnikBuffered.readLine()) != null) {
                System.out.println(wiersz);
                count++;
                if (trim.isEmpty()) {
                    return 0;
                } else {
                    return trim.split("\\s+\\W").length;
                }
            }
            czytnikBuffered.close();
            System.out.println("\nLiczba linijek tekstu:");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
}
