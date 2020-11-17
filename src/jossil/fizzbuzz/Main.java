package jossil.fizzbuzz;

public class Main {

    public static void main(String[] args) {

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
            if (toPrint.length() == 0) {
                toPrint = Integer.toString(i);
            }
            System.out.println(toPrint);
        }
    }
}