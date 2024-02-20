package domain;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("사다리 높이 테스트")
public class HeightTest {

    @ParameterizedTest
    @ValueSource(ints = {0, -1, -3})
    @DisplayName("높이는 0 이하면 검증에 실패한다.")
    void createHeightFailTest(int height) {
        assertThatThrownBy(() -> new Height(height))
                .isInstanceOf(IllegalArgumentException.class).hasMessage("");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5})
    @DisplayName("높이가 1 이상이면 검증에 성공한다.")
    void createHeightSuccessTest(int height) {
        assertThatCode(() -> Height(height)).doesNotThrowAnyException();
    }
}
