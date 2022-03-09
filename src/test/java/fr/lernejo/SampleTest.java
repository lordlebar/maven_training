package fr.lernejo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void op_10_plus_3_should_be_13() {
        Sample troll = new Sample();
        int a = 10;
        int b = 3;
        assertEquals(13, troll.op(Sample.Operation.ADD, a, b));
    }

    @Test
    void op_4_multiply_8_should_be_32() {
        Sample troll = new Sample();

        int c = 4;
        int d = 8;
        assertEquals(32, troll.op(Sample.Operation.MULT, c, d));
    }

    @Test
    void fact_negative_number_throws() {
        Sample troll = new Sample();
        org.assertj.core.api.Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> troll.fact(-1));
    }

    @Test
    void fact_of_10_should_be_3628800(){
        Sample troll = new Sample();

        int n = 10;
        assertEquals(3628800, troll.fact(n));
    }
}
