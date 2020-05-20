package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Matrix {
   public List<Integer> matrix(Integer[][] matrixInteger) {
       return Arrays.stream(matrixInteger)
               .flatMap(Arrays::stream)
               .collect(Collectors.toList());
   }
}
