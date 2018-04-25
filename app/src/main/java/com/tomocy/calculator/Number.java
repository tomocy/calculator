package com.tomocy.calculator;

public enum Number {
    ZERO("0"), ONE("1"), TWO("2"), THREE("3"), FOUR("4"),
    FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9");

    private String str;

    Number(final String s) {
        this.str = s;
    }

    public String toString() {
        return this.str;
    }
}
