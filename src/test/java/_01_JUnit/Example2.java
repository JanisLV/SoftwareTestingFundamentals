package _01_JUnit;

import _01_JUnit.Calculator;
import org.junit.Test;

public class Example2 {

    @Test
    public void test() {
        // given
        Calculator calculator = new Calculator();
        // when
        int result = calculator.add(5, 3);
        // then
        assert result == 8;
    }

}
