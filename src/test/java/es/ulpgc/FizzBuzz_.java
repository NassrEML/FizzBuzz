package es.ulpgc;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class FizzBuzz_ {
    @Test
    public void given_1_should_return_1() {
        assertThat(new FizzBuzz().of(1)).isEqualTo("1");
    }
    @Test
    public void given_2_should_return_2() {
        assertThat(new FizzBuzz().of(2)).isEqualTo("2");
    }
    @Test
    public void given_a_number_multiple_of_3_should_return_fizz() {
        assertThat(new FizzBuzz().of(3)).isEqualTo("Fizz");
        assertThat(new FizzBuzz().of(6)).isEqualTo("Fizz");
    }
    @Test
    public void given_a_number_multiple_of_5_should_return_buzz() {
        assertThat(new FizzBuzz().of(5)).isEqualTo("Buzz");
        assertThat(new FizzBuzz().of(10)).isEqualTo("Buzz");
    }
    @Test
    public void given_a_number_multiple_of_15_should_return_fizzbuzz() {
        assertThat(new FizzBuzz().of(15)).isEqualTo("FizzBuzz");
        assertThat(new FizzBuzz().of(30)).isEqualTo("FizzBuzz");
    }

}
