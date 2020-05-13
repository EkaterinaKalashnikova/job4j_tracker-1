package stream;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertThat;

public class SchoolTest {

    @Test
    public void groupOfStudents10a() {
        School school = new School();
        List <Student> result = Collections.unmodifiableList(school
                .collect(,p -> p.getScore() > 7 && p.getScore() < 100));
        List <Student> expected = new ArrayList<Student>();
                assertThat((result., is(expected));
    }

    @Test
    public void groupOfStudents10b() {
        School school = new School();
        List <Student> result = school
                .collect(, p -> p.getScore() > 5 && p.getScore() < 70);
        List <Student> expected = new ArrayList<Student>();
        assertThat((result, is(expected));
    }

    @Test
    public void groupOfStudents10c() {
        School school = new School();
        List <Student> result = school
                .collect(, p -> p.getScore() > 0 && p.getScore() < 50);
        List <Student> expected = new ArrayList<Student>();
        assertThat((result, is(expected));
    }
}