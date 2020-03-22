package ru.job4j.collection;

import org.junit.Test;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StringCompareTest {
    @Test
    public void whenStringsAreEqualThenZero () {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Ivanov",
                "Ivanov"
        );
        assertThat(rst, is(0));
    }

    @Test
    public void whenLeftLessThanRightResultShouldBeNegative () {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Ivanov",
                "Ivanova"
        );
        assertThat(rst, lessThan(0));
    }

    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive () {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Petrov",
                "Ivanova"
        );
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive(){
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Petrov",
                "Patrov"
        );
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative(){
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Patrova",
                "Petrov"
        );
        assertThat(rst, lessThan(0));
    }

    @Test
    public void whenCharsOfAreEqualThenZero () {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Petrov",
                "Petrov"
        );
        assertThat(rst, is(0));
    }

    @Test
    public void whenIndexThreeLessThanResultShouldBeNegative () {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Vetrov",
                "Vedrov"
        );
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void whenIndexTwoGreaterThanShouldBePositive(){
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Vedrov",
                "Vetrov"
        );
        assertThat(rst, lessThan(0));
    }

    @Test
    public void whenIndexAreEqualThenZero () {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Vetrov",
                "Vetrov"
        );
        assertThat(rst, is(0));
    }
}
