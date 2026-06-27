class Clock {
    private long time;

    private Clock(long time) {
        this.time = time;
    }

    public static Clock newClock() {
        return new Clock(System.currentTimeMillis());
    }
}