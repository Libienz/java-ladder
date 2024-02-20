package domain;

import java.util.ArrayList;
import java.util.List;

public class LineGenerator {

    public Line generateLine(int personCount) {
        List<ConnectStatus> points = new ArrayList<>();

        for (int i = 0; i < personCount - 1; i++) {
            ConnectStatus randomStatus = ConnectStatus.randomStatus();
            if (i != 0 && randomStatus == ConnectStatus.CONNECTED && points.get(i - 1) == ConnectStatus.CONNECTED) {
                points.add(ConnectStatus.UNCONNECTED);
                continue;
            }
            points.add(randomStatus);
        }
        return new Line(points);
    }
}
