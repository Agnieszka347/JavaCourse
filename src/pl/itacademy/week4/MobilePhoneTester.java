package pl.itacademy.week4;

public class MobilePhoneTester {
    public static void main(String[] args) {
        MobilePhone iphone = new MobilePhone("Apple", "iPhone 10", 1000, 1000);

        iphone.installApplication("Google Maps", 500);
        iphone.installApplication("Tinder", 300);
        iphone.installApplication("Chrome", 200);
        iphone.installApplication("Strava", 200);


        iphone.useApplication("YouTube", 7);
        iphone.useApplication("Angry Birds", 4);
        iphone.useApplication("Facebook", 1);

        int battery = iphone.charge();
        System.out.println("Phone has been charged to " + battery);
        iphone.useApplication("Facebook", 1);
    }
}

