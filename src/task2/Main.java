package task2;


enum Months {
    JANUARY(31),
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

    Months getPreviousMonth() {
        if (this == JANUARY) {
            return  DECEMBER;
        }
        return Months.values()[this.ordinal() - 1];
    }

    Months getNextMonth() {
        if (this == DECEMBER) {
            return JANUARY;
        }
        return Months.values()[this.ordinal() + 1];
    }

    String getSeason() {
        switch (this) {
            case DECEMBER, JANUARY, FEBRUARY: return "Winter";
            case MARCH, APRIL, MAY: return "Spring";
            case JUNE, JULY, AUGUST: return "Summer";
            case SEPTEMBER, OCTOBER, NOVEMBER: return "Autumn";
        }
        return null;
    }

    @Override
    public String toString() {
        return "The month: " + this.name() + ". Count of days: " + this.days + ". Seasson: " + this.getSeason();
    }

    static void  getInfoAboutAllMonths() {
        for(var v : Months.values()) {
            System.out.println(v);
        }
    }
    private int days;
    Months(int days) {
        this.days = days;
    }
}

public class Main {
    public static void main(String[] args) {
        Months.getInfoAboutAllMonths();
    }
}
