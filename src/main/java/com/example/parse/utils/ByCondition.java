package com.example.parse.utils;

import java.util.List;

@FunctionalInterface
public interface ByCondition <T extends Number> {
    boolean isOK (T number);

}
