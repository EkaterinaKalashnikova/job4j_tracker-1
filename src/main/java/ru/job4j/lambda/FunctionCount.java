package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCount {
    List <Double> diapason(int start, int end, Function <Double, Double> func) {
       FunctionCount function = new FunctionCount();
        for(int i=start; i <= end; i++) {
           diapason(start, end, func).add(func.apply((double) end));
        }
        return new ArrayList<>();
       }
    }


