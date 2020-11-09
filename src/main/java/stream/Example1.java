package stream;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example1 {
    public static Stream <Character> createStream() {
        return Stream.of('a', 'b', 'c');
    }

   // public static Stream<Integer> createStream(Integer[] data) {
   //     data = new Integer[]{ 1 ,2 ,3 };
    //    return Arrays.stream(data);
   // }

    public static void showArray(Integer[] data) {
        Stream.iterate(0, i -> i < 5, i -> i + 2)
                .forEach(i -> System.out.println(data[i]));
    }

    public static Stream<Object> createStream(Integer[] data) {
        return  Stream.builder().add(data[0]).add(data.length).build();
    }

    public static IntStream createStream(int[] data) {
        data = new int[] {1, 2, 3};
        return Arrays.stream(data) ;
    }

    public static IntStream createStream(int start, int end) {
        return IntStream.range(1,4);
    }

    public static Map <Integer, Integer> collect(Stream<Integer> data) {
         return null ;
    }
}
