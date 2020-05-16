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
        list.add(new Student(25, "Ivanov"));
        list.add(new Student(98, "Petrov"));
        list.add(new Student(54, "Sidorov"));
    }

    @Test
    public void groupOfStudents10a() {
        School school = new School();
        List <Student> result = school.collect(list, x -> x.getScore() >= 70
                && x.getScore() <= 100);
        List <Student> expected = List.of(new Student(98, "Petrov"));;
        assertThat(result, is(expected));
    }

    @Test
    public void groupOfStudents10b() {
        School school = new School();
        List <Student> result = school.collect(list, x -> x.getScore() >= 50
                && x.getScore() < 70);
        List <Student> expected = List.of(new Student(54, "Sidorov"));
        assertThat(result, is(expected));
    }

    @Test
    public void groupOfStudents10c() {
        School school = new School();
        List <Student> result = school.collect(list, x -> x.getScore() >= 0
                && x.getScore() < 50);
        List <Student> expected = List.of(new Student(25, "Ivanov"));
        assertThat(result, is(expected));
    }
}