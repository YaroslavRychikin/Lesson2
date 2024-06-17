import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Привет мой друг, напиши свое имя: ");
        String poor =  scanner.nextLine();
        System.out.println("Добро пожаловать в мой дом: " + poor);
        int[][] as = new int[6][6];
        int c = 0;
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                as[i][j] = ++c;
                System.out.print("\t"+ as[i][j] );
            }
            System.out.println();
        }
    }
}