package com.mycompany.mavenproject;

import java.util.Scanner;

public class Mavenproject {

    public static void main(String[] args) {
        System.out.println("Practical task 1.12, Skvortsova Kseniya, RIBO-04-22, Variant 4");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("name of plant:");
        String value = scanner.nextLine();

        System.out.println("plant family:");
        String value1 = scanner.nextLine();
        
        System.out.println("color of the plant:");
        String value2 = scanner.nextLine();

        System.out.println("age of the plant:");
        int value3 = scanner.nextInt();

        System.out.println("height of the plant:");
        float value4 = scanner.nextFloat();
        
        Plant p = new Plant(value, value1, value2, value3, value4);
                        
        SaverRunnable saverRunnable = new SaverRunnable(p, "C:\\plant.ser");
        Thread th = new Thread(saverRunnable);
        th.start();
    }
}
