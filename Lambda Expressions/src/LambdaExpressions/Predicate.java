package LambdaExpressions;

import java.util.function.IntPredicate;

public class Predicate {
    public static void main(String[] args) {
        IntPredicate lessThan80 = i -> i <= 80;
        IntPredicate moreThan20 = i -> i > 20;
        System.out.println(lessThan80.test(80));

        java.util.function.Predicate<String> predicate = temp -> temp.equalsIgnoreCase("Safe");
        System.out.println(predicate.test("Safe"));

        boolean isSafe=predicateTest(60,lessThan80,"",predicate);
        if(isSafe)
            System.out.println("happy drive");
        else
            System.out.println("Be cautious");

    }

    static boolean predicateTest(int x, IntPredicate lessThan80,String str,java.util.function.Predicate<String> predicate ) {
        if (lessThan80.test(x))
            return predicate.test(str);
        else
            return predicate.test(str);
    }
}


