package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] mass = new int[15];

        Random random = new Random();

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(100);
                if (mass[i]% 2 == 0) {
                    System.out.println();
                    System.out.print(mass[i]);




                }

            }
        }
    }
