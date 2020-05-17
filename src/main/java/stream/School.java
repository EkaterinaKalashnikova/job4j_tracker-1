package stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    private List<Student> students = List.of(
            new Student(75, "Ivanov"),
            new Student(55, "Petrov"),
            new Student(87, "Burma"),
            new Student(34, "Kazachenko"),
            new Student(93, "Volkov")
    );

   public  List<Student> collect(List<Student> students, Predicate<Student> predict) {
       List <Student> studentList = students.stream()
               .filter(predict)
               .collect(Collectors. <Student>toList());
       return students;
   }

      public List <Student> students(List<Student> students) {
          Map <String, String> students1 =  students.stream()
                     .distinct()
                     .collect(Collectors.toMap(Student::getSurname, Student::toString));
          return students;
      }
}
