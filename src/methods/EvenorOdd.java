package methods;

public class EvenorOdd {
    public static void checkEven(int number){
        if(number % 2 == 0){
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
    public static void main(String[] args){
        checkEven(10);
        checkEven(7);
        checkEven(25);
    }
}
