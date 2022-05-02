package com.gl.javafsd.lab3.brackets;

// class for different types of brackets
public class Bracket {

    // this stores the opening and closing brackets for each type
    private Character openBracket;
    private Character closeBracket;

    // constructor
    public Bracket ( Character openBracket, Character closeBracket){
        this.openBracket= openBracket;
        this.closeBracket= closeBracket;
    }

    // getter and setter methods for the openBracket and closeBracket

    public Character getOpenBracket() {
        return openBracket;
    }

    public void setOpenBracket(Character openBracket) {
        this.openBracket = openBracket;
    }

    public Character getCloseBracket() {
        return closeBracket;
    }

    public void setCloseBracket(Character closeBracket) {
        this.closeBracket = closeBracket;
    }
}
