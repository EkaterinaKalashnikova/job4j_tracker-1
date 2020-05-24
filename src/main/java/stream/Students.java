package stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class Students implements Comparable<Student> {

    List<Student> levelOf(List <Student> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .sorted(Comparator.comparing(Student::getSurname))
                .takeWhile(v -> v.getScore() < bound)
                .collect(Collectors.toList());
    }
}
