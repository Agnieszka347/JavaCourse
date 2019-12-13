package pl.itacademy.week10;

public class Animal {


        public void sleep(int hours) {
            System.out.println("animal sleeping " + hours + " hours");
        }

        /**
         * Please, use sleep(hours) instead
         */
        @Deprecated(since = "7.12.2019", forRemoval = true)
        public void sleep2hours() {
            System.out.println("animal sleeping 2 hours");
        }
}

