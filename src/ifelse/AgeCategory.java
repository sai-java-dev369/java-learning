package ifelse;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if(age <=13){
            System.out.println("your Child");
        } else if(age<=19){
            System.out.println("your Teen");
        } else if (age <=59){
            System.out.println("your Adult");
        } else {
            System.out.println("your Senior");
        }
        sc.close();
    }
}
