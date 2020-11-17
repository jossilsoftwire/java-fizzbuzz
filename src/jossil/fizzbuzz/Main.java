package jossil.fizzbuzz;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sysReader = new Scanner(System.in);
        System.out.println("Enter number to count up to...");
        String countTo = sysReader.nextLine();
        int enteredInt = Integer.parseInt(countTo);

        boolean threeOn, fiveOn, sevenOn, elevenOn, thirteenOn, seventeenOn;
        System.out.println("Implement 3 rule...(y/n)");
        String threeRule = sysReader.nextLine();
        threeOn = threeRule.equals("y");

        System.out.println("Implement 5 rule...(y/n)");
        String fiveRule = sysReader.nextLine();
        fiveOn = fiveRule.equals("y");

        System.out.println("Implement 7 rule...(y/n)");
        String sevenRule = sysReader.nextLine();
        sevenOn = sevenRule.equals("y");

        System.out.println("Implement 11 rule...(y/n)");
        String elevenRule = sysReader.nextLine();
        elevenOn = elevenRule.equals("y");

        System.out.println("Implement 13 rule...(y/n)");
        String thirteenRule = sysReader.nextLine();
        thirteenOn = thirteenRule.equals("y");

        System.out.println("Implement 17 rule...(y/n)");
        String seventeenRule = sysReader.nextLine();
        seventeenOn = seventeenRule.equals("y");

        for (int i = 1; i < enteredInt + 1; i++) {
            String toPrint = "";
            if (i % 3 == 0) {
                if (i % 5 == 0 && threeOn && fiveOn) {
                    toPrint = "FizzBuzz";
                } else if (threeOn) {
                    toPrint = "Fizz";
                }
            } else if (i % 5 == 0 && fiveOn) {
                toPrint = "Buzz";
            }
            if (i % 7 == 0 && sevenOn) {
                toPrint += "Bang";
            }
            if (i % 11 == 0 && elevenOn) {
                toPrint = "Bong";
            }
            if (i % 13 == 0 && thirteenOn) {
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
            if (i % 17 == 0 && seventeenOn) {
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