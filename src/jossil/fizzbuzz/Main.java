package jossil.fizzbuzz;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Rule[] activeRules = {new RuleThree(), new RuleFive(), new RuleSeven(),
//                new RuleEleven(), new RuleThirteen(), new RuleSeventeen(), new RuleDefault()};

        List<Rule> activeRules = new ArrayList<Rule>();

        Scanner sysReader = new Scanner(System.in);
        System.out.println("Enter number to count up to...");
        String countTo = sysReader.nextLine();
        int enteredInt = Integer.parseInt(countTo);

        System.out.println("Implement 3 rule...(y/n)");
        String threeRule = sysReader.nextLine();
        if(threeRule.equals("y")){
            activeRules.add(new RuleThree());
        };

        System.out.println("Implement 5 rule...(y/n)");
        String fiveRule = sysReader.nextLine();
        if(fiveRule.equals("y")){
            activeRules.add(new RuleFive());
        };

        System.out.println("Implement 7 rule...(y/n)");
        String sevenRule = sysReader.nextLine();
        if(sevenRule.equals("y")){
            activeRules.add(new RuleSeven());
        };

        System.out.println("Implement 11 rule...(y/n)");
        String elevenRule = sysReader.nextLine();
        if(elevenRule.equals("y")){
            activeRules.add(new RuleEleven());
        };

        System.out.println("Implement 13 rule...(y/n)");
        String thirteenRule = sysReader.nextLine();
        if(thirteenRule.equals("y")){
            activeRules.add(new RuleThirteen());
        };

        System.out.println("Implement 17 rule...(y/n)");
        String seventeenRule = sysReader.nextLine();
        if(seventeenRule.equals("y")){
            activeRules.add(new RuleSeventeen());
        };

        activeRules.add(new RuleDefault());

        for (int i = 1; i < enteredInt + 1; i++) {
            String toPrint = "";

            for (Rule activeRule : activeRules) {
                toPrint = activeRule.implementRule(toPrint, i);
            }

            System.out.println(toPrint);

        }
    }
}