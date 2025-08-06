package com.example.parse.utils;

public class ParseClass {
    public ParseClass() {
    }

    public static Integer parseCountOne(String str) throws NumberFormatException {
        return Integer.parseInt(str);
    }

    public Integer parseCountTwo(String str) {
        int numberTwo;
        try {
            numberTwo = Integer.parseInt(str);
        } catch (NumberFormatException message) {
            throw new NumberFormatException("Введено не верное значение " + message);
        }
        return numberTwo;

    }

    public Integer validateCount (String string) throws NumberFormatException{
        return parseCountOne(string);
    }

    public Double parseNumber (String string) throws NumberFormatException{
        return Double.parseDouble(string);
    }

    public Double validateNumber (String string) throws NumberFormatException{
        return parseNumber(string);
    }

}
