package jossil.fizzbuzz;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sysReader = new Scanner(System.in);
        System.out.println("Enter number to count up to...");
        String countTo = sysReader.nextLine();
        int enteredInt = Integer.parseInt(countTo);

        for (int i = 1; i < enteredInt + 1; i++) {
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
            if (i % 17 == 0) {
                if (toPrint.length() > 4) {
                    String newToPrint = "";
                    for (int j = toPrint.length() / 4; j > 0; j--) {
                        newToPrint += toPrint.substring(4 * (j - 1), 4 * j);
                    }
                    toPrint = newToPrint;
                }
            }
            if (toPrint.length() == 0) {
                toPrint = Integer.toString(i);
            }
            System.out.println(toPrint);
        }
    }
}