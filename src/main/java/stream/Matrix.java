package stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Matrix {
   public Integer[][] matrix(int i) {
       Integer[][] matrixInteger = {{1, 2}, {3, 4}};
               Arrays.stream(matrixInteger)
                       .flatMap(Arrays::stream)
                       .collect(Collectors.toList());
       return matrixInteger;
   }
}
