package stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Matrix {
    public static void main( String[] args ) {
        Integer[][] matrixInteger = {{ 1 ,2 } ,{ 3 ,4 }};
        System.out.println(
                Arrays.stream(matrixInteger)
                    .flatMap(Arrays::stream)
                    .collect(Collectors.toList())
        );
    }
}
