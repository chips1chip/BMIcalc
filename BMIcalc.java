import java.util.Scanner;
public class BMIcalc {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        // Input for height
        System.out.println("Enter your height (in meters):");
        double height = sc.nextDouble();
        // Input for weight
        System.out.println("Enter your weight (in kilograms):");
        double weight = sc.nextDouble();
        // Calculate BMI
        double bmi = weight / (height * height);
        // Display the result
        System.out.println("Your BMI is: " + bmi);
        // Interpret BMI
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
        sc.close();
    }
}
