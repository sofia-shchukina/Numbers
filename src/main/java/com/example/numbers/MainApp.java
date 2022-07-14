package com.example.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

import static java.lang.Integer.sum;

public class MainApp {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(9, 1, 8, 2, 7, 3, 6, 4, 5);
        List<Integer> sorted = numbers.stream()
                .sorted()
                .toList();
        System.out.println(sorted);


        Integer sum = numbers.stream()
                .reduce(0,(a,b)->a+b);
        System.out.println(sum);

        Integer product = numbers.stream()
                .reduce(1,(a,b)->a*b);
        System.out.println(product);

    }

}


