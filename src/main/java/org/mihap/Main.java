package org.mihap;

import java.util.Scanner;

public class Main {
    static double fToC(int a){
        return a * 1.8 + 32;
    }
    static double cToF(int a){
        return (a - 32)/1.8;
    }
    static double cToK(int a){
        return a + 273.15;
    }
    static double kToC(int a){
        return a - 273.15;
    }
    static double fToK(int a){
        return fToC(a) + 273.15;
    }
    static double kToF(int a){
        return cToF(a) - 273.15;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type unit of the measurement (C, K or F): ");
        String ogUnit = sc.nextLine();
        System.out.print("What unit to convert to (C, K or F): ");
        String nUnit = sc.nextLine();
        System.out.print("Value of measurement: ");
        int value = sc.nextInt();
        if (ogUnit.equalsIgnoreCase("c") && nUnit.equalsIgnoreCase("f")) {
            System.out.println(cToF(value));
        } else if (ogUnit.equalsIgnoreCase("f") && nUnit.equalsIgnoreCase("c")) {
            System.out.println(fToC(value));
        } else if (ogUnit.equalsIgnoreCase("c") && nUnit.equalsIgnoreCase("k")) {
            System.out.println(cToK(value));
        } else if (ogUnit.equalsIgnoreCase("f") && nUnit.equalsIgnoreCase("k")) {
            System.out.println(fToK(value));
        } else if (ogUnit.equalsIgnoreCase("k") && nUnit.equalsIgnoreCase("c")) {
            System.out.println(kToC(value));
        } else if (ogUnit.equalsIgnoreCase("k") && nUnit.equalsIgnoreCase("f")) {
            System.out.println(kToF(value));
        }
    }
}