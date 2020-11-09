package ru.job4j.anime;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InitialsTest {
    @Test
    public void test() {
        assertEquals("Иванов И.И.", Initials.convert(new String[] {"Иванов", "Иван", "Иваныч"}));
        assertEquals("Григорьев И.Н.", Initials.convert(new String[] {"Григорьев", "Игорь", "Николаевич"}));
    }
}