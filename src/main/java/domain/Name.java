package domain;

public class Name {
    private static final Integer MIN_LENGTH = 1;
    private static final Integer MAX_LENGTH = 5;

    private final String name;

    public Name(String name) {
        validateLength(name);
        this.name = name;
    }

    private void validateLength(String name) {
        if (name.length() < MIN_LENGTH || name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("[ERROR] 이름의 길이는 " + MIN_LENGTH + "자 이상, " + MAX_LENGTH + "자 이하여야 합니다.");
        }
    }
    public String getName() {
        return name;
    }
}
