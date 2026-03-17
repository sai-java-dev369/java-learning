package ifelse;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Marks:");
            int number = sc.nextInt();
            if ( number >= 90){
                System.out.println("Grade A");
            } else if (number >= 75) {
                System.out.println("Grade B");
            } else if(number >= 50){
                System.out.println("grade C");
            } else {
                System.out.println("Fail");
            }
    }
}
