public enum Predkosc {
    SLOW (30),
    NORMAL (90),
    FAST (150);

    private final int speed;

    private Predkosc(int speed) {
        this.speed=speed;
    }

    public int getspeed() {
        return speed;
    }



}
