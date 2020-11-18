package jossil.fizzbuzz;

public class RuleSeven implements Rule {
    @Override
    public String implementRule(String toPrint, int i) {
        if (i % 7 == 0) {
            toPrint += "Bang";
        }
        return toPrint;

    }
}