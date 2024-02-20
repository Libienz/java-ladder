package domain;

import java.util.List;

public class Line {
    private final List<ConnectStatus> points;

    public Line(List<ConnectStatus> points) {
        validateNoContinuousValue(points);
        this.points = points;
    }

    private void validateNoContinuousValue(List<ConnectStatus> points) {
        ConnectStatus prev = ConnectStatus.UNCONNECTED;
        for (ConnectStatus connection : points) {
            if (connection.equals(ConnectStatus.CONNECTED) && connection.equals(prev)) {
                throw new IllegalArgumentException("[ERROR] 가로 선은 연속으로 연결될 수 없습니다");
            }
            prev = connection;
        }
    }

    public boolean hasRightConnection(Integer point) {
        return points.get(point).getStatus();
    }

    public Integer getPointCount() {
        return points.size();
    }
}
