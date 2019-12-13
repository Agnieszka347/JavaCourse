package pl.itacademy.week8;

public class EnumeTester {

    public static void main(String[] args) {
        WeatherTypes weatherType = WeatherTypes.SMOG;
        System.out.println(weatherType);
        System.out.println(weatherType.compareTo(WeatherTypes.RAIN));
        System.out.println(weatherType.equals(WeatherTypes.RAIN));
        System.out.println(weatherType == WeatherTypes.SMOG);

        switch (weatherType) {
            case RAIN:
                System.out.println("it is rain now");
                break;
            case SMOG:
                System.out.println("high air pollution");
                break;
            default:
                System.out.println("weather is beautiful");
        }

        System.out.println(Planet.EARTH.getRadius() + " kilometers");

        System.out.println(Planet.valueOf("VENUS").getRadius());

        System.out.println(Planet.MERCURY.name());
        System.out.println(Planet.MERCURY.ordinal());
        System.out.println(Planet.EARTH.ordinal());
        System.out.println(Planet.VENUS.ordinal());

        for(Planet planet : Planet.values()) {
            System.out.println(planet.name());
        }

        System.out.println(Planet.EARTH.getDeclaringClass());
        System.out.println(Planet.EARTH.getClass());

        //Won't compile!!
        //Planet nubiru = new Planet(2345.6);

        System.out.println(DayOfWeek.valueOf("MON").getPolishName());
        System.out.println(DayOfWeek.fromPolishName("Sroda"));
        System.out.println(DayOfWeek.fromPolishName("Piatek"));
    }
}
