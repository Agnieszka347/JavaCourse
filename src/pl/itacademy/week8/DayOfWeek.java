package pl.itacademy.week8;

public enum DayOfWeek {

    MON("Poniedzialek", 1),
    TUE("Wtorek", 2),
    WED("Sroda", 3);


    private String polishName;
    private int index;

    DayOfWeek(String polishName, int index) {
        this.polishName = polishName;
        this.index = index;
    }

    public String getPolishName() {
        return polishName;
    }

    public static DayOfWeek fromPolishName(String polishName) {
        for(DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if(dayOfWeek.polishName.equals(polishName)) {
                return dayOfWeek;
            }
        }
        throw new IllegalArgumentException("There are no day of week with Polish name " + polishName);
    }
}
