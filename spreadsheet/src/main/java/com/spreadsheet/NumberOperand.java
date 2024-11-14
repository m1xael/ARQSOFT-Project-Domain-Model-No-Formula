package com.spreadsheet;

public class NumberOperand implements Operand {
    private Number value;

    public NumberOperand(Number value) {
        this.value = value;
    }

    public Number getValue() {
        return value;
    }
}