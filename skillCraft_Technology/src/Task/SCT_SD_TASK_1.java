package Task;

import java.util.Scanner;

public class SCT_SD_TASK_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Temperature Converter Menu:");
			System.out.println("1. Celsius to Fahrenheit");
			System.out.println("2. Celsius to Kelvin");
			System.out.println("3. Fahrenheit to Celsius");
			System.out.println("4. Fahrenheit to Kelvin");
			System.out.println("5. Kelvin to Celsius");
			System.out.println("6. Kelvin to Fahrenheit");
			System.out.println("7. Exit");
			System.out.print("Choose an option: ");
			int choice = scanner.nextInt();

			if (choice == 7) {
				System.out.println("Exiting the program. Goodbye!");
				break;
			}

			System.out.print("Enter the temperature value: ");
			double value = scanner.nextDouble();
			double result = 0;

			switch (choice) {
			case 1:
				result = celsiusToFahrenheit(value);
				System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", value, result);
				break;
			case 2:
				result = celsiusToKelvin(value);
				System.out.printf("%.2f Celsius is %.2f Kelvin%n", value, result);
				break;
			case 3:
				result = fahrenheitToCelsius(value);
				System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", value, result);
				break;
			case 4:
				result = fahrenheitToKelvin(value);
				System.out.printf("%.2f Fahrenheit is %.2f Kelvin%n", value, result);
				break;
			case 5:
				result = kelvinToCelsius(value);
				System.out.printf("%.2f Kelvin is %.2f Celsius%n", value, result);
				break;
			case 6:
				result = kelvinToFahrenheit(value);
				System.out.printf("%.2f Kelvin is %.2f Fahrenheit%n", value, result);
				break;
			default:
				System.out.println("Invalid option. Please try again.");
			}
		}
		scanner.close();
	}

	public static double celsiusToFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}

	public static double celsiusToKelvin(double celsius) {
		return celsius + 273.15;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

	public static double fahrenheitToKelvin(double fahrenheit) {
		return (fahrenheit + 459.67) * 5 / 9;
	}

	public static double kelvinToCelsius(double kelvin) {
		return kelvin - 273.15;
	}

	public static double kelvinToFahrenheit(double kelvin) {
		return (kelvin * 9 / 5) - 459.67;
	}
}
