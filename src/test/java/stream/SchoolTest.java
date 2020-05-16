package stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    private List<Student> list = new ArrayList <>();

    @Before
    public void setUp() throws Exception {
      new Student(25,"Ivanov");
      new Student(98,"Petrov");
      new Student(54,"Sidorov");
    }

    @Test
    public void groupOfStudents10a() {
        School school = new School();
        List <Student> result = school.collect(list, student -> student.getScore() >= 70
                && student.getScore() <= 100);
        List <Student> expected = new ArrayList<Student>();
        assertThat(result, is(expected));
    }

    @Test
    public void groupOfStudents10b() {
        School school = new School();
        List <Student> result = school.collect(list, student -> student.getScore() >= 50
                && student.getScore() < 50);
        List <Student> expected = new ArrayList<Student>();
        assertThat(result, is(expected));
    }

    @Test
    public void groupOfStudents10c() {
        School school = new School();
        List <Student> result = school.collect(list, student -> student.getScore() >= 0
                && student.getScore() < 50);
        List <Student> expected = new ArrayList<Student>();
        assertThat(result, is(expected));
    }
}