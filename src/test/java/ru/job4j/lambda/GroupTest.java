package ru.job4j.lambda;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GroupTest {

    @Test
    public void sections() {
        List <StudentsGroup> studentsGroup = List.of(
                new StudentsGroup("Anton", Set.of("musik", "drive", "dance")),
                new StudentsGroup("Vlad", Set.of("musik", "drive", "dance")),
                new StudentsGroup("Stepan",  Set.of("musik", "iron")));
       Map <String, Set <String>> otherStudentGroup = Map.of(
                "musik", Set.of("Anton", "Vlad", "Stepan"),
                "drive", Set.of("Anton", "Vlad"),
                "dance", Set.of("Anton", "Vlad"),
                "iron", Set.of("Stepan"));
        assertThat(Group.sections(studentsGroup), is(otherStudentGroup));

    }
}