package pl.itacademy.week6.Homework1;

public class CarTester {

    public static void main(String[] args) throws CloneNotSupportedException {

        Engine engine = new Engine("Fuel Engine", 120);
        Car vw = new Car("VW", engine);

        Engine electricEngine = new Engine("Electric Engine", 200);
        Car mazda = new Car("Mazda", electricEngine);

        Engine hybridEngine = new Engine("Hybid Engine", 150);
        Car kia = new Car("Kia NIRO", hybridEngine);

        Engine petrol = new Engine("Petrol Engine", 100);
        Car opel = new Car("Opel", petrol);

        System.out.println(vw);
        vw.tank();

        System.out.println(mazda);
        mazda.charge();

        System.out.println(kia);
        kia.charge();

        System.out.println(opel);
        opel.tank();

        Engine clonedEngine = (Engine) engine.clone();
        System.out.println("Cloned object " + clonedEngine);
        FuelCar clonedFuelCar = (FuelCar) vw.clone();
        System.out.println("Cloned object " + clonedFuelCar);
        ElectricCar clonedElectricCar = (ElectricCar) mazda.clone();
        System.out.println("Cloned object " + clonedElectricCar);
        HybridCar clonedHybridCar = (HybridCar) kia.clone();
        System.out.println("Cloned object " +clonedHybridCar);

        if (mazda.equals(clonedFuelCar)) {
            System.out.println("Cars are equal");
        } else {
            System.out.println("Cars are no egual");
        }

            if (vw.equals(mazda)) {
                System.out.println("Cars are the same object");
            } else {
                System.out.println("Cars are not the same object");
            }


            Car[] cars = new Car[4];
            cars[0] = vw;
            cars[1] = mazda;
            cars[2] = kia;
            cars[3] = opel;

            for (Car car : cars) {
                System.out.println(car.hashCode() + " " + car.getName());
            }


            for (Car car : cars) {
                if (car instanceof Chargable) {
                    ((Chargable) car).charge();

                }
                if (car instanceof Tankable) {
                    ((Tankable) car).tank();
                }

            }
        }


    }
