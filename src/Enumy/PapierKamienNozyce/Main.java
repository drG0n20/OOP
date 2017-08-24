package Enumy.PapierKamienNozyce;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public enum GameMoves {PAPIER, KAMIEN, NOZYCE, Q;}

    public enum GameStats {WYGRANA, REMIS, PRZEGRANA;}

    public static void main(String[] args) {

        System.out.println("Zagrajmy w Papier, Kamien, Nozyce\n" +
                "nacisnij n - nozyce, p - papier, k - kamien.");

        Scanner sc = new Scanner(System.in);

        GameMoves playerMove = GameMoves.KAMIEN;
        GameMoves cpuMove = GameMoves.KAMIEN;

        int remisy = 0;
        int zwyciestwa = 0;
        int porazki = 0;
        int liczbaGier = 0;

        while (!playerMove.equals(GameMoves.Q)) {
            String decision = sc.next();
            switch (decision.toLowerCase()) {
                case "n":
                    playerMove = GameMoves.NOZYCE;
                    break;
                case "p":
                    playerMove = GameMoves.PAPIER;
                    break;
                case "k":
                    playerMove = GameMoves.KAMIEN;
                    break;
                case "q":
                    playerMove = GameMoves.Q;
                    break;
                default:
                    continue;
            }


            Random rand = new Random();
            switch (decision.toLowerCase()) {
                case "n":
                    cpuMove = GameMoves.NOZYCE;
                    System.out.printf("Komputer zagral nozycami\n");
                    break;
                case "p":
                    cpuMove = GameMoves.PAPIER;
                    System.out.printf("Komputer zagral papierem\n");
                    break;
                case "k":
                    cpuMove = GameMoves.KAMIEN;
                    System.out.printf("Komputer zagral kamieniem\n");
                    break;
            }

            GameStats result = amIWin(playerMove, cpuMove);

            if (result.equals(GameStats.REMIS))
                remisy++;
            if (result.equals(GameStats.WYGRANA))
                zwyciestwa++;
            else
                porazki++;

            liczbaGier++;
        }

        System.out.printf("Zagrales %d gier. Wygrales: %d razy (%f). Przegrales: %d (%f)",
                liczbaGier, zwyciestwa, (double) zwyciestwa / liczbaGier * 100, porazki);
    }

    public static GameStats amIWin(GameMoves playerMove, GameMoves cpuMove) {
        if (playerMove.equals(GameMoves.KAMIEN) && (cpuMove.equals(GameMoves.KAMIEN)))
            return GameStats.REMIS;
        if (playerMove.equals(GameMoves.KAMIEN) && (cpuMove.equals(GameMoves.PAPIER)))
            return GameStats.PRZEGRANA;
        if (playerMove.equals(GameMoves.KAMIEN) && (cpuMove.equals(GameMoves.NOZYCE)))
            return GameStats.WYGRANA;
        if (playerMove.equals(GameMoves.PAPIER) && (cpuMove.equals(GameMoves.PAPIER)))
            return GameStats.REMIS;
        if (playerMove.equals(GameMoves.PAPIER) && (cpuMove.equals(GameMoves.KAMIEN)))
            return GameStats.WYGRANA;
        if (playerMove.equals(GameMoves.PAPIER) && (cpuMove.equals(GameMoves.NOZYCE)))
            return GameStats.PRZEGRANA;
        if (playerMove.equals(GameMoves.NOZYCE) && (cpuMove.equals(GameMoves.NOZYCE)))
            return GameStats.REMIS;
        if (playerMove.equals(GameMoves.NOZYCE) && (cpuMove.equals(GameMoves.PAPIER)))
            return GameStats.WYGRANA;
        if (playerMove.equals(GameMoves.NOZYCE) && (cpuMove.equals(GameMoves.KAMIEN)))
            return GameStats.PRZEGRANA;
        return null;
    }
}











