package Enumy.DniTygodnia;

public class Main {
    public enum Dnitygodnia {
        MONDAY("PONIEDZIALEK") {
            public Dnitygodnia next() {
                return THUESDAY;
            }
        },
        THUESDAY("WTOREK") {
            public Dnitygodnia next() {
                return WENDSDAY;
            }
        },
        WENDSDAY("SRODA") {
            public Dnitygodnia next() {
                return THURSDAY;
            }
        }, THURSDAY("CZWARTEK") {
            public Dnitygodnia next() {
                return FRIDAY;
            }
        }, FRIDAY("PIATEK") {
            public Dnitygodnia next() {
                return MONDAY;
            }
        };

        public abstract Dnitygodnia next();

        private final String polski;

        Dnitygodnia(String polski) {
            this.polski = polski;
        }

        String getPolski() {
            return polski;
        }
    }

    public static void main(String[] args) {
        for (Dnitygodnia dzien : Dnitygodnia.values()) {
            System.out.printf("%s -> %s, next day is %s \n", dzien, dzien.getPolski(), dzien.next().getPolski());
        }
    }
}
