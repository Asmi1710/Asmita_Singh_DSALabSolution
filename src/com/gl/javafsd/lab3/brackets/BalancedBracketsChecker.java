package com.gl.javafsd.lab3.brackets;

import java.util.Set;
import java.util.Stack;

// this class contains core logic for the program
public class BalancedBracketsChecker {

    // this contains the entered string to check whether its balanced or not
    private String stringOfBrackets;

    public BalancedBracketsChecker(String stringOfBrackets) {
        this.stringOfBrackets = stringOfBrackets;
    }


    // Logic for checking balanced/ unbalanced string of brackets
    public boolean check(){

        // if string has odd number of characters, it can not be balanced
        if (stringOfBrackets.length() %2 !=0) {
            return false;
        }

        // this stack contains the open brackets encountered while iterating through the string
        Stack <Character> stack = new Stack<Character>();

        // sets to contain open brackets and closing brackets respectively
        Set <Character> openBracketsSet = BracketsManager.getOpenBracketSet ();
        Set <Character> closeBracketsSet = BracketsManager.getClosedBracketSet();

        // stores each of the character in the string
        char character;

        for (int index=0; index <stringOfBrackets.length(); index++){

            character = stringOfBrackets.charAt(index);

            // pushing character into the stack if it's an opening bracket
            if (openBracketsSet.contains(character))
            {
                stack.push(character);
            }
            // closing bracket encountered
            else if (closeBracketsSet.contains(character))
            {
                char closedBracket = character;

                // popping out last opening bracket from the stack
                char openBracket = stack.pop();

                // getting bracketSet object corresponding to encountered closing bracket
                Bracket bracketObj = BracketsManager.getBracket(closedBracket);

                // matching the brackets
                if ( bracketObj.getOpenBracket().equals(openBracket))
                {
                   // matched brackets so we continue
                    continue;
                }
                else
                {
                    //mismatched brackets found, so we end matching by returning false
                    return false;
                }
            }
        }

        // if any opening bracket/s is left in the stack, we return false as brackets are not balanced
        return stack.isEmpty();
    }
}
