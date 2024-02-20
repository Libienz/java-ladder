package domain;

import java.util.List;

public class Ladder {
    private final Height height;
    private final List<Line> lines;

    public Ladder(Height height, List<Line> lines) {
        this.height = height;
        this.lines = lines;
    }

    public Line getLine(int idx) {
        return lines.get(idx);
    }
}
