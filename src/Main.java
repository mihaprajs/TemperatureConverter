import java.util.Scanner;

public class Main {
    public static void cToF(int temp){
        int newTemp = 32 + (temp * 5/9);
        System.out.println("Temperature: " + newTemp + "°F");
    }
    public static void cToK(int temp){
        int newTemp = temp + 273;
        System.out.println("Temperature: " + newTemp + "K");
    }
    public static void fToC(int temp){
        int newTemp = (temp - 32) / 9/5;
        System.out.println("Temperature: " + newTemp + "°C");
    }
    public static void fToK(int temp){
        int newTemp = ((temp - 32) / 9/5) + 273;
        System.out.println("Temperature: " + newTemp + "K");
    }
    public static void kToC(int temp){
        int newTemp = temp - 273;
        System.out.println("Temperature: " + newTemp + "°C");
    }
    public static void kToF(int temp){
        int newTemp = (temp - 273 - 32) / 9/5;
        System.out.println("Temperature: " + newTemp + "°F");
    }

    public static void main(String[] args) {
        System.out.print("Unit to convert from (c for celsius, f for fahrenheit and k for kelvins): ");
        Scanner unit1 = new Scanner(System.in);
        String ogUnit = unit1.nextLine();

        System.out.print("Unit to convert from (c for celsius, f for fahrenheit and k for kelvins): ");
        Scanner unit2 = new Scanner(System.in);
        String newUnit = unit2.nextLine();

        System.out.print("Temperature: ");
        Scanner temperature = new Scanner(System.in);
        int temp = temperature.nextInt();

        if (ogUnit.equalsIgnoreCase("c") && newUnit.equalsIgnoreCase("f")){
            cToF(temp);
        } else if (ogUnit.equalsIgnoreCase("c") && newUnit.equalsIgnoreCase("k")) {
            cToK(temp);
        } else if (ogUnit.equalsIgnoreCase("f") && newUnit.equalsIgnoreCase("c")) {
            fToC(temp);
        } else if (ogUnit.equalsIgnoreCase("f") && newUnit.equalsIgnoreCase("k")) {
            fToK(temp);
        } else if (ogUnit.equalsIgnoreCase("k") && newUnit.equalsIgnoreCase("c")) {
            kToC(temp);
        } else if (ogUnit.equalsIgnoreCase("k") && newUnit.equalsIgnoreCase("f")) {
            kToF(temp);
        }
    }
}