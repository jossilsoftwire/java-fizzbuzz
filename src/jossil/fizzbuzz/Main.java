package jossil.fizzbuzz;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            String toPrint = "";
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    toPrint = "FizzBuzz";
                } else {
                    toPrint = "Fizz";
                }
            } else if (i % 5 == 0) {
                toPrint = "Buzz";
            }
            if (i % 7 == 0) {
                toPrint += "Bang";
            }
            if (i % 11 == 0) {
                toPrint = "Bong";
            }
            if (i % 13 == 0) {
                boolean changed = false;
                for (int j = 0; j < toPrint.length() / 4; j++) {
                    if (toPrint.charAt(4 * j) == 'B') {
                        if (j == 0) {
                            toPrint = "Fezz" + toPrint.substring(0, 4);
                        } else {
                            toPrint = toPrint.substring(4 * (j - 1), 4 * j) + "Fezz" + toPrint.substring(4 * j, 4 * (j + 1));
                        }
                        changed = true;
                        break;
                    }
                }
                if (!changed) {
                    toPrint += "Fezz";
                }
            }
            if (toPrint.length() == 0) {
                toPrint = Integer.toString(i);
            }
            System.out.println(toPrint);
        }
    }
}