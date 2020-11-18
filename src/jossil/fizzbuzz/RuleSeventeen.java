package jossil.fizzbuzz;

public class RuleSeventeen implements Rule {
    @Override
    public String implementRule(String toPrint, int i) {
        if (i % 17 == 0) {
            if (toPrint.length() > 4) {
                StringBuilder newToPrint = new StringBuilder();
                for (int j = toPrint.length() / 4; j > 0; j--) {
                    newToPrint.append(toPrint.substring(4 * (j - 1), 4 * j));
                }
                toPrint = newToPrint.toString();
            }
        }
        return toPrint;
    }
}