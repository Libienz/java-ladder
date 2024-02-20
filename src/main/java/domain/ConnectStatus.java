package domain;

public enum ConnectStatus {
    CONNECTED(Boolean.TRUE),
    UNCONNECTED(Boolean.FALSE);

    private Boolean status;

    ConnectStatus(Boolean status) {
        this.status = status;
    }

    public static ConnectStatus randomStatus() {
        int min = 0;
        int max = values().length;
        int idx = (int) (Math.floor(Math.random() * (max - min)) + min);
        return values()[idx];
    }

    public Boolean getStatus() {
        return status;
    }
}
