import domain.Height;
import domain.InputMapper;
import domain.Ladder;
import domain.Line;
import domain.LineGenerator;
import domain.Names;
import java.util.ArrayList;
import java.util.List;
import view.InputView;
import view.ResultView;

public class Main {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        String names = inputView.requestNames();
        String height = inputView.requestHeight();

        InputMapper inputMapper = new InputMapper();

        Names names1 = inputMapper.mapToNames(names);
        Height height1 = inputMapper.mapToHeight(height);

        LineGenerator lineGenerator = new LineGenerator();

        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < height1.getHeight(); i++) {
            Line line = lineGenerator.generateLine(names1.getSize());
            lines.add(line);
        }
        Ladder ladder = new Ladder(height1, lines);
        ResultView resultView = new ResultView();
        resultView.printNames(names1);
        resultView.drawLadder(ladder);
    }
}
