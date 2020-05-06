package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FunctionCountTest {
    FunctionCount function = new FunctionCount();

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List <Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSquareFunctionThenSquareResults() {
        List <Double> result = function.diapason(2, 5, x -> 2 * Math.pow(x, x) + 2 * x + 2);
        List<Double> expected = Arrays.asList(14D, 62D, 522D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExpositoryFunctionThenExpositoryResults() {
        List <Double> result = function.diapason(5, 8, Math::floor);
        List<Double> expected = Arrays.asList(5D, 6D, 7D);
        assertThat(result, is(expected));
    }
}