import controller.InputMapper;
import controller.LadderGameController;
import domain.NonContinuousLineGenerator;
import domain.RowLineGenerator;
import view.InputView;
import view.MessageResolver;
import view.ResultView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView(new MessageResolver());
        RowLineGenerator nonContinuousLineGenerator = new NonContinuousLineGenerator();
        InputMapper inputMapper = new InputMapper();

        LadderGameController ladderGameController = new LadderGameController(inputView, inputMapper, resultView,
                nonContinuousLineGenerator);

        ladderGameController.run();
    }
}
