package doWhile;

import java.util.Scanner;

public class menuProgram2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("1.Print Hello");
            System.out.println("2.Print Number 1-5");
            System.out.println("3.Exit");

            System.out.println("Enter the number:");
            number = sc.nextInt();

            if(number ==1 ){
                System.out.println("Hello");
            } else if(number == 2){
                for(int i = 1; i <= 5; i++){
                    System.out.println(i);
                }
            } else if(number == 3){
                System.out.println("Exist");
            } else {
                System.out.println("Not Exist");
            }
        }
        while (number != 3);
    }
}
