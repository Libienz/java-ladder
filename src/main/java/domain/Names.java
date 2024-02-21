package domain;

import java.util.List;

public class Names {
    private final List<Name> names;

    public Names(List<Name> names) {
        this.names = names;
    }

    public Integer getSize() {
        return names.size();
    }

    public List<Name> getNames() {
        return List.copyOf(names);
    }
}
