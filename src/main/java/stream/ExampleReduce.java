package stream;

import java.util.stream.IntStream;

public class ExampleReduce {
    public static void main(String[] args) {
        int product=IntStream.range(0 ,10)
                .filter(x -> x++ % 4 == 0)
                .reduce(( acc ,x ) -> acc * x)
                .getAsInt();

    }
}
