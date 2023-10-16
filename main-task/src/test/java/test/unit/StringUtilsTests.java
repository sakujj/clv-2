package test.unit;


import org.example.Main;
import org.example.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class StringUtilsTests {
    @ParameterizedTest
    @MethodSource
    void shouldReturnFalseOnNegative(String actual, boolean expected) {
        Assertions.assertEquals(expected, StringUtils.isPositiveNumber(actual));
    }


    static Stream<Arguments> shouldReturnFalseOnNegative() {
        return Stream.of(Arguments.arguments("-42334", false));
    }
}
