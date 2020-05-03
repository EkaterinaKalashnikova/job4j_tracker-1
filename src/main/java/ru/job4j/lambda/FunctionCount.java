package ru.job4j.lambda;

import java.util.List;
import java.util.function.*;

public class FunctionCount {
    List <Double> diapason( int start, int end, Function<Double, Double> func) {
        Function<Double, Double> f =  Double::doubleValue;
     // IntToDoubleFunction function = Integer::valueOf;
    //  ToDoubleBiFunction<Double, Double> biFunction = function.applyAsDouble(double);
        return (List <Double>) func;
    }
}
