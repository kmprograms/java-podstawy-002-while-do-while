import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random rnd = new Random();

        final int MIN = 1;
        final int MAX = 100;

        // Losujemy dwie liczby do zmiennych typu int o nazwach a oraz b
        // Dopoki a nie bedzie mniejsza od b

        // Sposob 1 - petla while
        /*int a = rnd.nextInt(MAX - MIN + 1) + MIN;
        int b = rnd.nextInt(MAX - MIN + 1) + MIN;

        while (a >= b) {
            a = rnd.nextInt(MAX - MIN + 1) + MIN;
            b = rnd.nextInt(MAX - MIN + 1) + MIN;
        }

        System.out.println("a = " + a + " b = " + b);*/

        // Sposob 2 - petla do while

        int a, b;
        do {
            a = rnd.nextInt(MAX - MIN + 1) + MIN;
            b = rnd.nextInt(MAX - MIN + 1) + MIN;
        } while (a >= b);

        System.out.println("a = " + a + " b = " + b);
    }
}
