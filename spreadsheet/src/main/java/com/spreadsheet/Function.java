package com.spreadsheet;

import java.util.List;

public class Function implements Operand {
    private String name;
    private List<Operand> arguments;

    public Function(String name, List<Operand> arguments) {
        this.name = name;
        this.arguments = arguments;
    }

    public String getName() {
        return name;
    }

    public List<Operand> getArguments() {
        return arguments;
    }
}