package ru.job4j.anime;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckerAndGetterTest {
    @Test
    public void whenGetNull() {
        List <String> list = new ArrayList <> ();
        String result = CheckerAndGetter.getElement(list);
        String expected = "";
        assertThat(result, is(expected));
    }

    @Test
    public void whenGetFirstElement() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        String result = CheckerAndGetter.getElement(list);
        String expected = "first";
        assertThat(result, is(expected));
    }
}