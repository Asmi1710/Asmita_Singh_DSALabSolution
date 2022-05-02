package com.gl.javafsd.lab3.brackets;

public class BracketsTest {

    // hardcoded input cases
    public static void main(String[] args) {
        test("({})");
        test("{]}");
        test("[[]]{}");
        test("<[]{}>");
        test("{[}]");
    }


    // this method tests the string (brackets) to check whether it's balanced or not
    private static void test (String brackets){
        BalancedBracketsChecker checker= new BalancedBracketsChecker(brackets);
        boolean result = checker.check();

        System.out.println("--------------------------------\n"+brackets);

        // printing the result after running check algorithm
        if (result){
            System.out.println("The entered String has Balanced Brackets");
        }
        else
        {
            System.out.println("The entered Strings do not contain Balanced Brackets");
        }
    }
}
