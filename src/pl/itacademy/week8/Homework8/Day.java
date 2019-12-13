package pl.itacademy.week8.Homework8;

import java.util.ArrayList;
import java.util.List;

public enum Day {

    MON("MONDAY", "PONIEDZIAŁEK", true),
    TUE("TUESDAY", "WTOREK", true),
    WED("WEDNESDAY", "SRODA", true),
    THU("THURSDAY", "CZWARTEK", true),
    FRI("FRIDAY", "PIĄTEK", true),
    SAT("SATURDAY", "SOBOTA", false),
    SUN("SUNDAY", "NIEDZIELA", false);

    private String englishName;
    private String polishName;
    boolean workingDay;

    Day(String englishName, String polishName, boolean workingDay) {
        this.englishName = englishName;
        this.polishName = polishName;
        this.workingDay = workingDay;
    }

    public String getEnglishName() {

        return englishName;
    }

    public String getPolishName() {

        return polishName;
    }

    public boolean isWorkingDay() {

        return workingDay;
    }

    public static Day fromPolishName(String polishName) {
        for (Day day : Day.values()) {
            if (day.polishName.equals(polishName)) {
                return day;
            }
        }
        return null;
    }

    public static Day fromEnglishName(String englishName) {
        for (Day day : Day.values()) {
            if (day.englishName.equals(englishName)) {
                return day;
            }
        }
        return null;
    }

    public static <DayOfWeek> boolean isWeekend(String freeDays) {
        if (freeDays.equals(Day.SUN) || freeDays.equals(Day.SAT)) {
            return true;
        } else {
            return false;
        }

  /*  public static List<DayOfWeek> getWeekends () {
          List<DayOfWeek> weekends = new ArrayList<>();
//            weekends .add((DayOfWeek) MON);
//            weekends .add((DayOfWeek) TUE);
//            weekends .add((DayOfWeek) WED);
//            weekends .add((DayOfWeek) TUE);
//            weekends .add((DayOfWeek) FRI);
         //   weekends .add((DayOfWeek) SAT);
           // weekends .add((DayOfWeek) SUN);

            for (DayOfWeek day: weekends) {
                if (isWeekend(freeDays) == true){
                    weekends.add((DayOfWeek) day);
                }
            }
            return DayOfWeek;

            System.out.println("============");
            System.out.println("Weekend days "+ freeDays);
        }
        public static ArrayList<Day> getWorkingDays() {
            ArrayList<Day> workingDays = new ArrayList<>();

            for (Day day : Day.values()) {
                if (day.workingDay == true){
                    workingDays.add(day);
            }
            }
            return true;
        }*/
    }
    }
