package domain;

public class Height {
    private static final Integer MIN_HEIGHT = 1;
    private final Integer height;

    public Height(int height) {
        validateRange(height);
        this.height = height;
    }

    private void validateRange(int height) {
        if (height < MIN_HEIGHT) {
            throw new IllegalArgumentException("[ERROR] 높이는 1 이상의 정수여야 합니다.");
        }
    }
}
