package jossil.fizzbuzz;

public class RuleThirteen implements Rule {
    @Override
    public String implementRule(String toPrint, int i) {
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
        return toPrint;

    }
}