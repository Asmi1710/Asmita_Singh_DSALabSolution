package com.gl.javafsd.lab3.brackets;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class BracketsManager {

    // creates a set of pre-defined brackets for future comparisons
    private  static Set< Bracket> predefinedBrackets;


    // static function to add different types of bracket pairs in the set
    static {

        // new LinkedHashSet for creating a list of brackets for future comparisons
        predefinedBrackets = new LinkedHashSet<Bracket>();

        // adding 4 types of brackets
        predefinedBrackets.add( new Bracket('(',')'));

        predefinedBrackets.add( new Bracket('{','}'));

        predefinedBrackets.add( new Bracket('[',']'));

        predefinedBrackets.add( new Bracket('<','>'));
    }

    // method to create a set of open brackets
    public static Set <Character> getOpenBracketSet () {

        Set <Character> result = new LinkedHashSet<Character>();

        Iterator <Bracket> interator = predefinedBrackets.iterator();

        while (interator.hasNext())
        {
            result.add(interator.next().getOpenBracket());
        }

        return result;
    }

    // method to create a set of closed brackets
    public static Set <Character> getClosedBracketSet () {

        Set <Character> result = new LinkedHashSet<Character>();

        Iterator <Bracket> interator = predefinedBrackets.iterator();

        while (interator.hasNext())
        {
            result.add(interator.next().getCloseBracket());
        }

        return result;
    }


    // this method returns bracket object corresponding to the input closing bracket
    public static Bracket getBracket (Character closedBracket){

        for (Bracket bracketSet : predefinedBrackets){
            if (bracketSet.getCloseBracket().equals(closedBracket)){
                return bracketSet;
            }
        }
        return null;
    }
}
