package com.mycompany.mavenproject;

import java.util.Scanner;

public class Mavenproject {

    public static void main(String[] args) {
        System.out.println("Practical task 1.12, Student Budrik Sophia, RIBO-04-22, Variant 4");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please, enter name of plant:");
        String value = scanner.nextLine();

        System.out.println("Please, enter the plant family:");
        String value1 = scanner.nextLine();
        
        System.out.println("Please, enter the color of the plant:");
        String value2 = scanner.nextLine();

        System.out.println("Please, enter the age of the plant:");
        int value3 = scanner.nextInt();

        System.out.println("Please, enter the height of the plant:");
        float value4 = scanner.nextFloat();
        
        Plant p = new Plant(value, value1, value2, value3, value4);
                        
        SaverRunnable saverRunnable = new SaverRunnable(p, "C:\\plant.ser");
        Thread th = new Thread(saverRunnable);
        th.start();
    }
}