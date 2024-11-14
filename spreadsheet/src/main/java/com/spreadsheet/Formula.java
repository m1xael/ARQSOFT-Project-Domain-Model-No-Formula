package com.spreadsheet;

public class Formula {
    private String expression;

    public Formula(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public void evaluate() {
    }

    @Override
    public String toString() {
        return expression;
    }
}