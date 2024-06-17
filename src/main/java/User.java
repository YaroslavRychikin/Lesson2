import java.util.Scanner;

public class User {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи два числа через пробел: ");
        int a = scanner.nextInt();
        int b =  scanner.nextInt();
        System.out.println("Sum: "+ Sum(a,b));
    }
    public static int Sum(int a, int b) {
        int x = a+b;
        return x;
    }

}