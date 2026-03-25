package methodOverloading;

public class printMethods {
    public static void print(int number) {
        System.out.println("Number: " + number);
    }
    public static void print(String text) {
        System.out.println("Text: " + text);
    }
    public static void main(String[] args) {
        print(10);
        print("Hello Java");
    }
}
