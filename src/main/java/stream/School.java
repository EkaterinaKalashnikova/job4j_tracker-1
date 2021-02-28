package stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

   public List<Student> collect(List<Student> students, Predicate<Student> predict) {
       List <Student> studentList = students.stream()
               .filter(predict)
               .collect(Collectors.toList());
       return studentList;
   }

   public List <Student> students(List <Student> students) {
          Map <String, Student> studentMap = students.stream()
                     .distinct()
                     .collect(Collectors.toMap(Student::getSurname, student -> student));
          return students;
      }
}
