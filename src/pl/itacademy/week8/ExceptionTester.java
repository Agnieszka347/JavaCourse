package pl.itacademy.week8;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTester {

    public static void main(String[] args) {
        Car vw = new Car(10);
        driveCar(vw, 100);
        driveCar(vw, 100);
        driveCar(vw, 100);
        driveCar(vw, 100);
        driveCar(vw, 100);

        System.out.println("=====================================================");


        //Do NOT repeat at home, only if you are using Java before 7
//        FileInputStream inputStream = null;
//        BufferedInputStream bufferedInputStream = null;
//        try {
//            inputStream = new FileInputStream("C:\\1\\test.txt");
//            bufferedInputStream = new BufferedInputStream(inputStream);
//            byte[] bytes = bufferedInputStream.readAllBytes();
//            for (byte aByte : bytes) {
//                System.out.print((char) aByte);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if(bufferedInputStream != null) {
//                    bufferedInputStream.close();
//                }
//                if(inputStream != null) {
//                    inputStream.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        String fileName = null;
        try(FileInputStream inputStream = new FileInputStream(fileName);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {
            byte[] bytes = bufferedInputStream.readAllBytes();
            for (byte aByte : bytes) {
                System.out.print((char) aByte);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exists");
        } catch (IOException | NullPointerException e) {
            System.out.println("Can't read from file: " + fileName);
        }

    }

    private static void driveCar(Car car, int kilometers) {
        try {
            car.go(kilometers);
        } catch (EmptyTankException e) {
            System.out.println(e.getMessage());
            car.tank(10);
        } finally {
            System.out.println("Car ready to continue to go");
        }
    }

    private static void tryWithoutCatch() throws IOException {
//        try {
//            System.out.println("Hello from try section");
//            throw new IOException();
//        } finally {
//
//        }

        try(FileInputStream fis = new FileInputStream("C:\\1\\test.txt")) {
            System.out.println("Hello from try with resourses");
        }
    }
}
