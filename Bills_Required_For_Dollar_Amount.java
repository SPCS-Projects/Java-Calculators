import java.util.Scanner;

public class SAR {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Give an amount of Saudi Riyal:");
        int cash = keyboard.nextInt();

        int SR_500 = cash / 500;
        int SR_100 = cash%500 / 100;
        int SR_50 = cash%500%100 / 50;
        int SR_10 = cash%500%100%50 / 10;
        int SR_5 = cash%500%100%50%10 / 5;
        int SR_1 = cash%500%100%50%10 % 5;
        int total = SR_500+SR_100+SR_50+SR_10+SR_5+SR_1;
        String str_1 = String.format("The minimum number of bills required for the amount %d is: %d", cash, total);
        String str_2 = String.format("500 SR: %d\n100 SR: %d\n50 SR: %d\n10 SR: %d\n5 SR: %d\n1 SR: %d", SR_500, SR_100, SR_50, SR_10, SR_5, SR_1);
        System.out.println(str_1);
        System.out.println(str_2);
    }
}