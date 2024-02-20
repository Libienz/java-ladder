package domain;

import java.util.Arrays;

public class InputMapper {
    private static final String NAME_DELIMITER = ",";

    public Names mapToNames(String names) {
        return new Names(Arrays.stream(names.split(NAME_DELIMITER))
                .map(Name::new)
                .toList());
    }

    public Height mapToHeight(String height) {
        return new Height(mapToInt(height));
    }

    private Integer mapToInt(String target) {
        try {
            return Integer.parseInt(target);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 문자열을 숫자로 바꾸는데에 실패했습니다.");
        }
    }
}
