package pl.itacademy.week8.Homework8;



public class DayEnumTester {

    public static void main(String[] args) {

        daysEnglishName ();
        daysPolishName ();
        getWorkingDay ();
        boolean isWeekend;

    }

    private static void daysEnglishName() {
        Day day1 = Day.MON;
        Day day2 = Day.TUE;
        Day day3 = Day.WED;
        Day day4 = Day.THU;
        Day day5 = Day.FRI;
        Day day6 = Day.SAT;
        Day day7 = Day.SUN;
        for (Day days: Day.values()) {

            System.out.println(days.getEnglishName());

            System.out.println("=======================");
        }
    }


    private static void getWorkingDay() {
        Day day1 = Day.MON;
        Day day2 = Day.SAT;

        System.out.println(day1.isWorkingDay());
        System.out.println(day2.isWorkingDay());
    }

    private static void daysPolishName() {
        Day day1 = Day.MON;
        Day day2 = Day.TUE;
        Day day3 = Day.WED;
        Day day4 = Day.THU;
        Day day5 = Day.FRI;
        Day day6 = Day.SAT;
        Day day7 = Day.SUN;
        for (Day days: Day.values()) {

        System.out.println(days.getPolishName());
    }

       /* private static void isWeekendDays() {
            day1 = Day.MON;
            day6 = Day.SAT;
            System.out.println(day1.isWeekend());
            System.out.println(day2.isWeekend());

        }*/



    }

}






