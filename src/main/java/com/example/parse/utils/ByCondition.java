package com.example.parse.utils;

@FunctionalInterface
public interface ByCondition <T extends Number> {
    boolean isOK (T number);

}
