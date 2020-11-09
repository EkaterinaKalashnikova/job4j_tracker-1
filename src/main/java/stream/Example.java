package stream;

import java.util.Collection;
import java.util.stream.Stream;

public class Example {
    public static Stream<Integer> createStream(Collection<Integer> data) {
        //Collection<Integer> data = Arrays.asList(1, 2, 3);
        return data.stream();
    }
}
