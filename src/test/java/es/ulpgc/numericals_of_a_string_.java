package es.ulpgc;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class numericals_of_a_string_ {
    @Test
    public void given_zero_letter_should_return_0(){
        assertThat(new numericals_of_a_string().of("")).isEqualTo("0");
    }
    @Test
    public void given_one_letter_should_return_1(){
        assertThat(new numericals_of_a_string().of("a")).isEqualTo("1");
    }
    @Test
    public void given_two_letters_different_should_return_1_and_1(){
        assertThat(new numericals_of_a_string().of("ab")).isEqualTo("11");
    }
}
