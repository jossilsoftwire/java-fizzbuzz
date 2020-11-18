package jossil.fizzbuzz;

public class RuleEleven implements Rule {
    @Override
    public String implementRule(String toPrint, int i) {
        if (i % 11 == 0) {
            toPrint = "Bong";
        }
        return toPrint;
    }
}