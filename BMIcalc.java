import java.util.Scanner;
public class BMIcalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height(in m):");
        double height;
        height = sc.nextDouble();
        System.out.println("Enter your weight(in kg):");
        double weight = sc.nextDouble();
        System.out.println("BMI calculated is :");
        System.out.println(weight/(height*height));
    }
}