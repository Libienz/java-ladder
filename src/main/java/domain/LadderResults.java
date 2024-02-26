package domain;

import java.util.List;

public class LadderResults {
    private final List<LadderResult> results;

    public LadderResults(List<LadderResult> results) {
        this.results = results;
    }

    public int getResultCount() {
        return results.size();
    }
}
