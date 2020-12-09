package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {


        PC pc = new PC(1000, 16, "intel core i7", 0);
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число от 0 до 1 для запуска пк");
        pc.StartPC = scanner.nextInt();
        if (pc.StartPC == random.nextInt(2)) {
            System.out.println("вы успешно включили пк");
        } else {
            System.out.println("комп сгорел");
            System.exit(1);

        }


        pc.Operativka = 16;
        pc.HardDrive = 1000;
        pc.CPU = "intel core i7";
        System.out.println(pc.CPU);
        System.out.println(pc.HardDrive + "gb HardDrive");
        System.out.println(pc.Operativka + "gb OZU");

        System.out.println("введите число от 0 до 1 для выключения пк");
        pc.StartPC = scanner.nextInt();
        if (pc.StartPC == random.nextInt(2)) {
            System.out.println("вы успешно выключили пк");
        } else {
            System.out.println("комп сгорел");
            System.exit(1);

        }
    }
}
