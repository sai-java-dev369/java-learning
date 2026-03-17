package doWhile;

import java.util.Scanner;

public class menuProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int choice;
         do{
             System.out.println("1.Adding the menu");
             System.out.println("2. Sub the menu");
             System.out.println("3.Exit from the menu");

             System.out.println("Enter the choice:");
             choice = sc.nextInt();

             if(choice == 1){
                 System.out.println("Addition selected");
             }
             else if(choice == 2){
                 System.out.println("Subtraction selected");
             }
             else if(choice == 3){
                 System.out.println("Exiting program...");
             }
             else{
                 System.out.println("Invalid choice");
             }
         }
         while(choice != 3);
    }
}
