import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String prompt = """
                Hello user!
                
                You are using a temperature converter. Please read the this prompt before proceeding.
                
                This application will be asking you to tell it the units.
                - Use C for Celsius,
                - Use F for Fahrenheit,
                - Use K for Kelvins.
                
                Thank you for using this program :)
                """;
        System.out.println(prompt);
        System.out.print("Unit to convert from (C for celsius, F for fahrenheit and K for kelvins): ");
        Scanner unit1 = new Scanner(System.in);
        String ogUnit = unit1.nextLine();

        System.out.print("Unit to convert to (C for celsius, F for fahrenheit and K for kelvins): ");
        Scanner unit2 = new Scanner(System.in);
        String newUnit = unit2.nextLine();

        System.out.print("Temperature: ");
        Scanner temperature = new Scanner(System.in);
        int temp = temperature.nextInt();

        if (ogUnit.equalsIgnoreCase("c") && newUnit.equalsIgnoreCase("f")){
            int newTemp = 32 + (temp * 5/9);
            System.out.println("Temperature: " + newTemp + "°F");
        } else if (ogUnit.equalsIgnoreCase("c") && newUnit.equalsIgnoreCase("k")) {
            int newTemp = temp + 273;
            System.out.println("Temperature: " + newTemp + "K");
        } else if (ogUnit.equalsIgnoreCase("f") && newUnit.equalsIgnoreCase("c")) {
            int newTemp = (temp - 32) / 9/5;
            System.out.println("Temperature: " + newTemp + "°C");
        } else if (ogUnit.equalsIgnoreCase("f") && newUnit.equalsIgnoreCase("k")) {
            int newTemp = ((temp - 32) / 9/5) + 273;
            System.out.println("Temperature: " + newTemp + "K");
        } else if (ogUnit.equalsIgnoreCase("k") && newUnit.equalsIgnoreCase("c")) {
            int newTemp = temp - 273;
            System.out.println("Temperature: " + newTemp + "°C");
        } else if (ogUnit.equalsIgnoreCase("k") && newUnit.equalsIgnoreCase("f")) {
            int newTemp = (temp - 273 - 32) / 9/5;
            System.out.println("Temperature: " + newTemp + "°F");
        }
    }
}