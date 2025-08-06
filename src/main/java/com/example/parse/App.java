package com.example.parse;

import com.example.parse.utils.ByCondition;
import com.example.parse.utils.ParseClass;
import com.example.parse.utils.Sequence;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.example.parse.utils.ParseClass.parseCountOne;

public class App {
    public static void main(String[] args) {


        ParseClass parseCountNumber = new ParseClass();
        System.out.println("введите число 1 :");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            System.out.println(parseCountOne(input));

        } catch (NumberFormatException e) {
            System.out.println("Не верный ввод " + e);
        }

        System.out.println("введите число 2 :");
        String input2 = scanner.nextLine();
       try {
           System.out.println(parseCountNumber.parseCountTwo(input2));
       }catch (NumberFormatException e) {
           System.out.println("Не верный ввод " + e);
       }

        System.out.println("введите число 3 :");
        String input3 = scanner.nextLine();
        try {
            System.out.println(parseCountNumber.validateCount(input3));
        }catch (NumberFormatException e) {
            System.out.println("Не верный ввод " + e);
        }

        System.out.println("введите число 4 :");
        String input4 = scanner.nextLine();
        try {
            System.out.println(parseCountNumber.parseNumber(input4));
        }catch (NumberFormatException e) {
            System.out.println("Не верный ввод " + e);
        }
        System.out.println("введите число 5 :");
        String input5 = scanner.nextLine();

        try {
            System.out.println(parseCountNumber.validateNumber(input5));
        }catch (NumberFormatException e) {
            System.out.println("Не верный ввод " + e);
        }

        Number[] number = {-2,3,9,-7,15,16};
        System.out.println("Массив чисел: " + Arrays.toString(number));

        ByCondition positive = x->x.doubleValue()>=0;
        List<Number> filtered = Sequence.filterNegativeNumber(number,positive);
        System.out.println("Отфильтрованные числа : " + filtered);

        List<Number> n = Arrays.stream(number)
                .filter(x->x.doubleValue()>=0)
                .peek(System.out::println)
                .toList();
        System.out.println(n);

    }

}
