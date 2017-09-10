package simple_HashMap_Zliczacz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = null;
        FileReader fr = null;

        HashMap<String, Integer> wordsInText = new HashMap<>();

        try {
            fr = new FileReader("ala.txt");
            br = new BufferedReader(fr);
            String sCurrentLine = br.readLine();
            while (sCurrentLine != null) {
                String next = sCurrentLine.toLowerCase();
                next.replaceAll("(.,!\\\")", "");
                Integer count = wordsInText.get(next);
                if (count != null) {
                    wordsInText.put(next, count + 1);
                } else {
                    wordsInText.put(next, 1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(wordsInText);
            System.out.println(fr);
        }
        System.out.println(br);
    }
}
