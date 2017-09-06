package simple_HashMap_Zliczacz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        PrintWriter zapis = new PrintWriter("ala.txt");
//        zapis.println("Ala ma kota, a kot ma Alę");
//        zapis.close();

        File plik = new File("dupa.txt");
        Scanner sc = new Scanner(new File("dupa.txt"));
        String zdanie = sc.nextLine();
        sc.nextLine();
        System.out.println(zdanie);
    }
}
