package ru.job4j.lambda;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ExampleRookTest {
   /** @Test
    public void checkTrue() {
        boolean check = ExampleRook.check("A8", "E8");
        assertThat(check, is(true));
    }

    @Test
    public void checkTrue1() {
        boolean check = ExampleRook.check("H4", "H3");
        assertThat(check, is(true));
    }

    @Test
    public void checkFalse() {
        boolean check =ExampleRook .check("A1", "B2");
        assertThat(check, is(false));
    }

    @Test
    public void checkFalse1() {
        boolean check = ExampleRook.check("F5", "C8");
        assertThat(check, is(false));
    }*/
   @Test
   public void checkTrue() {
       boolean rsl = ExampleRook.check("", "");
       assertThat(rsl, is(true));
   }

    @Test
    public void checkTrue1() {
        boolean rsl = ExampleRook.check("sparkling", "groups");
        assertThat(rsl, is(true));
    }

    @Test
    public void checkFalse() {
        boolean rsl = ExampleRook.check("booking", "grabber");
        assertThat(rsl, is(false));
    }
}