package stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static class Task {
        private final String name;
        private final long spent;

        public Task( String name ,long spent ) {
            this.name=name;
            this.spent=spent;
        }

        @Override
        public String toString( ) {
            return "Task{"+
                    "name='"+name+'\''+
                    ", spent="+spent+
                    '}';
        }
    }

    public static void main( String[] args ) {
        List <Task> tasks=List.of(
                new Task("Bug #1" ,100) ,
                new Task("Task #2" ,100) ,
                new Task("Bug #3" ,100)
        );
        List <Task> bugs=tasks.stream().filter(
                task -> task.name.contains("Bug")
        ).collect(Collectors.toList());
        bugs.forEach(System.out::println);
    }
}
  /**  IntStream.range(0, 10)
        .boxed()
        .collect(Collectors.              ((i ->    )) )
        .entrySet()
        .forEach(System.out::println);
// false=[1, 3, 5, 7, 9]
// true=[0, 2, 4, 6, 8]

    IntStream.range(-5, 0)
        .flatMap(i -> IntStream.of(i,   ))
        .sorted()
        .forEach(System.out::println);
// -5, -4, -3, -2, -1, 1, 2, 3, 4, 5

    IntStream.range(-5, 0)
        .flatMap(i -> IntStream.of(i, ))
        .boxed()
        .sorted(Comparator.comparing(Math::   ))
        .forEach(System.out::println);
// -1, 1, -2, 2, -3, 3, -4, 4, -5, 5

IntStream.range(1, 5)
        .flatMap(i -> IntStream.generate(() -> i).limit(i))
        .boxed()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.       ))
        .entrySet().forEach(System.out::println);
// 1=1
// 2=2
// 3=3
// 4=4

*/

