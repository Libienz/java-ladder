package domain;

import java.util.List;

public class Line {
    private final List<Boolean> points;

    public Line(List<Boolean> points) {
        validateNoContinuousValue(points);
        this.points = points;
    }

    private void validateNoContinuousValue(List<Boolean> points) {
        Boolean prev = false;
        for (Boolean connection : points) {
            if (connection && prev) {
                throw new IllegalArgumentException("[ERROR] 가로 선은 연속으로 연결될 수 없습니다");
            }
            prev = connection;
        }
    }

    public boolean hasRightConnection(Integer point) {
        return points.get(point);
    }
}
