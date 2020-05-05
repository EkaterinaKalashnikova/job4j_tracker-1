package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCount {
    List <Double> diapason(int start, int end, Function <Double, Double> func) {
       FunctionCount function = new FunctionCount();
       //Function <Double, Double> function1 = Double::doubleValue;
          for(int i = start; i <= end; i++) {
              if ( i != 0 ){
                  diapason(start, end, func).add(func.apply((double) i));
                  List list = new ArrayList<>();

              }
           }
        return new ArrayList <>();
    }
}


