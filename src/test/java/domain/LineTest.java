package domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("사다리 가로 줄 테스트")
public class LineTest {

    @DisplayName("가로 줄이 연속되는 경우 줄을 생성할 수 없다")
    @Test
    void testCreateLineWithContinuousValue() {
        List<Boolean> points = List.of(true, true, false);
        assertThatThrownBy(() -> new Line(points))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 가로 선은 연속으로 연결될 수 없습니다");
    }

    @DisplayName("가로 줄이 연속되는 경우가 없으면 줄을 생성할 수 있다")
    void testCreateLineWithNoContinuousValue() {
        List<Boolean> points = List.of(true, false, true);
        assertThatCode(() -> new Line(points)).doesNotThrowAnyException();
    }

    @DisplayName("특정 좌표에 가로 줄이 있는 지 확인할 수 있다")
    @Test
    void testCheckConnection() {
        List<Boolean> points = List.of(true, false, true);
        Line line = new Line(points);
        assertThat(line.hasRightConnection(0)).isTrue();
    }

    @DisplayName("특정 좌표에 가로 줄이 없는 지 확인할 수 있다")
    @Test
    void testCheckNoConnection() {
        List<Boolean> points = List.of(true, false, true);
        Line line = new Line(points);
        assertThat(line.hasRightConnection(1)).isFalse();
    }
}
