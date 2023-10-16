package test.unit;

import org.example.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class UtilsTests {
    @ParameterizedTest
    @MethodSource
    void shouldReturnFalseWhenSomeAreNotNumbers(List<String> strings) {
        boolean actual = Utils.isAllPositiveNumbers(strings.toArray(String[]::new));
        Assertions.assertEquals(false, actual);
    }

    static Stream<List<String>> shouldReturnFalseWhenSomeAreNotNumbers() {
        return Stream.of(List.of("13", "34", "ABOBA"));
    }
}
