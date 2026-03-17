package ifelse;

import java.util.Scanner;

public class TemperatureCategory {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature in your area:");
        int Temp = sc.nextInt();
        if(Temp >= 35){
            System.out.println("Hot");
        } else if (Temp >=20){
            System.out.println("Warm");
        } else if (Temp >=10){
            System.out.println("Cool");
        } else {
            System.out.println("Cold");
        }
    }
}
