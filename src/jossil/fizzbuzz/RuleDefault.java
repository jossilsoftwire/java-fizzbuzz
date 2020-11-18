package jossil.fizzbuzz;

public class RuleDefault implements Rule {
    @Override
    public String implementRule(String toPrint, int i) {
        if (toPrint.length() == 0) {
            toPrint = Integer.toString(i);
        }
        return toPrint;

    }
}
