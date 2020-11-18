package jossil.fizzbuzz;

public class RuleThree implements Rule {
    @Override
    public String implementRule(String toPrint, int i) {
        if (i % 3 == 0) {
            toPrint += "Fizz";
        }
        return toPrint;

    }
}