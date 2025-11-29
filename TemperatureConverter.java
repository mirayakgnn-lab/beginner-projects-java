package Phase1Projects;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) throws InterruptedException {
        float celcius;
        float fahrenheit;
        float kelvin;
        String convert = "Converting...";
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("---Temperature Converter---\n");
            Thread.sleep(1000);
            while(true) {
                System.out.print("Temperature: ");
                String inputTemp = input.nextLine();
                if(inputTemp.contains("Celsius") || inputTemp.contains("C") || inputTemp.contains("°C")
                        || inputTemp.contains("Fahrenheit") || inputTemp.contains("F") || inputTemp.contains("°F")
                        ||inputTemp.contains("Kelvin") || inputTemp.contains("K")) {
                    //Continues.
                } else {
                    System.out.println("Invalid Input.");
                    break;
                }
                if (inputTemp.contains("Celsius") || inputTemp.contains("C") || inputTemp.contains("°C")) {

                    String numberOnlyTemp = inputTemp.split(" ")[0];
                    float temp = Float.parseFloat(numberOnlyTemp);

                    kelvin = temp + 273.15f;
                    fahrenheit = ((temp) * 9) / 5 + 32;

                    Thread.sleep(1000);
                    for (int i = 0; i < convert.length(); i++) {
                        System.out.print(convert.charAt(i));
                        Thread.sleep(200);
                    }
                    Thread.sleep(2000);
                    System.out.println("\nFahrenheit : " + fahrenheit);
                    Thread.sleep(250);
                    System.out.println("Kelvin : " + kelvin);
                    break;

                } else if (inputTemp.contains("Fahrenheit") || inputTemp.contains("F") || inputTemp.contains("°F")) {

                    String numberOnlyTemp = inputTemp.split(" ")[0];
                    float temp = Float.parseFloat(numberOnlyTemp);

                    celcius = ((temp - 32) * 5) / 9;
                    kelvin = celcius + 273.15f;

                    Thread.sleep(1000);
                    for (int i = 0; i < convert.length(); i++) {
                        System.out.print(convert.charAt(i));
                        Thread.sleep(200);
                    }
                    Thread.sleep(2000);
                    System.out.println("\nCelcius : " + celcius);
                    Thread.sleep(250);
                    System.out.println("Kelvin : " + kelvin);
                    break;

                } else if (inputTemp.contains("Kelvin") || inputTemp.contains("K")) {

                    String numberOnlyTemp = inputTemp.split(" ")[0];
                    float temp = Float.parseFloat(numberOnlyTemp);

                    celcius = temp - 273.15f;
                    fahrenheit = ((celcius) * 5) / 9;

                    Thread.sleep(1000);
                    for (int i = 0; i < convert.length(); i++) {
                        System.out.print(convert.charAt(i));
                        Thread.sleep(150);
                    }
                    Thread.sleep(2000);
                    System.out.println("\nFahrenheit : " + fahrenheit);
                    Thread.sleep(500);
                    System.out.println("Celcius : " + celcius);
                    break;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}