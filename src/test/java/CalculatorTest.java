import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class CalculatorTest {

    @Test
    void fail() {
        assertThat(true)
            .isEqualTo(false);
    }

    @Test
    void it_should_not_fail() {
        Calculator thing = new Calculator();
        int value = thing.calculate();
        assertThat(value)
                .isEqualTo(42);
    }
}
