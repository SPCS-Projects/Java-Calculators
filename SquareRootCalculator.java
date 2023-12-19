import java.util.Scanner;

public class Main {
    public static int getSquare (int x){
        return (int)Math.sqrt(x);
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number you'd like squared:");
        int num = keyboard.nextInt();
        int sqrt = getSquare(num);
        System.out.printf("the squareroot of %d is %d", num, sqrt);
    }
}
