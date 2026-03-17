package forLoops;

public class SummonNumbers {
    public static void main (String[] args){
        int i;
        int num = 10;
        int sum=0;
        for(i=1;i<=num;i++){
            sum += i;
        }
        System.out.println("sum = " + sum );
    }
}
