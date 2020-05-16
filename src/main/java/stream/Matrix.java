package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Matrix {
    public static void main( String[] args ) {
        Integer[][] matrixInteger = {{ 1 ,2 } ,{ 3 ,4 }};
        System.out.println(
                Arrays.stream(matrixInteger)
                     .flatMap(matrixInteger::stream)
                     .collect(Collectors.toList())
        );
    }
}
