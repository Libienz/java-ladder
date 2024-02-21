package view;

import domain.Ladder;
import domain.Line;
import domain.Name;
import domain.Names;
import java.util.List;

public class ResultView {
    public void printNames(Names names) {
        System.out.println("\n실행결과\n");
        System.out.println(resolveNameMessage(names));
    }

    public void drawLadder(Ladder ladder) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ladder.getHeight(); i++) {
            stringBuilder.append(resolveLineMessage(ladder.getLine(i)));
        }
        System.out.println(stringBuilder);

    }

    public String resolveLineMessage(Line line) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("    |");
        for (int j = 0; j < line.getPointCount(); j++) {
            boolean connection = line.hasRightConnection(j);
            stringBuilder.append(resolveConnectionMessage(connection));
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    private String resolveConnectionMessage(boolean connection) {
        if (connection) {
            return "-----|";
        }
        return "     |";
    }

    private String resolveNameMessage(Names names) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Name> names1 = names.getNames();
        for (int i = 0; i < names1.size() - 1; i++) {
            stringBuilder.append(String.format("%-5s ", names1.get(i).getName()));
        }
        stringBuilder.append(String.format("%5s", names1.get(names1.size() - 1).getName()));
        return stringBuilder.toString();
    }
}
