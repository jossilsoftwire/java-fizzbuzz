package jossil.fizzbuzz;
import java.util.List;
import java.util.ArrayList;

public class FizzBuzzTests {
    public static void main(String[] args) {

        List<Rule> allRules = new ArrayList<Rule>();
        allRules.add(new RuleThree());
        allRules.add(new RuleFive());
        allRules.add(new RuleSeven());
        allRules.add(new RuleEleven());
        allRules.add(new RuleThirteen());
        allRules.add(new RuleSeventeen());
        allRules.add(new RuleDefault());

        //3,5
        assert (Main.getFizzBuzzStr(allRules, 1).equals("1"));
        assert (Main.getFizzBuzzStr(allRules, 3).equals("Fizz"));
        assert (Main.getFizzBuzzStr(allRules, 5).equals("Buzz"));
        assert (Main.getFizzBuzzStr(allRules, 15).equals("FizzBuzz"));

        //7
        assert (Main.getFizzBuzzStr(allRules, 7).equals("Bang"));
        assert (Main.getFizzBuzzStr(allRules, 21).equals("FizzBang")); //3*7

        //11
        assert (Main.getFizzBuzzStr(allRules, 11).equals("Bong"));
        assert (Main.getFizzBuzzStr(allRules, 33).equals("Bong")); //3*11

        //13
        assert (Main.getFizzBuzzStr(allRules, 13).equals("Fezz"));
        assert (Main.getFizzBuzzStr(allRules, 65).equals("FezzBuzz")); //5*13
        assert (Main.getFizzBuzzStr(allRules, 143).equals("FezzBong")); //11*13
        assert (Main.getFizzBuzzStr(allRules, 195).equals("FizzFezzBuzz")); //3*5*13

        //17
        assert (Main.getFizzBuzzStr(allRules, 17).equals("17"));
        assert (Main.getFizzBuzzStr(allRules, 255).equals("BuzzFizz")); //3*5*17

        System.out.println("The tests all passed!");
    }
}
