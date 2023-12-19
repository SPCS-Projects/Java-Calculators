import java.util.Scanner;
public class isPositive {
    public static boolean isPos(int x){
        if (x > 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the integer number:");
        int base = keyboard.nextInt();
        boolean check = isPos(base);
        if (check){
            System.out.printf("%d is a positive number", base);
        }
        else{
            System.out.printf("%d is a negative number", base);
        }
    }
}
