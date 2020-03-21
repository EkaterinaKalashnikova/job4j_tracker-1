package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CharacterCompareTest {
    @Test
    public void whenStringsAreEqualThenZero () {
        CharacterCompare compare = new CharacterCompare();
        int rst = compare.compare('I', 'I');
        assertThat(rst, is(0));
    }

    @Test
    public void whenLeftLessThanRightResultShouldBeNegative () {
        CharacterCompare compare = new CharacterCompare();
        int rst = compare.compare('I', 'i');
        assertThat(rst, lessThan(0));
    }

    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive () {
        CharacterCompare compare = new CharacterCompare();
        int rst = compare.compare('P', 'I');
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive(){
       CharacterCompare compare = new CharacterCompare();
        int rst = compare.compare('e','a');
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative(){
        CharacterCompare compare = new CharacterCompare();
        int rst = compare.compare('a', 'e');
        assertThat(rst, lessThan(0));
    }

    @Test
    public void whenCharsOfAreEqualThenZero () {
        CharacterCompare compare = new CharacterCompare();
        int rst =compare.compare('i', 'i');
        assertThat(rst, is(0));
    }

    @Test
    public void whenIndexTwoLessThanResultShouldBeNegative () {
        CharacterCompare compare = new CharacterCompare();
        int rst = compare.compare('p', 'I');
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void whenIndexTwoGreaterThanShouldBePositive(){
       CharacterCompare compare = new CharacterCompare();
        int rst = compare.compare('P', 'i');
        assertThat(rst, lessThan(0));
    }

}