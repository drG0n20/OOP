package PowtorzenieWiad25082017.Zad4_Enum;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public enum GameMoves {ORZEL, RESZKA, Q;}

    public enum GameStats {WYGRANA, REMIS, PRZEGRANA;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GameMoves playerMoves = GameMoves.ORZEL;
        GameMoves cpuMoves = GameMoves.ORZEL;

        int remisy = 0;
        int zwyciestwa = 0;
        int porazki = 0;
        int liczbaGier = 0;

        while (!playerMoves.equals(GameMoves.Q)) {
            System.out.println("\nOrzel czy Reszka?\n" +
                    "\nnacisnij o - ORZEL, r - RESZKA, q - WYJSCIE Z GRY.");
            String decision = sc.next();
            switch (decision.toLowerCase()) {
                case "o":
                    playerMoves = GameMoves.ORZEL;
                    break;
                case "r":
                    playerMoves = GameMoves.RESZKA;
                    break;
                case "q":
                    playerMoves = GameMoves.Q;
                    break;
                default:
                    continue;
            }

            Random rand = new Random();

            switch (rand.nextInt(2)) {
                case 0:
                    cpuMoves = GameMoves.ORZEL;
                    System.out.printf("Cpu wylosowal: orzel\n");
                    break;
                case 1:
                    cpuMoves = GameMoves.RESZKA;
                    System.out.printf("Cpu wylosowal: reszka\n");
                    break;
                default:
                    break;
            }

            GameStats result = amIWin(playerMoves, cpuMoves);

            if (result.equals(GameStats.REMIS))
                remisy++;
            if (result.equals(GameStats.WYGRANA))
                zwyciestwa++;
            else
                porazki++;

            liczbaGier++;
        }
        System.out.printf("Zagrales %d gier. Wygrales: %d razy (%.0f%%). Przegrales: %d razy (%.0f%%)",
                liczbaGier, zwyciestwa, (double) zwyciestwa / liczbaGier * 100, porazki,
                (double) porazki / liczbaGier * 100);
    }

    public static GameStats amIWin(GameMoves playerMoves, GameMoves cpuMoves) {
        if (playerMoves.equals(GameMoves.ORZEL) && (cpuMoves.equals(GameMoves.ORZEL))) {
            System.out.println("\nWYGRALES");
            return GameStats.WYGRANA;
        }

        if (playerMoves.equals(GameMoves.ORZEL) && (cpuMoves.equals(GameMoves.RESZKA))) {
            System.out.println("\nPRZEGRYW!");
            return GameStats.PRZEGRANA;
        }
        if (playerMoves.equals(GameMoves.RESZKA) && (cpuMoves.equals(GameMoves.RESZKA))) {
            System.out.println("\nWYGRALES");
            return GameStats.WYGRANA;
        }
        if (playerMoves.equals(GameMoves.RESZKA) && (cpuMoves.equals(GameMoves.ORZEL))) {
            System.out.println("\nPRZEGRYW!");
            return GameStats.PRZEGRANA;
        }
        return GameStats.REMIS;
    }
}
