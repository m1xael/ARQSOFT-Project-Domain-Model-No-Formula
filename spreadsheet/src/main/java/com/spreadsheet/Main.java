package com.spreadsheet;

public class Main {
    public static void main(String[] args) {
        Spreadsheet spreadsheet = new Spreadsheet();

        spreadsheet.setCellContent("A1", new NumericalContent(55));
        spreadsheet.setCellContent("A2", new TextContent("Domain Model Implementation"));
        spreadsheet.setCellContent("A3", new FormulaContent(new Formula("=SUM(A1, A2)")));

        System.out.println("Cell A1 content: " + spreadsheet.getCellContent("A1"));
        System.out.println("Cell A2 content: " + spreadsheet.getCellContent("A2"));
        System.out.println("Cell A3 content: " + spreadsheet.getCellContent("A3"));

        spreadsheet.saveSpreadsheet("spreadsheet.txt");

        Spreadsheet loadedSpreadsheet = new Spreadsheet();
        loadedSpreadsheet.loadSpreadsheet("spreadsheet.txt");

        System.out.println("Loaded Cell A1 content: " + loadedSpreadsheet.getCellContent("A1"));
        System.out.println("Loaded Cell A2 content: " + loadedSpreadsheet.getCellContent("A2"));
        System.out.println("Loaded Cell A3 content: " + loadedSpreadsheet.getCellContent("A3"));
    }
}