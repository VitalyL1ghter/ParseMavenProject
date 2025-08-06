package com.example.parse.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sequence {
    public static List<Number> filterNegativeNumber(Number[] array, ByCondition condition) {
        return Arrays.stream(array).filter(condition::isOK).collect(Collectors.toList());

    }

}
