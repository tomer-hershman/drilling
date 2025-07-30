public enum month {
    JANUARY(30),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);


    private final int days;

    month(int days) {
        this.days = days;
    }
    public int getSpot(month m){
        return m.ordinal();
    }

}
