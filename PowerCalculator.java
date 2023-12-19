import java.util.Scanner;

public class power {
    public static void ComputePower (int x, int y){
        System.out.printf("%d to the power of %d = %.1f\n", x, y, Math.pow(x,y));
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the integer number:");
        int base = keyboard.nextInt();
        System.out.println("Enter the power:");
        int power = keyboard.nextInt();
        ComputePower(base, power);
    }
}
