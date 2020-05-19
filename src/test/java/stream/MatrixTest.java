package stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {

    @Test
    public void matrix() {
        Matrix matrix = new Matrix();
          Integer[][] actual = matrix.matrix(4);
          List<Integer> expected = List.of(1, 2, 3, 4);
           assertThat(actual, is(expected));
    }
}