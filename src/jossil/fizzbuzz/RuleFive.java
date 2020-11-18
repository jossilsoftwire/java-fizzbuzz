package jossil.fizzbuzz;

public class RuleFive implements Rule {
    @Override
    public String implementRule(String toPrint, int i) {
        if (i % 5 == 0) {
            toPrint += "Buzz";
        }
        return toPrint;

    }
}